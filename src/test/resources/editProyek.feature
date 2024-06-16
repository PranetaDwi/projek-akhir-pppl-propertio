Feature: Edit Proyek di Progress Proyek

  Background: Sukses Login
    Given Developer di halaman login
    When Developer mengisi kredensial valid dan klik tombol login
    Then Developer berada di halaman Progress Proyek

  Scenario: Positive - Edit Proyek
    Given User di halaman Progress Proyek
    When User klik button "Edit proyek" kemudian user kemudian click "Simpan"
    Then Sistem menampilkan proyek yang diubah
