package week_1;

import abstract_classes.funcMaster;

import java.util.Arrays;
import java.util.List;

public class W1_C2 extends funcMaster {

    public W1_C2(String selection) {
        super.selection = selection;
    }

    @Override
    public void run() {
        //queue list numbers
        List<Integer> q1_list = Arrays.asList(1, 4, 5, 8);
        List<Integer> q2_list = Arrays.asList(2, 3, 6, 7);

        //initialize queues
        queue<Integer> q1 = new queue();
        queue<Integer> q2 = new queue();

        //insert list into q1
        for(int i = q1_list.size(); i >= 0; i--) {
            q1.push(q1_list.get(i));
        }
        System.out.println(q1.display());

    }
    public static void main(String[] args) {
        //queue list numbers
        List<Integer> q1_list = Arrays.asList(1, 4, 5, 8);
        List<Integer> q2_list = Arrays.asList(2, 3, 6, 7);

        //initialize queues
        queue<Integer> q1 = new queue();
        queue<Integer> q2 = new queue();

        //initialize output queue
        queue<Integer> output = new queue();

        //insert list into q1
        for(int num : q1_list) {
            q1.push(num);
        }

        for(int num : q2_list) {
            q2.push(num);
        }

        while((q1.display() != null) || (q2.display() != null)) {
            if((q1.peek() < q2.peek()) || ((q1.peek()) == null) || (q2.peek() == null))  {
                output.push(q1.peek());
                q1.pop();
            }
            else if((q2.peek() < q1.peek()) || ((q1.peek()) == null) || (q2.peek() == null)) {
                output.push(q2.peek());
                q2.pop();
            }
        }

        System.out.println(output.display());
    }
}
