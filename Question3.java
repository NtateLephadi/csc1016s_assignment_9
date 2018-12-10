import java.util.*;
public class Question3{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      LinkedList link = new LinkedList<Character>();
      System.out.println("Enter a string to test:");
      String line = scanner.nextLine();
      char[] tokens = line.toCharArray();
      for (char token: tokens){
         if (Character.isDigit(token)){
            link.add(token);
          }
          else if(!Character.isDigit(token) || !(token=='-') || !(token=='*') || !(token=='+') || !(token=='\\')){
            System.out.println("Integer expected but not found");
            System.exit(0);
          }
         else if(token == '-'){
            if (link.size() < 2){
              System.out.println("Insufficient arguments for -");
              System.exit(0);
            }
            else{
              link.push( - Integer.valueOf(link.pollLast().toString()) + Integer.valueOf(link.pollLast().toString()));
            }
         }
         else if(token == '+'){
           if (link.size() < 2){
             System.out.println("Insufficient arguments for +");
             System.exit(0);
           }
           else{
             link.push(Integer.valueOf(link.pollLast().toString()) + Integer.valueOf(link.pollLast().toString()));
            }
         }
         else if(token == '*'){
           if (link.size() < 2){
             System.out.println("Insufficient arguments for *");
             System.exit(0);
           }
           else{
            link.push(Integer.valueOf(link.pollLast().toString()) * Integer.valueOf(link.pollLast().toString()));
          }
         }
         else if(token == '/'){
           if (link.size() < 2){
             System.out.println("Insufficient arguments for /");
             System.exit(0);
           }
           else{
            link.push(Integer.valueOf(link.pollLast().toString()) / Integer.valueOf(link.pollLast().toString()));
          }
         }
      }
      if (link.size() > 1){
        System.out.println("Extra symbols in expression");
        System.exit(0);
      }
      else{
        System.out.println("Answer: " + link.pop());
      }
   }
}
