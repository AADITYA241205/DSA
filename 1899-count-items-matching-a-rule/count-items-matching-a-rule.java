class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int c = 0;
        
        if(ruleKey.equals("color")){
            for(int i = 0 ; i<items.size() ; i++){
                if(items.get(i).get(1).equals(ruleValue)){
                    c++;
                }
            }
        }
        else if(ruleKey.equals("type")){
            System.out.println("b");
            for(int i = 0 ; i<items.size() ; i++){
                if(items.get(i).get(0).equals(ruleValue)){
                    c++;
                }
            }
        }
        else if(ruleKey.equals("name")){
            System.out.println("c");
            for(int i = 0 ; i<items.size() ; i++){
                if(items.get(i).get(2).equals(ruleValue)){
                    c++;
                }
            }
        }

        return c;
        
    }
}