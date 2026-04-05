POSTTEST 3
PEMROGRAMAN BERORIENTASI OBJEK

Sistem Penjualan Merchandise McLaren

Nama    : Aulia Natasya
NIM     : 2409106084
Kelas   : B2'24

Program ini merupakan lanjutan dari Posttest 2. Di dalam Posttest 3 ini program masih sama yaitu untuk mengelola data
merchandise dari tim Formula 1 McLaren, akan tetapi terdepat perubahan dengan menggunakan konsep inheritance delam program ini. Inheritance merupakan konsep pewarisan dimana sebuah class dapat mewarisi atribut dan method dari class lain.
Dalam program ini, class merchandise dijadikan sebagai superclass, sedangkan class tshirt, outerwear, headwear, dan accessoris merupakan subclass yang mewarisi atribut dan method dari class merchandise.

Konsep inheritance yang digunakan adalah Hierarchical Inheritance, yaitu satu superclass memiliki lebih dari satu subclass. Relasi yang digunakan adalah is-a relationship, contohnya:
T-Shirt adalah Merchandise
Outerwear adalah Merchandise
Headwear adalah Merchandise
Accessories adalah Merchandise

Program ini memiliki tujuh class:
1. Main
   Class utama yang menjalankan menu program dan mengatur proses CRUD serta transaksi.
2. Merchandise
   Class yang digunakan untuk menyimpan data merchanise, seperti:
    - id merchandise
    - nama merchandise
    - harga merchandise
    - stok merchandise
3. T-Shirt
   Subclass dari merchandise yang memiliki atribut tambahan berupa ukuran.
4. Outerwear
   Subclass dari merchandise yang memiliki atribut tambahan berupa ukuran dan tipe seperti jaket atau hoodie.
5. Headwear
   Subclass dari merchandise yang memiliki atribut tambahan berupa jenis dari headwear seperti cap atau beanie.
6. Accessories
   Subclass dari merchandise yang memiliki atribut tambahan berupa jenis dari headwear seperti kacamata, keyring, atau poster.
7. Transaksi
   Class yang digunakan untuk menyimpan data transaksi pembelian, seperti:
    - nama merchandise
    - jumlah pembelian
    - total harga

Program ini memiliki fitur yaitu:
1. Create     : Untuk menambahkan data merchandise baru.
2. Read       : Untuk menampilkan seluruh data merchandise.
3. Update     : Untuk mengubah data merchandise yang sudah ada.
4. Delete     : Untuk menghapus data merchandise dari daftar.
5. Transaksi  : Untuk melakukan pembelian merchandise dan menghitung total harga.
6. Exit       : untuk keluar dari program.

Penjelasan
1. Method Tambah Data
   Method tambahData() digunakan untuk menambahkan data merchandise baru. Pengguna diminta memasukkan ID, nama, harga, dan stok, kemudian memilih jenis merchandise. Setelah itu, program akan membuat objek sesuai subclass yang dipilih (TShirt, Outerwear, Headwear, atau Accessories) dan menyimpannya ke dalam ArrayList.
   ![code tambah 1.png](assets/code%20tambah%201.png)
   ![code tambah 2.png](assets/code%20tambah%202.png)

2. Method Lihat Data
   Method lihatData() digunakan untuk menampilkan seluruh data merchandise. Jika data kosong, program akan menampilkan pesan bahwa data belum tersedia. Jika data ada, maka semua data akan ditampilkan menggunakan perulangan.
   ![code lihat.png](assets/code%20lihat.png)

3. Method Update Data
   Method updateData() digunakan untuk mengubah data berdasarkan ID. Jika ID ditemukan, maka pengguna dapat mengubah nama, harga, dan stok menggunakan method setter karena atribut bersifat private.
   ![code update.png](assets/code%20update.png)

4. Method Hapus Data
   Method hapusData() digunakan untuk menghapus data merchandise berdasarkan ID yang dimasukkan pengguna dengan menggunakan perulangan.
   ![code hapus.png](assets/code%20hapus.png)

5. Method Transaksi
   Method transaksi() digunakan untuk melakukan pembelian merchandise. Program akan mengecek stok yang tersedia, menghitung total harga pembelian, lalu mengurangi stok merchandise sesuai jumlah yang dibeli. 
   ![code transaksi.png](assets/code%20transaksi.png)

Tampilan output program:
1. Menu Utama
   Tampilan menu utama saat program pertama kali dijalankan.
   ![Menu Utama.png](assets/Menu%20Utama.png)


2. Tambah Data Merchandise (Create)
   Proses memasukan data merchandise baru ke sistem.
   ![Tambah Data Merch.png](assets/Tambah%20Data%20Merch.png)


3. Menampilkan Data Merchandise (Read)
   Menampilkan daftar seluruh merchandise yang telah tersimpan.
   ![Lihat Data Merch.png](assets/Lihat%20Data%20Merch.png)


4. Mengubah Data Merchandise (Update)
   Untuk memperbaharui informasi merchandise berdasarkan ID.
   ![Update Data Merch.png](assets/Update%20Data%20Merch.png)


5. Menghapus Data Merchandise (Delete)
   Digunakan untuk menghapus data merchandise dari daftar.
   ![Hapus Data Merch.png](assets/Hapus%20Data%20Merch.png)


6. Transaksi Pembelian
   Terdapat transaksi sederhana untuk melakukan pembelian merchandise serta menghitung total harga secara otomatis.
   ![Transaksi Merch.png](assets/Transaksi%20Merch.png)


7. Keluar dari Program (Exit)
   Program akan berhenti ketika pengguna memilih menu keluar.
   ![Exit.png](assets/Exit.png)