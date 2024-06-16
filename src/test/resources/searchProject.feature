Feature: Developer search a project

Background:Sukses Login
  Given Developer di halaman login
  When Developer mengisi kredensial valid

Scenario:Masuk ke halaman progress project
  When Developer mengeklik button project progress
  Then Developer diarahkan ke halaman project progres

Scenario:Berhasil mencari project progress
  Given Developer di halaman project progress
  When Developer mengisi kolom pencarian project progress
  Then Hasil pencarian project progress ditemukan

