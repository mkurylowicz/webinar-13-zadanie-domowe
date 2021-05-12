package tests;

import my_app.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplyTests  {

    Calculator calc = new Calculator();

    @Test
    public void multiplyTest1(){
        Assert.assertEquals(20,calc.multiply(5,4));

    }

    @Test
    public void multiplyTest2(){
        Assert.assertEquals(200,calc.multiply(25,8));

    }

    @Test
    public void multiplyTest3(){
        Assert.assertEquals(42,calc.multiply(6,7));
    }


}
