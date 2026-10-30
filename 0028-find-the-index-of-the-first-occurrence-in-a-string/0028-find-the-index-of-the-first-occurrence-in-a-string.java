class Solution {
    public int strStr(String haystack, String needle) {
      if(!haystack.contains(needle)) return -1;
      int ind=haystack.indexOf(needle);
      return ind;  
    }
}