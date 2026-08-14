class Solution {
    public int maximumLengthSubstring(String s) {

        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] arr = new int[26];
            int len = 0;
            for (int j = i; j < s.length(); j++) {
                arr[s.charAt(j) - 'a']++;
                if (arr[s.charAt(j) - 'a'] > 2) {
                    break;
                }
                len = j-i+1;

            }
            max = Math.max(max, len);

        }
        return max;

    }
}