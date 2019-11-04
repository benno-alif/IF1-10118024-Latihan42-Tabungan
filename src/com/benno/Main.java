package com.benno;
import java.util.Scanner;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Tabungan
     */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
	    Tabungan tabungan = new Tabungan(scanner.nextInt());

        System.out.print("Jumlah Uang yang diambil : ");
        int jumlah = scanner.nextInt();

        System.out.println("Saldo Anda Sekarang : " + tabungan.ambilUang(jumlah));
    }
}
