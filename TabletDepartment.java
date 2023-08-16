package FinalPrjt;

public class TabletDepartment extends inv
{
    String display;
    public TabletDepartment(String itemName,double itemPrice, int itemID, int itemQuantity, String itemDisplay)
    {
        super(itemName,itemPrice,itemID,itemQuantity);
        display = itemDisplay;
    }
    
    public String getName()
    {
        return itemName;
    }
    
    public String getPrice()
    {
        return "$" + String.valueOf(itemPrice);
    }
    
    public int getID()
    {
        return itemID;
    }
   
    public int getQuantity()
    {
        return itemQuantity;
    }
    
    public String getDisplay()
    {
        return display;
    }
    
    public void changeName(String newName)
    {
        itemName = newName;
    }
    
    public void changePrice(double newPrice)
    {
        itemPrice = newPrice;
    }
    
    public void changeID(int newID)
    {
        itemID = newID;
    }
    
    public void changeQuantity(int newQuantity)
    {
        itemQuantity = newQuantity;
    }
    
    public String toString()
    {
        return "Name: " + itemName + "\n" + 
               "Price: "  + itemPrice + "\n" + 
               "ID: " + itemID + "\n" + 
               "Quantity" + itemQuantity +  "\n" + 
               "Display: " + display;
    }
    
    
}