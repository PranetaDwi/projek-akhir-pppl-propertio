Feature: Menambah Proyek di Progress Proyek

Background:Sukses Login
  Given Developer di halaman login
  When Developer mengisi kredensial valid
  When Developer mengeklik button project progress
  Then Developer diarahkan ke halaman project progres
  When Developer mengeklik button tambah projek progres
  And Developer mengisi kolom pencarian user

Scenario:Membuka halaman create manual project progress
  When User klik button Pilih Pembeli
  Then Developer di halaman formulir tambah projek manual
