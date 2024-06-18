Feature: Developer membuka halaman project progress

Background:Sukses Login
  Given Developer di halaman login
  When Developer mengisi kredensial valid

Scenario:Masuk ke halaman progress project
  When Developer mengeklik button project progress
  Then Developer diarahkan ke halaman project progres
