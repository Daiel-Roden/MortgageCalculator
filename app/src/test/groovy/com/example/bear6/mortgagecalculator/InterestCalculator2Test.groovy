package com.example.bear6.mortgagecalculator

import org.junit.Test;
import spock.lang.Specification

import static org.junit.Assert.assertEquals;

/**
 * Created by bear6 on 2/26/2018.
 *
 * https://dzone.com/articles/introduction-spock
 * https://dzone.com/articles/api-test-parameterization-with-spock
 *
 * https://stackoverflow.com/questions/38056901/class-not-found-empty-test-suite-when-running-unit-tests-in-android-studio
 *
 */

public class InterestCalculator2Test extends Specification {

    def "Test Interest calculations"(){
        given: "Interest Calculator"
        ic = new InterestCalculator()

        expect: "Interest calculated"
//        assertEquals(interest, ic.computeInterest(principal, interestRate, numYears,numYearParts,periodsPerYear),0.000000001);
        interest == ic.computeInterest(principal, interestRate, numYears, numYearParts, periodsPerYear)

        where: "Interest function parameters"
        principal | interestRate | periodsPerYear | numYears | numYearParts || interest
        100       | 10           | 1              | 1        | 0            || 10

    }

    def "Test simple math test"() {
        given:
          i = 1
          j = 2
        when:
          k = i + j
        then:
          k == 3
    }
}
