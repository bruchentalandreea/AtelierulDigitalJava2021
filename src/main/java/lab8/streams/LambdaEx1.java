package lab8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaEx1 {
    public static void p1(List<String> strings)
    {
        StringBuilder sb = new StringBuilder();
        strings.forEach(currentString -> sb.append(currentString.charAt(0)));
        System.out.println(sb);
    }

    public static void removeOdd(List<String> strings)
    {
        strings.removeIf(item-> item.length()%2 !=0 );
        System.out.println(strings);
    }

    public static void main(String[] args) {
        List<String> list2 =new ArrayList<>(Arrays.asList("a33", "b4fd", "cfds", "First", "Second"));
        p1(list2);
        removeOdd(list2);
    }
}
