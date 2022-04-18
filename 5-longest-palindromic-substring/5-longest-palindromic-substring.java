class Solution{
    public boolean isPalindrome(String s){
        for(int x=0;x<s.length()/2;x++){
            if(s.charAt(x)!=s.charAt(s.length()-1-x))
                return false;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        Solution ob=new Solution();
        String ans="";
        for(int x=0;x<s.length();x++){
            for(int y=s.length()-1;y>0;y--){
                String str=s.substring(x,y+1);
                if(ob.isPalindrome(str)){
                    if(str.length()>ans.length()){
                        ans=str;
                    }
                    break;
                }
            }
        }
        if(ans.length()==0){
            return s.charAt(0)+"";
        }
        return ans;
    }
}