Feature: Tambah Progress Proyek di Monitoring dan Chat

  Background: Sukses Login ke Sistem
    Given Pengembang sudah login ke sistem

  Scenario: Pengembang Memilih Proyek untuk Menambah Progress dengan Persentase Kurang
    Given Pengembang berada di halaman Progress Proyek
    And Pengembang telah memilih proyek

  Scenario: Pengembang Tambah Progress Proyek dengan Persentase Kurang
    Given Pengembang telah memilih proyek untuk ditambahkan progressnya
    When Pengembang klik button Lihat Progress click button Tambah Proggres
    Then Pengguna tidak dapat memasukkan progress karena persentase lebih rendah dari progress sebelumnya
