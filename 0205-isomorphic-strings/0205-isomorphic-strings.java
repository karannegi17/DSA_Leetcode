class Solution {
    public boolean isIsomorphic(String s, String t) {
       HashMap<Character,Character> m=new HashMap<>();
       HashMap<Character,Character> h=new HashMap<>();
        for(int i=0;i<s.length();i++){
           char ch1=s.charAt(i);
           char ch2=t.charAt(i);
           if(m.containsKey(ch1)){
               if(m.get(ch1)!=ch2){
                   return false;
               }
           }
           else{
               m.put(ch1,ch2);
           }
            if(h.containsKey(ch2)){
               if(h.get(ch2)!=ch1){
                   return false;
               }
           }
           else{
               h.put(ch2,ch1);
           }
        }
        return true;
    }
}
