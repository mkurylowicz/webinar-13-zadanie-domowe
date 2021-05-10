package tests;

import my_app.Calculator;
import org.testng.annotations.Test;

public class SumTests extends Calculator {

    @Test
    public void sumTests1(){
        System.out.println("Suma liczb 5 i 4 to " + sum(5,4));
    }

    @Test
    public void sumTests2(){
        System.out.println("Suma liczb 14 i 44 to " + sum(14,44));
    }

    @Test
    public void sumTests3(){
        System.out.println("Suma liczb 45 i 58 to " + sum(45,58));
    }

}
