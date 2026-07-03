class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        for(int weight : weights){
            low = Math.max(low, weight);
            high += weight;
        }

        while(low < high){
            int mid = low + (high - low) / 2;
            int load = 0;
            int minDays = 1;
            for(int weight : weights){
                if(load + weight > mid){
                    minDays++;
                    load = 0;
                }
                load += weight;
            }
            if(minDays <= days){
                high = mid;  // left
            }
            else{
                low = mid + 1; // right
            }
        }
        return low;
    }
}

