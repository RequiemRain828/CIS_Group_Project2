package CIS_Group_Project2;

import javafx.application.Application;
import javafx.event.*;
import javafx.collections.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*; 
import javafx.stage.Stage;

// For ArrayList
import java.util.*;

// These enable ComboBoxes
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;

public class HotelMadisonUI extends Application 
{
    public static ArrayList<Employee> employee = new ArrayList();
    public static ArrayList<Guest> guest = new ArrayList();
    public static ArrayList<Room> room = new ArrayList<Room>();
    public static ArrayList<Booking> booking = new ArrayList();
    public static ArrayList<Booking> tempBooking = new ArrayList();
    public static ObservableList roomList = FXCollections.observableArrayList();
    public static ObservableList guestList = FXCollections.observableArrayList();
    public static ObservableList employeeList = FXCollections.observableArrayList();
    public static ObservableList bookList = FXCollections.observableArrayList();
    
    // Shared Controls
    public Button btnEmployeeBack1 = new Button("Back to Employee Menu ");
    public Button btnEmployeeBack2 = new Button("Back to Employee Menu ");
    public Button btnEmployeeBack3 = new Button("Back to Employee Menu ");
    public Button btnEmployeeBack4 = new Button("Back to Employee Menu ");
    public Button btnEmployeeBack5 = new Button("Back to Employee Menu ");
    public Button btnEmployeeBack6 = new Button("Back to Employee Menu ");
    public Button btnEmployeeBack7 = new Button("Back to Employee Menu ");
    public Button btnEmployeeBack8 = new Button("Back to Employee Menu ");
    public Button btnGuestBack1 = new Button("Back to Guest Menu ");
    public Button btnGuestBack2 = new Button("Back to Guest Menu ");
    public Button btnGuestBack3 = new Button("Back to Guest Menu ");
    public Button btnGuestBack4 = new Button("Back to Guest Menu ");
    
    // Login Controls
    public Label lblUsername = new Label("Username: ");
    public Label lblPassword = new Label("Password: ");
    public TextField txtUsername = new TextField();
    public TextField txtPassword = new TextField();
    public Button btnLogin = new Button("Login -> ");
    public ComboBox cmboLogin = new ComboBox();
    public Label invalid = new Label("");
    
    // Employee Menu
    public ComboBox cmboEmployeeMenu = new ComboBox();
    public Button btnEmployeeSelect = new Button("Select -> ");
    public Button btnEmployeeLogout = new Button("Logout^ ");
    
    // Guest Menu
    public ComboBox cmboGuestMenu = new ComboBox();
    public Button btnGuestSelect = new Button("Select -> ");
    public Button btnGuestLogout = new Button("Logout^ ");
    
    // Employee Room Summary controls
    
    // Employee Guest Room Checkout controls
    
    // Create Guest Aaccount
    public Label lblGuestStatus = new Label("Guest or Valued Guest:");
    public Label lblGuestUsername = new Label("Enter Guest Username: ");
    public Label lblGuestPassword = new Label("Enter Guest Password: ");
    public Label lblGuestName = new Label("Enter Guest Full Name: ");
    public ComboBox cmboGuestStatus = new ComboBox();
    public TextField txtGuestUsername = new TextField();
    public TextField txtGuestPassword = new TextField();
    public TextField txtGuestName = new TextField();
    public Button btnAddGuest = new Button("Add Guest -> ");
    public ListView lstGuest = new ListView(guestList);
    
    // Edit Guest Account
    
    // Create Employee Account
    public Label lblEmployeeUsername = new Label("Enter Employee Username: ");
    public Label lblEmployeePassword = new Label("Enter Employee Password: ");
    public Label lblEmployeeName = new Label("Enter Employee Full Name: ");
    public TextField txtEmployeeUsername = new TextField();
    public TextField txtEmployeePassword = new TextField();
    public TextField txtEmployeeName = new TextField();
    public Button btnAddEmployee = new Button("Add Employee -> ");
    public ListView lstEmployee = new ListView(employeeList);
    
    // Edit Employee Account
    
