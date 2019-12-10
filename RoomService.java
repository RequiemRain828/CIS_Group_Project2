package CIS_Group_Project2;
/*
 * @author Dylan Jones
 * Date: December 10, 2019
 * Assignment: Hotel Madison Part 2
 * Purpose: To create a Guest object. 
*/

public class RoomService {
    
    public int roomServiceID;
    public String description;
    public double price;
    public int quantity;
    public static int nextInt = 0;
    
//Constructor
public RoomService(String description, double price, int amount){
    this.description = description;
    this.price = price;
    this.quantity = amount;
    this.roomServiceID = nextInt++;
}    
    
//Getter for description

public String getDescription(){
    return this.description;
}

//Setter for description

public void setDescription(String description){
    this.description = description;
}

//Getter for price

public double getPrice(){
    return this.price;
}

//Setter for price

public void setPrice(double price){
    this.price = price;
}

//Getter for ID

public int getID() {
    return this.roomServiceID;
}

@Override
public String toString()
{
    return "Purchased Items" + this.getDescription() + "Price: " + this.getPrice() + "Quantity: " + this.quantity;
}

    
}
