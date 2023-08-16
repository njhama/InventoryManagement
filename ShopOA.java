package FinalPrjt;

import java.util.ArrayList;
import java.text.NumberFormat;

public class ShopOA
{
public static void main (String[] args)
{
ArrayList <Item> cart = new <Item> ArrayList();

Item item;
String itemName;
double itemPrice;
int quantity;
int totalQuantity;
double totalPrice;

String keepShopping = "y";

System.out.print ("Do you like to shop (y/n)? ");
keepShopping = Keyboard.readString();

while (keepShopping.equals("y"))
{
System.out.print ("Enter the name of the item: ");
itemName = Keyboard.readString();

System.out.print ("Enter the unit price: ");
itemPrice = Keyboard.readDouble();

System.out.print ("Enter the quantity: ");
quantity = Keyboard.readInt();


item = new Item (itemName, itemPrice, quantity);
cart.add(item);

// *** print the contents of the cart object
totalPrice = 0;
totalQuantity=0;
System.out.println ("\nCurrent Cart");
for (int i = 0; i < cart.size(); i++)
{
item = (Item)cart.get(i);
System.out.println (item);
totalPrice += item.getPrice()*item.getQuantity();
totalQuantity +=item.getQuantity();
}

NumberFormat fmt = NumberFormat.getCurrencyInstance();
System.out.println ("Total Price: " + fmt.format(totalPrice));
System.out.println ("Total Quantity: " + (totalQuantity));

System.out.println();
System.out.print ("Continue shopping (y/n)? ");
keepShopping = Keyboard.readString();
}
}
}