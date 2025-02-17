
// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.driver;

public class Main {


    public static void main(java.lang.String[] args) {
        Product p = new Product();
        System.out.println( p.product(1,2));
        System.out.println(p.product(1,2,3));
        System.out.println(p.product(1.0,2.0));

    }

    public static class Product {

        public int product(int x, int y) { return x*y; }

        public int product(int x, int y, int z) {  return x*y*z;}

        public double product(double x, double y) { return x*y;}
    }
}