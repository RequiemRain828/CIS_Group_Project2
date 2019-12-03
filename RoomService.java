package CIS_Group_Project2;

/**
 *
 * @author Dylan Jones
 */
public class RoomService {
    
    public int ID;
    public String description;
    public double price;
    public static int nextInt = 1;
    
//Constructor
public RoomService(String description, double price){
    this.description = description;
    this.price = price;
    this.ID = nextInt++;
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
    return this.ID;
}
    

    
}