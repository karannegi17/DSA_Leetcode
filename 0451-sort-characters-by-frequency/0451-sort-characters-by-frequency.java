class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        for (char arr : ch) {
           if (map.containsKey(arr)) {
              map.put(arr, map.get(arr) + 1);
            } else {
               map.put(arr, 1);
            }
        }

    int freq = 0;
    for (int newa : map.values()) {
      freq = Math.max(freq, newa);
    }

    for (int i = freq; i >= 1; i--) {
        for (char b : map.keySet()) {
            if (map.get(b) == i) {
                for (int j = 0; j < i; j++) {
                   ans.append(b);
                 }
            }
        }
     }
        return ans.toString();
    }
}