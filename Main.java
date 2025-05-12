class Person {
    private String nama;
    private String alamat;

    public Person(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}

// Subclass Mahasiswa (turunan pertama dari Person)
class Mahasiswa extends Person {
    private String nim;

    public Mahasiswa(String nama, String alamat, String nim) {
        super(nama, alamat);
        this.nim = nim;
    }

    public String getNIM() {
        return nim;
    }
}

// Subchild class MahasiswaBeasiswa (turunan kedua dari Mahasiswa)
class MahasiswaBeasiswa extends Mahasiswa {
    private double beasiswa;

    public MahasiswaBeasiswa(String nama, String alamat, String nim, double beasiswa) {
        super(nama, alamat, nim);
        this.beasiswa = beasiswa;
    }

    public double getBeasiswa() {
        return beasiswa;
    }
}

// Subclass Dosen (turunan pertama dari Person)
class Dosen extends Person {
    private String nip;

    public Dosen(String nama, String alamat, String nip) {
        super(nama, alamat);
        this.nip = nip;
    }

    public String getNIP() {
        return nip;
    }
}

// Main class untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Array of superclass (polymorphism)
        Person[] orang = new Person[3];

        // Inisialisasi objek
        orang[0] = new Mahasiswa("Desta", "Lumajang", "20231001");
        orang[1] = new MahasiswaBeasiswa("Budi", "Jember", "20231002", 1500000);
        orang[2] = new Dosen("Ibu Lina", "Lumajang", "1980123456");

        // Menampilkan informasi setiap objek
        for (Person p : orang) {
            System.out.println("Nama   : " + p.getNama());
            System.out.println("Alamat : " + p.getAlamat());

            if (p instanceof MahasiswaBeasiswa) {
                MahasiswaBeasiswa mb = (MahasiswaBeasiswa) p;
                System.out.println("NIM    : " + mb.getNIM());
                System.out.println("Beasiswa: Rp " + mb.getBeasiswa());
            } else if (p instanceof Mahasiswa) {
                Mahasiswa mhs = (Mahasiswa) p;
                System.out.println("NIM    : " + mhs.getNIM());
            } else if (p instanceof Dosen) {
                Dosen dsn = (Dosen) p;
                System.out.println("NIP    : " + dsn.getNIP());
            }

            System.out.println("-------------------------");
        }
    }
}