import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;
//todo this passed 4 of 5 test cases failed for input 1,2,3,4,5
class Prime{
    boolean isPrime(int num){
        boolean prime = true;
        int divisor = 1;
        int zeroRemainderCount = 0;
        if(num == 1 || num == 0){
            return false;
        }
        while (prime && divisor<=num){
            if(num != 0 && num%divisor==0){
                zeroRemainderCount++;
            }
            if (zeroRemainderCount > 2){
                prime = false;
                break;
            }
            divisor++;

        }
        return prime;
    }

    public void checkPrime(int... numArray){
        String primes = "";
        boolean prime = true;

        for(int i=0; i<numArray.length; i++){
            int num = numArray[i];
            if(isPrime(num)){
                primes = primes + Integer.toString(num) +" ";
            }
        }
        if(primes.length() == 0){
            System.out.println("\n");
        } else {
            System.out.println(primes);
        }
    }
}

public class PrimeChecker {


    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("/Users/jacobfrancois/java/demo-java/input.txt");

            BufferedReader br=new BufferedReader(fileReader, 8);
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            Prime ob=new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1,n2);
            ob.checkPrime(n1,n2,n3);
            ob.checkPrime(n1,n2,n3,n4,n5);
            Method[] methods=Prime.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
