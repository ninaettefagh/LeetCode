class Solution {
    public boolean isValid(String s) {
        boolean ret = false;
        int length = s.length();
        
        Stack<Character> st = new Stack<>();
        
        if(length%2 != 0){
            return false;
        }
        
        int i = 0;
        while(i<length){
            char c = s.charAt(i);
            if (c =='(' || c =='[' || c=='{'){
                st.push(c);
            } else if (c == ')' && !st.empty() && st.peek() == '('){
                st.pop();
            } else if (c == '}' && !st.empty() && st.peek() == '{'){
                st.pop();
            } else if (c == ']' && !st.empty() && st.peek() == '['){
                st.pop();
            } else {
                return false;
            }
            
            i++;
        }  
        
        if (!st.empty()){
            return false;
        }        
        
        return true;
    }
}