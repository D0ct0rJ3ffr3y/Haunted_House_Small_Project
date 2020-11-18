/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cop2210assignment3;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

//*******************************************************************************
// PantherID: 6138963
// CLASS: COP 2210 - 2020
// ASSIGNMENT # 3
// DATE: November 5, 2020
// 
// I hereby swear and affirm that this work is solely my own, and not the work
// or the derivative of the work of someone else.
//******************************************************************************

public class HauntedHouse {
    
    //Creates private String variables
    private String userName, userInput, inventoryItem, currentRoom;
    
    //Default constructor with initial values
    public HauntedHouse() {
        this.userName = "None";
        this.userInput = "None";
        this.inventoryItem = "None";
        this.currentRoom = "None";
    }
    
    public void setUserName(String userName) {  //Sets the user's name
        this.userName = userName;
    }
    
    public String getUserName() {  //Gets the user's name
        return this.userName;
    }
    
    public void setInventoryItem(String inventoryItem) {  //Sets the item in inventory
        this.inventoryItem = inventoryItem;
    }
    
    public String getInventoryItem() {  //Gets the item in inventory
        return this.inventoryItem;
    }
    
    public String getCurrentRoom() {  //Gets the room user is in
        return this.currentRoom;
    }
    
    //Function if user has to chooose between exploring one item or go to another room
    public void oneItemOneRoom(String item, String room) {
        JOptionPane optionPane = new JOptionPane();  //Create object from class JOptionPane
        if(item.equalsIgnoreCase("Chest")) {         //If parameter item is Chest regardless of case
            ImageIcon livingRoom = new ImageIcon("Living Room.png");  //Print image of user in Living Room
            //Ask user to choose between checking the item or go to the room
            this.userInput = (String)JOptionPane.showInputDialog(optionPane, "What do you want to check? " + this.userName +
                                                "\n1) Check the \"" + item +
                                                "\"\n2) Go to the \"" + room + "\"", "Haunted House",
                                                JOptionPane.INFORMATION_MESSAGE, livingRoom, null, null);
        }
        else if(item.equalsIgnoreCase("Candelabra")){  //If parameter item is Candelabra regardless of case
            ImageIcon diningRoom = new ImageIcon("Dining Room.png");  //Print image of user in Dining Room
            //Ask user to choose between checking the item or go to the room
            this.userInput = (String)JOptionPane.showInputDialog(optionPane, "What do you want to check? " + this.userName +
                                                "\n1) Check the \"" + item +
                                                "\"\n2) Go to the \"" + room + "\"", "Haunted House",
                                                JOptionPane.INFORMATION_MESSAGE, diningRoom, null, null);
        }
        else {
            ImageIcon masterBedroom = new ImageIcon("Master Bedroom.png");  //Print image of user in Master Bedroom
            //Ask user to choose between checking the item or go to the room
            this.userInput = (String)JOptionPane.showInputDialog(optionPane, "What do you want to check? " + this.userName +
                                                "\n1) Check the \"" + item +
                                                "\"\n2) Go to the \"" + room + "\"", "Haunted House",
                                                JOptionPane.INFORMATION_MESSAGE, masterBedroom, null, null);
        }
        if(this.userInput.equalsIgnoreCase(room)) { //If variable this.userInput is equal to the room name
            this.currentRoom = room; //Set variable this.currentRoom to parameter room
        }
        else {
            this.inventoryItem = item; //Set variable this.ivnentoryItem to parameter item
            resultOutcome();           //Use resultOutcome() method
        }
    }
    
