Feature: Tambah Progress Proyek di Monitoring dan Chat

Background: Sukses Login dan Navigasi ke Halaman Progress Proyek
  Given Developer di halaman login
  When Developer mengisi kredensial valid
  When Developer mengeklik button project progress
  Then Developer diarahkan ke halaman project progres

Scenario: Pengembang Memilih Proyek untuk Dilihat Progressnya
  When Developer mengeklik button lihat progress
  Then Developer diarahkan ke halaman progres dan alamat proyek

Scenario: Pengembang Tambah Progress Proyek dengan Persentase Kurang
  When Developer mengisi data progres tidak valid
  Then Muncul pesan peringatan
