package com.sokolov.hw05;

public class Main {

    public static void main(String... args){
        MyUnitFramework junit = new MyUnitFramework();
        junit.runPackage("tests");
        System.out.println("-------------------------------------------");
        junit.runClasses(CalcTest.class);
    }
}