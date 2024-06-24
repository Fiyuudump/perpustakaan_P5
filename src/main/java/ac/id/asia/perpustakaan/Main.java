/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id.asia.perpustakaan;

/**
 *
 * @author D-11
 */
public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new PerpustakaanUmum();
        perpustakaan.pinjamBuku("Buku A");
        perpustakaan.kembalikanBuku("Buku B");
        perpustakaan.lihatDaftarBuku();
    }
}
