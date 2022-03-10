//imports
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        //Initialize scanner (user input)
        Scanner input = new Scanner(System.in);

        //Create menu options dictionary
        Dictionary<Integer, String> myElements = new Hashtable<Integer, String>(); {
            myElements.put(1, "Test_1");
            myElements.put(2, "Test_2");
        }
        
        //Create menu class object
        menu myMenu = new menu(myElements);

        //Print insturctions
        System.out.println("Enter Item Number From Following List: ");
        myMenu.print();

        //Read user input
        int choice = input.nextInt();
    }
}
