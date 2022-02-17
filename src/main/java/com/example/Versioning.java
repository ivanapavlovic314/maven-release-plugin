package com.example;

public class Versioning {
    public static void main(String[] args) {
        System.out.println("Hello explorers.");
        System.out.println();
        System.out.println("This program is running version "+
                Versioning.class.getPackage().getImplementationVersion());
    }
}

