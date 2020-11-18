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

public class HauntedHouseTester {
    
    public static void main(String[] args) {
        
        HauntedHouse hauntedHouse = new HauntedHouse();         //Create object from class HauntedHouse
        JOptionPane optionPane = new JOptionPane();             //Create object from class JOptionPane
        ImageIcon house = new ImageIcon("Haunted House.png");   //Create object from class ImageIcon
        ImageIcon frontDoor = new ImageIcon("Entrance.png");    //Create object from class ImageIcon
        
        String decisionMaker;         //Declare String variable
        String userName;              //Declare String variable
        
        //Ask user for user's name
        userName = (String)JOptionPane.showInputDialog(optionPane, "Hello visitor, what is your name?", "Haunted House", 
                                                         JOptionPane.QUESTION_MESSAGE, null, null, null);
        hauntedHouse.setUserName(userName);  //Set user's name using setUserName method from class HauntedHouse
        
        //Print message welcoming user to haunted house
        JOptionPane.showMessageDialog(optionPane, "Hello " + userName + ", Welcome to my haunted house!"
                                      + "\nHere's a backpack for you. It can store any item you find in the house."
                                      + "\nTry not to make a mess in my home.", "Hauned House", JOptionPane.INFORMATION_MESSAGE, house);
        
        //Ask user to choose between going to the Living Room, Dining Room, or up the stairs to the 2nd Floor
        decisionMaker = (String)JOptionPane.showInputDialog(optionPane, "Go through through the front door and choose your destiny!"
                                                  + "\n1) Explore the \"Living Room\""
                                                  + "\n2) Explore the \"Dining Room\""
                                                  + "\n3) Go up the \"Stairs\" to the second floor"
                                                  , "Haunted House", JOptionPane.INFORMATION_MESSAGE, frontDoor, null, null);
        
        if(decisionMaker.equalsIgnoreCase("Living Room")) {    //If user wants to go to the Living Room
            hauntedHouse.oneItemOneRoom("Chest", "Bathroom");  //Ask user to choose between checking the Chest or go to the Bathroom
            if(hauntedHouse.getCurrentRoom().equals("Bathroom")) {  //If user wants to go to the Bathroom
                hauntedHouse.deadEndRoom("Mirror", "Shower");       //Ask user to choose between two items in a room with no where else to go
            }
        }
        
        else if(decisionMaker.equalsIgnoreCase("Dining Room")) {  //If user wants to go to the Dining Room
            hauntedHouse.oneItemOneRoom("Candelabra", "Kitchen");  //Ask user to choose between checking the Candelabra or go to the Kitchen
            if(hauntedHouse.getCurrentRoom().equalsIgnoreCase("Kitchen")) {  //If user wants to go to the Kitchen
                hauntedHouse.twoItemsOneRoom("Refrigerator", "Cabinet", "Pantry");  //Ask user to choose between checking the Refrigerator,
                                                                                    //checking the Cabinet, or going to the Pantry
                if(hauntedHouse.getCurrentRoom().equalsIgnoreCase("Pantry")) {     //If user wants to go to the Pantry
                    hauntedHouse.deadEndRoom("Dusty Recipe Box", "Broom");         //Ask user to choose between checking the Dusty Recipe Box
                                                                                   //or checking the Broom
                }
            }
        }
        
        else {                                                                    //If user wants to go up the stairs to 2nd Floor
            hauntedHouse.threeRooms("Bedroom 1", "Bedroom 2", "Master Bedroom");  //Ask user to choose between going to Bedroom 1, Bedroom 2,
                                                                                  //or the Master Bedroom
            
            if(hauntedHouse.getCurrentRoom().equalsIgnoreCase("Bedroom 1")) {     //If user wants to go to Bedroom 1
                hauntedHouse.bedroom1Route("Rocking Chair", "Window", "Bathroom");//Ask user to choose between checking the Rocking Chair,
                                                                                  //checking the Window, or going to the Bathroom
            }
            else if(hauntedHouse.getCurrentRoom().equalsIgnoreCase("Bedroom 2")) {//If user wants to go to Bedroom 2
                hauntedHouse.bedroom2Route("Dollhouse", "Dresser", "Bathroom");   //Ask user to choose between checking the Dollhouse,
                                                                                  //checking the Dresser, or going to the Bathroom
            }
            else {                                                                //If user wants to go to the Baster Bedroom
                hauntedHouse.masterBedroomRoute("Jewelry Box", "Master Bathroom");//Ask user to choose between checking the Jewelry Box
                                                                                  //or going to the Master Bathroom
            }
        }
    }
}