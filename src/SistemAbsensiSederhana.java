import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 */
class Absensi {
    private String name;
    public boolean hadir;

    /**
     *
     * @param nama
     * @param hadir
     */
    public Absensi(String nama, boolean hadir) {
        this.setName(nama);
        this.hadir = hadir;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class SistemAbsensiSederhana {
    private static ArrayList<Absensi> daftarAbsensi = new ArrayList<>();

    // Tampilkan daftar kehadiran
    public static void tampilkanDaftarKehadiran() {
        System.out.println("\nDaftar Kehadiran:");
        for (Absensi absensi : daftarAbsensi) {
            System.out.println("Nama: " + absensi.getName() + " - Hadir: " + (absensi.hadir ? "Ya" : "Tidak"));
        }
    }

    // Hitung persentase kehadiran
    public static void hitungPersentaseKehadiran() {
        int totalHadir = 0;
        for (Absensi absensi : daftarAbsensi) {
            if (absensi.hadir) {
                totalHadir++;
            }
        }
        double persentase = (double) totalHadir / daftarAbsensi.size() * 100;
        System.out.println("\nPersentase Kehadiran: " + persentase + "%\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean selesai = false;

        while (!selesai) {
            System.out.println("=== Sistem Absensi Sederhana ===");
            System.out.println("1. Tambah Kehadiran");
            System.out.println("2. Tampilkan Daftar Kehadiran");
            System.out.println("3. Hitung Persentase Kehadiran");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Apakah hadir (y/n)? ");
                    char hadirInput = scanner.next().charAt(0);
                    boolean hadir = (hadirInput == 'y' || hadirInput == 'Y');
                    daftarAbsensi.add(new Absensi(nama, hadir));
                    System.out.println("Data kehadiran berhasil ditambahkan.\n");
                    break;
                case 2:
                    tampilkanDaftarKehadiran();
                    break;
                case 3:
                    hitungPersentaseKehadiran();
                    break;
                case 4:
                    selesai = true;
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
}