class Solution {
    public int minRotations(String s) {

        int a = 0;
        int ans = 0;

        for(int i =0; i<s.length(); i++){

            int tar = s.charAt(i)-'0';
            int rot = Math.abs(a-tar);
            
            ans += Math.min(rot, 10-rot);

            a = tar;
        }

        return ans;
    }
}