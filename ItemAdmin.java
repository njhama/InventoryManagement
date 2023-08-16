package FinalPrjt;
import java.util.Scanner;
public class ItemAdmin
{
    //Admin class (password required) that adds new items to desired department location and adds to its arraylist
    public static void main(String[] args)
    {
         Scanner scan = new Scanner(System.in);
         String password = "";
         String condition = "y";
         System.out.println("Admin Login");
         System.out.println("Enter Password: ");
         password = scan.nextLine();

         //Check if given password is correct
        if(password.equals("pass123"))
        {
            while (condition.equalsIgnoreCase("y"))
            {
            //Ask user to input new item name
            System.out.println("Enter item name: " );
            String itemName = scan.nextLine();
            
            //Ask user to input new item department
            System.out.println("Enter item department: ");
            System.out.println("(Phone, Computer, Printer, Tablet)");
            String itemDepartment = scan.nextLine();
            
            //Ask user to input new item price($99.99)
            System.out.println("Enter item price: ");
            Double itemPrice = scan.nextDouble();
            
            //Ask user to input new item ID number
            System.out.println("Enter item ID: ");
            int itemID = scan.nextInt();
            
            //Ask user to input new item quantity
            System.out.println("Enter item quantity: ");
            int itemQuantity = scan.nextInt();
            
            //Checks which department to add new item to
            //Add new item and given information to array list
                switch(itemDepartment)
                {
                    case "Phone":
                        System.out.println("Has 5th generation cellular network? (true/false)");
                        boolean item5g = scan.nextBoolean();
                        System.out.println("Successfully added new item to Phone Department");
                        inv iPhone = new PhoneDepartment(itemName, itemPrice,itemID,itemQuantity,item5g);
                        break;
                    case "Computer":
                        System.out.println("Enter GPU");
                        String itemGPU = scan.nextLine();
                        System.out.println("Successfully added new item to Computer Department");
                        inv Computer = new ComputerDepartment(itemName, itemPrice,itemID,itemQuantity, itemGPU);
                        break;
                    case "Printer":
                        System.out.println("Prints in Color? (true/false)");
                        boolean checkColor = scan.nextBoolean();
                        System.out.println("Successfully added new item to Printer Department");
                        inv Printer = new PrinterDepartment(itemName, itemPrice,itemID,itemQuantity, checkColor);
                        break;
                     case "Tablet":
                        System.out.println("Enter Display (ie: Liquid Retina)");
                        String itemDisplay = scan.nextLine();
                        System.out.println("Successfully added new item to Tablet Department");
                        inv Tablet = new TabletDepartment(itemName, itemPrice,itemID,itemQuantity, itemDisplay);
                        break;
                }
            
            //Print the new Item information
            System.out.println("Name:" + itemName);
            System.out.println("Department:" + itemDepartment);
            System.out.println("Price:$" + itemPrice);
            System.out.println("ID:" + itemID);
            System.out.println("Quantity:" + itemQuantity);
            
            //Ask user to continue
            //Type 'y' to continue, 'n' to stop
            System.out.println("Continue? (y/n)");
            condition = scan.nextLine();
            condition = scan.nextLine();
            }
         }

        else
        {
             //Print out Incorrect if the given password doesn't match the stored password
             System.out.println("Incorrect password");
        }
    }
    
}
