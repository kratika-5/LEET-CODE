class Solution {
    public String reverseWords(String s) {
        StringBuilder  result = new StringBuilder();

             String [] c = s.trim().split("\\s+");
            int l=c.length;
        for(int i=l-1;i>=0;i--)
        {
            result.append(c[i]);
             if (i > 0) result.append(" ");
        }
       
           return result.toString();

    }
}