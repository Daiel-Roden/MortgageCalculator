package com.example.bear6.mortgagecalculator;

/**
 * Created by bear6 on 2/27/2018.
 */

        /*
        clear_kbd;
        ErrorCode := 0;  CriticalVal := 0.0;
        r := IntRate/100.0/Periods_Per_Year;
        n := Trunc(NumYears *Periods_Per_Year + YearParts);

        If (p = 0.0) AND (A<>0.0) AND (r<>0.0) AND (n<>0) Then
        p := (r * A) / (1 - (IntExp(1 + r,-n)))
        */

class MortgageCalculator {
    public Double calculatePayment(double amount, double intRate, double years) {
        Double periodsPerYear = 12.0;
        Double numberOfPeriods = periodsPerYear * years;
        Double rate = intRate/100.0/periodsPerYear;
        return (rate * amount / (1.0 - Math.pow(1.0 + rate, -numberOfPeriods)));
    }
}
