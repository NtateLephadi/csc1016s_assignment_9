import java.util.*;
public class Question1 {
   public static void main(String[] args){
      ArrayDeque queue = new ArrayDeque<String>();
      Scanner scanner = new Scanner(System.in);
      while(scanner.hasNext()){
         String line = scanner.nextLine();
         switch(line){
            case "X":
               System.exit(0);
               break;
            case "O":
               if (queue.peek() == null){
                  System.out.println("Buffer Empty");
               }
               else{
                  System.out.println("Data: " + queue.poll());
               }
               break;
            default:
               queue.offer(line);
               break;
         }
      }
   }
}
