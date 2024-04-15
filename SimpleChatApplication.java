import java.util.ArrayList;
import java.util.Scanner;

class ChatMessage {
    private String sender;
    private String message;

    public ChatMessage(String sender, String message) {
        this.sender = sender;
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }
}

public class SimpleChatApplication {
    private ArrayList<ChatMessage> chatHistory;

    public SimpleChatApplication() {
        chatHistory = new ArrayList<>();
    }

    public void sendMessage(String sender, String message) {
        ChatMessage chatMessage = new ChatMessage(sender, message);
        chatHistory.add(chatMessage);
    }

    public void displayChatHistory() {
        for (ChatMessage chatMessage : chatHistory) {
            System.out.println(chatMessage.getSender() + ": " + chatMessage.getMessage());
        }
    }

    public static void main(String[] args) {
        SimpleChatApplication chatApp = new SimpleChatApplication();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Send Message\n2. Display Chat History\n3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String sender = scanner.nextLine();
                    System.out.print("Enter your message: ");
                    String message = scanner.nextLine();
                    chatApp.sendMessage(sender, message);
                    break;
                case 2:
                    System.out.println("Chat History:");
                    chatApp.displayChatHistory();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
