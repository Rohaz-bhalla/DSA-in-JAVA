package Arrays;

public class max_differnce 
{
  public static void main(String[] args) 
  {
    int a[] = { 1,2,3,4,5,6,7,8,9 };
    System.out.println(maxDiffernce(a));
  }
  
  static int maxDiffernce(int a[])
  {
    int small = a[0], large = a[0];
    for(int i=0; i<=a.length-1; i++)
    {
        if(a[i]<small)
        {
            small = a[i];
        }
        
        if (a[i]>large)
        {
            large = a[i];
        }
    }
    return (large - small);
  }
}
