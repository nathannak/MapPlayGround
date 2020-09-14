import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer,Integer> map = new HashMap<>();

        map.put(1,-1);
        map.put(10,0);
        map.put(100,1);
        map.put(1000,2);

        //get minimum of map values
        List<Integer> list = new ArrayList<>(map.values());
        System.out.println("min val: " + Collections.min(list));

        //get maximum of map values
        list = new ArrayList<>(map.values());
        System.out.println("max val: " + Collections.max(list));

        //get minimum of map keys
        list = new ArrayList<>(map.keySet());
        System.out.println("min key: " + Collections.min(list));

        //get maximum of map keys
        list = new ArrayList<>(map.keySet());
        System.out.println("max key: " + Collections.max(list));
        
    }

}
