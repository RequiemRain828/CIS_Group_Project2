/*
 * Author: Austin Putnam
 * Date: December 10, 2019
 * Assignment: Hotel Madison Part 2
 * Purpose: To create an Employee object. 
*/
package CIS_Group_Project2;

import java.util.*;

public class Employee 
{
    private int employeeID;
    private String username;
    private String password;
    private String employeeName;
    
    public static int nextID = 0;
    public static ArrayList<Employee> employeeArray = new ArrayList<Employee>();

    
    public Employee (String username, String password, String employeeName) // Constructor
    {
        this.employeeID = nextID++;
        this.username = username;
        this.password = password;
        this.employeeName = employeeName;
                
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
    
    public String getEmployeeName() // Getter for employee name
    {
        return this.employeeName;
    }
    
    public String getUsername() // Getter for employee username
    {
        return this.username;
    }
    
    public void setEmployeeName(String employeeName) // Setter for employee name
    {
        this.employeeName = employeeName;
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
    
    @Override
    public String toString()
    {
        return "Username: " + this.username + ", Password: " + hashPassword() + ", Employee name: " + this.employeeName;               
    }
    
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
