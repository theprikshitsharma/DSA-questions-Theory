import java.util.List;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorSort {
    public static void main(String[] args) {

        // Comparator<Integer> com1 = new Comparator<Integer>() {
        //     public int compare(Integer obj1 , Integer obj2) {
        //         if (obj1 % 10 > obj2 % 10)
        //             return 1;
        //         else   
        //             return -1;
        //     }
        // };
        Comparator<String> com2 = new Comparator<String>() {
            public int compare(String obj1 , String obj2) {
                if (obj1.length() > obj2.length())
                    return 1;
                else 
                    return -1;
            }
        };

        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(4);
        list.add(32);
        list.add(22);
        list.add(37);

        List<String> stringList = new ArrayList<>();
        stringList.add("Prikshit");
        stringList.add("Puru");
        stringList.add("Priky");
        stringList.add("Parisha");

        // Stack<Integer> stack = new Stack<>();
        // stack.push(6);
        // stack.push(4);
        // stack.push(32);
        // stack.push(22);
        // stack.push(37);


        // Collections.sort(list , com);
        //  Collections.sort(stack);

        // System.out.println(list);
        
        // System.out.println(stack);

        Collections.sort(stringList , com2);

        System.out.println(stringList);


    }

}
