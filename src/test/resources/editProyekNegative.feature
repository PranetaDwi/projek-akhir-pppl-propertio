Feature: Edit Proyek di Progress Proyek

  Background: Sukses Login
    Given Developer di halaman login
    When Developer mengisi kredensial valid dan klik tombol login
    Then Developer berada di halaman Progress Proyek

  Scenario: Negative - Edit Proyek dengan Data Salah atau Tidak Lengkap
    Given User di halaman Progress Proyek
    When User klik button "Edit proyek" mengisi form dengan data kosong dan click button "Simpan"
    Then Sistem menampilkan alert pada form