    //Function if user has to choose between choosing between two items or go to a room
    public void twoItemsOneRoom(String item1, String item2, String room) {
        JOptionPane optionPane = new JOptionPane();
        if(item1.equalsIgnoreCase("Refrigerator")) {  //If item1 is equal to Refrigerator
            ImageIcon kitchen = new ImageIcon("Kitchen.png");  //Print image of user in Kitchen
            //Ask user to choose between checking item1, checking item2, or go to another room
            this.userInput = (String)JOptionPane.showInputDialog(optionPane, "What do you want to do? " + this.userName
                                                            + "\n1) Check the \"" + item1
                                                            + "\"\n2) Check the \"" + item2
                                                            + "\"\n3) Go to the \"" + room + "\"", "Haunted House",
                                                            JOptionPane.INFORMATION_MESSAGE, kitchen, null, null);
        }
        else if(item1.equalsIgnoreCase("Rocking Chair")) {  //If item1 is equal to Rocking Chair regardless of case
            ImageIcon bedroom1 = new ImageIcon("Bedroom 1.png");  //Print image of user in Bedroom 1
            //Ask user to choose between checking item1, checking item2, or go to another room
            this.userInput = (String)JOptionPane.showInputDialog(optionPane, "What do you want to do? " + this.userName
                                                            + "\n1) Check the \"" + item1
                                                            + "\"\n2) Check the \"" + item2
                                                            + "\"\n3) Go to the \"" + room + "\"", "Haunted House",
                                                            JOptionPane.INFORMATION_MESSAGE, bedroom1, null, null);
        }
        else if(item1.equalsIgnoreCase("Mirror")) {   //If item1 is equal to Mirror regardless of case
            ImageIcon bathroom2 = new ImageIcon("2nd Floor Bathroom.png");  //Print image of user in 2nd Floor Bathroom
            //Ask user to choose between checking item1, checking item2, or go to another room
            this.userInput = (String)JOptionPane.showInputDialog(optionPane, "What do you want to do? " + this.userName
                                                            + "\n1) Check the \"" + item1
                                                            + "\"\n2) Check the \"" + item2
                                                            + "\"\n3) Go to the \"" + room + "\"", "Haunted House",
                                                            JOptionPane.INFORMATION_MESSAGE, bathroom2, null, null);
        }
        else if(item1.equalsIgnoreCase("Dollhouse")) {  //If item1 is equal to Dollhouse regardless of case
            ImageIcon bedroom2 = new ImageIcon("Bedroom 2.png");  //Print image of user in Bedroom 2
            //Ask user to choose between checking item1, checking item2, or go to another room
            this.userInput = (String)JOptionPane.showInputDialog(optionPane, "What do you want to do? " + this.userName
                                                            + "\n1) Check the \"" + item1
                                                            + "\"\n2) Check the \"" + item2
                                                            + "\"\n3) Go to the \"" + room + "\"", "Haunted House",
                                                            JOptionPane.INFORMATION_MESSAGE, bedroom2, null, null);
        }

        if(this.userInput.equalsIgnoreCase(item1)) {  //If this.userInput is equal to item1
            this.inventoryItem = item1;               //Set this.inventoryItem to item1
            resultOutcome();                          //Use resultOutcome() method
        }
        else if(this.userInput.equalsIgnoreCase(item2)) {  //If this.userInput is equal to item2
            this.inventoryItem = item2;                    //Set this.inventoryItem to item2
            resultOutcome();                               //Use resultOutcome() method
        }
        else {
            this.currentRoom = room;                       //Set this.currentRoom to room
        }
    }
    
    //Function if user has to choose between going to three rooms
    public void threeRooms(String room1, String room2, String room3) {
        JOptionPane optionPane = new JOptionPane();                       //Create object from class JOptionPane
        ImageIcon secondFloor = new ImageIcon("2nd Floor Choice.png");    //Create object from class ImageIcon
        //Ask user to choose between going to room1, room2, or room3
        this.userInput = (String)JOptionPane.showInputDialog(optionPane, "Where do you want to go? " + this.userName
                                                            + "\n1) Go to the \"" + room1
                                                            + "\"\n2) Go to the \"" + room2
                                                            + "\"\n3) Go to the \"" + room3 + "\"", "Haunted House",
                                                            JOptionPane.INFORMATION_MESSAGE, secondFloor, null, null);
        if(this.userInput.equalsIgnoreCase(room1)) {  //If this.userInput is equal to room1
            this.currentRoom = room1;                 //Set this.currentRoom to room1
        }
        else if(this.userInput.equalsIgnoreCase(room2)) {  //If this.userInput is equal to room2
            this.currentRoom = room2;                      //Set this.currentRoom to room2
        }
        else {
            this.currentRoom = room3;                      //Set this.currentRoom to room3
        }
    }
    
