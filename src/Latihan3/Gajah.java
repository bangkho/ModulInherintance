/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author BangKho
 */
public class Gajah extends Hewan{
    public static void testClassMethod(){
        System.out.println("This Class Method in Gajah...");
    }
    @Override
    public void testInstanceMethod(){
        System.out.println("This Instance Method in Gajah...");
    }
    public static void main(String []args){
        Gajah MyGajah = new Gajah();
        Hewan myHewan = MyGajah;
        Hewan Hewan = new Hewan();
        Hewan.testClassMethod();
        Gajah.testClassMethod();
        Hewan.testInstanceMethod();
        myHewan.testInstanceMethod();
    }
}
