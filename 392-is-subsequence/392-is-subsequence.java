class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        if(s.length()>t.length()){
            return false;
        }
        int ind=0;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)==s.charAt(ind)){
                ind++;
            }
            if(ind==s.length()){
                return true;
            }
        }
        return false;
    }
}