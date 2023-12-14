import java.security.Key;
import java.util.HashMap;
import java.util.Set;

public class hashMaps {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("Pakistan",100);
        hm.put("Australia",110);

        Set<String> keys = hm.keySet();
        for (String element : keys) {
            System.out.print("key"+element);
        }

    }
}
