Feature: Menambah Proyek di Progress Proyek

  Background: Sukses Login
    Given Developer di halaman login
    When Developer mengisi kredensial valid dan klik tombol login
    Then Developer berada di halaman Progress Proyek

  Scenario: Negative - Menambah Proyek dengan Data Salah atau Tidak Lengkap
    Given User di halaman Progress Proyek
    When User klik button "Tambah proyek" dan memasukkan nama pembeli "Budi Santoso" dan memasukan data kosong dan click button "Simpan"
    Then Sistem menampilkan alert pada form
