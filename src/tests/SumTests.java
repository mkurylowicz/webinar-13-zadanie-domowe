package tests;

import my_app.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumTests {
    Calculator calc = new Calculator();
    @Test
    public void sumTests1(){
        //Calculator calc = new Calculator();

        Assert.assertEquals(9,calc.sum(5,4));
    }

    @Test
    public void sumTests2(){

        Assert.assertEquals(58,calc.sum(14,44));

    }

    @Test
    public void sumTests3(){

        Assert.assertEquals(103,calc.sum(45,58));

    }

}
