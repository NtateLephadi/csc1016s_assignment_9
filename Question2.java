import java.util.*;
public class Question2{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      Stack stack1 = new Stack<String>();
      Stack stack2 = new Stack<String>();
      System.out.println("Enter a string to test:");
      String line = scanner.nextLine();
      StringTokenizer stringTokenizer = new StringTokenizer(line);
      while(stringTokenizer.hasMoreTokens()){
         stack1.push(stringTokenizer.nextToken());
      }
      
      while(!stack1.empty()){
         switch(stack1.peek().toString()){
            case "<":
               if(stack2.empty()){
                  System.out.println("error at end: opening bracket '" + stack1.pop() + "' remains unclosed.");
                  System.exit(0);
               }
               else if(stack2.peek().toString().equals(">")){
                  stack1.pop();
                  stack2.pop();
               }
               else{
                  System.out.println("error: '"+ stack1.pop() + "' does not match with '" + stack2.pop() + "'.");
                  System.exit(0);
               }
               break;
            case "{":
               if(stack2.empty()){
                  System.out.println("error at end: opening bracket '" + stack1.pop() + "' remains unclosed.");
                  System.exit(0);
               }
               else if (stack2.peek().toString().equals("}")){
                  stack1.pop();
                  stack2.pop();
               }
               else{
                  System.out.println("error: '"+ stack1.pop() + "' does not match with '" + stack2.pop() + "'.");
                  System.exit(0);
               }
            
               break;
            case "[":
               if(stack2.empty()){
                  System.out.println("error at end: opening bracket '" + stack1.pop() + "' remains unclosed.");
                  System.exit(0);
               }
               else if(stack2.peek().toString().equals("]")){
                  stack1.pop();
                  stack2.pop();
               }
               else{
                  System.out.println("error: '"+ stack1.pop() + "' does not match with '" + stack2.pop() + "'.");
                  System.exit(0);
               }
            
               break;
            case "(":
               if(stack2.empty()){
                  System.out.println("error at end: opening bracket '" + stack1.pop() + "' remains unclosed.");
                  System.exit(0);
               }
               else if(stack2.peek().toString().equals(")")){
                  stack1.pop();
                  stack2.pop();
               }
               else{
                  System.out.println("error: '"+ stack1.pop() + "' does not match with '" + stack2.pop() + "'.");
                  System.exit(0);
               }
            
               break;
            default:
               stack2.push(stack1.pop());
               break;
         }
      }
      
      for (Object a: stack2){
         System.out.println("error at end: the close bracket '" + a + "' does not have a corresponding opening bracket.");
      }
      
      if (stack1.empty() && stack2.empty()){
         System.out.println("The string is correct! There are no mismatched brackets.");
      }
   }
}