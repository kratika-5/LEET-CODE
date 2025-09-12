class Solution {
    public int numberOfSubstrings(String s) {
        int[] ls = new int[]{-1, -1, -1};
            int k=0;
        int c=0;

        for(int i =0;i<s.length();i++)
           {   ls[s.charAt(i) - 'a'] = i;


            if(ls[0]!=-1&&ls[1]!=-1&&ls[2]!=-1)
              {  k= Math.min(ls[0], Math.min(ls[1], ls[2]));
                c=c+k+1;
           }
           }
        return c;

    }
}