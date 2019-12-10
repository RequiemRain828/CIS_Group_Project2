package CIS_Group_Project2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*; 
import javafx.stage.Stage;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;

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
    //public static ArrayList<Booking> tempBooking = new ArrayList();
    public static ArrayList<Guest> currentGuest = new ArrayList();
    public static ArrayList<ValueGuest> currentVGuest = new ArrayList();
    public static ObservableList roomList = FXCollections.observableArrayList();
    public static ObservableList guestList = FXCollections.observableArrayList();
    public static ObservableList editGuestList = FXCollections.observableArrayList();
    public static ObservableList employeeList = FXCollections.observableArrayList();
    public static ObservableList bookList = FXCollections.observableArrayList();
    public static ObservableList ebookingList = FXCollections.observableArrayList();
    //public static ObservableList selectRoomList = FXCollections.observableArrayList();
    public static ObservableList checkoutList = FXCollections.observableArrayList();
    public static ObservableList roomServiceList = FXCollections.observableArrayList();
    public static ObservableList guestName = FXCollections.observableArrayList();
    public static ObservableList gBookingList = FXCollections.observableArrayList();
    public static ObservableList guestEditList = FXCollections.observableArrayList();
    //public static int count;
    
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
    public Label lblNotBooked = new Label("");
    
    // Employee Room Summary controls
    public Label lblSelectRoom = new Label("Select Guest: ");
    public ComboBox cmboSelectRoom = new ComboBox(guestName);
    public ListView lstEmployeeBooking = new ListView(ebookingList);
    public Button btnDisplayAll = new Button("Display All");
    public Button btnDisplaySelect = new Button("Display Selected Guest Info");
    
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
    public Label lblAddGuestPasswordMustHaves = new Label("Password Requirements:"
            + "\n * Must contain at least one capital letter"
            + "\n * Must contain at least one number"
            + "\n * Cannot begin with a number");
    public ComboBox cmboGuestStatus = new ComboBox();
    public TextField txtGuestUsername = new TextField();
    public TextField txtGuestPassword = new TextField();
    public TextField txtGuestPassword1 = new TextField();
    public TextField txtGuestName = new TextField();
    public Button btnAddGuest = new Button("Add Guest -> ");
    public ListView lstGuest = new ListView(guestList);
    
    // Edit Guest Account
    public Label lblSelectGuest = new Label("*** Select a guest from the list to edit.***");
    public Label lblEditGuestName = new Label("Enter Guest Full Name: ");
    public Label lblEditGuestPassword = new Label("Enter Old Guest Password: ");
    public Label lblEditGuestPassword1 = new Label("Enter New Guest Password: ");
    public Label lblEditGuestForEmpPasswordMustHaves = new Label("Password Requirements:"
            + "\n * Must contain at least one capital letter"
            + "\n * Must contain at least one number"
            + "\n * Cannot begin with a number");
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
    public Label lblAddEmployeePasswordMustHaves = new Label("Password Requirements:"
            + "\n * Must contain at least one capital letter"
            + "\n * Must contain at least one number"
            + "\n * Cannot begin with a number");
    public Label lblAddEmployee = new Label("");
    public TextField txtEmployeeUsername = new TextField();
    public TextField txtEmployeePassword = new TextField();
    public TextField txtEmployeePassword1 = new TextField();
    public TextField txtEmployeeName = new TextField();
    public Button btnAddEmployee = new Button("Add Employee -> ");
    public ListView lstEmployee = new ListView(employeeList);
    
    // Edit Employee Account
    public Label lblSelectEmployee = new Label("*** Select an employee from the list to edit.***");
    public Label lblEditEmployeeName = new Label("Enter Employee Full Name: ");
    public Label lblEditEmployeePassword = new Label("Enter Old Employee Password: ");
    public Label lblEditEmployeePassword1 = new Label("Enter New Employee Password: ");
    public Label lblEditEmployeePasswordMustHaves = new Label("Password Requirements:"
            + "\n * Must contain at least one capital letter"
            + "\n * Must contain at least one number"
            + "\n * Cannot begin with a number");
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
    public Label lblCheckinDate = new Label("Check In Month/Day/Year: ");
    public Label lblCheckoutDate = new Label("Check Out Month/Day/Year: ");
    public Label lblThankYou = new Label("");
    public Button btnBookRoom = new Button("Book Room -> "); 
    public ListView listBookRoom = new ListView(bookList);
    public ComboBox cmboYearIn = new ComboBox();
    public ComboBox cmboYearOut = new ComboBox();
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
    public Label lblGuestEditDisplayPrompt = new Label("Click \"Display Info\" to see your information");
    public Label lblNamePrompt = new Label("Enter a new name: ");
    public Label lblEditRule = new Label("*(As a Guest, you can only edit your name)*");
    public Button btnEditInfo = new Button("Edit Name ->");
    public ListView lstGuestInfo = new ListView(guestEditList);
    public TextField txtEditName = new TextField();
    public Button btnDisplayInfo = new Button("Display Info -> ");
    
    // Room Service Controls
    public Label lblServices = new Label("Available services: ");
    public Button btnAddToOrder = new Button("Add to Order");
    public Button btnFinishOrderService = new Button("Complete Order");
    public Button btnBack = new Button("Back to Menu");
    public Button btnClearOrder = new Button("Make Another Order");
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
    public Tab tabEditRoom = new Tab("Guest Edit Info");
    public Tab tabBookRoom = new Tab("Book Room Menu");
    public Tab tabDisplayBooking = new Tab("Guest Booking Report");
    public Tab tabEditGuestInfo = new Tab("Guest Edit Info");
    public Tab tabRoomService = new Tab("Room Service Menu");
    
    @Override
    public void start(Stage primaryStage) 
    {
        Employee e1 = new Employee ("root" , "D1", "Austin Putnam");
        employee.add(e1);
        
        Employee emp = new Employee ("admin" , "Pool2", "Boston Putnam");
        employee.add(emp);
        
        Employee emp1 = new Employee ("blah" , "Bleep3", "Costin Putnam");
        employee.add(emp1);
        
        Guest g1 = new Guest("guest", "C1", "Jeremy Ezell");
        guest.add(g1);
        
        Guest g2 = new Guest("guest1" , "C2", "Mike Thorton");
        guest.add(g2);
        
        ValueGuest g3 = new ValueGuest("vguest" , "G0", "Seth Ledger");
        valueGuest.add(g3);
        
        ValueGuest g4 = new ValueGuest("vguest1" , "G1", "Bob Solid");
        valueGuest.add(g4);
        
        Room r1 = new Room(1, 1, 1, 1, 3, 50.00);
        room.add(r1);
        
        Room r2 = new Room(1, 1, 1 ,1 , 4, 100.00);
        room.add(r2);
        
        for(int i=0;i<guest.size();i++){
            guestList.add(guest.get(i));
            guestName.add(guest.get(i).toStringName()); 
        }
        for(int i=0;i<valueGuest.size();i++)
        {
            guestList.add(valueGuest.get(i));
            guestName.add(valueGuest.get(i).toStringName());
       
        }
        for(int i = 0; i < employee.size(); i++){
            employeeList.add(employee.get(i));
        }
        
        
        primaryPane.setAlignment(Pos.TOP_LEFT);
        
        // Add each individual Tab to the TabPane
        Tabs.getTabs().add(tabLogin);
        //Tabs.getTabs().add(tabEmployee);
        //Tabs.getTabs().add(tabGuest);
        //Tabs.getTabs().add(tabAddGuest);
        //Tabs.getTabs().add(tabAddEmployee);
        //Tabs.getTabs().add(tabBooking);
        //Tabs.getTabs().add(tabAddRoom);
        //Tabs.getTabs().add(tabBookRoom);
        //Tabs.getTabs().add(tabRoomService);
        //Tabs.getTabs().add(tabEditGuest);
        //Tabs.getTabs().add(tabEditEmployee);
        
        primaryPane.add(Tabs, 0, 0);
        
        tabLogin.setContent(loginPane); 
        loginPane.setAlignment(Pos.CENTER);
        loginPane.add(new Label(""), 0, 0);
        loginPane.add(new Label("Welcome to the Login Screen "), 0, 1);
        loginPane.add(lblUsername, 0, 2);
        loginPane.add(txtUsername, 1, 2);
        loginPane.add(lblPassword, 0, 3);
        loginPane.add(txtPassword, 1, 3);
        cmboLogin.getItems().add("Employees");
        cmboLogin.getItems().add("Guests");
        cmboLogin.getSelectionModel().select(0);
        loginPane.add(cmboLogin, 1, 4);
        loginPane.add(btnLogin, 1, 5);
        loginPane.add(invalid, 1, 6);
        loginPane.setVgap(10);
        btnLogin.setOnAction(e -> {
            handleLogin(cmboLogin.getValue().toString()); 
        });

        // Employee Menu Pane
        tabEmployee.setContent(employeePane);
        employeePane.setAlignment(Pos.CENTER);
        employeePane.add(new Label("Welcome to the Employee Menu"), 0, 1);
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
        employeePane.add(cmboEmployeeMenu, 0, 2);
        employeePane.add(btnEmployeeSelect, 0, 3);
        employeePane.add(btnEmployeeLogout, 1, 3);
        employeePane.setVgap(10);
        btnEmployeeSelect.setOnAction(e -> {
            
            handleEmployeeChoice(cmboEmployeeMenu.getValue().toString());
        });
        btnEmployeeLogout.setOnAction(e -> {
            invalid.setText("");
            Tabs.getTabs().add(tabLogin);
            Tabs.getSelectionModel().select(tabLogin);
            Tabs.getTabs().remove(tabEmployee);
                
        });
        
        // Guest Menu Pane
        tabGuest.setContent(guestPane);
        guestPane.setAlignment(Pos.CENTER);
        guestPane.add(new Label("Welcome to the Guest Menu"), 0, 1);
        cmboGuestMenu.getItems().addAll(
                ("Book a Room"),
                ("Display Booking Report"),
                ("Edit Guest Information")
        );
        cmboGuestMenu.getSelectionModel().select(0);
        guestPane.add(cmboGuestMenu, 0, 2);
        guestPane.add(btnGuestSelect, 0, 3);
        guestPane.add(btnGuestLogout, 1, 3);
        guestPane.setVgap(10);
        btnGuestSelect.setOnAction(e -> {            
            handleGuestChoice(cmboGuestMenu.getValue().toString());
            if(cmboGuestMenu.getValue().toString().equals("Edit Guest Information")) {
                if (!currentGuest.isEmpty())
                {
                   guestEditList.add(currentGuest.get(0).toString());
                }
            }
        });
        btnGuestLogout.setOnAction(e -> {            
            currentGuest.remove(0);
            invalid.setText("");
            Tabs.getTabs().add(tabLogin);
            Tabs.getSelectionModel().select(tabLogin);
            Tabs.getTabs().remove(tabGuest);  
        });
        
        tabValueGuest.setContent(valueGuestPane);
        valueGuestPane.setAlignment(Pos.CENTER);
        valueGuestPane.add(new Label("Welcome to ValueGuest Menu"), 0, 1);
        cmboVGuestMenu.getItems().addAll(
                ("Book a Room"),
                ("Display Booking Report"),
                ("Edit Guest Information"),
                ("Order Room Service")
        );
        valueGuestPane.add(cmboVGuestMenu, 0, 2);
        cmboVGuestMenu.getSelectionModel().select(0);
        valueGuestPane.add(btnVGuestSelect, 0, 3);
        valueGuestPane.add(btnVGuestLogout, 1, 3);
        valueGuestPane.add(lblNotBooked, 0, 4);
        valueGuestPane.setVgap(10);
        btnVGuestSelect.setOnAction(e -> {            
            handleVGuestChoice(cmboVGuestMenu.getValue().toString());
            //Tabs.getTabs().remove(tabValueGuest);
            if (!currentVGuest.isEmpty()){
                guestEditList.add(currentVGuest.get(0).toString());
            }
                
        });
        btnVGuestLogout.setOnAction(e -> {
            currentVGuest.remove(0);
            invalid.setText("");
            Tabs.getTabs().add(tabLogin);
            Tabs.getSelectionModel().select(tabLogin);
            Tabs.getTabs().remove(tabValueGuest);            
        });
        
        tabBooking.setContent(employeeBookingPane);
        employeeBookingPane.setAlignment(Pos.CENTER);
        employeeBookingPane.add(new Label(""), 0, 0);
        employeeBookingPane.add(new Label("Employee Booking Report Menu"), 0, 1);
        employeeBookingPane.add(lblSelectRoom, 0, 3);
//        cmboSelectRoom.getItems().add("None");
        cmboSelectRoom.getSelectionModel().select(0);       
        employeeBookingPane.add(cmboSelectRoom, 0, 4);
        employeeBookingPane.add(lstEmployeeBooking, 1, 1, 2, 5);
        employeeBookingPane.add(btnDisplayAll, 0, 6);
        employeeBookingPane.add(btnDisplaySelect, 0, 5);
        employeeBookingPane.add(btnEmployeeBack1, 1, 6);
        lstEmployeeBooking.setPrefWidth(600);
        employeeBookingPane.setVgap(10);
        employeeBookingPane.setHgap(10);
        btnDisplaySelect.setOnAction(e -> {
            lstEmployeeBooking.getItems().clear();
            for(int i=0; i<booking.size();i++)
            { 
               if( cmboSelectRoom.getValue().toString().
                   equals(booking.get(i).getBookingGuest().
                           getGuestName()+ " (Value Guest)"))
               {                   
                   ebookingList.add(booking.get(i).toStringValue());
               }
               else if(cmboSelectRoom.getValue().toString().
                   equals(booking.get(i).getBookingGuest().
                           getGuestName() + " (Guest)"))
                       {
                         ebookingList.add(booking.get(i).toString());
                       }          
            }
        });
        btnDisplayAll.setOnAction(e -> {
            lstEmployeeBooking.getItems().clear();
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
        checkoutPane.add(new Label("Checkout Guest Menu"), 0, 1);
        checkoutPane.add(lblrule1, 0, 2);
        checkoutPane.add(lstCheckout, 1, 1, 2, 5);
        checkoutPane.add(btnCheckout, 0, 6);
        checkoutPane.add(btnEmployeeBack2, 1, 6);
        checkoutPane.setVgap(15);
        checkoutPane.setHgap(15);
        lstCheckout.setPrefWidth(400);
        btnCheckout.disableProperty()
        .bind(lstCheckout.getSelectionModel().selectedItemProperty().isNull());
        btnCheckout.setOnAction(e -> {
            int selectedInt = lstCheckout.getSelectionModel().getSelectedIndex();
            booking.get(selectedInt).bookedRoom.freeThisRoom();
            checkoutList.remove(selectedInt);
            bookList.add(room.get(selectedInt).roomDescription());
            
        });
        
        btnEmployeeBack2.setOnAction(e -> {
            Tabs.getSelectionModel().select(tabEmployee);
            Tabs.getTabs().remove(tabCheckout);
            cmboEmployeeMenu.getSelectionModel().select(0);
        });
        
        tabAddGuest.setContent(addGuestPane);
        addGuestPane.setAlignment(Pos.CENTER);
        addGuestPane.add(new Label("Guest Account Menu"), 0, 1);
        addGuestPane.add(lblGuestStatus, 0, 2);
        addGuestPane.add(lblGuestName, 0, 3);
        addGuestPane.add(lblGuestUsername, 0, 4);
        addGuestPane.add(lblGuestPassword, 0, 5);
        addGuestPane.add(lblGuestPassword1, 0, 6);
        addGuestPane.add(lblAddGuestPasswordMustHaves, 0, 8);
        addGuestPane.add(lblAddGuest, 0, 9);
        cmboGuestStatus.getItems().add("Guest");
        cmboGuestStatus.getItems().add("ValueGuest");
        cmboGuestStatus.getSelectionModel().select(0);
        addGuestPane.add(cmboGuestStatus, 1, 2);
        addGuestPane.add(txtGuestName, 1, 3);
        addGuestPane.add(txtGuestUsername, 1, 4);
        addGuestPane.add(txtGuestPassword, 1, 5);
        addGuestPane.add(txtGuestPassword1, 1, 6);
        addGuestPane.add(btnAddGuest, 1, 10);
        addGuestPane.add(btnEmployeeBack3, 2, 10);
        addGuestPane.add(lstGuest, 2, 1, 3, 9);
        lstGuest.setPrefWidth(500);
        addGuestPane.setVgap(10);
        addGuestPane.setHgap(10);
        btnAddGuest.setOnAction(e -> {
  
            // int x = 0;
            if (isValidAddGuest() == true && createNewPassword(txtGuestPassword.getText()) == 2)
            {
                handleAddGuest(cmboGuestStatus.getValue().toString());
                lblAddGuest.setText("");
            } else {
                
                String errorMessage = "Please try again.";
                String temp = addGuestErrorMessages();
                
                // Textfield empty
                if(addGuestErrorMessages().contains("1")) {
                    errorMessage += "\n- All text fields must be filled";
                }
    
                // Passwords don't match
                if(addGuestErrorMessages().contains("2")) {
                    errorMessage += "\n- The password entries don't match ";
                }
                
                // No capital
                if(addGuestErrorMessages().contains("3")) {
                    errorMessage += "\n- The password must contain a captial letter";
                }
                
                // No number
                if(addGuestErrorMessages().contains("4")) {
                    errorMessage += "\n- The password must contain a number";
                }
                
                // Number at the front 
                if(addGuestErrorMessages().contains("5")) {
                    errorMessage += "\n- The password cannot begin with a number";
                }
                
                lblAddGuest.setText(errorMessage);
            }
//            else if (isValidAddGuest() == true && createNewPassword(txtGuestPassword.getText()) == 0)
//            {
//                lblAddGuest.setText("");
//                lblAddGuest.setText("Please try again. \n"
//                        + "Password does not contain \n"
//                        + "at least one uppercase \n"
//                        + "letter and one number \n"
//                        + "or one or more TextFields \n"
//                        + "are empty");
//            }
//            else if (isValidAddGuest() == true && createNewPassword(txtGuestPassword.getText()) == 1)
//            {
//                lblAddGuest.setText("");
//                lblAddGuest.setText("Please try again. Password cannot \n"
//                    + "start with a number");
//            }
//            //if (isValidAddGuest() == false && createNewPassword(txtGuestPassword.getText()) == 0)
//            else
//            {
//                lblAddGuest.setText("");
//                lblAddGuest.setText("Please try again. Passwords do not match\n"
//                        + "or All Textfields are empty");
//            }
        });
        btnEmployeeBack3.setOnAction(e -> {
            lblAddGuest.setText("");
            Tabs.getSelectionModel().select(tabEmployee);
            Tabs.getTabs().remove(tabAddGuest);  
        });
        
        tabEditGuest.setContent(editGuestPane);
        editGuestPane.setAlignment(Pos.CENTER);
        editGuestPane.add(new Label("Welcome to the Edit a Guest Account Menu"), 0, 1);
        editGuestPane.add(lblSelectGuest, 0, 2);
        editGuestPane.add(lblEditGuestName, 0, 3);
        editGuestPane.add(lblEditGuestPassword, 0, 4);
        editGuestPane.add(lblEditGuestPassword1, 0, 5);
        editGuestPane.add(txtEditGuestName, 1, 3);
        editGuestPane.add(txtEditGuestPassword, 1, 4);
        editGuestPane.add(txtEditGuestPassword1, 1, 5);
        editGuestPane.add(lblEditGuestForEmpPasswordMustHaves, 0, 6);
        editGuestPane.add(lblEditGuest, 1, 7);
        editGuestPane.add(btnEmployeeBack4, 2, 8);
        editGuestPane.add(btnEditGuest, 1, 8);
        editGuestPane.add(lstEditGuest, 2, 1, 2, 7);
        lstEditGuest.setPrefWidth(500);
        editGuestPane.setVgap(10);
        editGuestPane.setHgap(10);
        btnEditGuest.disableProperty()
        .bind(lstEditGuest.getSelectionModel().selectedItemProperty().isNull());
        
        btnEditGuest.setOnAction(e -> {
            int selectedInt = lstEditGuest.getSelectionModel().getSelectedIndex();
            
            //y=guest.get(guestID).setPassword(passWordold, passWordnew);

            //guest.get(selectedInt).setPassword(txtEditGuestPassword.getText(),txtEditGuestPassword1.getText());
            if( lstEditGuest.getSelectionModel().getSelectedItem().toString().contains("(Value Guest)"))
            {
                if (isValidEditGuest() == true)
                {
                int y;
                y = valueGuest.get((selectedInt - guest.size())).setPassword(txtEditGuestPassword.getText(),txtEditGuestPassword1.getText());
                //y = guest.get(selectedInt).setPassword(txtEditGuestPassword.getText(),txtEditGuestPassword1.getText());
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
                    valueGuest.get((selectedInt - guest.size())).setGuestName(txtEditGuestName.getText());
                    guestList.add(selectedInt, valueGuest.get(selectedInt - guest.size()).toString());
                    txtEditGuestName.clear();
                    txtEditGuestPassword.clear();
                    txtEditGuestPassword1.clear();
                    lblEditGuest.setText("Your psssword has been changed successfully");
                }
                }
                else
                {
                    lblEditGuest.setText("Please try again. Passwords do not match or \n"
                    + "One or more TextFields are empty");
                }
            }
            else if (lstEditGuest.getSelectionModel().getSelectedItem().toString().contains("(Guest)"))
            {
                if (isValidEditGuest() == true)
                {
                int y;
                y = guest.get(selectedInt).setPassword(txtEditGuestPassword.getText(),txtEditGuestPassword1.getText());
                //)
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
                    System.out.println(lstEditGuest.getSelectionModel().getSelectedItem().toString());
                }
            }
            else
            {
                lblEditGuest.setText("Please try again. Passwords do not match or \n"
                + "One or more TextFields are empty");
            }
            }
        });
        
        btnEmployeeBack4.setOnAction(e -> {
            Tabs.getSelectionModel().select(tabEmployee);
            Tabs.getTabs().remove(tabEditGuest);
            cmboEmployeeMenu.getSelectionModel().select(0);
        });
            
        tabAddEmployee.setContent(addEmployeePane);
        addEmployeePane.setAlignment(Pos.CENTER);
        addEmployeePane.add(new Label("Employee Account Menu"), 0, 1);
        addEmployeePane.add(lblEmployeeName, 0, 2);
        addEmployeePane.add(lblEmployeeUsername, 0, 3);
        addEmployeePane.add(lblEmployeePassword, 0, 4);
        addEmployeePane.add(lblEmployeePassword1, 0, 5);  
        addEmployeePane.add(lblAddEmployeePasswordMustHaves, 0, 6);
        addEmployeePane.add(lblAddEmployee, 0, 7);
        addEmployeePane.add(txtEmployeeName, 1, 2);
        addEmployeePane.add(txtEmployeeUsername, 1, 3);
        addEmployeePane.add(txtEmployeePassword, 1, 4);
        addEmployeePane.add(txtEmployeePassword1, 1, 5);
        addEmployeePane.add(btnAddEmployee, 1, 8);
        addEmployeePane.add(btnEmployeeBack5, 2, 8);       
        addEmployeePane.add(lstEmployee, 2, 1, 1, 7);
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
            else if (isValidAddEmployee() == true && createNewPassword(txtEmployeePassword.getText()) == 0)
            {
                lblAddEmployee.setText("");
                lblAddEmployee.setText("Please try again. \n"
                        + "Password does not contain \n"
                        + "at least one uppercase \n"
                        + "letter and one number \n"
                        + "or one or more TextFields \n"
                        + "are empty");
            }
            else if (isValidAddEmployee() == true && createNewPassword(txtEmployeePassword.getText()) == 1)
            {
                lblAddEmployee.setText("");
                lblAddEmployee.setText("Please try again. Password cannot \n"
                    + "start with a number");
            }            
            //if (isValidAddEmployee() == false && createNewPassword(txtEmployeePassword.getText()) == 0)
            else
            {
                lblAddEmployee.setText("");
                lblAddEmployee.setText("Please try again. Passwords do not match \n"
                        + "or All TextFields are empty");                            
            }   
        });
        btnEmployeeBack5.setOnAction(e -> {
            Tabs.getSelectionModel().select(tabEmployee);
            Tabs.getTabs().remove(tabAddEmployee);  
        });
        
        tabEditEmployee.setContent(editEmployeePane);
        editEmployeePane.setAlignment(Pos.CENTER);
        editEmployeePane.add(new Label("Welcome to the Edit an Employee Account Menu"), 0, 1);
        editEmployeePane.add(lblSelectEmployee, 0, 2);
        editEmployeePane.add(lblEditEmployeeName, 0, 3);
        editEmployeePane.add(lblEditEmployeePassword, 0, 4);
        editEmployeePane.add(lblEditEmployeePassword1, 0, 5);
        editEmployeePane.add(lblEditEmployeePasswordMustHaves, 0, 6);
        editEmployeePane.add(lblEditEmployee, 0, 7);
        editEmployeePane.add(txtEditEmployeeName, 1, 3);
        editEmployeePane.add(txtEditEmployeePassword, 1, 4);
        editEmployeePane.add(txtEditEmployeePassword1, 1, 5);
        editEmployeePane.add(btnEmployeeBack6, 2, 8);
        editEmployeePane.add(btnEditEmployee, 1, 8);
        editEmployeePane.add(lstEditEmployee, 2, 1, 2, 7);
        lstEditEmployee.setPrefWidth(400);
        editEmployeePane.setVgap(10);
        editEmployeePane.setHgap(10);
        btnEditEmployee.disableProperty()
        .bind(lstEditEmployee.getSelectionModel().selectedItemProperty().isNull());
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
                + "One or more TextFields are empty");
            }
        });
        btnEmployeeBack6.setOnAction(e -> {
            Tabs.getSelectionModel().select(tabEmployee);
            Tabs.getTabs().remove(tabEditEmployee);  
        });
        
        tabAddRoom.setContent(addRoomPane);
        addRoomPane.setAlignment(Pos.CENTER);
        addRoomPane.add(new Label(""), 0, 0);
        addRoomPane.add(new Label("Add Room Menu"), 0, 1);
        addRoomPane.add(new Label("When Editing Rooms \n "
                + "Retype same room Number \n "
                + "(If you type a different room # \n"
                + "It will not change room # \n"
                + "You can try...)"), 0, 9);
        addRoomPane.add(lblBed, 0, 2);
        cmboBed.getItems().add("1 Queen Size Bed");
        cmboBed.getItems().add("2 Queen Size Beds");
        cmboBed.getItems().add("1 King Size Bed");
        cmboBed.getSelectionModel().select(0);
        addRoomPane.add(cmboBed, 1, 2);
        addRoomPane.add(lblKitchen, 0, 3);
        cmboKitchen.getItems().add("Microwave");
        cmboKitchen.getItems().add("Fridge + Microwave");
        cmboKitchen.getSelectionModel().select(0);
        addRoomPane.add(cmboKitchen, 1, 3);
        addRoomPane.add(lblCoffee, 0, 4);
        cmboCoffee.getItems().add("1-Cup Std. Coffee Machine");
        cmboCoffee.getItems().add("Keurig Hot K200 Coffee Machine");
        cmboCoffee.getSelectionModel().select(0);
        addRoomPane.add(cmboCoffee, 1, 4);
        addRoomPane.add(lblAccess, 0, 5);
        cmboAccess.getItems().add("Standard Room");
        cmboAccess.getItems().add("Enhanced Accessibility Room");
        cmboAccess.getSelectionModel().select(0);
        addRoomPane.add(cmboAccess, 1, 5);
        addRoomPane.add(lblRoomNum, 0, 6);
        addRoomPane.add(txtRoomNum, 1, 6);
        addRoomPane.add(lblPrice, 0, 7);
        addRoomPane.add(txtPrice, 1, 7);
        addRoomPane.add(lblStatus, 0, 8);
        cmboStatus.getItems().add("Active");
        cmboStatus.getSelectionModel().select(0);
        cmboStatus.getItems().add("InActive");
        addRoomPane.add(cmboStatus, 1, 8);
        addRoomPane.add(lstRoom, 2, 1, 2, 9);
        lstRoom.setPrefWidth(500);
        addRoomPane.add(btnAddRoom, 0, 10);
        addRoomPane.add(btnEditRoom, 0, 11);
        addRoomPane.add(btnEmployeeBack7, 2, 10);
        addRoomPane.setHgap(10);
        addRoomPane.add(lblRoomPrice, 1, 10);
        addRoomPane.add(lblRoomNumber, 1, 11);
        addRoomPane.setVgap(10);
        //cmboBed.getSelectionModel();
        for (int i = 0; i < room.size(); i++)
        {
            roomList.add(room.get(i).roomDescription() + "Room is Active");
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
        btnEditRoom.disableProperty()
        .bind(lstRoom.getSelectionModel().selectedItemProperty().isNull());
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
        
        tabBookRoom.setContent(bookRoomPane);
        bookRoomPane.setAlignment(Pos.CENTER);
        bookRoomPane.add(new Label("Welcome to the Book a Room Menu"), 0, 1);
        bookRoomPane.add(lblFreeRooms, 0, 4); 
        bookRoomPane.add(lblCheckinDate, 0, 6);
        bookRoomPane.add(lblCheckoutDate, 0, 7);
        cmboYearIn.getItems().addAll((2019), (2020),
                (2021), (2022), (2023));
        cmboYearOut.getItems().addAll((2019),(2020),
                (2021),(2022),(2023));
        bookRoomPane.add(cmboYearOut, 3, 7);
        bookRoomPane.add(cmboYearIn, 3, 6);
        cmboYearIn.getSelectionModel().select(0);
        cmboYearOut.getSelectionModel().select(0);
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
        bookRoomPane.add(btnGuestBack1, 3, 8);
        bookRoomPane.add(listBookRoom, 1, 1, 4, 4);
        bookRoomPane.add(lblThankYou, 4, 6);
        listBookRoom.setPrefWidth(500);
        bookRoomPane.setVgap(10);
        bookRoomPane.setHgap(10);
        for (int i = 0; i < room.size(); i++)
        {
            bookList.add(room.get(i).roomDescription());
        }
        btnBookRoom.disableProperty()
        .bind(listBookRoom.getSelectionModel().selectedItemProperty().isNull());
        btnBookRoom.setOnAction(e -> {
           //int selectedInt = listBookRoom.getSelectionModel().getSelectedIndex();

           int dayIn = ((Integer)cmboDayIn.getValue());
           int dayOut = ((Integer)cmboDayOut.getValue());
           int yearIn = ((Integer)cmboYearIn.getValue());
           int yearOut = ((Integer)cmboYearOut.getValue());
           int monthIn = handleMonth(cmboMonthIn.getValue().toString());
           int monthOut = handleMonth(cmboMonthOut.getValue().toString());          
           
           if (!currentGuest.isEmpty())
           {
                int selectedInt = listBookRoom.getSelectionModel().getSelectedIndex();
                listBookRoom.getItems().remove(selectedInt);
                Guest myGuest = currentGuest.get(0);
                Room chosenRoom = room.get(selectedInt);
                room.get(selectedInt).bookRoom();
                
                Booking newBooking = new Booking(myGuest, chosenRoom, yearIn, dayIn, dayOut, monthIn, monthOut, yearOut);
                lblThankYou.setText("*Thank you for booking a room!*");
                
                booking.add(newBooking);
                //gBookingList.add(newBooking.toString());
                //System.out.println("Thank you for booking Room #" + newBooking.getBookedRoom().getRoomNumber());
                checkoutList.add(newBooking.toString());  
           }
           if (!currentVGuest.isEmpty())
           {
                int selectedInt = listBookRoom.getSelectionModel().getSelectedIndex();
                listBookRoom.getItems().remove(selectedInt);
                Guest aGuest = currentVGuest.get(0);
                //room.get(selectedInt);              
                room.get(selectedInt).bookRoom();
                Room chosenRoom = room.get(selectedInt);
                Booking newBooking = new Booking(aGuest, chosenRoom, yearIn, dayIn, dayOut, monthIn, monthOut, yearOut);
                lblThankYou.setText("*Thank you for booking a room!*");
                booking.add(newBooking);
                checkoutList.add(newBooking.toString()); 

           }
           cmboDayIn.getSelectionModel().select(0);
           cmboDayOut.getSelectionModel().select(0);
           cmboMonthIn.getSelectionModel().select(0);
           cmboMonthOut.getSelectionModel().select(0);
           cmboYearIn.getSelectionModel().select(0);
           cmboYearOut.getSelectionModel().select(0);
           lblNotBooked.setText("");             
        });
        btnGuestBack1.setOnAction(e -> {
           if (!currentVGuest.isEmpty())
           {
               Tabs.getSelectionModel().select(tabValueGuest);
               Tabs.getTabs().remove(tabBookRoom);
               cmboVGuestMenu.getSelectionModel().select(0);
               
           }
           if (!currentGuest.isEmpty())
           {
               Tabs.getSelectionModel().select(tabGuest);
               Tabs.getTabs().remove(tabBookRoom);
               cmboGuestMenu.getSelectionModel().select(0);
           }  
           lblThankYou.setText("");
        });
       
        tabDisplayBooking.setContent(guestBookingPane);
        guestBookingPane.setAlignment(Pos.CENTER);
        guestBookingPane.add(new Label("Welcome to the Display Guest Booking Report Menu"), 0, 1);
        guestBookingPane.add(lblDisplayGBooking, 0, 3);
        guestBookingPane.add(btnDisplyGBooking, 0, 4);
        guestBookingPane.add(lstGBooking, 1, 1, 2, 5);
        lstGBooking.setPrefWidth(550);
        guestBookingPane.add(btnGuestBack2, 1, 6);
        guestBookingPane.setVgap(15);
        guestBookingPane.setHgap(15);
        btnDisplyGBooking.setOnAction(e -> {
            lstGBooking.getItems().clear();
            
            if (!currentGuest.isEmpty())
            {
                for (int i = 0; i < booking.size(); i++)
                {
                    if (booking.get(i).getBookingGuest().getGuestName().equals(currentGuest.get(0).getGuestName()))
                    {
                    gBookingList.add(booking.get(i).toString());
                    
                    }
                    System.out.print(booking.get(i).toString());
                }
            }
            if (!currentVGuest.isEmpty())
            {
                for (int i = 0; i < booking.size(); i++)
                {
                    if (booking.get(i).getBookingGuest().getGuestName().equals(currentVGuest.get(0).getGuestName()))
                    {
                    gBookingList.add(booking.get(i).toString());
                    }
                    
                }  
            }
        });
        btnGuestBack2.setOnAction(e -> {
           if (!currentVGuest.isEmpty())
           {
               lstGBooking.getItems().clear();
               Tabs.getSelectionModel().select(tabValueGuest);
               Tabs.getTabs().remove(tabDisplayBooking);
               cmboVGuestMenu.getSelectionModel().select(0);
           }
           if (!currentGuest.isEmpty())
           {
               lstGBooking.getItems().clear();
               Tabs.getSelectionModel().select(tabGuest);
               Tabs.getTabs().remove(tabDisplayBooking);
               cmboGuestMenu.getSelectionModel().select(0);
           }        
        });
        
        tabEditGuestInfo.setContent(editGuestInfoPane);
        editGuestInfoPane.setAlignment(Pos.CENTER);
        editGuestInfoPane.add(new Label("Welcome to the Edit Guest Information Menu"), 0, 1);
        editGuestInfoPane.add(lblGuestEditDisplayPrompt, 0, 2);
        editGuestInfoPane.add(btnDisplayInfo, 0, 3);
        editGuestInfoPane.add(lblNamePrompt, 0, 4);
        editGuestInfoPane.add(txtEditName, 0, 5);
        editGuestInfoPane.add(btnEditInfo, 0, 6);
        editGuestInfoPane.add(lblEditRule, 0, 7);
        
        editGuestInfoPane.add(lstGuestInfo, 1, 1, 2, 8);
        editGuestInfoPane.add(btnGuestBack3, 1, 9);
        lstGuestInfo.setPrefWidth(550);
        editGuestInfoPane.setVgap(15);
        editGuestInfoPane.setHgap(15);
        if (!currentVGuest.isEmpty())
            {
               for (int i = 0; i < 1; i++)
               {
               guestEditList.add(currentVGuest.get(0).toString());
               lstGuestInfo.getItems().add(guestEditList);
               }
            }
         else if (!currentGuest.isEmpty())
            {
               for (int i = 0; i < 1; i++)
               {
               guestEditList.add(currentGuest.get(0).toString());
               lstGuestInfo.getItems().add(guestEditList);
               }
            }
             
        btnEditInfo.setOnAction(e -> {
            if (isValidEditGuestName()){
                if (!currentGuest.isEmpty())
                {
                   //int selectedInt = lstGuestInfo.getSelectionModel().getSelectedIndex();
                   currentGuest.get(0).setGuestName(txtEditName.getText());
                   guestEditList.remove(0);
                   guestEditList.add(currentGuest.get(0).toString());
                   txtEditName.clear();
                }
                if (!currentVGuest.isEmpty())
                {
                   //int selectedInt = lstGuestInfo.getSelectionModel().getSelectedIndex();
                   currentVGuest.get(0).setGuestName(txtEditName.getText());
                   guestEditList.remove(0);
                   guestEditList.add(currentVGuest.get(0).toString());
                   txtEditName.clear();
                }
            } else {
                System.out.println("No name was entered!");
            }
        });
        btnGuestBack3.setOnAction(e -> {
           if (!currentVGuest.isEmpty())
           {
               lstGuestInfo.getItems().clear();
               Tabs.getSelectionModel().select(tabValueGuest);
               Tabs.getTabs().remove(tabEditGuestInfo);
               cmboVGuestMenu.getSelectionModel().select(0);
           }
           if (!currentGuest.isEmpty())
           {
               lstGuestInfo.getItems().clear();
               Tabs.getSelectionModel().select(tabGuest);
               Tabs.getTabs().remove(tabEditGuestInfo);
               cmboGuestMenu.getSelectionModel().select(0);
           }        
        });
        
        tabRoomService.setContent(roomServicePane);
        roomServicePane.setAlignment(Pos.CENTER);
        roomServicePane.add(new Label("Welcome to the Room Service Menu"), 0, 0);
        roomServicePane.add(lblServices, 0, 1);
        roomServicePane.add(cmboServices, 0, 2);
        roomServicePane.add(txtServiceQuantity, 1, 2);
        roomServicePane.add(listOrder, 2, 1, 2, 5);
        roomServicePane.add(btnAddToOrder, 0, 4);
        roomServicePane.add(btnFinishOrderService, 0, 7);
        roomServicePane.add(btnClearOrder, 1, 7);
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
        //btnAddToOrder.disableProperty()
        //.bind(Bindings.isEmpty(txtServiceQuantity.textProperty())
        btnFinishOrderService.setDisable(true);
        BooleanBinding isTextFieldEmpty = Bindings.isEmpty(txtServiceQuantity.textProperty());
        btnAddToOrder.disableProperty().bind(isTextFieldEmpty);
        btnAddToOrder.setOnAction(e -> {
            if (isValidAddOrder() == true)
            {       
            String quantityOfService;
            quantityOfService = cmboServices.getValue().toString() + " x " + txtServiceQuantity.getText();
            roomServiceList.add(quantityOfService);
           
            double num = handleRoomService(cmboServices.getValue().toString());
            double totalService = Double.parseDouble(txtServiceQuantity.getText()) * num;
            int quantity = Integer.parseInt(txtServiceQuantity.getText());
            
            RoomService newOrder = new RoomService(cmboServices.getValue().toString(), totalService, quantity);
            tempServiceList.add(newOrder);
            txtServiceQuantity.clear();
            for(int i = 0; i < booking.size();i++)
            {
                if(booking.get(i).getBookingGuest().getGuestName().equals(currentVGuest.get(0).getGuestName()))
                {
                    booking.get(i).addRoomService(newOrder);
                }
            System.out.println(newOrder.toString());
            }
            }
            cmboServices.getSelectionModel().select(0);           
            btnFinishOrderService.setDisable(false);
        });
        
        btnFinishOrderService.setOnAction(e -> {
            double totalCost = 0;
            {
                //if(booking.get(i).getBookingGuest().getGuestName().equals(currentVGuest.get(0).getGuestName()))
                {
                    //booking.get(0).getArrayList().add(newOrder);
                    for (int j = 0; j < tempServiceList.size(); j++)
                    {
                    totalCost += tempServiceList.get(j).getPrice();
                    lblTotalPrice.setText("Total Price: $" + totalCost );
                    }
                    System.out.print(tempServiceList.size()); 
                }
            }
            for (int j = 0; j < tempServiceList.size(); j++)
            {
                tempServiceList.remove(j);
            }
            cmboServices.getSelectionModel().select(0);
            cmboServices.getSelectionModel().select(0);
        });
        btnClearOrder.setOnAction(e -> {
            listOrder.getItems().clear();
            lblTotalPrice.setText("Total Price: ");
            txtServiceQuantity.clear();
            for (int j = 0; j < tempServiceList.size(); j++)
            {
                tempServiceList.remove(j);
            }
            cmboServices.getSelectionModel().select(0);
        });
        btnBack.setOnAction(e -> {
            Tabs.getTabs().remove(tabRoomService);
            Tabs.getSelectionModel().select(tabValueGuest);
            cmboVGuestMenu.getSelectionModel().select(0);
            cmboServices.getSelectionModel().select(0);
            listOrder.getItems().clear();
            lblTotalPrice.setText("Total Price: ");
            for (int j = 0; j < tempServiceList.size(); j++)
            {
                tempServiceList.remove(j);
            }
            lblNotBooked.setText("");
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
        int count = 0;
               
        switch(login)
        {
            case "Employees":                 
            for(int i = 0; i < employee.size(); i++) {
                if (employee.get(i).checkCredentials(username, password))
                {
                    cmboLogin.getSelectionModel().select(0);
                    Tabs.getTabs().add(tabEmployee); Tabs.getSelectionModel().select(tabEmployee);
                    Tabs.getTabs().remove(tabLogin);
                    txtUsername.clear();
                    txtPassword.clear();                    
                    invalid.setText("");
                    count++;
                }
            }    
            if (count == 0){
                invalid.setText("Invalid Credentials! Please try again!");
            }
            count = 0; 
            break;
            
            case "Guests":
                for(int i =0; i< guest.size(); i++)
                {
                    if (guest.get(i).checkCredentials(username, password))
                    {
                        cmboLogin.getSelectionModel().select(0);
                        currentGuest.add(guest.get(i));
                        Tabs.getTabs().remove(tabLogin);
                        Tabs.getTabs().add(tabGuest); Tabs.getSelectionModel().select(tabGuest);
                        txtUsername.clear();
                        txtPassword.clear();
                        invalid.setText("");
                        count++;
                    }
                }
            
                for(int i =0; i< valueGuest.size(); i++)
                {
                    if (valueGuest.get(i).checkCredentials(username, password))
                    {
                        cmboLogin.getSelectionModel().select(0);
                        currentVGuest.add(valueGuest.get(i));
                        Tabs.getTabs().remove(tabLogin);
                        Tabs.getTabs().add(tabValueGuest); Tabs.getSelectionModel().select(tabValueGuest);
                        txtUsername.clear();
                        txtPassword.clear();
                        invalid.setText("");
                        count++;
                    }
                }
                if (count == 0){
                    invalid.setText("Invalid Credentials! Please try again!");
                }
                break;
                
            default: break;
        }   
    }
    
    public void handleEmployeeChoice(String menuChoice)
    {
        switch(menuChoice) 
        {
            case "Run a Booking Report": Tabs.getTabs().add(tabBooking); Tabs.getSelectionModel().select(tabBooking); 
            cmboEmployeeMenu.getSelectionModel().select(0); break;
            case "Checkout Guest": Tabs.getTabs().add(tabCheckout); Tabs.getSelectionModel().select(tabCheckout); 
            cmboEmployeeMenu.getSelectionModel().select(0); break;
            case "Create New Guest Account": Tabs.getTabs().add(tabAddGuest); Tabs.getSelectionModel().select(tabAddGuest); 
            cmboEmployeeMenu.getSelectionModel().select(0); break;
            case "Edit Guest Account": ; Tabs.getTabs().add(tabEditGuest); Tabs.getSelectionModel().select(tabEditGuest); 
            cmboEmployeeMenu.getSelectionModel().select(0); break; 
            case "Create New Employee Account": Tabs.getTabs().add(tabAddEmployee); Tabs.getSelectionModel().select(tabAddEmployee); 
            cmboEmployeeMenu.getSelectionModel().select(0); break;
            case "Edit Employee Account": Tabs.getTabs().add(tabEditEmployee); Tabs.getSelectionModel().select(tabEditEmployee); 
            cmboEmployeeMenu.getSelectionModel().select(0); break;
            case "Create or Edit a Room": Tabs.getTabs().add(tabAddRoom); Tabs.getSelectionModel().select(tabAddRoom); 
            cmboEmployeeMenu.getSelectionModel().select(0); break;
            default: break;
        }
    }
    
    public void handleGuestChoice(String menuChoice)
    {
        switch(menuChoice)
        {
            case "Book a Room": Tabs.getTabs().add(tabBookRoom); Tabs.getSelectionModel().select(tabBookRoom); break; 
            case "Display Booking Report": Tabs.getTabs().add(tabDisplayBooking); Tabs.getSelectionModel().select(tabDisplayBooking); break; 
            case "Edit Guest Information": Tabs.getTabs().add(tabEditGuestInfo); Tabs.getSelectionModel().select(tabEditGuestInfo); break; 
            default: break;
        }
    }
    public void handleVGuestChoice(String menuChoice)
    {
        switch(menuChoice)
        {
            case "Book a Room": Tabs.getTabs().add(tabBookRoom); Tabs.getSelectionModel().select(tabBookRoom); break; 
            case "Display Booking Report": Tabs.getTabs().add(tabDisplayBooking); Tabs.getSelectionModel().select(tabDisplayBooking); break; 
            case "Edit Guest Information": Tabs.getTabs().add(tabEditGuestInfo); Tabs.getSelectionModel().select(tabEditGuestInfo); break;
            case "Order Room Service": 
                for (int i = 0; i < room.size(); i++)
                {
                    if ((room.get(i).bookedRoom()))
                    {
                        Tabs.getTabs().add(tabRoomService); Tabs.getSelectionModel().select(tabRoomService); 
                        lblNotBooked.setText("");
                    }
                    else
                    {
                        lblNotBooked.setText("You have not yet booked a Room");
                    }
                }
                break;
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
        int status = handleInactive(cmboStatus.getValue().toString());
        if (status == 1)
        {
        int bed = handleBed(cmboBed.getValue().toString());
        int kitchen = handleKitchen(cmboKitchen.getValue().toString());
        int coffee = handleCoffee(cmboCoffee.getValue().toString());
        int access = handleAccess(cmboAccess.getValue().toString());
            
        Room tempRoom = new Room(bed, kitchen, coffee, access,  
                Integer.valueOf(txtRoomNum.getText()), Double.valueOf(txtPrice.getText()));
                   
        room.add(tempRoom);
            
        roomList.add(tempRoom.roomDescription() + "Room is Active");
        bookList.add(tempRoom.roomDescription());
            
        cmboBed.getSelectionModel().select(0);
        cmboKitchen.getSelectionModel().select(0);
        cmboCoffee.getSelectionModel().select(0);
        cmboAccess.getSelectionModel().select(0);
        txtRoomNum.clear();
        txtPrice.clear();
        }
        if (status == 2)
        {
        int bed = handleBed(cmboBed.getValue().toString());
        int kitchen = handleKitchen(cmboKitchen.getValue().toString());
        int coffee = handleCoffee(cmboCoffee.getValue().toString());
        int access = handleAccess(cmboAccess.getValue().toString());
            
        Room tempRoom = new Room(bed, kitchen, coffee, access,  
                Integer.valueOf(txtRoomNum.getText()), Double.valueOf(txtPrice.getText()));
                   
        room.add(tempRoom);
            
        roomList.add(tempRoom.roomDescription() + "Room is InActive");
        bookList.add(tempRoom.roomDescription());
            
        cmboBed.getSelectionModel().select(0);
        cmboKitchen.getSelectionModel().select(0);
        cmboCoffee.getSelectionModel().select(0);
        cmboAccess.getSelectionModel().select(0);
        txtRoomNum.clear();
        txtPrice.clear();
        }
        
        
    }
    public void handleEditRoom()
    {
        int selectedInt = lstRoom.getSelectionModel().getSelectedIndex();
            
        int bed = handleBed(cmboBed.getValue().toString());
        int kitchen = handleKitchen(cmboKitchen.getValue().toString());
        int coffee = handleCoffee(cmboCoffee.getValue().toString());
        int access = handleAccess(cmboAccess.getValue().toString());
        
        int status = handleInactive(cmboStatus.getValue().toString());
            
        //Room tempRoom = new Room(bed, kitchen, coffee, access,  
        //       room.get(selectedInt).getRoomNumber(), Double.valueOf(txtPrice.getText()));
                    
        room.get(selectedInt).setBed(bed);
        room.get(selectedInt).setKitch(kitchen);
        room.get(selectedInt).setCoffee(coffee);
        room.get(selectedInt).setAccess(access);
        room.get(selectedInt).setRoomPrice(Double.valueOf(txtPrice.getText()));
        if (status == 2)
        {
            bookList.remove(selectedInt);
            roomList.remove(selectedInt);
            roomList.add(selectedInt, room.get(selectedInt).roomDescription() + "Room is InActive");

            cmboBed.getSelectionModel().select(0);
            cmboKitchen.getSelectionModel().select(0);
            cmboCoffee.getSelectionModel().select(0);
            cmboAccess.getSelectionModel().select(0);
            txtRoomNum.clear();
            txtPrice.clear();
        }
        else if (status == 1)
        {
            bookList.add(selectedInt, room.get(selectedInt).roomDescription());
            roomList.remove(selectedInt);
            roomList.add(selectedInt, room.get(selectedInt).roomDescription() + "Room is Active");
            
            cmboBed.getSelectionModel().select(0);
            cmboKitchen.getSelectionModel().select(0);
            cmboCoffee.getSelectionModel().select(0);
            cmboAccess.getSelectionModel().select(0);
            txtRoomNum.clear();
            txtPrice.clear();
        }
            
       // System.out.print(room.get(selectedInt).roomDescription());
            
        //selectRoomList.add(tempRoom.getRoomNumber());
        //selectRoomList.remove(tempRoom.getRoomNumber());
            
        //lstRoom.getItems().remove(selectedInt);
        
    }
    
    public int handleInactive(String status)
    {
        int num = 0;
        switch (status)
        {
            case "Active": num = 1; break;
            case "InActive": num = 2; break;
        }
        return num;
    }
    
    public boolean isValidRoomPrice()
    {
        boolean result = false;
        if (!(txtPrice.getText() == null || txtPrice.getText().length() == 0)) 
        {
        try {
            // Do all the validation you need here such as
            Double d = Double.parseDouble(txtPrice.getText());
            if ( d >= 1.0 && d < 9999.9)
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
    
    public boolean isValidAddOrder()
    {
        boolean result = false;
        if (!(txtServiceQuantity.getText() == null || txtServiceQuantity.getText().length() == 0)) 
        {
        try {
            // Do all the validation you need here such as
            int d = Integer.parseInt(txtServiceQuantity.getText());
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
    
    public String addGuestErrorMessages()
    {
        String result = "";
        
        // if a textfield is empty, concat 1 to result
        if (txtGuestPassword.getText() == null || txtGuestPassword.getText().length() == 0
                || txtGuestPassword1.getText() == null || txtGuestPassword1.getText().length() == 0
                || txtGuestUsername.getText() == null || txtGuestUsername.getText().length() == 0
                || txtGuestName.getText() == null || txtGuestName.getText().length() == 0) {
            result += 1;
        } else {
            // if the passwords don't match, concat 2 to result
            if(!txtGuestPassword.getText().equals(txtGuestPassword1.getText())) {
             result += 2;
            }

            // if the password doesn't contain a capital, concat 3 to result
            if (!(txtGuestPassword.getText().matches(".*[A-Z].*"))
                    || !(txtGuestPassword1.getText().matches(".*[A-Z].*"))) {
                result += 3;
            }

            // if the password doesn't contain a number, concat 4 to result
            if (!(txtGuestPassword.getText().matches(".*[0-9].*"))
                    || !(txtGuestPassword1.getText().matches(".*[0-9].*"))) {
                result += 4;
            }

            // if the password starts with a number, concat 5 to result
            String firstChar = txtGuestPassword.getText().substring(0, 1);
            if (firstChar.equals("0") || firstChar.equals("1") || firstChar.equals(2)
                    || firstChar.equals("3") || firstChar.equals("4") || firstChar.equals("5")
                    || firstChar.equals("6") || firstChar.equals("7") || firstChar.equals("8")
                    || firstChar.equals("9")) {
                result += 5;
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
        return result;     
    }
    
    public boolean isValidEditGuestName() {
        boolean result = false;
        
        if(!((txtEditName.getText() == null) || (txtEditName.getText().trim().length() == 0))) {
            result = true; 
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
            case "ValueGuest": addValueGuest(); break;
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
        guestName.add(tempGuest.toStringName());
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
        guestName.add(tempValueGuest.toStringName());
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
