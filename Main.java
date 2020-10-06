 import java.util.Scanner;
/**
 * This program creates asterisks in a line according to how many the user wants
 * @author Zach Ramirez 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input 
    Scanner input = new Scanner(System.in); 
    //ask user for a number between 1 - 10 
    System.out.println("Please enter a number between 1 - 10"); 
    int integer = input.nextInt(); 
    //use loop to make asterisk line 
    for(int count = 1; count <= integer; count++){
      System.out.print("*"); 
    } 

    
  }
}
