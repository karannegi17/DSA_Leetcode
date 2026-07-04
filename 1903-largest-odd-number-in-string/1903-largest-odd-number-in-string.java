class Solution {
    public String largestOddNumber(String num) {
        String ans = "";
        
        for(int i = 0; i < num.length(); i++){
            String slice = num.substring(0, i+1);
            char last = slice.charAt(slice.length() - 1);
            int digit = last - '0';

            if(digit % 2 == 1){
                ans = slice;
            }
        }
        if(ans.isEmpty()){
            return "";
        }else{
            return ans;
        }
    }
}