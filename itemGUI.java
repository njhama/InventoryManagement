

package FinalPrjt;
import java.util.*;
import java.awt.Point;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.net.URL;
import java.util.List;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class itemGUI implements ActionListener
{
    
    boolean loggedIn = false; 
    ArrayList <inv>Inventory; 
    JLabel label;
    JTextField text;
    JButton button;
    JButton buttonAddItem;
    JButton addToInvButton;
    JFrame guiPasswordFrame;
    public itemGUI()
    {
        //Makes objects using Swing API
        guiPasswordFrame = new JFrame("Item Inventory Admin");
        JPanel panel = new JPanel();
        button = new JButton("Login");
        label = new JLabel("Not Logged In");
        text = new JTextField(15);
        
        
        panel.setBackground(new Color(207, 106, 204));
        
        
        //Sets frame size and adds exit feature
        guiPasswordFrame.setSize(400,200);
        guiPasswordFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Adding panel to external frame
        guiPasswordFrame.add(panel);
      
        //Sets size of each object
        panel.setLayout(null);
        button.setBounds(125,50, 120, 50); //(x,y,width, height)
        text.setBounds(125,10,120, 25);
        label.setBounds(145, 75 ,165, 100);
        
        panel.add(button);
        panel.add(label); 
        panel.add(text);
        
        button.addActionListener(this);
        
        guiPasswordFrame.setVisible(true);
    }
    
  
    //Creates new GUI if password is correct
    //OPENS MENU
    JButton changeAttributeButton;
    JButton viewAllButton;
    JButton logoutButton;
    JFrame itemGUIFrameAccess;
    JButton changeColorButton;
    JPanel itemGUIAccessPanel;
    public void itemGUIAccess()
    {
        itemGUIFrameAccess = new JFrame("Item Inventory Admin Menu");
        JPanel itemGUIAccessPanel = new JPanel();
        buttonAddItem = new JButton("Add new Item");
        changeAttributeButton = new JButton("Edit Item");
        viewAllButton = new JButton("View All Items");
        logoutButton = new JButton("Log Out");
        changeColorButton = new JButton("Change Colors");
        itemGUIAccessPanel.setBackground(new Color(67, 151, 255));
        
        
         itemGUIFrameAccess.setResizable(false);
        
        
        itemGUIFrameAccess.setSize(475,800);
        itemGUIFrameAccess.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        itemGUIFrameAccess.add(itemGUIAccessPanel);
        
        itemGUIAccessPanel.setLayout(null);
        
        changeColorButton.setBounds(100, 500, 250, 50);
        logoutButton.setBounds(100, 400, 250, 50);
        viewAllButton.setBounds(100, 300, 250, 50);
        changeAttributeButton.setBounds(100, 200, 250, 50);
        buttonAddItem.setBounds(100,100, 250, 50);
        
        buttonAddItem.addActionListener(this);
        viewAllButton.addActionListener(this);
        logoutButton.addActionListener(this);
        changeColorButton.addActionListener(this);
        
        itemGUIAccessPanel.add(buttonAddItem);
        itemGUIAccessPanel.add(changeAttributeButton);
        itemGUIAccessPanel.add(viewAllButton);
        itemGUIAccessPanel.add(logoutButton);
        itemGUIAccessPanel.add(changeColorButton);
        
        itemGUIFrameAccess.setVisible(true);
        //itemGUIFrameAccess.getContentPane().setBackground(Color.RED);
    }
    
    JComboBox departmentDropDown;
    JLabel addedSuccess;
    JTextField anotherParamText;
    JButton confirmAdd;
    String extraParam;
    String itemName;
        String itemDepartment;
        String itemPrice;
    String itemID;
    String itemQuantity;
    JTextField nameText;   
    JTextField priceText;
    JTextField idText;
    JTextField quantityText;
    //New GUI if AddItem Button is pressed
    JFrame addItemFrame;
    public void invAddItem()
    {
        addItemFrame = new JFrame("Add New Item to Inventory");
        JPanel panel = new JPanel();
        addToInvButton = new JButton("Add Item");
        departmentDropDown =  new JComboBox();
        confirmAdd = new JButton("Finish Adding");
        panel.setBackground(new Color(24, 229, 119));
        addItemFrame.setResizable(false);
        addedSuccess = new JLabel("");
        addItemFrame.setSize(750,400);
        addItemFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addItemFrame.add(panel);
        
        panel.setLayout(null);
        
        confirmAdd.setBounds(425, 245, 0, 0);
        addToInvButton.setBounds(425,95,200, 70);
        addedSuccess.setBounds(465, 130, 200, 100);
        departmentDropDown.setBounds(100,125, 200, 25);
        
        departmentDropDown.addItem("");
        departmentDropDown.addItem("Phone");
        departmentDropDown.addItem("Printer");
        departmentDropDown.addItem("Computer");
        departmentDropDown.addItem("Tablet");
        
        anotherParamText = new JTextField();
        anotherParamText.setBounds(425,200, 0, 0);
        
        
        JLabel nameLabel = new JLabel("Enter Item Name: ");
        nameText = new JTextField(20);
        nameText.setBounds(100,75, 200, 25);
        nameLabel.setBounds(100,50, 250, 20);
        
        JLabel departmentLabel = new JLabel("Department Name:");
        JTextField departmentText = new JTextField(20);
        //departmentText.setBounds(100,125, 200, 25);
        departmentLabel.setBounds(100,100, 250, 20);
        
        JLabel priceLabel = new JLabel("Cost $:");
        priceText = new JTextField(20);
        priceText.setBounds(100,175, 200, 25);
        priceLabel.setBounds(100,150, 250, 20);
        
        JLabel idLabel = new JLabel("ID:");
        idText = new JTextField(20);
        idText.setBounds(100,225, 200, 25);
        idLabel.setBounds(100,200, 250, 20);
        
        JLabel quantityLabel = new JLabel("Quantity:");
        quantityText = new JTextField(20);
        quantityText.setBounds(100,275, 200, 25);
        quantityLabel.setBounds(100,250, 250, 20);
        
        // itemName = nameText.getText();
        // itemDepartment = departmentText.getText();
        // itemPrice = priceText.getText();
        // itemID = idText.getText();
        // itemQuantity = quantityText.getText();
        extraParam = anotherParamText.getText();
        
        panel.add(nameText);
        panel.add(nameLabel);
        panel.add(departmentText);
        panel.add(departmentLabel);
        panel.add(priceText);
        panel.add(priceLabel);
        panel.add(idText);
        panel.add(idLabel);
        panel.add(quantityText);
        panel.add(quantityLabel);
        panel.add(addToInvButton);
        panel.add(addedSuccess);
        panel.add(departmentDropDown);
        panel.add(anotherParamText);
        panel.add(confirmAdd);
        addToInvButton.addActionListener(this);
        confirmAdd.addActionListener(this);
  
        addItemFrame.setVisible(true);
    }
    
    Boolean has5g;
    JLabel fifthParam;
    public void itemToInv()
    {
        String itemDepartment ="";
        if(departmentDropDown.getSelectedIndex() == 1)
        {
            itemDepartment = "Phone";
        }
        else if (departmentDropDown.getSelectedIndex() == 2)
        {
            itemDepartment = "Printer";
        }
        else if (departmentDropDown.getSelectedIndex() == 3)
        {
            itemDepartment = "Computer";
        }
        else if (departmentDropDown.getSelectedIndex() == 4)
        {
            itemDepartment = "Tablet";
        }
        JFrame frame = new JFrame("Added Successfully");
        JPanel panel = new JPanel();
        JLabel name = new JLabel("Name: " + itemName);
        JLabel department = new JLabel("Department: " + itemDepartment );
        JLabel price = new JLabel("Price : $" + itemPrice);
        JLabel id = new JLabel("ID: " + itemID);
        JLabel quantity = new JLabel("Quantity: " + itemQuantity);
        fifthParam = new JLabel("");
        panel.setLayout(null);
        panel.setBackground(new Color(178, 229, 253 ));
        frame.setSize(350,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        
        name.setBounds(100, 50, 250, 20);
        department.setBounds(100, 80, 250, 20);
        price.setBounds(100, 110, 250, 20);
        id.setBounds(100, 140, 250, 20);
        quantity.setBounds(100, 170, 250, 20);
        fifthParam.setBounds(100, 200, 250, 20);
        
        panel.add(name);
        panel.add(department);
        panel.add(price);
        panel.add(id);
        panel.add(quantity);
        panel.add(fifthParam);
        
        frame.setVisible(true);
    }
    
    
    public void printAll2(ArrayList<inv> inventory)
    {
        
        JFrame frame = new JFrame("test");
        JPanel panel = new JPanel();
        JTextArea textArea = new JTextArea();
        
        frame.setSize(350,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        
        
        panel.setLayout(null);
        panel.add(textArea);
        textArea.setText("HI");
        textArea.setBounds(150,150,150,150);
        //String test = String.valueOf(Inventory.get(2));
        
        // textArea.setText(test);
        
        
        
        
        int invSize = Inventory.size();
       
         for (int i = 0; i < invSize;i++)
        {
            System.out.println(Inventory.get(i));
            System.out.println("Working");
         }
        
         frame.setVisible(true);
    }
    
    public void changeColors()
    {
        itemGUIFrameAccess.getContentPane().setBackground(Color.RED);
    }
    
    public static void printAll3(ArrayList<inv> inventory)
    {
        int invSize = inventory.size();
         for (int i = 0; i < invSize;i++)
        {
            System.out.println(inventory.get(i));
            System.out.println("Working");
        }
    }
    Boolean printsInColor;
    String GPU;
    //Event Listener Commands
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        //first
        if (e.getSource().equals(button))
        {
                String userPassword = text.getText(); 
                if (userPassword.equals("abcd1234"))
                {
                    label.setText("Login Successful!");
                    itemGUIAccess();
                }
                else
                {
                    label.setText("Wrong Password. Try Again");
                }
        }
        
        //second
        else if (e.getSource().equals(viewAllButton))
        {
           printAll3(Inventory);
           itemGUIAccessPanel.setBackground(new Color(0, 0, 255));
           // int i = Inventory.size();
           // System.out.println(i);
           
           // int invSize = Inventory.size();
           // System.out.println("HI");
           // System.out.println(invSize);
           // printAll2(Inventory);
           
                //Inventory.get(i)
                
           // for (int i = 0; i < invSize;i++)
             // {
                 // System.out.println("Working");
             // }
        }
        
        //fourth
        else if (e.getSource().equals(buttonAddItem))
        {
                invAddItem();
        }
        //fifth
        else if(e.getSource().equals(addToInvButton))
        { 
            itemName = nameText.getText();
            itemID = idText.getText();
            itemQuantity = quantityText.getText();
            itemPrice = priceText.getText();
            if(departmentDropDown.getSelectedIndex() == 1)//PHONE
            {
                anotherParamText.setBounds(425,200, 200, 25);
                confirmAdd.setBounds(425, 245, 200, 70);
                addedSuccess.setText("  Offers 5G? (y/n):   ");
                
            }
            else if (departmentDropDown.getSelectedIndex() == 2)//Printer
            {
                anotherParamText.setBounds(425,200, 200, 25);
                confirmAdd.setBounds(425, 245, 200, 70);
                addedSuccess.setText("Prints in Color? (y/n):");
            }
            else if (departmentDropDown.getSelectedIndex() == 3)//Computer 
            {
                anotherParamText.setBounds(425,200, 200, 25);
                confirmAdd.setBounds(425, 245, 200, 70);
                addedSuccess.setText("     Type of GPU:     ");
            }
            else if (departmentDropDown.getSelectedIndex() == 4)//Tablet
            {
                anotherParamText.setBounds(425,200, 200, 25);
                confirmAdd.setBounds(425, 245, 200, 70);
                addedSuccess.setText("    Type of Display:  ");
            }
        }
       //sixth
        else if(e.getSource().equals(confirmAdd))
        {
                itemToInv();
                
               if(departmentDropDown.getSelectedIndex() == 1)//PHONE
               {
                        String checkPhone = anotherParamText.getText();
                        if (checkPhone.equals("y"))
                        {
                           has5g = true;
                           fifthParam.setText("Has 5g: " + has5g);
                        }
                        else if (checkPhone.equals("n"))
                        {
                            has5g = false;
                            fifthParam.setText("Has 5g: " + has5g);
                        }
                        else
                        {
                            has5g = null;
                            fifthParam.setText("Incorrect Input");
                        }
                         inv newPhone = new PhoneDepartment(itemName, Double.valueOf(itemPrice),Integer.parseInt(itemID),Integer.parseInt(itemQuantity),has5g);
               }
                
               else if (departmentDropDown.getSelectedIndex() == 2)//Printer
               {
                            String checkPrinter = anotherParamText.getText();
                            if (checkPrinter.equals("y"))
                             {
                                    printsInColor = true;
                                    fifthParam.setText("Prints in color: " + printsInColor);
                                    inv newPrinter = new PrinterDepartment(itemName, Double.valueOf(itemPrice),Integer.parseInt(itemID),Integer.parseInt(itemQuantity),printsInColor);
                              }
                            else if (checkPrinter.equals("n"))
                            {
                                   printsInColor = false;
                                   fifthParam.setText("Prints in color: " + printsInColor);
                                   inv newPrinter = new PrinterDepartment(itemName, Double.valueOf(itemPrice),Integer.parseInt(itemID),Integer.parseInt(itemQuantity),printsInColor);
                            }
                            else
                            {
                                has5g = null;
                                fifthParam.setText("Incorrect Input");
                            }
               }
                            
               else if (departmentDropDown.getSelectedIndex() == 3)//Computer 
               {
                    String computerGPU = anotherParamText.getText();
                    fifthParam.setText("Computer GPU: " + computerGPU);
                    inv newComputer = new ComputerDepartment(itemName, Double.valueOf(itemPrice), Integer.parseInt(itemID), Integer.parseInt(itemQuantity), computerGPU);
               }
                
               else if (departmentDropDown.getSelectedIndex() == 4)//Tablet
               {
                    String tabletDisplay = anotherParamText.getText();
                    fifthParam.setText("Computer GPU: " + tabletDisplay);
                    inv newTablet = new TabletDepartment(itemName, Double.valueOf(itemPrice), Integer.parseInt(itemID), Integer.parseInt(itemQuantity), tabletDisplay);
               }
        }
        //seventh  
        else if(e.getSource().equals(logoutButton))
        {
            itemGUIFrameAccess.setVisible(false);
            guiPasswordFrame.setVisible(false);
            addItemFrame.setVisible(false);
        }
        
        //eighth
        else if(e.getSource().equals(changeColorButton))
        {
            //itemGUIAccessPanel.setBackground(Color.RED);
            itemGUItest newWindow = new itemGUItest();
            //changeColors();
        }
       
       
        
        
     }
    
    public static void main(String[] args)
    {
        ArrayList <inv> Inventory = new <inv> ArrayList();
        inv iPhone11 = new PhoneDepartment("iPhone", 250.99, 123456, 32, true);
        inv MacBookAir = new ComputerDepartment("Macbook", 799.99, 123951, 89, "GTX 1590");
        inv BrotherPrinter2 = new PrinterDepartment("Brother", 59.99, 124312,32,true);
        inv iPadPro = new TabletDepartment("iPad", 299.99, 1321293, 73, "Retina");
        inv DellDesktop = new ComputerDepartment("Dell PC", 250.99, 159453, 12, "RX 560");
        
        Inventory.add(new PhoneDepartment("iPhone", 250.99, 123456, 32, true));
        Inventory.add(new ComputerDepartment("Macbook", 799.99, 123951, 89, "GTX 1590"));
        
         
        new itemGUI();
    }
    
}
