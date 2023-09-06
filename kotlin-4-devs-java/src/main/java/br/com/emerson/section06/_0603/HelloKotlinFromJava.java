package br.com.emerson.section06._0603;

import br.com.emerson.section05._0505.MaxKt;

public class HelloKotlinFromJava {

    public static void main(String[] args) {
        Person rob = new Person("Robert", "Martin");
        System.out.println("His name is " + rob.getFirstName());

        rob.setFirstName("Uncle Bob");
        System.out.println("His new name is " + rob.getFirstName());

        Integer maxInt = MaxKt.max(2001, 2022);
        System.out.println("The max value is " + maxInt);
    }
}
