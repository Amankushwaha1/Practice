package DSImplementation;

import java.util.ArrayList;
import java.util.List;

public class StringNewLine {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append("World");
        builder.append("!");
        String[] builder1 = {"First", "Second", "Third"};
        for (String s: builder1) {
            builder.append("\n");
            builder.append("ERROR->" + s);
        }

        System.out.println(builder.toString());
    }
}
