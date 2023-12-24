package tasks.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Task1 {

    public static void main(String[] args) {
        getList(createList());
    }

    public static  List<String> createList() {
        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Alice");
        list.add("Bob");
        list.add("Lucy");
        return list;
    }

    public static void getList(List<String> list){
        Consumer<String> consumer = name -> System.out.println("Name is " + name);
        list.forEach(consumer);
    }

}
