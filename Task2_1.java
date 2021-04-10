import java.util.ArrayList;
import java.util.List;

public class Task3_1 {
    static public List<Integer> getList(String s) {

        String strg[] = s.split(";");
        List<Integer> intList = new ArrayList<>();
        for (String S : strg)
            intList.add(Integer.parseInt(S));
        return intList;

    }

    public static void main(String args[]) {
        System.out.println(getList("1;2;3;4"));
    }
}