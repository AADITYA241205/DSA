class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        

        List<List<String>> ans = new ArrayList<>();

        int i = 0;

        while(i< s1.length()){

            if(s1.charAt(i)==s2.charAt(i)){
                i++;
                continue;
            }

            int start = i;

            while(i <s1.length() && s1.charAt(i) != s2.charAt(i)){
                i++;
            }

            String a1 = s1.substring(start, i);
            String a2 = s2.substring(start, i);

            List<String> ls = new ArrayList<>();
            ls.add(a1);
            ls.add(a2);

            ans.add(ls);
        }

        return ans;
    }
}
