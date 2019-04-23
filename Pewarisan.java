
package pewarisan;

import java.util.Scanner;

public class Pewarisan {

    
    public static void main(String[] args) {
        int a;
        Scanner pil = new Scanner(System.in);
        
        Manusia x = new Manusia();
        Wanita y = new Wanita();
        Manusia xy = new Wanita();
        Pria z = new Pria();
        Manusia xz = new Pria();
        
        x.ciriFisik();
        System.out.println("");
        System.out.println("1. Ciri Wanita");
        System.out.println("2. Ciri Pria");
        System.out.print("Masukkan Pilihan = ");
        a = pil.nextInt();
        if(a == 1){
            System.out.println("");
            xy.ciriFisik();
            y.ciriWanita();
        }
        if(a == 2){
            System.out.println("");
            xz.ciriFisik();
            z.ciriPria();
        }
    }
    
}
