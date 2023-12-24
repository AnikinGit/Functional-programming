package tasks.task2;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        getUser(new User("Tom", "555 123-8596"));
    }

    public static void getUser(User user) {
        Supplier<String> nameSupplier = user::getName;
        System.out.print("User name is " + nameSupplier.get() + ", ");
        Supplier<String> phoneNumberSupplier = user::getPhoneNumber;
        System.out.println("phone " + phoneNumberSupplier.get());


    }

}
