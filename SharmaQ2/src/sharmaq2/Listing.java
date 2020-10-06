
package sharmaq2;

import javax.swing.JOptionPane;

public class Listing 
{
    private String name; 
    private int age; 
  
    public Listing() // default constructor 
    {
        age = 0;
        name = " "; 
    }
    
    public Listing(int age, String name)
    {
        this.age = age;
        this.name = name; 
    }
    
    @Override 
    public String toString()
    {
        String l = "age: " + age +
                "\nname: " + name; 
        return l; 
    }
    
    public void show()
    {
        String totalInput; 
        JOptionPane.showMessageDialog(null, this);  

    }
    
    public void input()
    {
        String newAge = JOptionPane.showInputDialog("Enter the age"); 
        age = Integer.parseInt(newAge); 
        
        String newName = JOptionPane.showInputDialog("Enter the name"); 
        name = newName; 
        
    }
    
    public Listing clone() 
    {
        Listing theClone = new Listing(this.age, this.name); 
        return theClone; 
    }
    
    //getters and setters
    public String getName() 
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }
    
    
    
}
