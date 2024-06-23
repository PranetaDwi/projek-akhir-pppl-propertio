Feature: Mencari Proyek di Progress Proyek

  Background: Sukses Login
    Given Developer di halaman login
    When Developer mengisi kredensial valid dan klik tombol login
    Then Developer berada di halaman Progress Proyek

  Scenario: Negative - Mencari Proyek yang Tidak Ada
    Given User di halaman Progress Proyek
    When User klik Search bar dan mengetik nama proyek "ProyekSarip"
    Then Sistem tidak menampilkan list proyek
