import java.util.ArrayList;
import java.util.Collections;

public class array_list{

    public static void swap(ArrayList<Integer>list, int index1, int index2){
        int temp=list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2, temp);
        // System.out.println(list);
    }

    public static void main(String args[]){
        // Java Collection Framework

        ArrayList<Integer> list= new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(2); //O(1)
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // System.out.println(list);

        // Get Operation
        // int element=list.get(2);
        // System.out.println(element);

        // Delete
        // list.remove(2);
        // System.out.println(list);

        // list.set(2,10);
        // System.out.println(list);

        // Contains
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));

        // System.out.println(list.size());

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        // Reverse order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
       
    }

}