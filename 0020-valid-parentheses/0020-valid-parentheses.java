class Solution {
    public boolean isValid(String s) {
        Stack<Character> x = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                x.push(ch);
            }
            else{
                if(x.isEmpty()){
                    return false;
                }
                char top = x.pop();
                if((ch == ')' && top != '(') ||
                  (ch == ']' && top != '[') ||
                  (ch == '}' && top != '{')){
                    return false;
                  }
            }
        }
        return x.isEmpty();
    }
}