import java.util.*;
public class Question3{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      LinkedList link = new LinkedList<Character>();
      System.out.println("Enter a string to test:");
      String line = scanner.nextLine();
      char[] tokens = line.toCharArray();
      for (char token: tokens){
         if (Character.isDigit(token))
            link.add(token);
         else if(token == '-'){
            link.push(Integer.valueOf(link.pop().toString()) - Integer.valueOf(link.pop().toString())); 
         }
         else if(token == '+'){
            link.push(Integer.valueOf(link.pop().toString()) + Integer.valueOf(link.pop().toString())); 
         }
         else if(token == '*'){
            link.push(Integer.valueOf(link.pop().toString()) * Integer.valueOf(link.pop().toString())); 
         }
         else if(token == '/'){
            link.push(Integer.valueOf(link.pop().toString()) / Integer.valueOf(link.pop().toString())); 
         }
      }
   }
}