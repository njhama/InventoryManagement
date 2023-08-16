package FinalPrjt;
import java.util.*;

public class itemEditor
{
 
    public static void removeItem(ArrayList<inv> inventory, int itemID)
    {
        int a = inventory.size();
        // for (int numbers : inventory.size())
        // {
            // if(itemID == inventory.get(i).getID())
            // {
                // inventory.remove(numbers);
            // }
        // }
       
        for (int i = 0; i < a;i++)
        {
            if(itemID == inventory.get(i).getID())
            {
                inventory.remove(i);
            }
        }
    }
    
    // public static void changeName(ArrayList<inv> inventory, int itemID, String newName)
    
    // public static void getArraySize(ArrayList<inv> inventory)
    // {
        
    // }
}