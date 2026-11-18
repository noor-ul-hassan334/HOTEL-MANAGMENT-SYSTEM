import java.util.Scanner;
// This program is a simple hotel management system that allows users to book rooms, reserve tables, and order food.
// It consists of three main classes: 'hotel', 'restaurant', and 'food', along with a main class 'HotelManagment' that serves as the entry point for the program.

class hotel{ 
    // Method to select a room based on the number of persons
    // This method prompts the user for the number of persons and displays available rooms
    // It then allows the user to select a room and confirms the booking
    // If the number of persons is less than 1 or the selected room number is invalid, appropriate messages are displayed
    public void selectRoom(){
        Scanner input = new Scanner(System.in);
        System.out.println("HOW MAY PERSINS YOU ARE");
        int persons = input.nextInt();
        if (persons < 1){
            System.out.println("Invalid Number of Persons!");
                        return;
        }
        System.out.println("\n AVAILABLE ROOMS");
        int[] rooms = {101, 102, 103, 104};
        
                for (int i = 0; i < rooms.length; i++) {
                    System.out.println(rooms[i]);
                }
        
                System.out.print("\nSelect Room Number: ");
                int selected = input.nextInt();
        
                boolean found = false;
        
                for (int i = 0; i < rooms.length; i++) {
        
                    if (selected == rooms[i]) {
                        found = true;
                        break;
                    }
                }
        
                if (found) {
        
                    System.out.println("\nRoom Booked Successfully!");
                    System.out.println("Persons: " + persons);
                    System.out.println("Room Number: " + selected);
                    System.out.println("YOUR 1 NIGHT STANDARD CHARGES ARE RS-" + (persons * 1000));
        
                }
        
                else {
                    System.out.println("Invalid Room Number!");
                }
                                  

    }
}


class restaurant{
    // Method to select a table based on the number of persons
    // This method prompts the user for the number of persons and displays available tables
    // It then allows the user to select a table and confirms the booking
    // If the number of persons is less than 1 or the selected table number is invalid, appropriate messages are displayed
   
    public void selectperson(){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF PERSOND");
        int persons = input.nextInt();
        if (persons < 1){
            System.out.println("Invalid Number of Persons!");
                        return;
        }
        System.out.println("\n AVAILABLE TABLES");
        int[] tables = {101, 102, 103, 104};
        
                for (int i = 0; i < tables.length; i++) {
                    System.out.println(tables[i]);
                }
        
                System.out.print("\nSelect Table Number: ");
                int selected = input.nextInt();
        
                boolean found = false;
        
                for (int i = 0; i < tables.length; i++) {
        
                    if (selected == tables[i]) {
                        found = true;
                        break;
                    }
                }
        
                if (found) {
        
                    System.out.println("\nTable Booked Successfully!");
                    System.out.println("Persons: " + persons);
                    System.out.println("Table Number: " + selected);
        
                }
        
                else {
                    System.out.println("Invalid Table Number!");
                }
     
            }
            
        }
 class food extends restaurant {
    // This class represents a food selection system for a restaurant
    // It allows users to select a meal type (Breakfast, Lunch, Dinner, Fast Food) and displays the corresponding menu
    // The user can then enter their food choice, and the system confirms the order placement
    // The class uses a Scanner to read user input and provides feedback based on the selected meal type
            public int choice;
               public void selectMeal() {
            
                    System.out.println("\n===== SELECT YOUR MEAL BY CHOICE ONE NUMBER =====");
            
                    System.out.println("1. Breakfast");
                    System.out.println("2. Lunch");
                    System.out.println("3. Dinner");
                    System.out.println("4. Fast Food");
                    Scanner input = new Scanner(System.in);

            
                    System.out.print("Enter your choice: ");
                     choice = input.nextInt();

                    if (choice >=1 && choice <= 4 ) {
                        if (choice == 1) {
                            System.out.println("BREAKFAST IS SELECTED ");
                          }
                            if (choice == 2) {
                            System.out.println("LUNCH IS SELETED ");
                            }
                              if (choice == 3) {
                               System.out.println("dinner is seleted ");
                            } 
                             if (choice == 4) {
                                System.out.println("fast food is selected");
                             }
                         }
                     else {
                        System.out.println("----INVALID CHOISE ----");
                     }
                    }
                 }
                    //INHERITANCE USED TO ACCESS CHOICE 
  class foodMenu extends food {
    // This class extends the 'food' class and provides a method to display the menu based on the selected meal type
    // It uses the 'choice' variable inherited from the 'food' class to determine which menu to display
    // The 'showMenu' method prompts the user to enter their food choice and confirms the order placement
    public String order;
         void showMenu(){

                 if (choice == 1) {
                                System.out.println("-----BREAKFAST MENU-----");
                                System.out.println("PARATHA-(RS-50) ,\n CHAI(RS-50) ,\n ANDAA(RS-50) ");
                                Scanner input = new Scanner(System.in);
                                System.out.println("ENTER YOUR FOOD NAME");
                                 order = input.nextLine();
                                 System.out.println("PLEASE WAIT YOUR ORDER IS PLACED");

                 }
                   if (choice == 2) {
                                System.out.println("-----LUNCH MENU-----");
                                System.out.println("NAN-(RS-12)\n DAAL-(RS-70) \n BIRYANI(RS-150) ");
                                Scanner input = new Scanner(System.in);
                                System.out.println("ENTER YOUR FOOD NAME");
                                order = input.nextLine();   
                                System.out.println("PLEASE WAIT YOUR ORDER IS PLACED"); 
                 }
                  if (choice == 3) {
                                System.out.println("-----DINNER MENU-----");
                                System.out.println("CHICKEN KARAHI(RS-2000) \n HANDI(RS-1200) \n CHAPATI(RS-15)");
                                Scanner input = new Scanner(System.in);
                                System.out.println("ENTER YOUR FOOD NAME");
                                order = input.nextLine();
                                System.out.println("PLEASE WAIT YOUR ORDER IS PLACED");
                 }
                 if (choice == 4) {
                                System.out.println("----FAST FOOD MENU----");
                                System.out.println("Zinger Burger (RS-250)\n Chicken Shawarma(RS-180)\n Pizza LARGE(RS-1000)");
                                Scanner input = new Scanner(System.in);
                                System.out.println("ENTER YOUR FOOD NAME");
                                order = input.nextLine();
                                System.out.println("PLEASE WAIT YOUR ORDER IS PLACED");
                            
                                
                 }
                        
                        
           }
     }
     
                 
  public class HotelManagment{
     public static void main(String[] args) {
        // Main method to run the hotel management system
        // It prompts the user to choose between hotel stay and restaurant/food options
        // Based on the user's choice, it creates instances of the 'hotel' or 'restaurant' classes 

        Scanner input = new Scanner(System.in);
                
             System.out.println("WELCOME TO SINDHREE HOTEL");
                
             System.out.println("1. Hotel Stay");
             System.out.println("2. Restaurant / Food");
                
             System.out.print("Enter choice: ");
                int choice = input.nextInt();
                
                 if (choice == 1) 
                        {   
                            hotel h = new hotel();
                            h.selectRoom();
                          }
                         
            if  (choice == 2) {
                
                            restaurant r = new restaurant();
                            r.selectperson();
                            foodMenu meNu = new foodMenu();
                            meNu.selectMeal();
                            meNu.showMenu();
              }
              
     }
 }