Feature: Tambah Progress Proyek di Monitoring dan Chat

  Background: Sukses Login ke Sistem
    Given Pengembang sudah login ke sistem

  Scenario: Pengembang Memilih Proyek untuk Menambah Progress
    Given Pengembang berada di halaman Progress Proyek
    And Pengembang telah memilih proyek "Pembangunan Gedung Perkantoran ABC"

  Scenario: Pengembang Tambah Progress Proyek
    Given Pengembang telah memilih proyek untuk ditambahkan progressnya
    When Pengembang klik button "Lihat Progress" dan klik button "Tambah Progress"
    Then Pengguna diarahkan pada halaman progress proyek yang diperbarui

