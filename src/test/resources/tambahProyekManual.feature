Feature: Menambah Proyek di Progress Proyek

  Background: Sukses Login
    Given Developer di halaman login
    When Developer mengisi kredensial valid dan klik tombol login
    Then Developer berada di halaman Progress Proyek

  Scenario: Positive - Menambah Proyek Baru
    Given User di halaman Progress Proyek
    When User klik button "Tambah proyek" dan mengisi form kemudian click "Simpan"
    Then Sistem menampilkan proyek yang ditambahkan
