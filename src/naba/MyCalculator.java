package naba;

import java.math.BigInteger;

public class MyCalculator implements AdvancedArithmetic{


    @Override
    public void divisorSum(int n) {
        int sum = 0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum = sum+i;
            }
        }
        System.out.println("Sum of all divisors of "+n+" = "+sum);

    }

    @Override
    public void findFactorial(int n) {
       BigInteger result = BigInteger.ONE;
       for(int i=1; i<=n; i++){
           result = result.multiply(BigInteger.valueOf(i));
       }
        System.out.println(n+"! = "+result);

    }
}
