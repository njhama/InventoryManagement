package FinalPrjt;

if (e.getSource().equals(button))
        {
                String userPassword = text.getText(); 
                if (userPassword.equals("a"))
                {
                    label.setText("Login Successful!");
                    itemGUIAccess();
                }
                else
                {
                    label.setText("Wrong Password. Try Again");
                }
        }
        
        
        
        else if (e.getSource().equals(viewAllButton))
        {
           printAll3(Inventory);
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
        
        
        else if (e.getSource().equals(buttonAddItem))
        {
                invAddItem();
        }
        
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
                          }
                        else if (checkPrinter.equals("n"))
                        {
                               printsInColor = false;
                               fifthParam.setText("Prints in color: " + printsInColor);
                        }
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
            
 
            
        else if(e.getSource().equals(logoutButton))
        {
            itemGUIFrameAccess.setVisible(false);
            guiPasswordFrame.setVisible(false);
            addItemFrame.setVisible(false);
            
        }