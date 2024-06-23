Feature: Periksa Progress Proyek di Monitoring dan Chat

  Background: Sukses Login ke Sistem
    Given Pengembang sudah login ke sistem

  Scenario: Pengembang Memilih Proyek untuk Dilihat Progressnya
    Given Pengembang berada di Dashboard
    When Pengembang navigasi ke halaman Progress Proyek
    And Pengembang memilih proyek

  Scenario: Pengembang Melihat Detail Progress Proyek
    Given Pengembang telah memilih proyek untuk dilihat progressnya
    When Pengembang klik button Lihat Progress
    Then Pengguna diarahkan ke halaman Monitoring dan Chat

  Scenario: Pengguna Melihat Informasi Lengkap Proyek dan Progress Proyek
    Given Pengguna berada di halaman Monitoring dan Chat
    Then Pengguna melihat informasi lengkap mengenai proyek dan progress proyek yang dipilih