    //Function if user decides to go through Bedroom 1 first
    public void bedroom1Route(String item1, String item2, String room) {
        twoItemsOneRoom("Rocking Chair", "Window", "Bathroom");   //Use twoItemsOneRoom method
        if(this.currentRoom.equalsIgnoreCase("Bathroom")) {       //If this.currentRoom is equal to Bathroom regardless of case
            twoItemsOneRoom("Mirror", "Shower", "Bedroom 2");     //Use twoItemsOneRoom method
            if(this.currentRoom.equalsIgnoreCase("Bedroom 2")) {  //If this.currentRoom is equal to Bedroom 2 regardless of case
                twoItemsOneRoom("Dollhouse", "Dresser", "Master Bedroom");  //Use twoItemsOneRoom method
            }
        }
        
        if(this.currentRoom.equalsIgnoreCase("Master Bedroom")) {  //If this.currentRoom equal to Master Bedroom regardless of case
            masterBedroomRoute("Jewelry Box", "Master Bathroom");  //Use masterBedroomRoute method
        }
    }
    
    //Function if user decides to go through Bedroom2 first
    public void bedroom2Route(String item1, String item2, String room) {
        twoItemsOneRoom("Dollhouse", "Dresser", "Bathroom");  //Use twoItemsOneRoom method
        if(this.currentRoom.equalsIgnoreCase("Bathroom")) {   //If this.currentRoom is equal to Bathroom regardless of case
            twoItemsOneRoom("Mirror", "Shower", "Bedroom 1"); //Use twoItemsOneRoom method
            if(this.currentRoom.equalsIgnoreCase("Bedroom 1")) {  //if this.currentRoom is equal to Bedroom 1 regardless of case
                twoItemsOneRoom("Rocking Chair", "Window", "Master Bedroom");  //Use twoItemsOneRoom method
            }
        }
        
        if(this.currentRoom.equalsIgnoreCase("Master Bedroom")) {  //If this.currentRoom is equal to Master Bedroom
            masterBedroomRoute("Jewelry Box", "Master Bathroom");  //Use masterBedroomRoute method
        }
    }
    
    //Function if user decides to go through the Master Bedroom first
    public void masterBedroomRoute(String item, String room) {
        oneItemOneRoom("Jewelry Box", "Master Bathroom");          //Use oneItemOneRoom method
        if(this.userInput.equalsIgnoreCase("Master Bathroom")) {   //If this.userInput is equal to Master Bathroom regardless of case
            deadEndRoom("Intricate Oil Lamp", "Shower");           //Use deadEndRoom method
        }
    }
    
    //Function if user reaches to a room with only items, no other room to go to
    public void deadEndRoom(String item1, String item2) {
        String itemInput;                               //Declare String variable itemInput
        JOptionPane optionPane = new JOptionPane();     //Create object from class JOptionPane
        
        if(item1.equalsIgnoreCase("Mirror")) {          //If item1 is equal to Mirror regardless of case
            ImageIcon bathroom = new ImageIcon("Bathroom.png");   //Print image of user in 1st Floor Bathroom
            //Ask user to choose between checking one to the two items
            itemInput = (String)JOptionPane.showInputDialog(optionPane,
                                        "Which item do you want to check " + this.userName +
                                        "\n1) Check the \"" + item1 +
                                        "\"\n2) Check the \"" + item2 + "\"", "Haunted House",
                                        JOptionPane.INFORMATION_MESSAGE, bathroom, null, null);
        }
        else if(item1.equalsIgnoreCase("Dusty Recipe Box")) {  //If item1 is equal to Dusty Recipe Box regardless of case
            ImageIcon pantry = new ImageIcon("Pantry.png");    //Print image of user in Pantry
            //Ask user to choose between checking one of the two items
            itemInput = (String)JOptionPane.showInputDialog(optionPane,
                                        "Which item do you want to check " + this.userName +
                                        "\n1) Check the \"" + item1 +
                                        "\"\n2) Check the \"" + item2 + "\"", "Haunted House",
                                        JOptionPane.INFORMATION_MESSAGE, pantry, null, null);
        }
        else {
            ImageIcon masterBathroom = new ImageIcon("Master Bathroom.png");  //Print image of user in Master Bathroom
            //Ask user to choose between checking one of the two items
            itemInput = (String)JOptionPane.showInputDialog(optionPane,
                                        "Which item do you want to check " + this.userName +
                                        "\n1) Check the \"" + item1 +
                                        "\"\n2) Check the \"" + item2 + "\"", "Haunted House",
                                        JOptionPane.INFORMATION_MESSAGE, masterBathroom, null, null);
        }
        if(itemInput.equalsIgnoreCase(item1)) {  //If itemInput is equal to item1
            this.inventoryItem = item1;          //Set this.inventoryItem to item1
            resultOutcome();                     //Use resultOutcome method
        }
        else {
            this.inventoryItem = item2;          //Set this.inventoryItem to item2
            resultOutcome();                     //Use resultOutcome method
        }
    }
    
