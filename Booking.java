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
    
    public int checkInMonth;
    public int checkInDay;
    public int checkInYear;
    
    public int checkOutMonth;
    public int checkOutDay;
    public int checkOutYear;
    
    public double roomCost;
    public double roomServiceCost;
    public double totalCost;
    
    public ArrayList <RoomService> roomServiceList = new ArrayList<>();
    
    private static int nextID = 1;
    
    public Booking(Guest bookingGuest, Room bookedRoom, int checkInYear, int checkInDay, 
        int checkOutDay, int checkInMonth, int checkOutMonth, int checkOutYear){
        this.checkOutMonth = checkOutMonth;
        this.checkInMonth = checkInMonth;
        this.bookingGuest = bookingGuest;
        this.bookedRoom = bookedRoom;
        this.checkInYear = checkInYear;
        this.checkInDay = checkInDay;
        this.checkOutDay = checkOutDay;
        this.checkOutYear = checkOutYear;    
    }
    
    public Booking(ValueGuest valueGuest, Room bookedRoom, int checkInYear, int checkIn, 
            int checkOut, int checkInMonth,int checkOutMonth,int checkOutYear){
        this.checkOutMonth = checkOutMonth;
        this.checkInMonth = checkInMonth;
        this.valueGuest = valueGuest;
        this.bookedRoom = bookedRoom;
        this.checkInYear = checkInYear;
        this.checkInDay = checkIn;
        this.checkOutDay = checkOut;
        this.checkOutYear = checkOutYear;
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
    
   
    
    
    public long dayCount(){
        long numberOfDays;
        LocalDate firstYear= LocalDate.of(checkInYear, Month.JANUARY, 1);
        LocalDate checkIn = LocalDate.of(checkInYear, Month.of(checkInMonth), checkInDay);
        LocalDate checkOut = LocalDate.of(checkOutYear, Month.of(checkOutMonth), checkOutDay);
        long daysFrombeg = ChronoUnit.DAYS.between(firstYear, checkIn);
        long dayFrombeg1= ChronoUnit.DAYS.between(firstYear, checkOut);
       numberOfDays=dayFrombeg1-daysFrombeg;
        return numberOfDays;
    }
    
    public void RoomService(String description, double price){
        this.roomServiceList.add(new RoomService(description, price));
    }
    
    public double roomCost(){
        
        this.roomCost = this.bookedRoom.roomCostPerNight * this.dayCount();
        return this.roomCost;
    }
    
    public double roomService(){
        
        for (int i = 0; i < this.roomServiceList.size(); i++){
            
           this.roomServiceCost += roomServiceList.get(i).price;
            
        }
        return this.roomServiceCost;
}
    
    public double totalCost(){
        
        this.totalCost = this.roomCost + this.roomServiceCost;
        
        return this.totalCost;
        
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
    
    // Getter for RoomService ArrayList
    
    public ArrayList getArrayList(){
        
      
        return this.roomServiceList;
       
    }
    public String getRoomServiceList()
    {
          String roomService="";
         for (int i = 0; i < this.roomServiceList.size(); i++){
            
           roomService += "\n"+roomServiceList.get(i).description+",\n " ;
            
        }
         return roomService;
    }
     @Override
    public String toString(){
        String result = "";
        result += this.bookingGuest.getGuestName() + " booked Room# " +
                this.bookedRoom.getRoomNumber() 
                + "\n from " +this.checkInMonth+"/"
                +this.checkInDay+"/"+ this.checkInYear+" to "+
                this.checkOutMonth+"/"+this.checkOutDay+"/"+this.checkOutYear ;
        return result; 
    }
     public String toStringValue(){
        String result = "";
        
        result += this.bookingGuest.getGuestName() + " booked Room# " 
                + this.bookedRoom.getRoomNumber() +" from "
                + this.checkInMonth+"/"
                + this.checkInDay+"/"+ this.checkInYear+" to "
                + this.checkOutMonth+"/"+this.checkOutDay+"/"
                + this.checkOutYear
                +"\nRoom Price per Day: $"+this.bookedRoom.roomCostPerNight
                +"\nTotal Days Room Prive: $"+roomCost()
                +"\nRoom Service List: "+getRoomServiceList()+
                "\nRoom Service Cost: $"+roomService()
                +"\nTotal Combined Price: $"+totalCost();
        return result; 
    }
    

}