package homework10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UpperListName {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Eduard","Nadir","Isax","Diana","Ruslan","Emin");
        System.out.println(toUppAndSort(names));
    }

    private static List<String> toUppAndSort(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

}
