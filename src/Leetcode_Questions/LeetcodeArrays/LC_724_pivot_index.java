package LeetcodeArrays;

public class LC_724_pivot_index 
{
    public static void main(String[] args) 
    {
        int a[] = { 1,7,3,6,5,6 };
        int b = pivotIndex(a);

        System.out.println(b);
    }

    static int pivotIndex(int a[])
    {
        int totalSum= 0;
        int sum = 0;

        for(int p:a)
        {
            totalSum += p;
        }

        for(int i=0; i<a.length; i++)
        {
            if(sum == totalSum - sum - a[i]) return i ; 
            sum += a[i];           
        }
        return -1;
    }
}

