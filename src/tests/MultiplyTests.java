package tests;

import my_app.Calculator;
import org.testng.annotations.Test;

public class MultiplyTests extends Calculator {

    @Test
    public void multiplyTest1(){
        System.out.println("Iloczyn liczb 5 i 4 to " + multiply(5,4));
    }

    @Test
    public void multiplyTest2(){
        System.out.println("Iloczyn  liczb 25 i 8 to " + multiply(25,8));
    }

    @Test
    public void multiplyTest3(){
        System.out.println("Iloczyn liczb 7 i 6 to " + multiply(7,6));
    }


}
