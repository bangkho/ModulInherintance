/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author BangKho
 */
class B extends A{
     private int b;
    public void SetB(int nilai){
        b = nilai;
    }
    
    public int GetB(){
        return b;
    }
    
    public void TampilkanNilai(){
        super.TampilkanNilai();
        System.out.println("Nilai dari B = "+GetB());
    }
}
