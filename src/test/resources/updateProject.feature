Feature: Edit Proyek di Progress Proyek

Background: Sukses Login
  Given Developer di halaman login
  When Developer mengisi kredensial valid
  When Developer mengeklik button project progress

Scenario: Positive - Edit Proyek
  When User klik button edit proyek
  And Developer mengisi formulir dengan data lengkap
  Then Developer diarahkan ke halaman project progres
