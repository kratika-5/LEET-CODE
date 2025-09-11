class Solution {
    public int characterReplacement(String s, int k) {
        
        int l=0; int r; int maxlen=0; int maxc=0;
        int[] freq= new int[26];

        HashSet<Character> set = new HashSet<>();

        for( r =0;r<s.length();r++)
        {
            char c= s.charAt(r);
             freq[c-'A']++;
             

             maxc=Math.max(maxc,freq[c-'A']);
             
                while ((r - l + 1) - maxc > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }

             maxlen=Math.max(maxlen,r-l+1);

        }
        return maxlen;
    }
}