package com.maqexpendedora.domain;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class MaquinaExpendedora {

	private String id;
	private Long balance;
	private Long soldSodasAmt;

	public MaquinaExpendedora(Long balance, Long soldSodasAmt) throws Exception {
		super();

		this.validate(balance, soldSodasAmt);

		this.id = UUID.randomUUID().toString();
		this.balance = balance;
		this.soldSodasAmt = soldSodasAmt;
	}

	public String getId() {
		return id;
	}

	public Long getBalance() {
		return balance;
	}

	public Long getSoldSodasAmt() {
		return soldSodasAmt;
	}

	private void validate(Long balance, Long sodasAmt) throws Exception {
		boolean hasError = false;
		List<String> errorMessages = new LinkedList<>();

		if (balance == null || sodasAmt == null) {
			hasError = true;
			errorMessages.add("El importe o el total de refrescos vendidos no pueden ser NULL.");
		}

		if (balance < 0) {
			hasError = true;
			errorMessages.add("El importe no puede ser inferior a 0.");
		}

		if (sodasAmt < 0) {
			hasError = true;
			errorMessages.add("El total de refrescos vendidos no puede ser inferior a 0.");
		}

		if (hasError) {
			String e = "";

			for (String msg : errorMessages) {
				e = e.concat(msg + " ");
			}

			throw new Exception(e);
		}
	}

	public void reponer(Soda soda, Integer amt) throws Exception {
		if (amt <= 0)
			throw new Exception("El stock a reponer debe ser superior a 0.");

		Integer newStock = soda.getStock();
		newStock += amt;

		soda.setStock(newStock);
	}

	public void vender(Soda soda) throws Exception {
		if (soda == null)
			throw new Exception("Nos está llegando un refresco a NULL en el método vender().");

		Integer stock = soda.getStock();

		if (stock <= 0)
			throw new Exception("No hay stock de ese refresco. No ha sido posible realizar la venta.");

		if (stock == 1)
			soda.setSoldOut(true);

		soda.setStock(stock - 1);

		this.balance += soda.getPrice();
		this.soldSodasAmt++;
	}

	public String mostrarInformeVentas() {
		return "";
	}

}
