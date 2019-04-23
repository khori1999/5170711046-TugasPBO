/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisan;

/**
 *
 * @author USER
 */
public class Wanita extends Manusia{
    @Override
    public void ciriFisik(){
        System.out.println("=====||| CIRI-CIRI FISIK WANITA |||=====");
        System.out.println("> Memiliki rambut dibeberapa bagian tubuh");
        System.out.println("> Memiliki 2 tangan dan 2 kaki");
        System.out.println("> Memiliki 1 hidung dengan dua lubang");
        System.out.println("> Memiliki 2 telinga");
        System.out.println("> Memiliki 1 mulut");
    }
    protected void ciriWanita(){
        System.out.println("> Memiliki suara yang halus");
        System.out.println("> Mempunyai Payudara");
    }
}
