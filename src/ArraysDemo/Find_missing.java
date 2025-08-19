package ArraysDemo;

// An array of size 9 is supposed to contain random numbers from 1-10 out of which one is missing. Find the missing

// import java.util.*;

public class Find_missing 
{
    public static void main(String[] args) 
    {
        int a [] = { 1,2,3,4,5,7,8,9,10 };
        System.out.println(missingNumber(a,10));
    }    
    static int missingNumber(int a[],int N) // function calling Array a and expected value i.e 10


     {
        int expected_sum = N*(N+1)/2;
        int actual_sum = java.util.Arrays.stream(a).sum(); //it adds the array, if import option not avialable then we can use java.util. here

        int diff = Math.abs(actual_sum - expected_sum);

        return diff;
     }
}
