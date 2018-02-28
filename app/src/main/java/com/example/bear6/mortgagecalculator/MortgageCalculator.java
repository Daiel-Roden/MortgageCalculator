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
    public Double calculatePayment(int amount, double intRate, int years, int i2) {
        Double intR = intRate/100/12;
        return intRate/100/12 * amount / (1-Math.pow(1+intR,-360));
    }
}
