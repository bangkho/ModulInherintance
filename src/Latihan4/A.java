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
class A {
    private int a;
    public void SetA(int nilai){
        a = nilai;
    }
    
    public int GetA(){
        return a;
    }
    
    public void TampilkanNilai(){
        System.out.println("Nilai dari A = "+GetA());
    }
}
