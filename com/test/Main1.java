package com.test;

public class Main1 {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport();
        report.show(calculator);
        report.show(new TaxCalculator2019());
    }
}
