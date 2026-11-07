class Solution {
    public long countValidSubstrings(String s) {


        int a = -1;
        int b = -1;
        int l = 0;
        long ans = 0;

        for(int i = 0; i<s.length(); i++){

            char ch = s.charAt(i);
            if(ch == 'a'){
                a = i;
            }
            else if(ch == 'b' && a!=-1){
                b = a;
            }
            else if(ch == 'c' && b!=-1) {
                l = Math.max(l, b+ 1);
            }

            ans += i - l + 1;
        }

        return ans;
    }
}
        