    // Add Room Controls
    public Label lblBed = new Label("Bed: ");
    public Label lblKitchen = new Label("Kitch: ");
    public Label lblCoffee = new Label("Coffee: ");
    public Label lblAccess = new Label("Accessibility: ");
    public Label lblPrice = new Label("Price Per Night: ");
    public Label lblStatus = new Label("Room Status: ");
    public Label lblRoomNum = new Label("Room Number: ");
    public ComboBox cmboBed = new ComboBox();
    public ComboBox cmboKitchen = new ComboBox();
    public ComboBox cmboCoffee = new ComboBox();
    public ComboBox cmboAccess = new ComboBox();
    public TextField txtRoomNum = new TextField();
    public TextField txtPrice = new TextField();
    public ComboBox cmboStatus = new ComboBox();
    public Button btnAddRoom = new Button("Add Room -> ");   
    public ListView lstRoom = new ListView(roomList);
    
    // Edit Guest Room Controls
    
    // Guest Book a Room Controls
    public Label lblFreeRooms = new Label("Free Rooms: ");
    public Label lblCheckinYear = new Label("Check In Year: ");
    public Label lblCheckinDate = new Label("Check In Date: ");
    public Label lblCheckoutDate = new Label("Check Out Date: ");
    public Button btnBookRoom = new Button("Book Room -> "); 
    public ListView listBookRoom = new ListView(bookList);
    
    public TextField txtCheckInYear = new TextField();
    public TextField txtCheckInDate = new TextField();
    public TextField txtCheckOutDate = new TextField();
           
    // Guest Display Booking Report Controls
    
    // Guest Edit Information Controls
     
    // Panes
    public GridPane primaryPane = new GridPane();
    public GridPane loginPane = new GridPane();
    public GridPane employeePane = new GridPane();
    public GridPane guestPane = new GridPane();
    public GridPane employeeBookingPane = new GridPane();
    public GridPane checkoutPane = new GridPane();
    public GridPane addGuestPane = new GridPane();
    public GridPane editGuestPane = new GridPane();
    public GridPane addEmployeePane = new GridPane();
    public GridPane editEmployeePane = new GridPane();
    public GridPane addRoomPane = new GridPane();
    public GridPane editRoomPane = new GridPane();
    public GridPane bookRoomPane = new GridPane();
    public GridPane guestBookingPane = new GridPane();
    public GridPane editGuestInfoPane= new GridPane();
    
    // Tab Pane and tabs
    public TabPane Tabs = new TabPane();
    public Tab tabLogin = new Tab("Login Screen");
    public Tab tabEmployee = new Tab("Employee Menu");
    public Tab tabGuest = new Tab("Guest Menu");
    public Tab tabBooking = new Tab("Booking Menu");
    public Tab tabCheckout = new Tab();
    public Tab tabAddGuest = new Tab("Add Guest Menu");
    public Tab tabEditGuest = new Tab();
    public Tab tabAddEmployee = new Tab("Add Employee Menu");
    public Tab tabEditEmployee = new Tab();
    public Tab tabAddRoom = new Tab("Employee Add Room");
    public Tab tabEditRoom = new Tab();
    public Tab tabBookRoom = new Tab("Book Room Menu");
    public Tab tabDisplayBooking = new Tab();
    public Tab tabEditGuestInfo = new Tab();
    
