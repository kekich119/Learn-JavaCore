package org.rebootMethods;

public class SolutionReboot {
    public static void print (int value){
        System.out.println(value);
    }
    public static void print(Integer value){
        System.out.println(value);
    }
    public static void print (String value){
        System.out.println(value);
    }
    public static void print (double value){
        System.out.println(value);
    }
    public static void print(boolean value){
        System.out.println(value);
    }
    public static void print (char value){
        System.out.println(value);
    }


    public static void main(String[] args) {
        print(5);
        print(3.14);
        print(true);
        print("Пример");
        print('A');

        System.out.println(SolutionRebootMin.min(10, 20));
        System.out.println(SolutionRebootMin.min(5.5, 3.3));
        System.out.println(SolutionRebootMin.min(10000000000L, 5000000000L));

    }

}
