import java.util.HashMap;
public class hash_map {
    public static void main(String args[]){
        //Create
        HashMap<String ,Integer> hm = new HashMap<>();

        // Insert 
        hm.put("India",150);
        hm.put("China",200);
        hm.put("US",70);
        hm.put("Pak",80);
        // hm.remove("Pak");

        System.out.println(hm);

        // Get
        System.out.println(hm.get("c"));

        // Contains
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Pak"));

        //Size 
        System.out.println(hm.size());

        // Is Empty
        System.out.println(hm.isEmpty());

        // Clear
        hm.clear();
        System.out.println(hm);
    }
}
