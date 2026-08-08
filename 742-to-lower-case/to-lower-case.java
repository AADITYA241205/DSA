class Solution {
    public String toLowerCase(String s) {

        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i<s.length() ; i++){
            if((int)s.charAt(i)<=90 && (int)s.charAt(i)>64){
                ans.append((char)(s.charAt(i)+32));
            }
            else{
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
        
    }
}