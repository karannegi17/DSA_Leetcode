class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m * k > bloomDay.length){
            return -1;
        }      

        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;

        for(int bloom : bloomDay){
            left = Math.min(left, bloom);
            right = Math.max(right, bloom);
        }

        while(left <= right){
            int mid = left + (right - left) / 2;
            int flower = 0;
            int bouquet = 0;
            for(int bloom : bloomDay){
                if(bloom <= mid){                    
                    flower++;
                    if(flower == k){
                        bouquet++;
                        flower = 0;
                    }
                }else{
                    flower = 0;
                }
            }
            if(bouquet >= m){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}


