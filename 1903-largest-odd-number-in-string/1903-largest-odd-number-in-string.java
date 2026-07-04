class Solution {
    public String largestOddNumber(String num) {
       boolean found = false;

        char last = num.charAt(num.length() - 1);

        if ((last - '0') % 2 != 0) {
            return num;
        }

        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);

            if ((ch - '0') % 2 != 0) {
                found = true;
                return num.substring(0, i + 1);
            }
        }

        return "";
        
    }
}

/*
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
            return ans; */