package com.sdacademy.day6;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class Dry {

    private String showMessage(Customer customer) {
        if (customer.isPermium && customer.age > 18) {
            return "This is only for rich adults";
        }

        if (customer.name.startsWith("J")) {
            return "Promotion for peapole with name starts with J";
        }

        if (customer.name.split(" ").length > 3) {
            return "Bonus for your names";
        }
        return "regular message";
    }

    Map<Predicate<Customer>, String> messages = new HashMap<>();

    {
        messages.put(customer -> customer.isPermium && customer.age > 18, "Message 1");
        messages.put(customer -> customer.name.startsWith("J"), "Message 2");
        messages.put(customer -> customer.name.split(" ").length > 3, "Message 3");
    }

    private String showMessageBetter(Customer customer) {
        String result = "regular message";

        for (Map.Entry<Predicate<Customer>, String> entry : messages.entrySet()) {
            if(entry.getKey().test(customer)){
                result = entry.getValue();
            }
        }
        return result;
    }


    static class Customer {
        private String name;
        private int age;
        private boolean isPermium;
    }

}
