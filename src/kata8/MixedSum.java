package kata8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MixedSum {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        List<Integer> newList = list.stream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());
        int sum = 0;
        for (Integer integer : newList) {
            sum += integer;
        }
        System.out.println(sum);
    }
}
