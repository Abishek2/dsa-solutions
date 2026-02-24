
import java.util.HashMap;
import java.util.Stack;

class ValidParanthses{

    public static boolean isValid(String s){

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char current = s.charAt(i);

            if(map.containsKey(current)){
                char topElement = stack.empty() ? '#' : stack.pop();

                if(topElement != map.get(current)){
                    return false;
                }
            }
            else{
                stack.push(current);
            }
        }

        return stack.isEmpty();

    }

    
}