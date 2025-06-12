package org.prievidClass;

public class Sosution {
    public static void main(String[] args) {
        Building building = getBuilding();
        School school = getSchool();
        System.out.println(school);
    }

    public static Building getBuilding() {
        return new Building(); // исправь
    }

    public static School getSchool() {
        return new School();
    }

    public static class Building {}

    public static class School extends Building {}
}