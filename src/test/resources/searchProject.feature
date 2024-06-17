Feature: Developer search a project

Background:Sukses Login
  Given Developer di halaman login
  When Developer mengisi kredensial valid

Scenario:Berhasil mencari project progress
  When Developer mengeklik button project progress
  Then Developer diarahkan ke halaman project progres
  When Developer mengisi kolom pencarian project progress
  Then Hasil pencarian project progress ditemukan

