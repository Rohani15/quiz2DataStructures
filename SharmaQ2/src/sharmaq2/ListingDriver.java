
package sharmaq2;

import javax.swing.JOptionPane;

public class ListingDriver 
{
    public static void main(String[] args)
    {
        Listing l2 = new Listing(23, "Eren"); 
        System.out.println(l2); 
        
        l2.show();
        Listing l1 = new Listing();
        System.out.println(l1.toString()); // toString Method 
        
        l1.input(); 
        l1.show();
        
        //INVOKING THE CLONE METHOD
        Listing l3 = l1.clone(); 
        l1.show();
        l3.clone(); 
        
        //DYNAMIC ALLOCATION: 
        Listing [] listings; 
        
        String a = JOptionPane.showInputDialog("Enter The number of Names: ");
        int an = Integer.parseInt(a); 
        
        listings = new Listing[an]; 
        for(int i = 0; i < an; i++)
        {
            listings[i] = new Listing(); 
            listings[i].input(); 
        }
        for(int i = 0; i < an; i++)
        {
            listings[i].show(); 
        }
        
        // PRINTING IN REVERSE ORDER: Will print in the console and in the dialouge box
        for (int i = (listings.length-1); i >= 0; i--)
        {
            System.out.println(listings[i]);
            JOptionPane.showMessageDialog(null, listings[i]);

        }
                     

    }
}
