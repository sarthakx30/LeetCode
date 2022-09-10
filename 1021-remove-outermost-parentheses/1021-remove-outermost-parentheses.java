class Solution {
    public String removeOuterParentheses(String s) {
        int opened=0;
        int closed=0;
        int start=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                opened++;
            }
            else{
                closed++;
            }
            if(opened==closed){
                sb.append(s.substring(start+1,i));
                start=i+1;
            }
        }
        return sb.toString();
    }
}