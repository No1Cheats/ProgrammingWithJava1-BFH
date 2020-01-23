package Streams;

import java.util.List;

public class toUpperCase {

    public static void main(String[] args) {
        new toUpperCase(stringList());
    }

    private toUpperCase(List<String> list){
        //List<String> upperCase = stringList().stream();


    }

    private static List<String> stringList() {
        return List.of(
                "hello world",
                "go USA",
                "myName"
        );
    }

}
