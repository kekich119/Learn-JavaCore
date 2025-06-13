package org.chikenFactory;

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen("russia");
        System.out.println(hen.getDescription());

        Hen hen1 = HenFactory.getHen("ukraine");
        System.out.println(hen1.getDescription());

        Hen hen2 = HenFactory.getHen("belarus");
        System.out.println(hen2.getDescription());

        Hen hen3 = HenFactory.getHen("moldova");
        System.out.println(hen3.getDescription());
    }
}
