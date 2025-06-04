package org.example;

public class Main {
    public static void main(String[] args) {
        Employee[] employees ={
                new Manager(),
                new Tester(),
                new Developer()
        };
        for(Employee employee : employees){
            employee.work();

        }
    }

}
