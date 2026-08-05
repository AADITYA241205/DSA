class Solution {
    public boolean checkIfExist(int[] arr) {

        int c = 0;
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr.length ; j++){
                if(i!=j && arr[i]==2*arr[j]){
                    c++;
                }
            }
        }

        if(c>0){
            return true;
        }
        return false;
        
    }
}