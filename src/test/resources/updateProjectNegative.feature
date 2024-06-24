Feature: Edit Proyek negatif

Background: Sukses Login
  Given Developer di halaman login
  When Developer mengisi kredensial valid
  When Developer mengeklik button project progress

Scenario: Positive - Edit Proyek
  When User klik button edit proyek
  And Developer mengisi formulir dengan ada data kosong
  Then Developer diarahkan ke halaman update