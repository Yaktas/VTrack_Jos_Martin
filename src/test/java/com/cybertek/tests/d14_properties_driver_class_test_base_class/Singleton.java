package com.cybertek.tests.d14_properties_driver_class_test_base_class;

public class Singleton {

    // singleton class will have private constructor
    // it means other classes con not create object of this class
    private Singleton() {
    }

    static String str;

    public static String getInstance() {
        //if the string has no value, initialize it nad retun
        if (str == null) {
            System.out.println("str is null. assigning value to it");
            str = "ice cream was good";

        }
        // else just return it

        else {

            System.out.println("it already has a value");
        }

        return str;
    }


}