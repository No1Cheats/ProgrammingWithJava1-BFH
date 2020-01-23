package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestProgram {

    public static List<String> upperCase(List<String> list) {
        return list.stream()
                .map(String::toUpperCase) //Better option
                //.map(name -> name.toUpperCase())   Works too tho
                .collect(Collectors.toList());
    }

    public static List<String> select(List<String> list) {
        return list.stream()
                .filter(name -> name.startsWith("A"))
                .filter(name -> name.length() == 3)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ann","Bob","Jim","Charles", "Amy");
        System.out.println(names);
        List<String> upperNames = upperCase(names);
        System.out.println(upperNames);

        List<String> selectedNames = select(names);
        System.out.println(selectedNames);


    }


}
