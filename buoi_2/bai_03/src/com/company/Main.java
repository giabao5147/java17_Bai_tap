package com.company;
//Hien thi cac thong tin cai dat Java
public class Main {

    public static void main(String[] args) {
	    System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("Java runtime version: " + System.getProperty("java.version"));
        System.out.println("Java home: " + System.getProperty("JAVA_HOME"));
        System.out.println("Java vendor: " + System.getProperty("java.vm.vendor"));
        System.out.println("Java vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java class path: " + System.getProperty("java.class.path"));
    }
}
