package FinalPrjt;
import java.util.ArrayList;
public abstract class inv
{
    public int itemID,itemQuantity;
    public double itemPrice;
    public String itemDepartment,itemName;
    
    public inv(String itemName,double itemPrice, int itemID, int itemQuantity)
    {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemID = itemID;
        this.itemQuantity = itemQuantity;
    }
    
    public String toString()
    {
       
        return "-----------------------------------------------------------------------------------------------------------------" + 
       "\nItem: " + this.itemName + " is in the " + this.itemDepartment + " department and it has the ID of " + "this.itemID" 
       + ". There are " + this.itemQuantity + " in quantity and each costs $" + this.itemPrice;
       
    }
    
    abstract public int getID();
    abstract public void changeName(String newName);
    abstract public void changePrice(double newPrice);
    abstract public void changeID(int newID);
    abstract public void changeQuantity(int newQuantity);
    // public getDepartment()
    // {
        // return this.itemDepartment;
    // }
    
    // public getName()
    // {
        // return this.itemName;
    // }
    
    // public getPrice()
    // {
        // return this.itemPrice;
    // }
    
    // public getID()
    // {
        // return this.itemID;
    // }
    
    // public getQuantity()
    // {
        // return this.itemQuantity;
    // }
    
    // public String getName(int size)
    // {
        // for (int i =0; i < size;i++)
        // {
            // return i + ") " + Inventory.get(i);
        // }
    // }
    // public static void getItem(int x)
    // {
        // System.out.println(Inventory);
    // }
}
    
   
    
// class Philosopher
// {
// public int value;
// public String name;

// public Philosopher(int value, String name)
// {
// this.value = value;
// this.name = name;
// }

// public String toString() {
// return "value = " + this.value + ", name = " + this.name;
// }
// }

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
    
    
    
    
    
    
    
    
    
    
    // private int itemID,itemQuantity;
    // private double itemPrice;
    // private String itemDepartment,itemName;
    // public inv(String itemName,String itemDepartment, double itemPrice, int itemID, int itemQuantity)
    // {
        // this.itemDepartment = itemDepartment;
        // this.itemName = itemName;
        // this.itemPrice = itemPrice;
        // this.itemID = itemID;
        // this.itemQuantity = itemQuantity;
    // }
    
    // public String getLocation()
    // {
        // return this.itemDepartment;
    // }
    
    // public Double getPrice()
    // {
        // return 10.2;
    // }
    
    // public int getID()
    // {
        // return 0;
    // }
    
    // public int getQuantity()
    // {
        // return 0;
    // }

    
    

    //location, price, id, and
//quantity on hand.