/*
 * Author: Austin Putnam
 * Date: December 10, 2019
 * Assignment: Hotel Madison Part 2
 * Purpose: To create a Guest object. 
*/
package CIS_Group_Project2;

public class Guest 
{
    public int guestID;
    private String username;
    public String password;
    private String guestName;
    public double amountSpentWithHotel;
    public int numberOfBookings;
    private String status;
    private static int nextID = 0;
    
    
    public Guest(String username, String password, String guestName) // Constructor
    {
        this.guestID = nextID++;
        this.username = username;
        this.password = password;
        this.guestName = guestName;
        this.status = "G";
    }
    
    public boolean checkCredentials(String username, String password) // Checks login credentials
    {
        boolean credentials = false;
        if (this.username.equals(username) && this.password.equals(password))
                {
                    credentials = true;
                }
        return credentials;
    }
    
     public String getGuestName() // Getter for guest name
    {
        return this.guestName;
    }
    
    public String getUsername() // Getter for guest username
    {
        return this.username;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setGuestName(String guestName) // Setter for guest name
    {
        this.guestName = guestName;
    }
    
    //  Author: Austin Putnam
     public int setPassword(String oldP, String newP) //Allows users to change passwords
    { 
        int x = 0;
        
        if (this.password.equals(oldP))
        {
            x = 1;
     
            if (oldP.equals(newP) == false)
            {
                x = 2; 
                
                if (newP.matches(".*[A-Z].*") && (newP.matches(".*[0-9].*")))
                { 
                    x = 3;
                    if (Character.getNumericValue(newP.charAt(0)) != 0 &&
                            Character.getNumericValue(newP.charAt(0)) != 1 &&
                            Character.getNumericValue(newP.charAt(0)) != 2 &&
                            Character.getNumericValue(newP.charAt(0)) != 3 &&
                            Character.getNumericValue(newP.charAt(0)) != 4 &&
                            Character.getNumericValue(newP.charAt(0)) != 5 &&
                            Character.getNumericValue(newP.charAt(0)) != 6 &&
                            Character.getNumericValue(newP.charAt(0)) != 7 &&
                            Character.getNumericValue(newP.charAt(0)) != 8 &&
                            Character.getNumericValue(newP.charAt(0)) != 9)
                    { 
                        x = 4;
                        this.password = newP;
                    }    
                }
            }
         }
     
        return x;
    }
    
    //  Author: Austin Putnam 
     public int createNewPassword(String newP)
    {
        int x = 0;
        
        if (newP.matches(".*[A-Z].*") && (newP.matches(".*[0-9].*")))
        { 
            x = 1;
            if (Character.getNumericValue(newP.charAt(0)) != 0 &&
                            Character.getNumericValue(newP.charAt(0)) != 1 &&
                            Character.getNumericValue(newP.charAt(0)) != 2 &&
                            Character.getNumericValue(newP.charAt(0)) != 3 &&
                            Character.getNumericValue(newP.charAt(0)) != 4 &&
                            Character.getNumericValue(newP.charAt(0)) != 5 &&
                            Character.getNumericValue(newP.charAt(0)) != 6 &&
                            Character.getNumericValue(newP.charAt(0)) != 7 &&
                            Character.getNumericValue(newP.charAt(0)) != 8 &&
                            Character.getNumericValue(newP.charAt(0)) != 9)
                    { 
                        x = 2;
                        this.password = newP;
                    }    
                }
        
        
        return x;
    }
     
     public String getStatus()
    {
        return this.status;
    }
      

    @Override
    public String toString()
    {
        String tempStatus = "";
        if (this.getStatus().equals("G")) {
            tempStatus = " (Guest)";
        } else if (this.getStatus().equals("V")) {
            tempStatus = " (Value Guest)";
        }
        
        return "Username: " + this.username + ", Password: " + hashPassword() + ", Guest Name: " + this.guestName + ", Status: " 
                + this.getStatus() + tempStatus;               
    }
    
    public String toStringName()
    {
        String tempStatus = "";
        if (this.getStatus().equals("G")) {
            tempStatus = " (Guest)";
        } else if (this.getStatus().equals("V")) {
            tempStatus = " (Value Guest)";
        }
        
        return this.getGuestName() + tempStatus;           
    }
    
    //  Author: Marin Walters
    public String hashPassword()
    {
        String result = "";
        for (int i = 0; i < this.password.length(); i++)
        {
            result += "*";
        }
        return result;
    }
    
    
    
    
}
