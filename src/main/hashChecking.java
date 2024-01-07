package programs;

import java.util.HashMap;
import java.util.Hashtable;

 class HashCheckingExample {
    public static void main(String args[]){
        HashMap<String, String> demoMap = new HashMap<>();

        demoMap.put("key1", "1");
        demoMap.put(null, "2");
        demoMap.put(null, "3");

        System.out.println(demoMap.get("Key1"));
        System.out.println(demoMap.get(null));

        Hashtable<String,String> demoHashTable = new Hashtable<>();

        demoHashTable.put(null, "1");
        demoHashTable.put(null, "2");
    }
}


