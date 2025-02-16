//To find multiple missing numbers in an array

public class MultipleMissing 
{
    public static void main(String[] args) 
    {
        int a [] = { 5,3,7,2,8,1,11 };
        multipleMissingNumbers(a,10); // helper method showing range of array 'a' with an upper limit of 10
    }

static void multipleMissingNumbers(int a [], int N)
{
    int freq [] = new int [N+1];  // creating a freq table

    // pick elements and set 1 in corresponding freq array
    for(int i=0; i<=a.length-1; i++)
    {
      int num = a[i];
      
      if(num >= 1 && num <= N)  //Checks whether the element is in given limit
      freq [num] = 1;

      else{
        System.out.println("Invalid Number :"+num);
      }
    }
    // now check which elements have 0 missing 
    for(int i=1; i<=N; i++)
    if (freq [i] == 0)
    System.out.println("The missing number is : "+i);
}

}