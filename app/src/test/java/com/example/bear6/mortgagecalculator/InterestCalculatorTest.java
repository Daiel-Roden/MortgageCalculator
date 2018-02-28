package com.example.bear6.mortgagecalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by bear6 on 2/25/2018.
 */
public class InterestCalculatorTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void computeInterest() throws Exception {
        InterestCalculator ic = new InterestCalculator();
        Double principal = 100.0;
        Double intRate = 10.0;
        assertEquals(10.0, ic.computeInterest(principal, intRate,1,0,1),0.000000001);
        assertEquals(21.0, ic.computeInterest(principal, intRate,2,0,1),0.000000001);
    }

    @Test
    public void computeMortgagePayment() throws Exception {
        /*
        clear_kbd;
        ErrorCode := 0;  CriticalVal := 0.0;
        r := IntRate/100.0/Periods_Per_Year;
        n := Trunc(NumYears *Periods_Per_Year + YearParts);

        If (p = 0.0) AND (A<>0.0) AND (r<>0.0) AND (n<>0) Then
        p := (r * A) / (1 - (IntExp(1 + r,-n)))
        */
        MortgageCalculator mc = new MortgageCalculator();

        assertEquals(1107,mc.calculatePayment(225000,3.75,30, 000001), 00000001);
    }

    }