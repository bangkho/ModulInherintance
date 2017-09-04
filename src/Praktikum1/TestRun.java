/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author BangKho
 */
public class TestRun {
    public static void main(String[] args){
        //inisialisasi Objek
        Turunan turunan = new Turunan();
        Induk induk = new Induk();
        
        //Test Overloading
        turunan.TestOverload();
        turunan.TestOverload("Khoi");
        
        //Test Overriding
        induk.TestOverride();
        turunan.TestOverride();
    }
}
