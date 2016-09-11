package com.bookings.auto.test.Steps;

import org.apache.bcel.generic.Select;

/**
 * Created by rakeshnambiar on 7/21/16.
 */
public class arithmetics {
    public static double simpleCalculator(String operator, double nbr1, double nbr2) throws Exception {
        double result = 0.0;
        try{
            if (operator.equals("+"))
            {
                result = nbr1 + nbr2;
                System.out.println("Result : " + result);
            }
            if (operator.equals("-"))
            {
                result = Math.round(nbr1 - nbr2);
                System.out.println("Result : " + result);
            }
            if (operator.equals("/"))
            {
                result = Math.round(nbr1 / nbr2);
                System.out.println("Result : " + result);
            }
            if (operator .equals( "*"))
            {
                result = Math.round(nbr1 * nbr2);
                System.out.println("Result : " + result);
            }
            return result;
        }catch (Exception e){
            throw new Exception("ERRROR : While perform the Arithmetic calculation - "+operator);
        }
    }
}
