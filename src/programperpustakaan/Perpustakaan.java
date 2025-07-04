package programperpustakaan;

//Class
public class Perpustakaan {
    //Atribut (Nilai: 5) - Enkapsulasi (Nilai: 5)
    private String namaPeminjam;
    private String kodeBuku;
    private String nim;
    private int durasiPinjam;
    
    //Constructor
    public Perpustakaan(String namaPeminjam, String kodeBuku, String nim, int durasiPinjam) {
        this.namaPeminjam = namaPeminjam;
        this.kodeBuku = kodeBuku;
        this.nim = nim;
        this.durasiPinjam = durasiPinjam;
    }
    
    //Mutator (Setter)
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
    
    //Accessor
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
    
    //Polymorphism (Overloading)
    public String displayInfo() {
        return "Nama Peminjam: " + getNamaPeminjam() +
               "\nNIM: " + getNim() +
               "\nKode Buku: " + getKodeBuku() +
               "\nDurasi Pinjam: " + getDurasiPinjam() + " hari";
    }
    
    public String displayInfo(boolean showDetails) {
        if(showDetails) {
            return displayInfo() + "\nStatus: Sedang Dipinjam";
        }
        return displayInfo();
    }
}