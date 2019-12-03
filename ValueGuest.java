/*
 * Author: Austin Putnam
 * Date: November 18, 2019
 * Assignment: Hotel Madison Part 1
 * Purpose: To create a ValueGuest object. 
*/
package CIS_Group_Project2;

public class ValueGuest extends Guest
{
    //private String savingsNumber;
    private int valueClubID;
    private int numberOfBookings;
    private double amountSpentWithHotel;
    private static int nextID;
    
    public ValueGuest(String username, String password, String guestName) // Constructor
    {
        super(username, password, guestName);
        this.valueClubID = nextID++;
    }
    
    public double getAmountSpentWithHotel() // Getter for amount spent at hotel
    {
        return this.amountSpentWithHotel;
    }
    
    public int getNumberOfBookings() // Getter for number of previous bookings
    {
        return this.numberOfBookings;
    }
    
    /*public String getSavingsNumber() // Getter for amount of savings
    {
        return this.savingsNumber;
    }*/
    
    public int getValueClubId()
    {
        return this.valueClubID;
    }
}
