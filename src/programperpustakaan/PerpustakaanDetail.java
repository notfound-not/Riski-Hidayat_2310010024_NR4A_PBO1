package programperpustakaan;

//Inheritance
public class PerpustakaanDetail extends Perpustakaan {
    
    
    //Method untuk menampilkan daftar buku
    public static void tampilkanDaftarBuku() {
        System.out.println("\n===== DAFTAR BUKU YANG TERSEDIA =====");
        System.out.println("Kode\t\tJudul Buku");
        System.out.println("------\t\t------------------");
        System.out.println("PB012022\tBelajar Photoshop");
        System.out.println("PC022024\tPanduan Corel Draw");
        System.out.println("JP032021\tJava Programming");
        System.out.println("AM042010\tCisco Paket Tracer");
        System.out.println("DB052011\tDasar-Dasar Basis Data");
    }
    
    //Overriding Constructor
    public PerpustakaanDetail(String namaPeminjam, String kodeBuku, String nim, int durasiPinjam) {
        super(namaPeminjam, kodeBuku, nim, durasiPinjam);
    }
    
    //Seleksi IF
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
    
    //Seleksi SWITCH
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
    
    public int getTahunTerbit() {
        return Integer.parseInt(getKodeBuku().substring(6, 8)) + 2000;
    }
    
    //Polymorphism (Overriding)
    @Override
    public String displayInfo() {
        return super.displayInfo() +
               "\nJudul Buku: " + getJudulBuku() +
               "\nPenerbit: " + getPenerbit() +
               "\nTahun Terbit: " + getTahunTerbit();
    }
}