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
public class Pria extends Manusia{
    @Override
    public void ciriFisik(){
        System.out.println("=====||| CIRI-CIRI FISIK PRIA |||=====");
        System.out.println("> Memiliki rambut dibeberapa bagian tubuh");
        System.out.println("> Memiliki 2 tangan dan 2 kaki");
        System.out.println("> Memiliki 1 hidung dengan dua lubang");
        System.out.println("> Memiliki 2 telinga");
        System.out.println("> Memiliki 1 mulut");
    }
    protected void ciriPria(){
        System.out.println("> Memiliki jakun");
        System.out.println("> Memiliki suara yang besar");
    }
}
