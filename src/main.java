//imports
import abstract_classes.funcMaster;
import week_0.matrix;
import week_0.swapper;
import week_1.W1_C1;
import week_1.W1_C2;
import week_1.W1_C3;

import java.util.*;

public class main {

    public static void main(String[] args) {
        //Initialize scanner (user input)
        Scanner input = new Scanner(System.in);

        //Create menu options dictionary
        Dictionary<Integer, funcMaster> myElements = new Hashtable<Integer, funcMaster>(); {
            myElements.put(1, new exit("Exit"));
            myElements.put(2, new swapper("Week 0: Swapper"));
            myElements.put(3, new matrix("Week 0: Matrix"));
            myElements.put(4, new W1_C1("Week 1 Challenge 1"));
            myElements.put(5, new W1_C2("Week 2 Challenge 2"));
            myElements.put(6, new W1_C3("Week 3 Challenge 3"));
        }
        
        //Create menu class object
        menu myMenu = new menu(myElements);

        Boolean running = true;
        while(running == true){
            //Print insturctions
            System.out.println("Enter Item Number From Following List: ");
            myMenu.print();

            //Read user input
            System.out.println("Input: ");
            int choice = input.nextInt();

            //Try choice
            try {
                //Run selection
                myMenu.run(choice);
                System.out.println();
            }
            //Return valid values
            catch(Exception e) {
                System.out.println("Enter a valid number");
            }
        }
    }
}