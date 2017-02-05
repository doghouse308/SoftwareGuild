
package com.sg.statecapitals2;

/**
 *
 * @author Paul Peterson
 */
public class StateCapitals2App {
    
    public static void main(String[] args) {
        
        StateCapitals2 sc = new StateCapitals2();
        int selection = 0;
        boolean isSaved = false;
        
        while (selection != sc.menuItems.length){
            selection = sc.displayMenu();
            
            switch (selection){
                //add new capital
                case 1:
                    sc.addCapital();
                    break;
                //retrieve capital information    
                case 2:
                    sc.retrieveCapital();
                    break;
                //retrieve information for all capitals
                case 3:
                    sc.retrieveAllCapitals(0);
                    break;
                //retrieve information for capitals with population over floor
                case 4:
                    sc.retrieveAllCapitals(1);
                    break;
                //update capital
                case 5:
                    sc.updateCapital();
                    break;
                //delete capital
                case 6:
                    sc.deleteCapital();
                    break;
                //save file
                case 7:
                    sc.saveCapitals();
                    isSaved = true;
                    break;
                //load file
                case 8:
                    sc.loadCapitals();
                    break;
                //verify data saved and exit
                case 9:
                    if (! isSaved){
                        System.out.println("Please Save file.");
                        selection = 0;
                        break;
                    }
                    break;
                    
            }
        }
    }
    
}
