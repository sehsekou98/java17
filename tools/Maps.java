package tools;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<Object, Object> colors = new HashMap<>();
        colors.put("red", 0);
        colors.put("white", 1);
        colors.put("blue", 2);
        colors.put("purple", 3);

        System.out.println(colors);
    }
}
