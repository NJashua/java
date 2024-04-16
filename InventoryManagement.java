import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;



 class  Inventory{
    private Map<String, Integer> items;
    public Inventory(){
        items = new HashMap<>();
    }

    public void addItem(String itemName, int quantity) {
        items.put(itemName, quantity);
        System.out.println("Item " + itemName + "added to inventory");
    }
    public void removeItem(String itemName){
        if (items.containsKey(itemName)){
        items.remove(itemName);
        System.out.println("Item" + itemName + "is remove");
    }else{
        System.out.println("No item founded");
    }
}
    public void updateQuantity(String itemName, int quantity){
        System.out.println("Enter quantity: ");
        if (items.containsKey(itemName)){
            items.put(itemName, quantity);
        }else{
            System.out.println("Enter valdid quantity number");
        }
    }
    public void viewInventory(){
        System.out.println("Current inventory status: ");
        for (Map.Entry<String, Integer> entry: items.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

 }
public class InventoryManagement {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Inventory inventory = new Inventory();
    int choice;
    do{
        System.out.println("\n1. Add Item");
        System.out.println("\n2. Remove Item");
        System.out.println("\n3. Update Qunatity");
        System.out.println("\n4. View Inventory");
        System.out.println("\n5. Exit..");
        choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Enter item name: ");
                String itemName = scanner.nextLine();
                System.out.println("Enter item quantity: ");
                int quantity = scanner.nextInt();
                inventory.addItem(itemName, quantity);
                break;
            case 2:
                System.out.println("Enter item name to remove: ");
                 itemName = scanner.nextLine();
                inventory.removeItem(itemName);
                break;
            case 3:
                System.out.println("Enter quantity:");
                quantity = scanner.nextInt();
                itemName = scanner.nextLine();
                inventory.updateQuantity(itemName, quantity);
                break;
            case 4:
                System.out.println("View inventory: ");
                inventory.viewInventory();
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice");
        } 
}   while (choice != 5);
    scanner.close();
}
}
