Feature: Developer search a project

Background:Sukses Login
  Given Developer di halaman login
  When Developer mengisi kredensial valid
  When Developer mengeklik button project progress
  Then Developer diarahkan ke halaman project progres

Scenario:Berhasil menemukan user
  When Developer mengeklik button tambah projek progres
  And Developer mengisi kolom pencarian user
  Then Hasil pencarian user ditemukan