    //Function to print an image telling user is dead and what it in the user's inventory
    public void resultOutcome() {
        JOptionPane optionPane = new JOptionPane();  //Create object from class JOptionPane
        ImageIcon deadMessage = new ImageIcon("Dead Result.png");  //Create object from class ImageIcon
        switch(this.inventoryItem) {      //Switch statement regarding this.inventoryItem
            case "Chest":   //If this.inventoryItem is equal to Chest
                //Print message that user is dead with a Chest in the backpack
                JOptionPane.showMessageDialog(optionPane, "You are dead!"
                                                 + "\nA ghost escapes and scares you to death!"
                                                 + "\nYou died with a " + this.inventoryItem
                                                 + " in your backpack.", "Haunted House", JOptionPane.INFORMATION_MESSAGE, deadMessage);
                break;
            case "Candelabra":   //If this.inventoryItem is equal to Candelabra
                //Print message that user is dead with a Candelabra in the backpack
                JOptionPane.showMessageDialog(optionPane, "You are dead!"
                                                 + "\nThe candelabra lights up and you see a feath shadow,"
                                                 + "\nscaring you to death."
                                                 + "\nYou died with a " + this.inventoryItem
                                                 + " in your backpack.", "Haunted House", JOptionPane.INFORMATION_MESSAGE, deadMessage);
                break;
            case "Refrigerator":   //If this.inventoryItem is equal to Refrigerator
                //Print message that user is dead with a Refrigerator in the backpack
                JOptionPane.showMessageDialog(optionPane, "You are dead!"
                                                 + "\nYou open it and find delicious soul food,"
                                                 + "\nso delicious, you died as you eat it."
                                                 + "\nYou died with a " + this.inventoryItem
                                                 + " in your backpack.", "Haunted House", JOptionPane.INFORMATION_MESSAGE, deadMessage);
                break;
            case "Cabinet":   //If this.inventoryItem is equal to Cabinet
                //Print message that user is dead with a Cabinet in the backpack
                JOptionPane.showMessageDialog(optionPane, "You are dead!"
                                                 + "\nThe dished and glasses starts flying at you as soon as you open the door."
                                                 + "\nYou get hit in the hed and feel yourself moving towards a light."
                                                 + "\nYou died with a " + this.inventoryItem
                                                 + " in your backpack.", "Haunted House", JOptionPane.INFORMATION_MESSAGE, deadMessage);
                break;
            case "Dusty Recipe Box":   //If this.inventoryItem is equal to Dusty Recipe Box
                //Print message that user is dead with a Dusty Recipe Box in the backpack
                JOptionPane.showMessageDialog(optionPane, "You are dead!"
                                                 + "\nYou open it, and a receipe for chocolate devil's food cake appears out of no where."
                                                 + "\nThe receipe flies into your mouth, choking you with a flavor of chocolate."
                                                 + "\nYou died with a " + this.inventoryItem
                                                 + " in your backpack.", "Haunted House", JOptionPane.INFORMATION_MESSAGE, deadMessage);
                break;
            case "Broom":   //If this.inventoryItem is equal to Broom
                //Print message that user is dead with a Broom in the backpack
                JOptionPane.showMessageDialog(optionPane, "You are dead!"
                                                 + "\nThe broom flies up in the air as soon as you touch it."
                                                 + "\nThe broom starts beating you to death."
                                                 + "\nYou died with a " + this.inventoryItem
                                                 + " in your backpack.", "Haunted House", JOptionPane.INFORMATION_MESSAGE, deadMessage);
                break;
            case "Mirror":   //If this.inventoryItem is equal to Mirror
                //Print message that user is dead with a Mirror in the backpack
                JOptionPane.showMessageDialog(optionPane, "You are dead!"
                                                 + "\nYou see a bloody face looking back at you, scaring you to death."
                                                 + "\nYou died with a " + this.inventoryItem
                                                 + " in your backpack.", "Haunted House", JOptionPane.INFORMATION_MESSAGE, deadMessage);
                break;
            case "Shower":   //If this.inventoryItem is equal to Shower
                //Print message that user is dead with a Shower in the backpack
                JOptionPane.showMessageDialog(optionPane, "You are dead!"
                                                 + "\nThe room suddenly steams up and you feel fingers touching the back of your neck."
                                                 + "\nThe fingers start gripping your neck, choking you"
                                                 + "\nYou died with a " + this.inventoryItem
                                                 + " in your backpack.", "Haunted House", JOptionPane.INFORMATION_MESSAGE, deadMessage);
                break;
            case "Rocking Chair":   //If this.inventoryItem is equal to Rocking Chair
                //Print message that user is dead with a Rocking Chair in the backpack
                JOptionPane.showMessageDialog(optionPane, "You are dead!"
                                                 + "\nThe chair starts rocking by itself with no one in it."
                                                 + "\nA ghost appears and flies towards you, possessing you."
                                                 + "\nYou died with a " + this.inventoryItem
                                                 + " in your backpack.", "Haunted House", JOptionPane.INFORMATION_MESSAGE, deadMessage);
                break;
            case "Window":   //If this.inventoryItem is equal to Window
                //Print message that user is dead with a Window in the backpack
                JOptionPane.showMessageDialog(optionPane, "You are dead!"
                                                 + "\nYou see a child outside on a swing who suddenly disappears."
                                                 + "\nYou look back, and the child appears and possesses you."
                                                 + "\nYou died with a " + this.inventoryItem
                                                 + " in your backpack.", "Haunted House", JOptionPane.INFORMATION_MESSAGE, deadMessage);
                break;
            case "Dollhouse":   //If this.inventoryItem is equal to Doll House
                //Print message that user is dead with a Dollhouse in the backpack
                JOptionPane.showMessageDialog(optionPane, "You are dead!"
                                                 + "\nThe dolls start dancing on their own, towards you."
                                                 + "\nThe dolls grabs you and tears you apart."
                                                 + "\nYou died with a " + this.inventoryItem
                                                 + " in your backpack.", "Haunted House", JOptionPane.INFORMATION_MESSAGE, deadMessage);
                break;
            case "Dresser":   //If this.inventoryItem is equal to Dresser
                //Print message that user is dead with a Dresser in the backpack
                JOptionPane.showMessageDialog(optionPane, "You are dead!"
                                                 + "\nA ghost flies out of the dresser as soon as you open it"
                                                 + "\nand goes right through your body, possessing you."
                                                 + "\nYou died with a " + this.inventoryItem
                                                 + " in your backpack.", "Haunted House", JOptionPane.INFORMATION_MESSAGE, deadMessage);
                break;
            case "Jewelry Box":   //If this.inventoryItem is equal to Jewelry Box
                //Print message that user is dead with a Jewelry Box in the backpack
                JOptionPane.showMessageDialog(optionPane, "You are dead!"
                                                 + "\nYou find the cursed Hope Diamond and feel your doom."
                                                 + "\nYou died with a " + this.inventoryItem
                                                 + " in your backpack.", "Haunted House", JOptionPane.INFORMATION_MESSAGE, deadMessage);
                break;
            case "Intricate Oil Lamp":   //If this.inventoryItem is equal to Intricate Oil Lamp
                //Print message that user is dead with a Intricate Oil Lamp in the backpack
                JOptionPane.showMessageDialog(optionPane, "You are dead!"
                                                 + "\nYou rub the lamp, and a genie pops out who turns you to dust as he snaps his fingers."
                                                 + "\nYou died with a " + this.inventoryItem
                                                 + " in your backpack.", "Haunted House", JOptionPane.INFORMATION_MESSAGE, deadMessage);
                break;
            default:  //Default case
                //Print message that user survived
                JOptionPane.showMessageDialog(optionPane, "You survived", "Haunted House", JOptionPane.INFORMATION_MESSAGE, deadMessage);
        }
    }
}