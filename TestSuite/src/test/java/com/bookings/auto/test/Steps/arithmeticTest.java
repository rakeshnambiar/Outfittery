package com.bookings.auto.test.Steps;

import javafx.scene.Scene;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by rakeshnambiar on 7/21/16.
 */
public class arithmeticTest {
    @Test
    public void add() throws Exception {
        try{
            System.out.println("Addition");
            Assert.assertEquals(30.5,arithmetics.simpleCalculator("+",10,20.5),0.0);
            Assert.assertEquals(121.0,arithmetics.simpleCalculator("+",100.50,20.5),0.0);
            Assert.assertEquals(1998.0,arithmetics.simpleCalculator("+",999,999),0.0);
        }catch (Exception e){
            throw new Exception("ERROR: Unit Test Failed - Add "+this.toString());
        }

    }

    @Test
    public void substraction() throws Exception {
        try {
            System.out.println("Subtraction");
            Assert.assertEquals(0.0,arithmetics.simpleCalculator("-", 50.5, 50.25),0.0);
            Assert.assertEquals(3.0,arithmetics.simpleCalculator("-", 5, 2),0.0);
            Assert.assertEquals(25.0,arithmetics.simpleCalculator("-", 50, 25),0.0);
            Assert.assertEquals(-100.0,arithmetics.simpleCalculator("-", 100, 200),0.0);
        }catch (Exception e){
            throw new Exception("ERROR: Unit Test Failed - Subtraction "+this.toString());
        }
    }

    @Test
    public void multiplication() throws Exception {
        try {
            System.out.println("Multiplication");
            Assert.assertEquals(204.0,arithmetics.simpleCalculator("*", 10.1, 20.20),0.0);
            Assert.assertEquals(205.0,arithmetics.simpleCalculator("*", 10.15, 20.20),0.0);
            Assert.assertEquals(72.0,arithmetics.simpleCalculator("*", 9, 8),0.0);
            Assert.assertEquals(887112.0,arithmetics.simpleCalculator("*", 999, 888),0.0);
        }catch (Exception e){
            throw new Exception("ERROR: Unit Test Failed - Multiplication "+this.toString());
        }
    }

    @Test
    public void division() throws Exception {
        try {
            System.out.println("Division");
            Assert.assertEquals(328.0,arithmetics.simpleCalculator("/", 10000.1, 30.5),0.0);
            Assert.assertEquals(1.0,arithmetics.simpleCalculator("/", 10.15, 19.20),0.0);
            Assert.assertEquals(90.0,arithmetics.simpleCalculator("/", 90, 1),0.0);
            Assert.assertEquals(0.0,arithmetics.simpleCalculator("/", 0, 999),0.0);
        }catch (Exception e){
            throw new Exception("ERROR: Unit Test Failed - Division "+this.toString());
        }
    }
}
