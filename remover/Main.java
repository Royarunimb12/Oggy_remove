package remover;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void removeOggy(ArrayList<String> names) {
        return;
    }
    public static boolean oggyIsRemoved(ArrayList<String> names) {
        List<String> oggys=new ArrayList<>();
        for(int i=0;i<names.size();i++)
        {
            if(names.get(i).contains("oggy"))
                oggys.add(names[i]);
        }
        return oggys.size() == 0;
    }
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("nobita", "bheem", "oggy", "oggy cockroach", "ninja"));
        removeOggy(names);
        if(oggyIsRemoved(names)) {
            System.out.println("Passed!");
            System.exit(0);
        } else {
            System.out.println("Failed!!");
            System.exit(1);
        }
    }
}
