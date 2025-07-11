package DSImplementation;

import java.util.ArrayList;
import java.util.List;

public class ListImplmentation {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        System.out.println("list of size ");
//        list.add("RAM");

        for (String str : list) {System.out.println(str);}
    }
}
