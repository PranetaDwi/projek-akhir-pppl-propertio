Feature: Update Progress Proyek di Monitoring dan Chat

  Background: Sukses Login dan Navigasi ke Halaman Progress Proyek
    Given Developer di halaman login
    When Developer mengisi kredensial valid
    When Developer mengeklik button project progress
    Then Developer diarahkan ke halaman project progres
    When Developer mengeklik button lihat progress

  Scenario: Pengembang Tambah Progress Proyek dengan data tidak lengkap
    When Developer mengeklik button ubah detail
    And Developer mengisi data update valid
    Then Developer diarahkan ke halaman progres