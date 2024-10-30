# Sistem Absensi Sederhana

Program ini adalah sistem absensi sederhana yang memungkinkan pengguna untuk menambah data kehadiran, menampilkan daftar kehadiran, dan menghitung persentase kehadiran dari peserta yang terdaftar. Program ini berjalan di terminal dan menerima input pengguna.

## Fitur

- *Tambah Kehadiran*: Pengguna dapat menambah data kehadiran dengan nama dan status kehadiran (hadir atau tidak hadir).
- *Tampilkan Daftar Kehadiran*: Program menampilkan daftar kehadiran dengan status apakah peserta hadir atau tidak.
- *Hitung Persentase Kehadiran*: Menghitung persentase peserta yang hadir dari total peserta yang terdaftar.

## Struktur Kode

### Kelas

- *Absensi*: Kelas ini merepresentasikan data kehadiran setiap peserta, dengan atribut name (nama peserta) dan hadir (status kehadiran).
- *SistemAbsensiSederhana*: Kelas utama yang menjalankan fungsi sistem absensi, mengatur input pengguna, dan menampilkan data kehadiran.

### Metode

- **tampilkanDaftarKehadiran**: Menampilkan daftar semua peserta beserta status kehadiran mereka.
- **hitungPersentaseKehadiran**: Menghitung dan menampilkan persentase peserta yang hadir dari total peserta.
- **main**: Mengelola antarmuka utama program, menerima input pengguna, dan menjalankan fungsi berdasarkan pilihan.

## Cara Penggunaan

1. Kompilasi program:

   ```bash
   javac SistemAbsensiSederhana.java 