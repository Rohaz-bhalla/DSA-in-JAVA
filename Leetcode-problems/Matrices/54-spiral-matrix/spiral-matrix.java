class Solution {
    public List<Integer> spiralOrder(int[][] a) 
    {
        List<Integer> ans = new ArrayList<>();
        int i,j,k,x1,x2,y1,y2;
         
        x1 = 0;
        y1 = 0;
        x2 = a.length - 1;
        y2 = a[0].length - 1;

        i = 0;
        j = 0;

        outer:
        while(true)
        {
          for( j=y1; j<=y2; j++ ) //go right
          {
            ans.add(a[x1][j]); // x1 is used bcz x1 is topmost row yaha se shuru hora h
          }
          x1++;

          if( x1>x2 ) break;

          for( i=x1; i<=x2; i++ ) // go down
          {
            ans.add(a[i][y2]);
          }
          y2--;

          if( y1>y2 ) break;

          for( j=y2; j>=y1; j-- )// go left
          {
            ans.add(a[x2][j]);
          }
          x2--;

          if( x1>x2 ) break;

          for( i=x2; i>=x1; i-- )// go up
          {
            ans.add(a[i][y1]);
          }
          y1++;

          if(y1>y2) break;
        }
        return ans;
    }
}