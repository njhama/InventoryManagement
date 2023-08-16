package FinalPrjt;

public class PhoneDepartment extends inv
{
    boolean item5g;
    public PhoneDepartment(String itemName,double itemPrice, int itemID, int itemQuantity, boolean has5g)
    {
        super(itemName,itemPrice,itemID,itemQuantity);
        item5g = has5g;
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
    
    public boolean check5g()
    {
        return item5g;
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
               "5g: " + item5g;
    }
}