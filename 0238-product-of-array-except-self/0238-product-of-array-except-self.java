class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        int prefix = 1;
        for(int i = 0; i < n; i++){
            ans[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for(int i = n - 1; i >= 0; i--){
            ans[i] *= suffix;
            suffix *= nums[i];
        }
        return ans;
    }
}

//Brute force
// class Solution {
//     public int[] productExceptSelf(int[] nums){
//         int n = nums.length;
//         int[] ans = new int[n];

//         for(int i = 0; i < n; i++){
//             int product = 1;
//             for(int j = 0; j < n; j++){
//                 if(i != j){
//                     product *= nums[j];
//                 }
//             }
//             ans[i] = product;
//         }
//         return ans;
//     }
// }