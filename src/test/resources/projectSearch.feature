Feature: Developer search a project

Background:Sukses Login
  Given Developer di halaman login
  When Developer mengisi kredensial valid
  Then Developer diarahkan ke dashboard

Scenario:Sukses mencari proyek
  When Developer mengeklik button project progress
  Then Developer diarahkan ke halaman project progres
