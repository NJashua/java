import java.util.Scanner;
import java.util.Date;
import java.time.LocalDateTime;
public class Simplechatbot {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Hi, I'm your simple chatbox.");
            System.out.println("You can ask me weather, day or anything else..!");
            System.out.println("Type exit to exit the conversation..");
            
            while (true) {
                String userInput = scanner.next().toLowerCase();
                System.out.println("You:");
                if (userInput.contains("weather")){
                    System.out.println("Today weather looking good with normal temparature");
                }else if(userInput.contains("day")){
                    Date currDate = new Date();
                    LocalDateTime currDateTime = LocalDateTime.now();
                    System.out.println(String.format("Today date is %s and current time %s", currDate, currDateTime));
                }
                else if(userInput.contains("exit")){
                    System.out.println("ChatBot: Good Bye, have a nice day.");
                    break;
                }
                else{
                    System.out.println("Feel free to connect again");
                    break;
                }
            }
        } catch (IllegalArgumentException e){
            System.out.println("Enter a correct word in above..");
        }
    }
}
