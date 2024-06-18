Feature: Hapus Proyek di Progress Proyek

Background: Sukses Login dan Navigasi ke Halaman Progress Proyek
  Given Developer di halaman login
  When Developer mengisi kredensial valid
  When Developer mengeklik button project progress
  Then Developer diarahkan ke halaman project progres

Scenario: Hapus Proyek yang Ada
  When Developer klik button hapus proyek
  And Developer mengeklik ya hapus pada modal
  Then Sistem menghapus proyek yang dipilih
