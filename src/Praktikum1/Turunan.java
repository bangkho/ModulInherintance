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
public class Turunan extends Induk{
    public void TestOverload(String s){
        System.out.println("Method di dalam kelas Turunan (Overload)");
        System.out.println("S : \""+ s + "\"");
    }
    @Override
    public void TestOverride(){
        System.out.println("Method di dalam kelas Turunan (Override)");
    }
}
