package LeetcodeArrays;

public class LC_1732_highestAltitude 
{
    public static void main(String[] args) 
    {
        int a [] = { -5,1,5,0,-7 };
        int c = highestAltitude(a);

        System.out.println(c);
    }

    static int highestAltitude (int a[])
    {

        int sum = 0;
        int b = 0;

        for(int i=0; i<a.length; i++)
        {
            sum = sum += a[i];

            if(sum > b)
            {
                b = sum;
            }
        }
        return b;
    }   

}
