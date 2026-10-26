class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        if(s.isEmpty()){
            return true;
        }
       
        for(char c : s.toCharArray()){
           if(c == '(' || c=='[' || c =='{'){
            stack.push(c);
           } 
            else {
                if(stack.size()>0){
                if(c == ')'){
                 char last = stack.pop();
                  if(last != '('){
                    return false;
                  }
            
           
           }else if( c==']'){
            char last = stack.pop();
            if(last != '['){
                return false;
            }
           }
           else{
            char last = stack.pop();
            if(last != '{'){
                return false;
            }
            
           }
                }
                else{return false;}     
        }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
