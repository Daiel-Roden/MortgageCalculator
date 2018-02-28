package com.example.bear6.mortgagecalculator;


import android.support.annotation.NonNull;

import java.math.BigDecimal;

/**
 * Created by bear6 on 2/25/2018.
 */
/*
Calculator Use
This simple interest calculator calculates an accrued amount that includes principal plus interest.  For interest only, use the simple interest calculator.

Simple Interest Equation (Principal + Interest)
A = P(1 + rt)

Where:

A = Total Accrued Amount (principal + interest)
P = Principal Amount
I = Interest Amount
r = Rate of Interest per year in decimal; r = R/100
R = Rate of Interest per year as a percent; R = r * 100
t = Time Period involved in months or years
From the base formula, A = P(1 + rt) derived from A = P + I and I = Prt so A = P + I = P + Prt = P(1 + rt)

Note that rate r and time t should be in the same time units such as months or years. Time conversions that are based on day count of 365 days/year have 30.4167 days/month and 91.2501 days/quarter. 360 days/year have 30 days/month and 90 days/quarter.

Simple Interest Formulas and Calculations:
Use this simple interest calculator to find A, the Final Investment Value, using the simple interest formula: A = P(1 + rt) where P is the Principal amount of money to be invested at an Interest Rate R% per period for t Number of Time Periods.  Where r is in decimal form; r=R/100; r and t are in the same units of time.

The accrued amount of an investment is the original principal P plus the accumulated simple interest, I = Prt, therefore we have:

A = P + I = P + (Prt), and finally A = P(1 + rt)

Calculate Total Amount Accrued (Principal + Interest), solve for A
A = P(1 + rt)
Calculate Principal Amount, solve for P
P = A / (1 + rt)
Calculate rate of interest in decimal, solve for r
r = (1/t)(A/P - 1)
Calculate rate of interest in percent
R = r * 100
Calculate time, solve for t
t = (1/r)(A/P - 1)

 */

//https://en.wikipedia.org/wiki/Compound_interest
//    https://en.wikipedia.org/wiki/Interest

public class InterestCalculator {
    public Double computeInterest(Double principal, Double intRate, int numYears, int yearParts, int periodsPerYear) {
        Double payment = computePayment(principal, intRate, numYears, yearParts, periodsPerYear);
        //A := p * IntExp(1 + r,n)
        return payment-principal;
    }

    @NonNull
    private Double computePayment(Double p, Double intRate, int numYears, int yearParts, int periodsPerYear) {
        int n = numYears * periodsPerYear + yearParts;
        Double r = intRate / 100.0 / periodsPerYear;
        return p * Math.pow((1.0 + r), n);
//        return Math.pow(p * (1.0 + r), n);
    }

    public String helloWorld() {
        return "Hello World";
    }
}
