class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false; // different lengths = not anagrams

        int[] count = new int[26]; // count for each letter a-z

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // increment count for s
            count[t.charAt(i) - 'a']--; // decrement count for t
        }

        // if all counts are 0, then it's an anagram
        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }
    }
