package Main;

import OtherFunctions.*;
import SymbolTables.*;
import java.io.IOException;

/**
 * @author Joachim
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        int control = 1; //used to make sure that the values of the keys are updated properly.
        
        String[] text = FileConverter.toStringArray("src\\main\\java\\supplementary\\shakespeare-complete-works.txt", "[^A-Za-z]");
        
        
        LinkedST linked = new LinkedST();
        ArrayST array = new ArrayST();
        SeparateChainingHashST scHashed = new SeparateChainingHashST();
        RedBlackBalancedST rbBalanced = new RedBlackBalancedST();
        flexibleArray<String> keys = new flexibleArray();
        flexibleArray<Integer> values = new flexibleArray();
        keys.add("dummy"); //rough value to avoid null pointer exceptions
        values.add(control); //see above
        boolean repeat;
        
        
        Stopwatch timer = new Stopwatch();
        //Linked table code
        /*for (String s : text) {
            if (linked.get(s) != null) {
                linked.put(s, control + (int) linked.get(s));
            } else {
            linked.put(s, control);
            }
        }
        for (Object o : linked.keys()) {
            System.out.println(o + " -> " + linked.get(o));
        }*/
        
        //Array table code
        /*for (String s : text) {
            if (array.get(s) != null) {
                array.put(s, control + (int) array.get(s));
            } else {
            array.put(s, control);
            }
        }
        for (Object o : array.keys()) {
            System.out.println(o + " -> " + array.get(o));
        }*/
        
        //Array table code but using flexibleArray
        /*for (String s : text) {
            repeat = false;
            for (int i = 0; i < keys.size(); i++) {
                if (keys.get(i).equals(s)) {
                    values.set(i, values.get(i) + control);
                    repeat = true;
                }
            }
            if (repeat == true) {
                continue;
            }
            keys.add(s);
            values.add(control);
        }
        
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " -> " + values.get(i));
        }*/
        
        //Separate chaining Hashed table code
        /*for (String s : text) {
            if (scHashed.get(s) != null) {
                scHashed.put(s, control + (int) scHashed.get(s));
            } else {
            scHashed.put(s, control);
            }
        }
        for (Object o : scHashed.keys()) {
            System.out.println(o + " -> " + scHashed.get(o));
        }*/
        
        //Red-Black balanced table code
        /*for (String s : text) {
            if (rbBalanced.get(s) != null) {
                rbBalanced.put(s, control + (int) rbBalanced.get(s));
            } else {
            rbBalanced.put(s, control);
            }
        }
        for (Object o : rbBalanced.keys()) {
            System.out.println(o + " -> " + rbBalanced.get((Comparable) o));
        }*/
        
        double time = timer.elapsedTime();
        System.out.println("This took " + time + " Seconds!");
    }
    
    
}
