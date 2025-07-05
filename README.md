# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data untuk peminjaman buku di Perpustakaan menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa "Nama Peminjam", "NIM Peminjam", "Kode Buku", dan "Durasi Peminjaman". Lalu selanjutnya dari output "Kode Buku" akan mendapatkan informasi detail dari seperti "Judul Buku", "Penerbit" dan "Tahun Terbit".

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Mahasiswa`, `MahasiswaDetail`, dan `MahasiswaBeraksi` adalah contoh dari class.

```bash
public class Perpustakaan {
    ...
}

public class PerpustakaanDetail extends Perpustakaan {
    ...
}

public class PerpustakaanBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `daftarPinjam[i] = new PerpustakaanDetail(nama, kodeBuku, nim, durasi);` adalah contoh pembuatan object.

```bash
daftarPinjaman[i] = new PerpustakaanDetail(nama, kodeBuku, nim, durasi);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaPeminjam`, `kodeBuku`, `nim` dan `durasiPinjam` adalah contoh atribut.

```bash
String namaPeminjam;
String kodeBuku;
String nim;
int durasiPinjam;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Perpustakaan` dan `PerpustakaanDetail`.

```bash
public Perpustakaan(String namaPeminjam, String kodeBuku, String nim, int durasiPinjam) {
    this.namaPeminjam = namaPeminjam;
    this.kodeBuku = kodeBuku;
    this.nim = nim;
    this.durasiPinjam = durasiPinjam;
}

public PerpustakaanDetail(String namaPeminjam, String kodeBuku, String nim, int durasiPinjam) {
        super(namaPeminjam, kodeBuku, nim, durasiPinjam);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamaPeminjam`, `setKodeBuku`, `setNim`, dan `setDurasiPinjam` adalah contoh method mutator.

```bash
public void setNamaPeminjam(String namaPeminjam) {
    this.namaPeminjam = namaPeminjam;
}
    
public void setKodeBuku(String kodeBuku) {
    this.kodeBuku = kodeBuku;
}
    
public void setNim(String nim) {
    this.nim = nim;
}
    
public void setDurasiPinjam(int durasiPinjam) {
    this.durasiPinjam = durasiPinjam;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaPeminjam`, `getKodeBuku`, `getNim`, dan `getDurasiPinjam` adalah contoh method accessor.

```bash
public String getNamaPeminjam() {
    return namaPeminjam;
}
    
public String getKodeBuku() {
    return kodeBuku;
}
    
public String getNim() {
    return nim;
}
    
public int getDurasiPinjam() {
    return durasiPinjam;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namaPeminjam`, `kodeBuku`, `nim` dan `durasiPinjam dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String namaPeminjam;
private String kodeBuku;
private String nim;
private int durasiPinjam;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PerpustakaanDetail` mewarisi `Perpustakaan` dengan sintaks `extends`.

```bash
public class PerpustakaanDetail extends Perpustakaan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(Boolean)` di `Perpustakaan` merupakan overloading method `displayInfo` dan `displayInfo` di `PerpustakaanDetail` merupakan override dari method `displayInfo` di `Perpustakaan`.

```bash
public String displayInfo(boolean showDetails) {
   if(showDetails) {
   return displayInfo() + "\nStatus: Sedang Dipinjam";
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getJudulBuku` dan seleksi `switch` dalam method `getPenerbit`.

```bash
public String getJudulBuku() {
    String kodeJudul = getKodeBuku().substring(0, 2);
    if(kodeJudul.equals("PB")) {
       return "Belajar Photoshop";
    } else if(kodeJudul.equals("PC")) {
       return "Panduan Corel Draw";
    } else if(kodeJudul.equals("JP")) {
       return "Java Programming";
    } else if(kodeJudul.equals("AM")) {
        return "Cisco Packet Tracer";
    } else if(kodeJudul.equals("DB")) {
        return "Dasar-Dasar Basis Data";
    } else {
       return "Judul Tidak Diketahui";
    }
}

public String getPenerbit() {
     String kodePenerbit = getKodeBuku().substring(2, 4);
     switch(kodePenerbit) {
      case "01":
         return "Angkasa Raya";
       case "02":
         return "Cahaya Ilmu Persada";
       case "03":
         return "Gramedia Pustaka";
       case "04":
         return "Sinar Jaya";
       case "05":
         return "Tiga Sekawan";
       default:
         return "Penerbit Tidak Dikenal";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < daftarPinjaman.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.println("\nMasukkan data peminjaman ke-" + (i+1));
String nama = scanner.nextLine();

System.out.print("Nama Peminjam: ");
String nama = scanner.nextLine();
            
System.out.print("NIM: ");
String nim = scanner.nextLine();
            
System.out.print("Kode Buku (8 digit): ");
String kodeBuku = scanner.nextLine();
            
System.out.print("Durasi Pinjam (hari): ");
int durasi = Integer.parseInt(scanner.nextLine());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `PerpustakaanDetail[] daftarpinjam = new PerpustakaanDetail[3];` adalah contoh penggunaan array.

```bash
PerpustakaanDetail[] daftarPinjaman = new PerpustakaanDetail[3];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
} catch (NumberFormatException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
    } 
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Riski Hidayat
NPM: 2310010024
