package teszt;

import java.util.Map;
import java.util.TreeMap;

public class teszt {

    public static final String VOWELS="aui";

    public static void main(String[] args) {
        String teszt = "auuuii";

        char [] chars = teszt.toCharArray();
        Map<Character, Integer> list = new TreeMap<>();

        for (int i=0; i<teszt.length();i++) {
            if(teszt.charAt(i)==chars[i]  && !list.containsKey(chars[i])) {
                list.put(chars[i], 1);
                            } else
                  if(teszt.charAt(i)==chars[i]  && list.containsKey(chars[i])) {
                list.put(chars[i], list.get(chars[i])+1);
                            }



        }
        System.out.println(list);
    }
}
