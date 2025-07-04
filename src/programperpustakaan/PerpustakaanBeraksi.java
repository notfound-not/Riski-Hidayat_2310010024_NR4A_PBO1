package programperpustakaan;

import java.util.Scanner;

public class PerpustakaanBeraksi {
    public static void main(String[] args) {
        
        //Error Handling
        try {
        //IO Sederhana
        Scanner scanner = new Scanner(System.in);
        
        //Tampilkan daftar buku langsung saat program dimulai
        PerpustakaanDetail.tampilkanDaftarBuku();
        
        //Array
        PerpustakaanDetail[] daftarPinjaman = new PerpustakaanDetail[3];
        
        //Perulangan
        for(int i = 0; i < daftarPinjaman.length; i++) {
            System.out.println("\nMasukkan data peminjaman ke-" + (i+1));
            
            System.out.print("Nama Peminjam: ");
            String nama = scanner.nextLine();
            
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            
            System.out.print("Kode Buku (6 digit): ");
            String kodeBuku = scanner.nextLine();
            
            System.out.print("Durasi Pinjam (hari): ");
            int durasi = Integer.parseInt(scanner.nextLine());
            
            //Object
            daftarPinjaman[i] = new PerpustakaanDetail(nama, kodeBuku, nim, durasi);
        }
        
      
            System.out.println("\n===== DAFTAR PEMINJAMAN =====");
            for(PerpustakaanDetail pinjam : daftarPinjaman) {
                System.out.println("\n==============================");
                System.out.println(pinjam.displayInfo(true));
                System.out.println("==============================");
            }
        } catch (NumberFormatException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } 
    }
}