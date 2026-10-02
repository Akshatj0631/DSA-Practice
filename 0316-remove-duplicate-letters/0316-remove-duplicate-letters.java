class Solution {
    public String removeDuplicateLetters(String s) {
        StringBuilder sb= new StringBuilder();
        boolean taken[]= new boolean[26];
        int lastindex[]= new int[26];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            lastindex[ch-'a']=i;
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(taken[ch-'a']) continue;
            while(sb.length()>0 && lastindex[sb.charAt(sb.length()-1)-'a']>i && sb.charAt(sb.length()-1)>ch)
            {
                taken[sb.charAt(sb.length()-1)-'a']=false;
                sb.deleteCharAt(sb.length()-1);
            }
            sb.append(ch);
            taken[ch-'a']=true;
        }
        return sb.toString();
    }
}