    @Override
    public void start(Stage primaryStage) 
    {
        Employee e1 = new Employee ("admin" , "1234", "Austin Putnam");
        employee.add(e1);
        
        Employee e2 = new Employee ("root","12345","Ben Carson");
        employee.add(e2);
        
        Guest g1 = new Guest("guest", "pass", "Jeremy Ezell");
        guest.add(g1);
        
        Guest g2 = new Guest("guest1" , "pass1", "Mike Thorton");
        guest.add(g2);
        
        Room r1 = new Room(1, 1, 1, 1, 1, 50.00);
        room.add(r1);
        
        Room r2 = new Room(1, 1, 1 ,1 , 2, 100.00);
        room.add(r2);
        
        primaryPane.setAlignment(Pos.TOP_LEFT);
        
        // Add each individual Tab to the TabPane
        Tabs.getTabs().add(tabLogin);
        //Tabs.getTabs().add(tabEmployee);
        //Tabs.getTabs().add(tabGuest);
        //Tabs.getTabs().add(tabAddGuest);
        //Tabs.getTabs().add(tabAddEmployee);
        
        primaryPane.add(Tabs, 0, 0);
        
        tabLogin.setContent(loginPane); 
        loginPane.setAlignment(Pos.CENTER);
        loginPane.add(new Label("Welcome to the Login Screen "), 0, 0);
        loginPane.add(lblUsername, 0, 1);
        loginPane.add(txtUsername, 1, 1);
        loginPane.add(lblPassword, 0, 2);
        loginPane.add(txtPassword, 1, 2);
        cmboLogin.getItems().add("Employees");
        cmboLogin.getItems().add("Guests");
        loginPane.add(cmboLogin, 1, 3);
        loginPane.add(btnLogin, 1, 4);
        loginPane.add(invalid, 1, 5);
        btnLogin.setOnAction(e -> {
            handleLogin(cmboLogin.getValue().toString());
            
        });
        
         
        //loginPane.setVgap(20);
        //loginPane.setHgap(40);
        
        
        // Employee Menu Pane
        tabEmployee.setContent(employeePane);
        employeePane.setAlignment(Pos.CENTER);
        employeePane.add(new Label("Welcome to the Employee Menu"), 0, 0);
        cmboEmployeeMenu.getItems().addAll(
                ("Run a Booking Report"),
                ("Check a Guest Room Out"),
                ("Create Guest Account"),
                ("Edit Guest Account"),
                ("Create Employee Account"),
                ("Edit Employee Account"),
                ("Create Guest Rooms"),
                ("Edit Guest Rooms")
        );
        employeePane.add(cmboEmployeeMenu, 0, 1);
        employeePane.add(btnEmployeeSelect, 0, 2);
        employeePane.add(btnEmployeeLogout, 1, 2);
        employeePane.setVgap(10);
        btnEmployeeSelect.setOnAction(e -> {
            
            handleEmployeeChoice(cmboEmployeeMenu.getValue().toString());
        });
        btnEmployeeLogout.setOnAction(e -> {

                Tabs.getSelectionModel().select(tabLogin);
                Tabs.getTabs().remove(tabEmployee);  
        });
        
        // Guest Menu Pane
        tabGuest.setContent(guestPane);
        guestPane.setAlignment(Pos.CENTER);
        guestPane.add(new Label("Welcome to the Guest Menu"), 0, 0);
        cmboGuestMenu.getItems().addAll(
                ("Book a Room"),
                ("Display Booking Report"),
                ("Edit Guest Information")
        );
        guestPane.add(cmboGuestMenu, 0, 1);
        guestPane.add(btnGuestSelect, 0, 2);
        guestPane.add(btnGuestLogout, 1, 2);
        guestPane.setVgap(10);
        btnGuestSelect.setOnAction(e -> {
            
            handleGuestChoice(cmboGuestMenu.getValue().toString());
        });
        btnGuestLogout.setOnAction(e -> {

                Tabs.getSelectionModel().select(tabEmployee);
                Tabs.getTabs().remove(tabGuest);  
        });
        
        
        tabBooking.setContent(employeeBookingPane);
        employeeBookingPane.setAlignment(Pos.CENTER);
        employeeBookingPane.add(new Label("Welcome to the Employee Display Booking Report Menu"), 0, 0);
        
        tabCheckout.setContent(checkoutPane);
        checkoutPane.setAlignment(Pos.CENTER);
        checkoutPane.add(new Label("Welcome to the Checkout Guest Room Menu"), 0, 0);
        
        tabAddGuest.setContent(addGuestPane);
        addGuestPane.setAlignment(Pos.CENTER);
        addGuestPane.add(new Label("Welcome to the Create a Guest Account Menu"), 0, 0);
        addGuestPane.add(lblGuestStatus, 0, 1);
        addGuestPane.add(lblGuestUsername, 0, 2);
        addGuestPane.add(lblGuestPassword, 0, 3);
        addGuestPane.add(lblGuestName, 0, 4);
        cmboGuestStatus.getItems().add("Guest");
        cmboGuestStatus.getItems().add("Valued Guest");
        cmboGuestStatus.getSelectionModel().select(0);
        addGuestPane.add(cmboGuestStatus, 1, 1);
        addGuestPane.add(txtGuestUsername, 1, 2);
        addGuestPane.add(txtGuestPassword, 1, 3);
        addGuestPane.add(txtGuestName, 1, 4);
        addGuestPane.add(btnAddGuest, 1, 7);
        addGuestPane.add(btnEmployeeBack3, 2, 7);
        addGuestPane.add(lstGuest, 2, 1, 3, 6);
        lstGuest.setPrefWidth(400);
        addGuestPane.setVgap(10);
        addGuestPane.setHgap(10);
        btnAddGuest.setOnAction(e -> {
            Guest tempGuest = new Guest(txtGuestUsername.getText(), txtGuestPassword.getText()
                    ,txtGuestName.getText());
            
            
            guest.add(tempGuest);
            
            guestList.add(tempGuest.toString());
            
            txtGuestUsername.clear();
            txtGuestPassword.clear();
            txtGuestName.clear();
            
            
        });
        btnEmployeeBack3.setOnAction(e -> {
                Tabs.getSelectionModel().select(tabEmployee);
                Tabs.getTabs().remove(tabAddGuest);  
        });
        
        tabEditGuest.setContent(editGuestPane);
        editGuestPane.setAlignment(Pos.CENTER);
        editGuestPane.add(new Label("Welcome to the Edit a Guest Account Menu"), 0, 0);
        
        tabAddEmployee.setContent(addEmployeePane);
        addEmployeePane.setAlignment(Pos.CENTER);
        addEmployeePane.add(new Label("Welcome to the Create an Employee Account Menu"), 0, 0); 
        addEmployeePane.add(lblEmployeeUsername, 0, 1);
        addEmployeePane.add(lblEmployeePassword, 0, 2);
        addEmployeePane.add(lblEmployeeName, 0, 3);        
        addEmployeePane.add(txtEmployeeUsername, 1, 1);
        addEmployeePane.add(txtEmployeePassword, 1, 2);
        addEmployeePane.add(txtEmployeeName, 1, 3);
        addEmployeePane.add(btnAddEmployee, 1, 7);
        addEmployeePane.add(btnEmployeeBack5, 2, 7);
        addEmployeePane.add(lstEmployee, 2, 1, 1, 6);
        lstEmployee.setPrefWidth(400);
        addEmployeePane.setVgap(10);
        addEmployeePane.setHgap(10);
        btnAddEmployee.setOnAction(e -> {
            Employee tempEmployee = new Employee(txtEmployeeUsername.getText(), txtEmployeePassword.getText(), txtEmployeeName.getText());
                    // Integer.parseInt());
            
            employee.add(tempEmployee);
            
            employeeList.add(tempEmployee.toString());
            
            txtEmployeeUsername.clear();
            txtEmployeePassword.clear();
            txtEmployeeName.clear();
               
        });
        btnEmployeeBack5.setOnAction(e -> {

                Tabs.getSelectionModel().select(tabEmployee);
                Tabs.getTabs().remove(tabAddEmployee);  
        });
        
        tabEditEmployee.setContent(editEmployeePane);
        editEmployeePane.setAlignment(Pos.CENTER);
        editEmployeePane.add(new Label("Welcome to the Edit an Employee Account Menu"), 0, 0);
        
        tabAddRoom.setContent(addRoomPane);
        addRoomPane.setAlignment(Pos.CENTER);
        addRoomPane.add(new Label("Welcome to the Employee Add Room"), 0, 0);
        addRoomPane.add(lblBed, 0, 1);
        cmboBed.getItems().add("1 Queen Size Bed");
        cmboBed.getSelectionModel().select(0);
        addRoomPane.add(cmboBed, 1, 1);
        addRoomPane.add(lblKitchen, 0, 2);
        cmboKitchen.getItems().add("Microwave");
        cmboKitchen.getSelectionModel().select(0);
        addRoomPane.add(cmboKitchen, 1, 2);
        addRoomPane.add(lblCoffee, 0, 3);
        cmboCoffee.getItems().add("1-Cup Std. Coffee Machine");
        cmboCoffee.getSelectionModel().select(0);
        addRoomPane.add(cmboCoffee, 1, 3);
        addRoomPane.add(lblAccess, 0, 4);
        cmboAccess.getItems().add("Standard Room");
        cmboAccess.getSelectionModel().select(0);
        addRoomPane.add(cmboAccess, 1, 4);
        addRoomPane.add(lblRoomNum, 0, 5);
        addRoomPane.add(txtRoomNum, 1, 5);
        addRoomPane.add(lblPrice, 0, 6);
        addRoomPane.add(txtPrice, 1, 6);
        addRoomPane.add(lblStatus, 0, 7);
        cmboStatus.getItems().add("Active");
        cmboStatus.getSelectionModel().select(0);
        cmboStatus.getItems().add("InActive");
        addRoomPane.add(cmboStatus, 1, 7);
        addRoomPane.add(lstRoom, 2, 1, 2, 8);
        lstRoom.setPrefWidth(500);
        addRoomPane.add(btnAddRoom, 1, 9);
        addRoomPane.add(btnEmployeeBack7, 2, 9);
        addRoomPane.setHgap(10);
        cmboBed.getSelectionModel();
        btnAddRoom.setOnAction(e -> {
            
            int bed = handleBed(cmboBed.getValue().toString());
            int kitchen = handleKitchen(cmboKitchen.getValue().toString());
            int coffee = handleCoffee(cmboCoffee.getValue().toString());
            int access = handleAccess(cmboAccess.getValue().toString());
            
            Room tempRoom = new Room(bed, kitchen, coffee, access,  
                    Integer.valueOf(txtRoomNum.getText()), Double.valueOf(txtPrice.getText()));
                    // Integer.parseInt());
                    
            /*Room newRoom = new Room(Integer.valueOf((String)cmboBed.getValue()), Integer.valueOf((String)cmboKitchen.getValue()), 
                    Integer.valueOf((String)cmboCoffee.getValue()), Integer.valueOf((String)cmboAccess.getValue()),  
                    Integer.valueOf(txtRoomNum.getText()), Double.valueOf(txtPrice.getText()));*/
            
            room.add(tempRoom);
            
            roomList.add(tempRoom.roomDescription());
            
            cmboBed.getSelectionModel().clearSelection();
            cmboKitchen.getSelectionModel().clearSelection();
            cmboCoffee.getSelectionModel().clearSelection();
            cmboAccess.getSelectionModel().clearSelection();
            txtRoomNum.clear();
            txtPrice.clear();
            
        });
        btnEmployeeBack7.setOnAction(e -> {

                Tabs.getSelectionModel().select(tabEmployee);
                Tabs.getTabs().remove(tabAddRoom);  
        });
        
        tabEditRoom.setContent(editRoomPane);
        editRoomPane.setAlignment(Pos.CENTER);
        editRoomPane.add(new Label("Welcome to the Edit a Room Menu"), 0, 0);
        
        tabBookRoom.setContent(bookRoomPane);
        bookRoomPane.setAlignment(Pos.CENTER);
        bookRoomPane.add(new Label("Welcome to the Book a Room Menu"), 0, 0);
        bookRoomPane.add(lblFreeRooms, 0, 4);
        bookRoomPane.add(lblCheckinYear, 0, 5);
        bookRoomPane.add(lblCheckinDate, 0, 6);
        bookRoomPane.add(lblCheckoutDate, 0, 7);
        bookRoomPane.add(txtCheckInYear, 1, 5);
        bookRoomPane.add(txtCheckInDate, 1, 6);
        bookRoomPane.add(txtCheckOutDate, 1, 7);
        bookRoomPane.add(btnBookRoom, 1, 8);
        bookRoomPane.add(btnGuestBack1, 2, 8);
        bookRoomPane.add(listBookRoom, 1, 1, 2, 4);
        listBookRoom.setPrefWidth(500);
        bookRoomPane.setVgap(10);
        bookRoomPane.setHgap(5);
        for (int i = 0; i < room.size(); i++)
        {
            bookList.add(room.get(i).roomDescription());
            //bookList.remove(room.get(i));
        }
        btnBookRoom.setOnAction(e -> {
           for (int i = 0; i < room.size(); i++)
        { 
           if(listBookRoom.getSelectionModel().getSelectedIndex() == i);
           {
               room.get(i).bookRoom();
               listBookRoom.getItems().remove(i);
           }
        }
           
        });
        btnGuestBack1.setOnAction(e -> {
            
                Tabs.getSelectionModel().select(tabGuest);
                Tabs.getTabs().remove(tabBookRoom);   
        });
       
        tabDisplayBooking.setContent(guestBookingPane);
        guestBookingPane.setAlignment(Pos.CENTER);
        guestBookingPane.add(new Label("Welcome to the Display Guest Booking Report Menu"), 0, 0);
        
        tabEditGuestInfo.setContent(editGuestInfoPane);
        editGuestInfoPane.setAlignment(Pos.CENTER);
        editGuestInfoPane.add(new Label("Welcome to the Edit Guest Information Menu"), 0, 0);
        
        // Create a scene
        Scene primaryScene = new Scene(primaryPane, 1000, 600);
        
        Tabs.setMinWidth(primaryScene.getWidth());
        
        // Create a stage
        primaryStage.setTitle("*** Welcome to Hotel Madison Home Page ***");
        primaryStage.setScene(primaryScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    public void handleLogin(String login)
    {
        String username = txtUsername.getText();
        String password = txtPassword.getText(); 
               
        switch(login)
        {
            case "Employees": for(int i = 0; i < employee.size(); i++)
            {
                if (employee.get(i).checkCredentials(username, password))
                {
                    System.out.println("Welcome " + employee.get(i).getEmployeeName());
                    Tabs.getTabs().add(tabEmployee); Tabs.getSelectionModel().select(tabEmployee);
                    txtUsername.clear();
                    txtPassword.clear();
                    
                    invalid.setText("");
                    break;
                }
                else
                {
                    invalid.setText("Invalid Credentials! Please try again!");
                    break;
                }
            }            
            break;
            case "Guests":  for(int i =0; i< guest.size(); i++)
            {
                if (guest.get(i).checkCredentials(username, password))
                {
                    System.out.println("Welcome " + guest.get(i).getGuestName());
                    Tabs.getTabs().add(tabGuest); Tabs.getSelectionModel().select(tabGuest);
                    txtUsername.clear();
                    txtPassword.clear();
                    invalid.setText("");
                    break;
                }
                else
                {
                    invalid.setText("Invalid Credentials! Please try again!");
                    break;
                }
            }  
            break;
            default: break;
        }   
    }
    
    public void handleEmployeeChoice(String menuChoice)
    {
        switch(menuChoice) 
        {
            case "Run a Booking Report":; break;
            case "Check a Guest Room Out": ; break;
            case "Create Guest Account": Tabs.getTabs().add(tabAddGuest); Tabs.getSelectionModel().select(tabAddGuest); break;
            case "Edit Guest Account": ; break;
            case "Create Employee Account": Tabs.getTabs().add(tabAddEmployee); Tabs.getSelectionModel().select(tabAddEmployee); break;
            case "Edit Employee Account": ; break;
            case "Create Guest Rooms": Tabs.getTabs().add(tabAddRoom); Tabs.getSelectionModel().select(tabAddRoom); break;
            case "Edit Guest Rooms": ; break;           
            default: break;
        }
    }
    
    public void handleGuestChoice(String menuChoice)
    {
        switch(menuChoice)
        {
            case "Book a Room": Tabs.getTabs().add(tabBookRoom); Tabs.getSelectionModel().select(tabBookRoom); break; 
            case "Display Booking Report": Tabs.getTabs().add(tabDisplayBooking); Tabs.getSelectionModel().select(tabDisplayBooking); break; 
            case "Edit Guest Information": Tabs.getTabs().add(tabEditGuestInfo); Tabs.getSelectionModel().select(tabEditGuest); break; 
            default: break;
        }
    }
    
    public int handleBed(String choice)
    {
        int result = 0;
        
        switch(choice)
        {
            case "1 Queen Size Bed": result = 1; break;
            case "2 Queen Size Beds": result = 2; break;
            case "1 King Size Bed": result = 3; break;
            default: break;
        }
        return result;
    }
    
    public int handleKitchen(String choice)
    {
        int result = 0;
        
        switch(choice)
        {
            case "Microwave": result = 1; break;
            case "Fridge + Microwave": result = 2; break;
            default: break;
        }
        return result;
    }
    
    public int handleCoffee(String choice)
    {
        int result = 0;
        
        switch(choice)
        {
            case "1-Cup Std. Coffee Machine": result = 1; break;
            case "Keurig Hot K200 Coffee Machine": result = 2; break;
            default: break;
        }
        return result;
    }
    
    public int handleAccess(String choice)
    {
        int result = 0;
        
        switch(choice)
        {
            case "Standard Room": result = 1; break;
            case "Enhanced Accessibility Room": result = 2; break;
            default: break;
        }
        return result;
    }
    
    
}
