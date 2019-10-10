/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg1011806.latihan19.saldotabungan;
import  java.text.DecimalFormat;
/*
 * NAMA              : Alfarizi Rizki Pane
 * KELAS             : IF-01
 * NIM               : 10118006
 * DESKRIPSI PROGRAM : Program yang dapat menampilkan saldo perbulan    
 */

public class IF0110118006Latihan19SaldoTabungan {

    public static void main(String[] args) {

        int i, Saldo;
        DecimalFormat satuan = new DecimalFormat();
        i = 1;
        Saldo = 2500000;
        while (i < 7) {
            Saldo += (Saldo * 0.15);
            System.out.println("Saldo di bulan ke-" + i + " Rp." + satuan.format(Saldo));
            i++;
        }
    }

}
