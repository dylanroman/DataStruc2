package week_2;

import abstract_classes.funcMaster;

import java.util.ArrayList;
import java.util.Scanner;

public class W2_C1 extends funcMaster {
    Scanner input = new Scanner(System.in);

    public W2_C1(String selection) {
        super.selection = selection;
    }

    @Override
    public void run() {
        System.out.println("Input: ");
        String expression = input.nextLine();

        calculator myCalculator = new calculator();

        ArrayList<String> tokens = myCalculator.tokenizer(expression);
        ArrayList<String> rpn = myCalculator.toReversePolish(tokens);

        System.out.println("Reverse Polish: " + rpn);

        Double result = myCalculator.calculate(rpn);
        System.out.println("Result: " + result);
    }


}
