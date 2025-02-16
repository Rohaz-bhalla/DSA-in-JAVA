public class monotonicArray_leetcode896 
{
   public static void main(String[] args) 
   {
     int a [] = { 1,2,4,5,7,8,9 };
     System.out.println(isMonotonic(a));
   }    

static boolean isMonotonic(int a[])
{
    if(isAsceding(a) || isDescending(a))
    {
        return true;
    }

    else
    {
        return false;
    }
}

static boolean isAsceding(int a[])
{

  boolean flag = true;

    for(int i=0; i<=a.length-2; i++)
    {
        if(a[i] <= a[i+1])
        {
            //do nothing
        }

        else
        {
            flag = false;
            break;
        }
    }
    return flag;
}

static boolean isDescending(int a[])
{
    boolean flag = true;

    for(int i=0; i<= a.length-2; i++)
    {
        if(a[i] >= a[i+1])
        {
            //do nothing
        }

        else
        {
           flag = false;
           break;
        }
    }
    return flag;
}

}
