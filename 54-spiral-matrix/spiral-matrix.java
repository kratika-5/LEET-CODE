class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int n=matrix.length;
        int m=matrix[0].length;
        int l=0,r=m-1;
        int t=0,b=n-1;

        List<Integer> ans= new ArrayList<>();

        while(t<=b&&l<=r)
        {
            for(int i=l;i<=r;i++)
             ans.add(matrix[t][i]);

             t++;
             for(int i =t;i<=b;i++)
               ans.add(matrix[i][r]);
             r--;  

            if(t<=b)  
             for(int i = r;i>=l;i--)  
               ans.add(matrix[b][i]);
             b--;

             if(l<=r)
            { for(int i=b;i>=t;i--)
             ans.add(matrix[i][l]);
              l++;  
        }
        }
        return ans;
    }
}