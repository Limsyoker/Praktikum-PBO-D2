package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args){
        System.out.println("-------------------------------------------");
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());
        System.out.println("-------------------------------------------");
        Segitiga triangle = new Segitiga(9, 10, 3);
        triangle.printInfo();
        System.out.println("Luas Segitiga : " + triangle.hitungLuas());
        System.out.println("-------------------------------------------");
    }
}
