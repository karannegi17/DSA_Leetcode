import java.util.Arrays;
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l = nums.length;
        int[] arr = new int[l];
        int positive = 0;
        int negative = 1;
        for(int i = 0; i < l; i++){
            if(num > 0){
                arr[positive] = nums[i];
                positive += 2;
            }
            else{
                arr[negative] = nums[i];
                negative += 2;
            }
        }
        return arr;
    }
}