package remover;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void removeOggy(ArrayList<String> names) {
        Iterator i = names.iterator();
        String str = "";
        while (i.hasNext()) {
            str = (String) i.next();
            if (str.contains("oggy")) {
                i.remove();

            }
        }
    }
    public static boolean oggyIsRemoved(ArrayList<String> names) {
        List<String> oggys=new ArrayList<>();
        for(int i=0;i<names.size();i++)
        {
            if(names.get(i).contains("oggy"))
                oggys.add(names.get(i));
        }
        return oggys.size() == 0;
    }
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("nobita", "bheem", "oggy", "oggy cockroach", "ninja"));
        removeOggy(names);
        System.out.println(names);
        if(oggyIsRemoved(names)) {
            System.out.println("Passed!");
            System.exit(0);
        } else {
            System.out.println("Failed!!");
            System.exit(1);
        }
    }
}
