/*
 * Author: Marin Walters
 * Date: November 18, 2019
 * Assignment: Hotel Madison Part 1
 * Purpose: To create a booking - The Booking class acts as a “cross-table” object 
            and creates a link between a Guest object and a Room object. 
*/
package CIS_Group_Project2;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Booking {
    public Room bookedRoom;
    public Guest bookingGuest;
    public ValueGuest valueGuest;
    public int bookingYear;
    public int checkInDay;
    public int checkInMonth;
    public int checkOutMonth;
    public int checkOutDay;
    public int checkOutYear;
    public ArrayList <RoomService> roomServiceList = new ArrayList<>();
    public int i = 0;
    private static int nextID = 1;
    public double roomCost;
    public double roomServiceCost;
    public double totalCost;
    
    public Booking(Guest bookingGuest, Room bookedRoom, int year, int checkIn, 
        int checkOut, int checkInMonth,int checkOutMonth,int checkOutYear){
        this.checkOutMonth= checkOutMonth;
        this.checkInMonth=checkInMonth;
        this.bookingGuest = bookingGuest;
        this.bookedRoom = bookedRoom;
        this.bookingYear = year;
        this.checkInDay = checkIn;
        this.checkOutDay = checkOut;
        
    }
    
    public Booking(ValueGuest valueGuest, Room bookedRoom, int year, int checkIn, 
            int checkOut, int checkInMonth,int checkOutMonth,int checkOutYear){
        this.checkOutMonth= checkOutMonth;
        this.checkInMonth=checkInMonth;
        this.valueGuest = valueGuest;
        this.bookedRoom = bookedRoom;
        this.bookingYear = year;
        this.checkInDay = checkIn;
        this.checkOutDay = checkOut;
    }
    
    public Guest getBookingGuest(){
        return this.bookingGuest;
    }
    
    public Room getBookedRoom(){
        return this.bookedRoom;
    }
    
    public void endBooking(){
        this.bookedRoom.freeThisRoom();
    }
    
    @Override
    public String toString(){
        String result = "";
        result += this.bookingGuest.getGuestName() + " booked room " + this.bookedRoom.getRoomNumber() 
                + " from " +this.checkInDay+"/"+this.checkInMonth+"/"+ this.bookingYear+" to "+
                this.checkOutDay+"/"+this.checkOutMonth+"/"+this.checkOutYear ;
        return result; 
    }
    
    public long dayCount(){
        long numberOfDays;
        LocalDate firstYear= LocalDate.of(bookingYear, Month.JANUARY, 1);
        LocalDate checkIn = LocalDate.of(bookingYear, Month.of(checkInMonth), checkInDay);
        LocalDate checkOut = LocalDate.of(checkOutYear, Month.of(checkOutMonth), checkOutDay);
        long daysFrombeg = ChronoUnit.DAYS.between(firstYear, checkIn);
        long dayFrombeg1= ChronoUnit.DAYS.between(firstYear, checkOut);
       numberOfDays=dayFrombeg1-daysFrombeg;
        return numberOfDays;
    }
    
    public void RoomService(String description, double price){
        this.roomServiceList.set(i, new RoomService(description, price));
        i++;
    }
    
    public void roomCost(){
        
        this.roomCost = this.bookedRoom.roomCostPerNight * this.dayCount();
        
    }
    
    public void roomService(){
        
        for (i = 0; i < this.roomServiceList.size(); i++){
            
           this.roomServiceCost += roomServiceList.get(i).price;
            
        }
}
    
    public void totalCost(){
        
        this.totalCost = this.roomCost + this.roomServiceCost;
        
    }
    
    
    //setter for amount Spent in ValueGuest to Total Cost
    
    public void setValueGuestTotalCost(){
        
     this.valueGuest.amountSpentWithHotel = this.totalCost;   
     
    }
    
    public void setGuestTotalCost(){
     
        this.bookingGuest.amountSpentWithHotel = this.totalCost;
       
        
    }
    
    // getter for total cost
    
    public double getTotalCost(){
        return this.totalCost;
        
    }
    
    
    
    
    
    

}