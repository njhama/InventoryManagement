package FinalPrjt;
import java.util.ArrayList;
import java.util.Scanner;

public class InventoryDriver
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList <inv> Inventory = new <inv> ArrayList();
        //inv.add(new PhoneDepartment("iPhone", 250.99, 123456, 32));
        //String itemName,String itemDepartment, double itemPrice, int itemID, int itemQuantity
        inv iPhone11 = new PhoneDepartment("iPhone", 250.99, 123456, 32, true);
        inv MacBookAir = new ComputerDepartment("Macbook", 799.99, 123951, 89, "GTX 1590");
        inv BrotherPrinter2 = new PrinterDepartment("Brother", 59.99, 124312,32,true);
        inv iPadPro = new TabletDepartment("iPad", 299.99, 1321293, 73, "Retina");
        inv DellDesktop = new ComputerDepartment("Dell PC", 250.99, 159453, 12, "RX 560");
        
        
        Inventory.add(new PhoneDepartment("iPhone", 250.99, 123456, 32, true));
         Inventory.add(new ComputerDepartment("Macbook", 799.99, 123951, 89, "GTX 1590"));
        // inv a = new inv("iPhone", 250.99, 123456, 32);
        // Inventory.add(new inv("iPhone", "Phone", 250.99, 123456, 32));
        // Inventory.add(new inv("Macbook", "Laptop", 799.99, 123951, 89));
        // Inventory.add(new inv("Dell PC", "Computer", 250.99, 159453, 12));
        // Inventory.add(new inv("Brother", "Printer", 59.99, 124312,32));
        // Inventory.add(new inv("iPad", "Tablets", 299.99, 1321293, 73));
       System.out.println(Inventory);
        
        
        // System.out.println("Electronics Store Inventory System");
        
        // for (inv x : Inventory) 
        // System.out.println(x);
            
        // int size = Inventory.size();
        // //addToInv("Brother", "Printer", 59.99, 124312,32);
        
        // // boolean pass =  true;
        // // while (pass == true)
        // // {
      // for (int i = 0; i < Inventory.size(); i++)
      // {
          // System.out.println();
      // }
            
        // String condition =  "y";
      // while (condition.equalsIgnoreCase("y"))
      // {
        // System.out.println("Type Item Number: ");
        // int selectedNum = scan.nextInt();
        // System.out.println(Inventory.get(selectedNum -1));
        // // System.out.println("Continue Searching? (y/n)");
        // // String yesorno = scan.nextLine();
        // // if (yesorno == "n")
        // // pass = false;
        // // else 
        // // pass =true;
        // // }
        // System.out.println("Search again? (y/n)");
        // condition = scan.nextLine();
        // condition = scan.nextLine();
      // }
      printAll(Inventory);
    }
    
    // public void printAll1()
    // {
        // printAll(Inventory);
    // }
    
    public static void printAll(ArrayList<inv> inventory)
    {
        int invSize = inventory.size();
         for (int i = 0; i < invSize;i++)
        {
            System.out.println(inventory.get(i));
            System.out.println("Working");
        }
    }
    
    // public static void addToInv(String itemName,String itemDepartment, double itemPrice, int itemID, int itemQuantity)
    // {
        // Inventory.add(new inv(itemName, itemDepartment, itemPrice, itemID, itemQuantity));
    // }
    
}
// public class ArrayListObj
// {
// public static void main(String[] args)
// {

// // Create an ArrayList of objects.
// ArrayList<Philosopher> list = new ArrayList<Philosopher>();
// list.add(new Philosopher(1, "Socrates"));
// list.add(new Philosopher(2, "Plato"));

// // Display our objects.
// for (Philosopher p : list) {
// System.out.println(p);
// }
// }
// }

//(String itemName,String itemLocation, double itemPrice, int itemID, int itemQuantity)
//(String itemLocation, int itemPrice, int itemID, int itemQuantity)