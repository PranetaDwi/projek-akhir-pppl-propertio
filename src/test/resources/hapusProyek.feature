Feature: Hapus Proyek di Progress Proyek

  Background: Sukses Login dan Navigasi ke Halaman Progress Proyek
    Given Developer telah login ke sistem
    And Developer berada di halaman Progress Proyek

  Scenario: Hapus Proyek yang Ada
    Given User telah login dan berada di halaman Progress Proyek
    When User klik button "Hapus proyek" muncul modal validasi dan click "Ya, Hapus"
    Then Sistem menghapus proyek yang dipilih
