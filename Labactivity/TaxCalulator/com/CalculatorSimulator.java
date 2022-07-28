package com;

public class CalculatorSimulator {
public static void main(String[] args) throws TaxNotEligible,
CountryNotValidException, EmployeeNameInvalidException {

TaxCalculator f = new TaxCalculator();
System.out.println("Tax Amount is :" + f.calculateTax(70000));

}
}



