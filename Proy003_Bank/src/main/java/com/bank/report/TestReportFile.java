package com.bank.report;

import com.bank.data.DataSource;

public class TestReportFile {

    public static void main(String[] args) {
        try {
            DataSource data = new DataSource("src/main/java/com/bank/data/test.dat");
            data.loadData();
//        System.out.println(data.toURI().toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

        CustomerReport.generateReport();
    }

}
