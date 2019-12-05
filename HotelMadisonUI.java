package CIS_Group_Project2;

import javafx.application.Application;
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
    public static ArrayList<ValueGuest> valueGuest = new ArrayList();
    public static ArrayList<Booking> booking = new ArrayList();
    public static ArrayList<Booking> tempBooking = new ArrayList();
    public static ArrayList<Guest> currentGuest = new ArrayList();
    public static ArrayList<ValueGuest> currentVGuest = new ArrayList();
    public static ObservableList roomList = FXCollections.observableArrayList();
    public static ObservableList guestList = FXCollections.observableArrayList();
    public static ObservableList editGuestList = FXCollections.observableArrayList();
    public static ObservableList employeeList = FXCollections.observableArrayList();
    public static ObservableList bookList = FXCollections.observableArrayList();
    public static ObservableList ebookingList = FXCollections.observableArrayList();
    public static ObservableList selectRoomList = FXCollections.observableArrayList(room);
    public static ObservableList checkoutList = FXCollections.observableArrayList();
    public static ObservableList roomServiceList = FXCollections.observableArrayList();
    public static ObservableList guestName = FXCollections.observableArrayList(guest);
    public static ObservableList gBookingList = FXCollections.observableArrayList();
    
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
    
    // Value Guest Menu
    public ComboBox cmboVGuestMenu = new ComboBox();
    public Button btnVGuestSelect = new Button("Select -> ");
    public Button btnVGuestLogout = new Button("Logout^ ");
    
    // Employee Room Summary controls
    public Label lblSelectRoom = new Label("Select Guest: ");
    public ComboBox cmboSelectRoom = new ComboBox(guestName);
    public ListView lstEmployeeBooking = new ListView(ebookingList);
    public Button btnDisplayAll = new Button("Display All");
    public Button btnDisplaySelect = new Button("Display Selected Room");
    
    // Employee Guest Room Checkout controls
    public ListView lstCheckout = new ListView(checkoutList);
    public Label lblrule1 = new Label("Select a room/guest to free");
    public Button btnCheckout = new Button("Check Out this guest -> ");
    
    // Create Guest Account
    public Label lblGuestStatus = new Label("Guest or Valued Guest:");
    public Label lblGuestUsername = new Label("Enter Guest Username: ");
    public Label lblGuestPassword = new Label("Enter Guest Password: ");
    public Label lblGuestName = new Label("Enter Guest Full Name: ");
    public Label lblGuestPassword1 = new Label("Confirm Guest Password: ");
    public Label lblAddGuest = new Label("");
    public ComboBox cmboGuestStatus = new ComboBox();
    public TextField txtGuestUsername = new TextField();
    public TextField txtGuestPassword = new TextField();
    public TextField txtGuestPassword1 = new TextField();
    public TextField txtGuestName = new TextField();
    public Button btnAddGuest = new Button("Add Guest -> ");
    public ListView lstGuest = new ListView(guestList);
    
    // Edit Guest Account
    public Label lblEditGuestName = new Label("Enter Guest Full Name: ");
    public Label lblEditGuestPassword = new Label("Enter Old Guest Password: ");
    public Label lblEditGuestPassword1 = new Label("Enter New Guest Password: ");
    public Label lblEditGuest = new Label("");
    public TextField txtEditGuestPassword = new TextField();
    public TextField txtEditGuestPassword1 = new TextField();
    public TextField txtEditGuestName = new TextField();
    public Button btnEditGuest = new Button("Edit Guest -> ");
    public ListView lstEditGuest = new ListView(guestList);
    
    // Create Employee Account
    public Label lblEmployeeUsername = new Label("Enter Employee Username: ");
    public Label lblEmployeePassword = new Label("Enter Employee Password: ");
    public Label lblEmployeeName = new Label("Enter Employee Full Name: ");
    public Label lblEmployeePassword1 = new Label("Confirm Employee Password: ");
    public Label lblAddEmployee = new Label("");
    public TextField txtEmployeeUsername = new TextField();
    public TextField txtEmployeePassword = new TextField();
    public TextField txtEmployeePassword1 = new TextField();
    public TextField txtEmployeeName = new TextField();
    public Button btnAddEmployee = new Button("Add Employee -> ");
    public ListView lstEmployee = new ListView(employeeList);
    
    // Edit Employee Account
    public Label lblEditEmployeeName = new Label("Enter Employee Full Name: ");
    public Label lblEditEmployeePassword = new Label("Enter Old Employee Password: ");
    public Label lblEditEmployeePassword1 = new Label("Enter New Employee Password: ");
    public Label lblEditEmployee = new Label("");
    public TextField txtEditEmployeeName = new TextField();
    public TextField txtEditEmployeePassword = new TextField();
    public TextField txtEditEmployeePassword1 = new TextField();
    public Button btnEditEmployee = new Button("Edit Employee -> ");
    public ListView lstEditEmployee = new ListView(employeeList);
    
    // Add Room Controls
    public Label lblBed = new Label("Bed: ");
    public Label lblKitchen = new Label("Kitchen: ");
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
    public Button btnEditRoom = new Button("Edit Room -> ");
    public ListView lstRoom = new ListView(roomList);
    public Label lblRoomPrice = new Label("");
    public Label lblRoomNumber = new Label("");
    
    // Edit Guest Room Controls
    
    
    // Guest Book a Room Controls
    public Label lblFreeRooms = new Label("Free Rooms: ");
    public Label lblCheckinYear = new Label("Check In Year: ");
    public Label lblCheckinDate = new Label("Check In Month/Day: ");
    public Label lblCheckoutDate = new Label("Check Out Month/Day: ");
    public Button btnBookRoom = new Button("Book Room -> "); 
    public ListView listBookRoom = new ListView(bookList);
    public ComboBox cmboYear = new ComboBox();
    public ComboBox cmboDayIn = new ComboBox();
    public ComboBox cmboDayOut = new ComboBox();
    public ComboBox cmboMonthIn = new ComboBox();
    public ComboBox cmboMonthOut = new ComboBox();
    public TextField txtCheckInYear = new TextField();
    public TextField txtCheckInDate = new TextField();
    public TextField txtCheckOutDate = new TextField();
           
    // Guest Display Booking Report Controls
    public Label lblDisplayGBooking = new Label("Press the Button to Display your Booking");
    public Button btnDisplyGBooking = new Button("Display Booking");
    public ListView lstGBooking = new ListView(gBookingList);
    
    // Guest Edit Information Controls
    
    // Room Service Controls
    public Label lblServices = new Label("Available services: ");
    public Button btnAddToOrder = new Button("Add to Order");
    public Button btnFinishOrderService = new Button("Complete Order");
    public Button btnBack = new Button("Back");
    public ComboBox cmboServices = new ComboBox();
    public TextField txtQuantity = new TextField();
    public ListView listOrder = new ListView(roomServiceList); 
    public TextField txtServiceQuantity = new TextField();
    public Label lblQuantity = new Label("Quantity: ");
    public Label lblTotalPrice = new Label("Price: ");
    
    // Panes
    public GridPane primaryPane = new GridPane();
    public GridPane loginPane = new GridPane();
    public GridPane employeePane = new GridPane();
    public GridPane guestPane = new GridPane();
    public GridPane valueGuestPane = new GridPane();
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
    public GridPane roomServicePane = new GridPane();
    
    // Tab Pane and tabs
    public TabPane Tabs = new TabPane();
    public Tab tabLogin = new Tab("Login Screen");
    public Tab tabEmployee = new Tab("Employee Menu");
    public Tab tabGuest = new Tab("Guest Menu");
    public Tab tabValueGuest = new Tab("Value Guest Menu");
    public Tab tabBooking = new Tab("Booking Report");
    public Tab tabCheckout = new Tab("Checkout Guest Menu");
    public Tab tabAddGuest = new Tab("Add Guest Menu");
    public Tab tabEditGuest = new Tab("Edit Guest Menu");
    public Tab tabAddEmployee = new Tab("Add Employee Menu");
    public Tab tabEditEmployee = new Tab("Edit Employee Menu");
    public Tab tabAddRoom = new Tab("Employee Add Room");
    public Tab tabEditRoom = new Tab();
    public Tab tabBookRoom = new Tab("Book Room Menu");
    public Tab tabDisplayBooking = new Tab();
    public Tab tabEditGuestInfo = new Tab();
    public Tab tabRoomService = new Tab("Room Service Menu");
    
    @Override
    public void start(Stage primaryStage) 
    {
        Employee e1 = new Employee ("root" , "D1", "Austin Putnam");
        employee.add(e1);
        
//        Employee e2 = new Employee ("admin" , "B2" , "Ben Carson");
//        employee.add(e2);
        
        Guest g1 = new Guest("guest", "C1", "Jeremy Ezell");
        guest.add(g1);
        
        Guest g2 = new Guest("guest2" , "C2", "Mike Thorton");
        guest.add(g2);
        
        ValueGuest g3 = new ValueGuest("guest1" , "G1", "Seth Ledger");
        valueGuest.add(g3);
        
        Room r1 = new Room(1, 1, 1, 1, 1, 50.00);
        room.add(r1);
        
        Room r2 = new Room(1, 1, 1 ,1 , 2, 100.00);
        room.add(r2);
        
        for(int i=0;i<guest.size();i++){
            guestList.add(guest.get(i));
            guestName.add(guest.get(i).getGuestName()+
                    " -"+guest.get(i).getStatus());
            

            
        }
        for(int i=0;i<valueGuest.size();i++)
        {
        guestName.add(valueGuest.get(i).getGuestName()+" -"+
                valueGuest.get(i).getStatus());
       
        }
        for(int i = 0; i < employee.size(); i++){
            employeeList.add(employee.get(i));
        }
        
        primaryPane.setAlignment(Pos.TOP_LEFT);
        
        // Add each individual Tab to the TabPane
        Tabs.getTabs().add(tabLogin);
        Tabs.getTabs().add(tabEmployee);
        Tabs.getTabs().add(tabGuest);
        Tabs.getTabs().add(tabAddGuest);
        Tabs.getTabs().add(tabAddEmployee);
        Tabs.getTabs().add(tabBooking);
        Tabs.getTabs().add(tabAddRoom);
        Tabs.getTabs().add(tabBookRoom);
        Tabs.getTabs().add(tabRoomService);
        Tabs.getTabs().add(tabEditGuest);
        Tabs.getTabs().add(tabEditEmployee);
        
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
        cmboLogin.getSelectionModel().select(0);
        loginPane.add(cmboLogin, 1, 3);
        loginPane.add(btnLogin, 1, 4);
        loginPane.add(invalid, 1, 5);
        btnLogin.setOnAction(e -> {
            handleLogin(cmboLogin.getValue().toString()); 
        });

        // Employee Menu Pane
        tabEmployee.setContent(employeePane);
        employeePane.setAlignment(Pos.CENTER);
        employeePane.add(new Label("Welcome to the Employee Menu"), 0, 0);
        cmboEmployeeMenu.getItems().addAll(
                ("Run a Booking Report"),
                ("Checkout Guest"),
                ("Create New Guest Account"),
                ("Edit Guest Account"),
                ("Create New Employee Account"),
                ("Edit Employee Account"),
                ("Create or Edit a Room")
        );
        cmboEmployeeMenu.getSelectionModel().select(0);
        employeePane.add(cmboEmployeeMenu, 0, 1);
        employeePane.add(btnEmployeeSelect, 0, 2);
        employeePane.add(btnEmployeeLogout, 1, 2);
        employeePane.setVgap(10);
        btnEmployeeSelect.setOnAction(e -> {
            
            handleEmployeeChoice(cmboEmployeeMenu.getValue().toString());
        });
        btnEmployeeLogout.setOnAction(e -> {
            invalid.setText("");
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
        cmboGuestMenu.getSelectionModel().select(0);
        guestPane.add(cmboGuestMenu, 0, 1);
        guestPane.add(btnGuestSelect, 0, 2);
        guestPane.add(btnGuestLogout, 1, 2);
        guestPane.setVgap(10);
        btnGuestSelect.setOnAction(e -> {            
            handleGuestChoice(cmboGuestMenu.getValue().toString());
        });
        btnGuestLogout.setOnAction(e -> {            
            currentGuest.remove(0);
            invalid.setText("");
            Tabs.getSelectionModel().select(tabLogin);
            Tabs.getTabs().remove(tabGuest);  
        });
        
        tabValueGuest.setContent(valueGuestPane);
        valueGuestPane.setAlignment(Pos.CENTER);
        valueGuestPane.add(new Label("Welcome to ValueGuest Menu"), 0, 0);
        cmboVGuestMenu.getItems().addAll(
                ("Book a Room"),
                ("Display Booking Report"),
                ("Edit Guest Information"),
                ("Order Room Service")
        );
        valueGuestPane.add(cmboVGuestMenu, 0, 1);
        cmboVGuestMenu.getSelectionModel().select(0);
        valueGuestPane.add(btnVGuestSelect, 0, 2);
        valueGuestPane.add(btnVGuestLogout, 1, 2);
        valueGuestPane.setVgap(10);
        btnVGuestSelect.setOnAction(e -> {            
            handleVGuestChoice(cmboVGuestMenu.getValue().toString());
            //Tabs.getTabs().remove(tabValueGuest);
        });
        btnVGuestLogout.setOnAction(e -> {
            currentVGuest.remove(0);
            invalid.setText("");
            Tabs.getSelectionModel().select(tabLogin);
            Tabs.getTabs().remove(tabValueGuest);  
        });
        
        tabBooking.setContent(employeeBookingPane);
        employeeBookingPane.setAlignment(Pos.CENTER);
        employeeBookingPane.add(new Label("Employee Booking Report Menu"), 0, 0);
        employeeBookingPane.add(lblSelectRoom, 0, 3);
        cmboSelectRoom.getItems().add("None");
        cmboSelectRoom.getSelectionModel().select(0);       
        employeeBookingPane.add(cmboSelectRoom, 0, 4);
        employeeBookingPane.add(lstEmployeeBooking, 1, 1, 2, 5);
        employeeBookingPane.add(btnDisplayAll, 0, 6);
        employeeBookingPane.add(btnDisplaySelect, 0, 5);
        employeeBookingPane.add(btnEmployeeBack1, 1, 7);
        lstEmployeeBooking.setPrefWidth(600);
        btnDisplaySelect.setOnAction(e -> {
        
            for(int i=0; i<booking.size();i++)
            { 
               if( cmboSelectRoom.getValue().toString().
                   equals(booking.get(i).getBookingGuest().
                           getGuestName()+" -V"))
               {
                   
                   ebookingList.add(booking.get(i).toStringValue());
               }
               else if(cmboSelectRoom.getValue().toString().
                   equals(booking.get(i).getBookingGuest().
                           getGuestName()+" -G"))
                       {
                         ebookingList.add(booking.get(i).toString());
 
                       }
            
            }

        });
        btnDisplayAll.setOnAction(e -> {
            for (int i = 0; i < booking.size(); i++)
            {
                ebookingList.add(booking.get(i).toString());
            }
        });
        btnEmployeeBack1.setOnAction(e -> {
            Tabs.getSelectionModel().select(tabEmployee);
            Tabs.getTabs().remove(tabBooking);
            cmboEmployeeMenu.getSelectionModel().select(0);
        });
        
        tabCheckout.setContent(checkoutPane);
        checkoutPane.setAlignment(Pos.CENTER);
        checkoutPane.add(new Label("Checkout Guest Menu"), 0, 0);
        checkoutPane.add(lblrule1, 0, 1);
        checkoutPane.add(lstCheckout, 1, 1, 2, 5);
        checkoutPane.add(btnCheckout, 0, 6);
        checkoutPane.add(btnEmployeeBack2, 1, 6);
        lstCheckout.setPrefWidth(400);
        btnCheckout.setOnAction(e -> {
            int selectedInt = lstCheckout.getSelectionModel().getSelectedIndex();
            booking.get(selectedInt).bookedRoom.freeThisRoom();
            checkoutList.remove(selectedInt);
            bookList.add(booking.get(selectedInt).toString());
        });
        
        btnEmployeeBack2.setOnAction(e -> {
            Tabs.getSelectionModel().select(tabEmployee);
            Tabs.getTabs().remove(tabCheckout);
            cmboEmployeeMenu.getSelectionModel().select(0);
        });
        
        tabAddGuest.setContent(addGuestPane);
        addGuestPane.setAlignment(Pos.CENTER);
        addGuestPane.add(new Label("Guest Account Menu"), 0, 0);
        addGuestPane.add(lblGuestStatus, 0, 1);
        addGuestPane.add(lblGuestName, 0, 2);
        addGuestPane.add(lblGuestUsername, 0, 3);
        addGuestPane.add(lblGuestPassword, 0, 4);
        addGuestPane.add(lblGuestPassword1, 0, 5);
        addGuestPane.add(lblAddGuest, 0, 6);
        cmboGuestStatus.getItems().add("Guest");
        cmboGuestStatus.getItems().add("ValueGuest");
        cmboGuestStatus.getSelectionModel().select(0);
        addGuestPane.add(cmboGuestStatus, 1, 1);
        addGuestPane.add(txtGuestName, 1, 2);
        addGuestPane.add(txtGuestUsername, 1, 3);
        addGuestPane.add(txtGuestPassword, 1, 4);
        addGuestPane.add(txtGuestPassword1, 1, 5);
        addGuestPane.add(btnAddGuest, 1, 7);
        addGuestPane.add(btnEmployeeBack3, 2, 7);
        addGuestPane.add(lstGuest, 2, 1, 3, 6);
        lstGuest.setPrefWidth(480);
        addGuestPane.setVgap(10);
        addGuestPane.setHgap(10);
        btnAddGuest.setOnAction(e -> {
  
            int x = 0;
            if (isValidAddGuest() == true && createNewPassword(txtGuestPassword.getText()) == 2)
            {
                handleAddGuest(cmboGuestStatus.getValue().toString());
                lblAddGuest.setText("");
            }
            if (isValidAddGuest() == true && createNewPassword(txtGuestPassword.getText()) == 0)
            {
                lblAddGuest.setText("");
                lblAddGuest.setText("Please try again. \n"
                        + "Password does not contain \n"
                        + "at least one uppercase \n"
                        + "letter and one number \n"
                        + "or one or more TextFields \n"
                        + "are empty");
            }
            if (isValidAddGuest() == true && createNewPassword(txtGuestPassword.getText()) == 1)
            {
                lblAddGuest.setText("");
                lblAddGuest.setText("Please try again. Password cannot \n"
                    + "start with a number");
            }
            if (isValidAddGuest() == false)
            {
                lblAddGuest.setText("");
                lblAddGuest.setText("Please try again. Passwords do not match or \n"
                );
            }
        });
        btnEmployeeBack3.setOnAction(e -> {
            Tabs.getSelectionModel().select(tabEmployee);
            Tabs.getTabs().remove(tabAddGuest);  
        });
        
        tabEditGuest.setContent(editGuestPane);
        editGuestPane.setAlignment(Pos.CENTER);
        editGuestPane.add(new Label("Welcome to the Edit a Guest Account Menu"), 0, 0);
        editGuestPane.add(lblEditGuestName, 0, 1);
        editGuestPane.add(lblEditGuestPassword, 0, 2);
        editGuestPane.add(lblEditGuestPassword1, 0, 3);
        editGuestPane.add(txtEditGuestName, 1, 1);
        editGuestPane.add(txtEditGuestPassword, 1, 2);
        editGuestPane.add(txtEditGuestPassword1, 1, 3);
        editGuestPane.add(lblEditGuest, 1, 4);
        editGuestPane.add(btnEmployeeBack4, 2, 6);
        editGuestPane.add(btnEditGuest, 1, 6);
        editGuestPane.add(lstEditGuest, 2, 1, 2, 5);
        lstEditGuest.setPrefWidth(400);
        editGuestPane.setVgap(10);
        editGuestPane.setHgap(10);
        btnEditGuest.setOnAction(e -> {
            int selectedInt = lstEditGuest.getSelectionModel().getSelectedIndex();
            
            //y=guest.get(guestID).setPassword(passWordold, passWordnew);

            //guest.get(selectedInt).setPassword(txtEditGuestPassword.getText(),txtEditGuestPassword1.getText());
            if (isValidEditGuest() == true)
            {
            int y = 0;
                y = guest.get(selectedInt).setPassword(txtEditGuestPassword.getText(),txtEditGuestPassword1.getText()); 
                if (y == 0)
                {
                    lblEditGuest.setText("You entered the wrong password! "
                        + "Please try again!"); 
                }    
                if (y == 1)
                {
                    lblEditGuest.setText("You entered the same password twice! "
                        + "Please try again!");
                }
                if ( y == 2)
                {
                    lblEditGuest.setText("Your password needs a capital letter and number! "
                        + "Please try again!");
                }
                if (y == 3)
                {
                    lblEditGuest.setText("Your password cannot start with a number! "
                        + "Please try again!");    
                }
                if (y == 4)
                {
                    guestList.remove(selectedInt);        
                    guest.get(selectedInt).setGuestName(txtEditGuestName.getText());
                    guestList.add(selectedInt, guest.get(selectedInt).toString());
                    txtEditGuestName.clear();
                    txtEditGuestPassword.clear();
                    txtEditGuestPassword1.clear();
                    lblEditGuest.setText("Your psssword has been changed successfully");
                }
            }
            else
            {
                lblEditGuest.setText("Please try again. Passwords do not match or \n"
                + "One or more TextFields are");
            }
        });
            
        tabAddEmployee.setContent(addEmployeePane);
        addEmployeePane.setAlignment(Pos.CENTER);
        addEmployeePane.add(new Label("Employee Account Menu"), 0, 0);
        addEmployeePane.add(lblEmployeeName, 0, 1);
        addEmployeePane.add(lblEmployeeUsername, 0, 2);
        addEmployeePane.add(lblEmployeePassword, 0, 3);
        addEmployeePane.add(lblEmployeePassword1, 0, 4);
        addEmployeePane.add(lblAddEmployee, 0, 5);
        addEmployeePane.add(txtEmployeeName, 1, 1);
        addEmployeePane.add(txtEmployeeUsername, 1, 2);
        addEmployeePane.add(txtEmployeePassword, 1, 3);
        addEmployeePane.add(txtEmployeePassword1, 1, 4);        
        addEmployeePane.add(btnAddEmployee, 1, 7);
        addEmployeePane.add(btnEmployeeBack5, 2, 7);       
        addEmployeePane.add(lstEmployee, 2, 1, 1, 6);
        lstEmployee.setPrefWidth(400);
        addEmployeePane.setVgap(10);
        addEmployeePane.setHgap(10);       
        btnAddEmployee.setOnAction(e -> {
            int x = 0;
            if (isValidAddEmployee() == true && createNewPassword(txtEmployeePassword.getText()) == 2)
            {
            Employee tempEmployee = new Employee(txtEmployeeUsername.getText(), txtEmployeePassword.getText(), txtEmployeeName.getText());
            employee.add(tempEmployee);
            
            employeeList.add(tempEmployee.toString());
            
            txtEmployeeUsername.clear();
            txtEmployeePassword.clear();
            txtEmployeePassword1.clear();
            txtEmployeeName.clear();
            lblAddEmployee.setText("");
            }
            if (isValidAddEmployee() == true && createNewPassword(txtEmployeePassword.getText()) == 0)
            {
                lblAddEmployee.setText("");
                lblAddEmployee.setText("Please try again. Password \n"
                    + "does not contain at least one \n"
                    + "uppercase letter and one number \n"
                    + "or one or more TextFields are empty");
            }
            if (isValidAddEmployee() == true && createNewPassword(txtEmployeePassword.getText()) == 1)
            {
                lblAddEmployee.setText("");
                lblAddEmployee.setText("Please try again. Password cannot \n"
                    + "start with a number");
            }
            if (isValidAddEmployee() == false && createNewPassword(txtEmployeePassword.getText()) == 0)
            {
                lblAddEmployee.setText("");
                lblAddEmployee.setText("Please try again. Passwords do not match \n");                            
            }   
        });
        btnEmployeeBack5.setOnAction(e -> {
            Tabs.getSelectionModel().select(tabEmployee);
            Tabs.getTabs().remove(tabAddEmployee);  
        });
        
        tabEditEmployee.setContent(editEmployeePane);
        editEmployeePane.setAlignment(Pos.CENTER);
        editEmployeePane.add(new Label("Welcome to the Edit an Employee Account Menu"), 0, 0);
        editEmployeePane.add(lblEditEmployeeName, 0, 1);
        editEmployeePane.add(lblEditEmployeePassword, 0, 2);
        editEmployeePane.add(lblEditEmployeePassword1, 0, 3);
        editEmployeePane.add(lblEditEmployee, 0, 4);
        editEmployeePane.add(txtEditEmployeeName, 1, 1);
        editEmployeePane.add(txtEditEmployeePassword, 1, 2);
        editEmployeePane.add(txtEditEmployeePassword1, 1, 3);
        editEmployeePane.add(btnEmployeeBack6, 2, 6);
        editEmployeePane.add(btnEditEmployee, 1, 6);
        editEmployeePane.add(lstEditEmployee, 2, 1, 2, 5);
        lstEditEmployee.setPrefWidth(400);
        editEmployeePane.setVgap(10);
        editEmployeePane.setHgap(10);
        
        btnEditEmployee.setOnAction(e -> {
            
            if (isValidEditEmployee() == true)
            {    
            int selectedInt = lstEditEmployee.getSelectionModel().getSelectedIndex();
            int y = 0; 
                y = employee.get(selectedInt).setPassword(txtEditEmployeePassword.getText(),txtEditEmployeePassword1.getText());
                if (y == 0)
                {
                    lblEditEmployee.setText("You entered the wrong password! "
                        + "Please try again!"); 
                }      
                if (y == 1)
                {
                    lblEditEmployee.setText("You entered the same password twice! "
                        + "Please try again!");
                }
                if ( y == 2)
                {
                    lblEditEmployee.setText("Your password needs a capital letter and number! "
                        + "Please try again!");
                }
                if (y == 3)
                {
                    lblEditEmployee.setText("Your password cannot start with a number! "
                        + "Please try again!");    
                }
                if (y == 4)
                {    
                    employee.get(selectedInt).setEmployeeName(txtEditGuestName.getText());
                    employeeList.add(selectedInt, employee.get(selectedInt).toString());
                    employeeList.remove(selectedInt);  
                    txtEditEmployeeName.clear();
                    txtEditEmployeePassword.clear();
                    txtEditEmployeePassword1.clear();
                    lblEditEmployee.setText("Your password has been changed successfully.");
                }
            }
            else
            {
                lblEditEmployee.setText("Please try again. Passwords do not match or \n"
                + "One or more TextFields are");
            }
        });
        
        tabAddRoom.setContent(addRoomPane);
        addRoomPane.setAlignment(Pos.CENTER);
        addRoomPane.add(new Label("Add Room Menu"), 0, 0);
        addRoomPane.add(new Label("When Editing Rooms \n "
                + "Retype same room Number \n "
                + "(If you type a different room # \n"
                + "It will not change room # \n"
                + "You can try...)"), 0, 8);
        addRoomPane.add(lblBed, 0, 1);
        cmboBed.getItems().add("1 Queen Size Bed");
        cmboBed.getItems().add("2 Queen Size Beds");
        cmboBed.getItems().add("1 King Size Bed");
        cmboBed.getSelectionModel().select(0);
        addRoomPane.add(cmboBed, 1, 1);
        addRoomPane.add(lblKitchen, 0, 2);
        cmboKitchen.getItems().add("Microwave");
        cmboKitchen.getItems().add("Fridge + Microwave");
        cmboKitchen.getSelectionModel().select(0);
        addRoomPane.add(cmboKitchen, 1, 2);
        addRoomPane.add(lblCoffee, 0, 3);
        cmboCoffee.getItems().add("1-Cup Std. Coffee Machine");
        cmboCoffee.getItems().add("Keurig Hot K200 Coffee Machine");
        cmboCoffee.getSelectionModel().select(0);
        addRoomPane.add(cmboCoffee, 1, 3);
        addRoomPane.add(lblAccess, 0, 4);
        cmboAccess.getItems().add("Standard Room");
        cmboAccess.getItems().add("Enhanced Accessibility Room");
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
        addRoomPane.add(btnAddRoom, 0, 9);
        addRoomPane.add(btnEditRoom, 0, 10);
        addRoomPane.add(btnEmployeeBack7, 2, 9);
        addRoomPane.setHgap(10);
        addRoomPane.add(lblRoomPrice, 1, 9);
        addRoomPane.add(lblRoomNumber, 1, 10);
        //cmboBed.getSelectionModel();
        for (int i = 0; i < room.size(); i++)
        {
            roomList.add(room.get(i).roomDescription());
        }
        btnAddRoom.setOnAction(e -> {
            if (isValidRoomPrice() == true && isValidRoomNumber() == true)
            {
                handleAddRoom();
                lblRoomNumber.setText("");
            }
            else
            {
                if (isValidRoomPrice() == false)
                {
                    lblRoomPrice.setText("Please enter valid room price!");
                    lblRoomNumber.setText("");
                }
                if (isValidRoomNumber() == false)
                {
                    lblRoomNumber.setText("Please enter valid room number!");
                    lblRoomPrice.setText("");
                }
                if (isValidRoomPrice() == false && isValidRoomNumber() == false)
                {
                    lblRoomPrice.setText("Please enter valid room price!");
                    lblRoomNumber.setText("Please enter valid room number!");
                }
            }     
        });
        btnEditRoom.setOnAction(e -> {
            if (isValidRoomPrice() == true && isValidRoomNumber() == true)
            {
                handleEditRoom();
                lblRoomNumber.setText("");
            }
            else
            {
                if (isValidRoomPrice() == false)
                {
                    lblRoomPrice.setText("Please enter valid room price!");
                    lblRoomNumber.setText("");
                }
                if (isValidRoomNumber() == false)
                {
                    lblRoomNumber.setText("Please enter valid room number!");
                    lblRoomPrice.setText("");
                }
                if (isValidRoomPrice() == false && isValidRoomNumber() == false)
                {
                    lblRoomPrice.setText("Please enter valid room price!");
                    lblRoomNumber.setText("Please enter valid room number!");
                }
            }     
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
        cmboYear.getItems().addAll((2019), (2020),
                (2021), (2022), (2023));
        bookRoomPane.add(cmboYear, 1, 5);
        cmboYear.getSelectionModel().select(0);
        for (int i = 1; i < 32; i++)
        {
        cmboDayIn.getItems().add(i);
        cmboDayIn.getSelectionModel().select(0);
        }
        bookRoomPane.add(cmboDayIn, 2, 6);
        for (int i = 1; i < 32; i++)
        {
        cmboDayOut.getItems().add(i);
        cmboDayOut.getSelectionModel().select(0);
        }
        bookRoomPane.add(cmboDayOut, 2, 7);
        cmboMonthIn.getItems().addAll(("January"),("February"),("March"),("April"),("May"),
                ("June"),("July"),("August"),("September"),("October"),("November"),("December"));      
        bookRoomPane.add(cmboMonthIn, 1, 6);
        cmboMonthIn.getSelectionModel().select(0);
        cmboMonthOut.getItems().addAll(("January"),("February"),("March"),("April"),("May"),
                ("June"),("July"),("August"),("September"),("October"),("November"),("December"));
        bookRoomPane.add(cmboMonthOut, 1, 7);
        cmboMonthOut.getSelectionModel().select(0);
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
           int selectedInt = listBookRoom.getSelectionModel().getSelectedIndex();
           listBookRoom.getItems().remove(selectedInt);
           
           int dayIn = ((Integer)cmboDayIn.getValue());
           int dayOut = ((Integer)cmboDayOut.getValue());
           int year = ((Integer)cmboYear.getValue());
           int monthIn = handleMonth(cmboMonthIn.getValue().toString());
           int monthOut = handleMonth(cmboMonthOut.getValue().toString());
           
           if (!currentGuest.isEmpty())
           {
                Guest myGuest = currentGuest.get(0);
                room.get(selectedInt);              
                room.get(selectedInt).bookRoom();
                Room chosenRoom = room.get(selectedInt);
                //listBookRoom.getItems().remove(i);
                Booking newBooking = new Booking(myGuest, chosenRoom, year, dayIn, dayOut, monthIn, monthOut, year);

                booking.add(newBooking);
                checkoutList.add(newBooking.toString());
                System.out.print(newBooking.toString());
                System.out.print("Booked a guest");
                  
           }
           if (!currentVGuest.isEmpty())
           {
               Guest aGuest = currentVGuest.get(0);
               for (int i = 0; i < room.size(); i++)
                { 
                    if(listBookRoom.getSelectionModel().getSelectedIndex() == i);
                    {
                    room.get(i).bookRoom();
                    Room chosenRoom = room.get(i);
                    //listBookRoom.getItems().remove(i);
                    Booking newBooking = new Booking(aGuest, chosenRoom, year, dayIn, dayOut, monthIn, monthOut, year);

                    booking.add(newBooking);
                    checkoutList.add(newBooking.toString());
                    System.out.print(newBooking.toString());
                    System.out.print("Booked a valued guest");
                    }
                }
           }
                
        });
        btnGuestBack1.setOnAction(e -> {
           if (!currentVGuest.isEmpty())
           {
               Tabs.getSelectionModel().select(tabValueGuest);
               Tabs.getTabs().remove(tabBookRoom); 
           }
           if (!currentGuest.isEmpty())
           {
               Tabs.getSelectionModel().select(tabGuest);
               Tabs.getTabs().remove(tabBookRoom); 
           }
                  
        });
       
        tabDisplayBooking.setContent(guestBookingPane);
        guestBookingPane.setAlignment(Pos.CENTER);
        guestBookingPane.add(new Label("Welcome to the Display Guest Booking Report Menu"), 0, 0);
        guestBookingPane.add(lblDisplayGBooking, 0, 1);
        guestBookingPane.add(btnDisplyGBooking, 0, 2);
        guestBookingPane.add(lstGBooking, 1, 1, 2, 5);
        
        tabEditGuestInfo.setContent(editGuestInfoPane);
        editGuestInfoPane.setAlignment(Pos.CENTER);
        editGuestInfoPane.add(new Label("Welcome to the Edit Guest Information Menu"), 0, 0);
        
        tabRoomService.setContent(roomServicePane);
        roomServicePane.setAlignment(Pos.CENTER);
        roomServicePane.add(new Label("Welcome to the Room Service Menu"), 0, 0);
        roomServicePane.add(lblServices, 0, 1);
        roomServicePane.add(cmboServices, 0, 2);
        roomServicePane.add(txtServiceQuantity, 1, 2);
        roomServicePane.add(listOrder, 2, 1, 2, 5);
        roomServicePane.add(btnAddToOrder, 0, 4);
        roomServicePane.add(btnFinishOrderService, 0, 7);
        roomServicePane.add(btnBack, 2, 7);
        roomServicePane.add(lblQuantity, 1, 1);
        roomServicePane.add(lblTotalPrice, 2, 6); 
        roomServicePane.setVgap(20);
        roomServicePane.setHgap(20);
        cmboServices.getItems().addAll(
        ("Pizza - $17.00"), ("Dessert - $5.00"), ("Salad - $8.00"), ("Dom Perignon 1968 - $150.00"), ("Towels - $2.00")
        );
        cmboServices.getSelectionModel().select(0);
        ArrayList <RoomService> tempServiceList = new ArrayList<>();
        btnAddToOrder.setOnAction(e -> {
        
            //double quantityOfService; 
            //quantityOfService = Double.parseDouble(txtServiceQuantity.getText())
            String quantityOfService;
            quantityOfService = cmboServices.getValue().toString() + " x " + txtServiceQuantity.getText();
            roomServiceList.add(quantityOfService);
           
            double num = handleRoomService(cmboServices.getValue().toString());
            double totalService = Double.parseDouble(txtServiceQuantity.getText()) * num;
            
            RoomService newOrder = new RoomService(cmboServices.getValue().toString(), totalService);
            tempServiceList.add(newOrder);
            System.out.println(newOrder.toString());
            System.out.println(tempServiceList.get(0).toString());          
        });
        
        btnFinishOrderService.setOnAction(e -> {
        /*
        double num = handleRoomService(cmboServices.getValue().toString());
        double totalService = Double.parseDouble(txtServiceQuantity.getText()) * num;
        RoomService newOrder = new RoomService(cmboServices.getValue().toString(), totalService);
        */
          
          double totalCost = 0;
          for(int i = 0; i < booking.size();i++)
            {
                if(booking.get(i).getBookingGuest() == currentVGuest.get(0))
                {
                    //booking.get(0).getArrayList().add(newOrder);
                    for (int j = 0; j < tempServiceList.size(); j++)
                    {
                    booking.get(0).getArrayList().add(tempServiceList.get(j));
                    totalCost += tempServiceList.get(j).getPrice();
                    lblTotalPrice.setText("Price: $" + totalCost / 2);
                    }
                }
            }    
        });
        btnBack.setOnAction(e -> {
            Tabs.getTabs().remove(tabRoomService);
            Tabs.getSelectionModel().select(tabValueGuest);
            cmboVGuestMenu.getSelectionModel().select(0);
              
        });
        
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
                    //System.out.println("Welcome " + employee.get(i).getEmployeeName());
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
            case "Guests":
            for(int i =0; i< guest.size(); i++)
            {
                if (guest.get(i).checkCredentials(username, password))
                {
                    currentGuest.add(guest.get(i));
                    Tabs.getTabs().add(tabGuest); Tabs.getSelectionModel().select(tabGuest);
                    txtUsername.clear();
                    txtPassword.clear();
                    invalid.setText("");
                    break;
                }
                if (guest.get(i).checkCredentials(username, password) == false && currentVGuest.isEmpty() == true)
                {
                    invalid.setText("Invalid Credentials! Please try again!");
                    break;
                }
            }
            
            for(int i =0; i< valueGuest.size(); i++)
            {
                if (valueGuest.get(i).checkCredentials(username, password))
                {
                    currentVGuest.add(valueGuest.get(i));
                    Tabs.getTabs().add(tabValueGuest); Tabs.getSelectionModel().select(tabValueGuest);
                    txtUsername.clear();
                    txtPassword.clear();
                    invalid.setText("");
                    break;
                }
                if (valueGuest.get(i).checkCredentials(username, password) == false && currentGuest.isEmpty() == true)
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
            case "Run a Booking Report": Tabs.getTabs().add(tabBooking); Tabs.getSelectionModel().select(tabBooking); break;
            case "Checkout Guest": Tabs.getTabs().add(tabCheckout); Tabs.getSelectionModel().select(tabCheckout); break;
            case "Create New Guest Account": Tabs.getTabs().add(tabAddGuest); Tabs.getSelectionModel().select(tabAddGuest); break;
            case "Edit Guest Account": ; Tabs.getTabs().add(tabEditGuest); Tabs.getSelectionModel().select(tabEditGuest); break; 
            case "Create New Employee Account": Tabs.getTabs().add(tabAddEmployee); Tabs.getSelectionModel().select(tabAddEmployee); break;
            case "Edit Employee Account": Tabs.getTabs().add(tabEditEmployee); Tabs.getSelectionModel().select(tabEditEmployee); break;
            case "Create or Edit a Room": Tabs.getTabs().add(tabAddRoom); Tabs.getSelectionModel().select(tabAddRoom); break;
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
    public void handleVGuestChoice(String menuChoice)
    {
        switch(menuChoice)
        {
            case "Book a Room": Tabs.getTabs().add(tabBookRoom); Tabs.getSelectionModel().select(tabBookRoom); break; 
            case "Display Booking Report": Tabs.getTabs().add(tabDisplayBooking); Tabs.getSelectionModel().select(tabDisplayBooking); break; 
            case "Edit Guest Information": Tabs.getTabs().add(tabEditGuestInfo); Tabs.getSelectionModel().select(tabEditGuest); break;
            case "Order Room Service": Tabs.getTabs().add(tabRoomService); Tabs.getSelectionModel().select(tabRoomService); break;
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
    
    public int handleMonth(String month)
    {
        int monthInt = 0;
        switch(month)
        {
            case "January": monthInt = 1; break;
            case "February": monthInt = 2; break;
            case "March": monthInt = 3; break;
            case "April": monthInt = 4; break;
            case "May": monthInt = 5; break;
            case "June": monthInt = 6; break;
            case "July": monthInt = 7; break;
            case "August": monthInt = 8; break;
            case "September": monthInt = 9; break;
            case "October": monthInt = 10; break;
            case "November": monthInt = 11; break;
            case "December": monthInt = 12; break;            
            default: break;
        }
        return monthInt;
    }
    
    public void handleAddRoom()
    {
        int bed = handleBed(cmboBed.getValue().toString());
        int kitchen = handleKitchen(cmboKitchen.getValue().toString());
        int coffee = handleCoffee(cmboCoffee.getValue().toString());
        int access = handleAccess(cmboAccess.getValue().toString());
            
        Room tempRoom = new Room(bed, kitchen, coffee, access,  
                Integer.valueOf(txtRoomNum.getText()), Double.valueOf(txtPrice.getText()));
                   
        room.add(tempRoom);
            
        //selectRoomList.add(tempRoom.getRoomNumber());
            
        roomList.add(tempRoom.roomDescription());
        bookList.add(tempRoom.roomDescription());
            
        cmboBed.getSelectionModel().select(0);
        cmboKitchen.getSelectionModel().select(0);
        cmboCoffee.getSelectionModel().select(0);
        cmboAccess.getSelectionModel().select(0);
        txtRoomNum.clear();
        txtPrice.clear();
    }
    public void handleEditRoom()
    {
        int selectedInt = lstRoom.getSelectionModel().getSelectedIndex();
            
        int bed = handleBed(cmboBed.getValue().toString());
        int kitchen = handleKitchen(cmboKitchen.getValue().toString());
        int coffee = handleCoffee(cmboCoffee.getValue().toString());
        int access = handleAccess(cmboAccess.getValue().toString());
            
        Room tempRoom = new Room(bed, kitchen, coffee, access,  
                room.get(selectedInt).getRoomNumber(), Double.valueOf(txtPrice.getText()));
                    
        room.get(selectedInt).setBed(bed);
        room.get(selectedInt).setKitch(kitchen);
        room.get(selectedInt).setCoffee(coffee);
        room.get(selectedInt).setAccess(coffee);
        room.get(selectedInt).setRoomPrice(Double.valueOf(txtPrice.getText()));
            
        System.out.print(room.get(selectedInt).roomDescription());
            
        //selectRoomList.add(tempRoom.getRoomNumber());
        //selectRoomList.remove(tempRoom.getRoomNumber());
            
        //lstRoom.getItems().remove(selectedInt);
        roomList.remove(selectedInt);
        roomList.add(selectedInt, room.get(selectedInt).roomDescription());
            
        cmboBed.getSelectionModel().select(0);
        cmboKitchen.getSelectionModel().select(0);
        cmboCoffee.getSelectionModel().select(0);
        cmboAccess.getSelectionModel().select(0);
        txtRoomNum.clear();
        txtPrice.clear();
    }
    
    public boolean isValidRoomPrice()
    {
        boolean result = false;
        if (!(txtPrice.getText() == null || txtPrice.getText().length() == 0)) 
        {
        try {
            // Do all the validation you need here such as
            Double d = Double.parseDouble(txtPrice.getText());
            if ( d >= 1.0 && d < 999.9)
                {
                result = true;
                }
            } catch (NumberFormatException e) 
            {
            result = false;
            }
        }
        return result;     
    }

    public boolean isValidRoomNumber()
    {
        boolean result = false;
        if (!(txtRoomNum.getText() == null || txtRoomNum.getText().length() == 0)) 
        {
        try {
            // Do all the validation you need here such as
            int d = Integer.parseInt(txtRoomNum.getText());
            if ( d >= 1 && d < 999)
                {
                result = true;
                }
            } catch (NumberFormatException e) 
            {
            result = false;
            }
        }
        return result;     
    }
    public boolean isValidAddGuest()
    {
        boolean result = false;
        if (!(txtGuestPassword.getText() == null || txtGuestPassword.getText().length() == 0
                && txtGuestPassword1.getText() == null || txtGuestPassword1.getText().length() == 0
                && txtGuestUsername.getText() == null || txtGuestUsername.getText().length() == 0
                && txtGuestName.getText() == null || txtGuestName.getText().length() == 0))
        {
            if(txtGuestPassword.getText().equals(txtGuestPassword1.getText()))
            {
                result = true;
            }
            else
            {
                result = false;
            }
        }
        return result;     
    }
    
    public boolean isValidEditGuest()
    {
        boolean result = false;
        if (!(txtEditGuestPassword.getText() == null || txtEditGuestPassword.getText().length() == 0
                && txtEditGuestPassword1.getText() == null || txtEditGuestPassword1.getText().length() == 0
                && txtEditGuestName.getText() == null || txtEditGuestName.getText().length() == 0)) 
        {
            result = true; 
        }
        else
        {
            result = false;
        }
        return result;     
    }
    
    public boolean isValidAddEmployee()
    {
        boolean result = false;
        if (!(txtEmployeePassword.getText() == null || txtEmployeePassword.getText().length() == 0
                && txtEmployeePassword1.getText() == null || txtEmployeePassword1.getText().length() == 0
                && txtEmployeeUsername.getText() == null || txtEmployeeUsername.getText().length() == 0
                && txtEmployeeName.getText() == null || txtEmployeeName.getText().length() == 0)) 
        {
            if(txtEmployeePassword.getText().equals(txtEmployeePassword1.getText()))
            {
                result = true;
            }
            else
            {
                result = false;
            }
        }
        return result;     
    }
    
    public boolean isValidEditEmployee()
    {
        boolean result = false;
        if (!(txtEditEmployeePassword.getText() == null || txtEditEmployeePassword.getText().length() == 0
                && txtEditEmployeePassword1.getText() == null || txtEditEmployeePassword1.getText().length() == 0
                && txtEditEmployeeName.getText() == null || txtEditEmployeeName.getText().length() == 0)) 
        {
            result = true; 
        }
        else
        {
            result = false;
        }
        return result;     
    }
    
    public void handleAddGuest(String status)
    {
        switch(status)
        {
            case "Guest": addGuest(); break; 
            case "ValueGuest": addValueGuest(); System.out.print("This is valued Guest"); break;
            default: break;
        }
    }
    
    public void addGuest()
    {
        Guest tempGuest = new Guest(txtGuestUsername.getText(), txtGuestPassword.getText()
                    ,txtGuestName.getText());
            
        guest.add(tempGuest);        
        
        editGuestList.add(tempGuest.toString());
               
        guestList.add(tempGuest.toString());
        guestName.add(tempGuest.getGuestName());
        txtGuestUsername.clear();
        txtGuestPassword.clear();
        txtGuestPassword1.clear();
        txtGuestName.clear();
    }
    
    public void addValueGuest()
    {
        ValueGuest tempValueGuest = new ValueGuest(txtGuestUsername.getText(), txtGuestPassword.getText()
                    ,txtGuestName.getText());
        
        valueGuest.add(tempValueGuest);
        
        guestList.add(tempValueGuest.toString());
        
        txtGuestUsername.clear();
        txtGuestPassword.clear();
        txtGuestPassword.clear();
        txtGuestName.clear();       
    }
    
    public double handleRoomService(String service)
    {
        double num = 0;
        switch(service)
        {
            case "Pizza - $17.00":  num = 17.00; break;
            case "Dessert - $5.00":  num = 5.00; break;
            case "Salad - $8.00": num = 8.00; break;
            case "Dom Perignon 1968 - $150.00": num = 150.00; break;
            case "Towels - $2.00": num = 2.00 ; break;
                  
            default: break;
        }
        return num;
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
                        x = 2;        
        }
        return x;
    }
    
    @Override
    public void stop()
    {
        
    }
}
