package com.bank.data;

import java.io.File;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

import com.bank.domain.Account;
import com.bank.domain.Bank;
import com.bank.domain.CheckingAccount;
import com.bank.domain.Customer;
import com.bank.domain.SavingsAccount;

public class DataSource {
    private File dataFile;

    public DataSource(String dataFilePath) throws Exception {
        super();

        if (this.validatePath(dataFilePath))
            this.dataFile = new File(dataFilePath);
        else
            throw new Exception("La ruta de archivo introducida no es válida.");
    }

    public void loadData() throws Exception {
        if (this.dataFile == null)
            throw new Exception("El archivo no es válido. No se han podido cargar los datos.");

        if (!this.dataFile.canRead())
            throw new Exception("No se han podido leer los datos del archivo.");

        Scanner input = new Scanner(this.dataFile);
        input.useLocale(Locale.ENGLISH);

        // numero de clientes
        int numOfCustomers;

        if (input.hasNext())
            numOfCustomers = input.nextInt();
        else
            throw new Exception("El archivo está vacío. No se han podido cargar los datos.");

        // bucle para cargar los datos de cada cliente
        for (int i = 0; i < numOfCustomers; i++) {
            if (!input.hasNext())
                throw new Exception(
                        "El archivo no tiene datos de clientes o los datos son inconsistentes. No se han podido cargar los datos.");

            // nombre, apellido y numero de cuentas
            String firstName = input.next();
            String lastName = input.next();
            int numOfAccounts = input.nextInt();

            Customer customer = new Customer(firstName, lastName);

            // bucle para cargar los datos de cada cuenta
            for (int j = 0; j < numOfAccounts; j++) {
                if (!input.hasNext())
                    throw new Exception(
                            "El archivo no tiene datos de cuentas o los datos son inconsistentes. No se han podido cargar los datos.");

                Account account;

                // tipo de cuenta
                String type = input.next();

                switch (type) {
                    case "S":
                        account = new SavingsAccount(input.nextDouble(), input.nextDouble());
                        break;

                    case "C":
                        account = new CheckingAccount(input.nextDouble(), input.nextDouble());
                        break;

                    default:
                        throw new Exception(
                                "Los datos están mal escritos o no se está contemplando este tipo de cuenta: " + type
                                        + ".");
                }

                // añadimos las cuentas al cliente
                customer.addAccount(account);
            }

            // añadimos los clientes al banco
            Bank.addCustomer(customer);

        }

    }

    private boolean validatePath(String dataFilePath) {
        try {
            Paths.get(dataFilePath);
        } catch (InvalidPathException | NullPointerException e) {
            return false;
        }

        return true;
    }

}
