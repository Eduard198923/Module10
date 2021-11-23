package homework10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Eduard","Nadir","Isax","Diana","Ruslan","Emin");
        System.out.println(fromListToString(names));

    }

    private static String fromListToString(List<String> names) {
        return names.stream()
                .filter(name -> names.indexOf(name)%2!=0)
                .map(name -> " "+names.indexOf(name)+". " + name+", ")
                .collect(Collectors.joining());
    }

}