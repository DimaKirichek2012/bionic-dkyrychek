package Lesson_2;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Hasler on 14.07.2015.
 */
public class Test_1 {

    @Test
    public void Example(){

        Assert.assertTrue(isPrime(5),"This numner isn't prime number");
    }

    public boolean isPrime(int N){
        if(N<=2) return true;
        for (int i=2; i*i<=N;i++)
            if (N%i==0)return false;
        return true;
    }

}
