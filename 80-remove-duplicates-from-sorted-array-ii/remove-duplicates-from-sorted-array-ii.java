class Solution {
    public int removeDuplicates(int[] arr) {

        int i = 1;
        int j = 1;
        int count = 1;
        while (i < arr.length && j < arr.length) {

            if (arr[i] - arr[i - 1] != 0) {
                arr[j] = arr[i];
                j++;
                count = 1;
            }
            else if(count<2){
                count++;
                arr[j] = arr[i];
                j++;
            }
            i++;
        }
        return j;
    }
}