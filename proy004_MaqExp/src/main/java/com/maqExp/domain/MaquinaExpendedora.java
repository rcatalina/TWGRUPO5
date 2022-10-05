package com.maqExp.domain;

import java.util.Map;

public class MaquinaExpendedora {

	private Long balance;

//	Mapa de ID de refresco con número de refrescos
	private Map<String, Long> sodasMap;
	private Long soldSodasAmt;

	public MaquinaExpendedora(Long balance, Long sodasAmt) {
		super();
		this.balance = balance;
	}

	public Long getBalance() {
		return balance;
	}

	public Map<String, Long> getSodasMap() {
		return sodasMap;
	}

	public Long getSoldSodasAmt() {
		return soldSodasAmt;
	}

	public void reponer(Soda soda, Long amt) {
		String sodaID = soda.getiD();
		Long currentSodaAmt = this.sodasMap.get(sodaID);

		if (currentSodaAmt == null) {
			currentSodaAmt = 0L;
		}

		currentSodaAmt += amt;

		this.sodasMap.put(sodaID, currentSodaAmt);
	}

	public void sell(Soda soda) {
		// TODO
	}

}
