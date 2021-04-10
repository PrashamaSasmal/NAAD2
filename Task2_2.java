import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class Task3_2 {
    public static void main(String[] args) {
        System.out.println(getOccurrencesHashMap("1;2;2;2;3;1"));
    }

    private static HashMap<Integer, Integer> getOccurrencesHashMap(String s) {
        String strg[] = s.split(";");
        List<Integer> intList = new ArrayList<>();
        for (String S : strg)
            intList.add(Integer.parseInt(S));
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Set<Integer> hashSet = new HashSet<>(intList);
        for (Integer intCol : hashSet)
            hashMap.put(intCol, Collections.frequency(intList, intCol));

        return hashMap;
    }
}
