|  | Algorithm and Data Structure |
| ------------- |-------------|
| NIM | 244107020107     |
| Nama | Helmi Rizqi Ramadhan     |
| Kelas | TI-1H     |
| Reposity | [GitHub GH-Rumi](https://github.com/GH-Rumi/algorithm-jobsheet) |

# KONSEP DASAR PEMROGRAMAN

## 2.2.1 Pemilihan

Hasil Kode Program:

![Screenshot](screenshot/pemilihan.png)

Langkah-Langkah:
1. Inputlah Nilai Tugas, Kuis, UTS, UAS
2. Kode akan selesai jika nilai lebih dari 100 
3. Jika Nilai tidak ada yang lebih dari 100, kode akan memilih Jika Nilai Huruf yang didapatkan adalah A, B+, B, C+, C maka LULUS, jika nilai huruf D dan E maka TIDAK LULUS.

## 2.3.1 Perulangan

Hasil Kode Program:

![Screenshot](screenshot/pengulangan.png)

Langkah-Langkah:
1. program meminta memasukkan NIM sebagai String
2. Dua digit diambil dan dikonversi ke int, dan Program mencetak nilai akhir n
3. Program akan melakukan perulangan dari 1 hingga n, jika (i == 6) atau (i == 10), iterasi dilewati (continue)
4. Angka genap dicetak, sedangkan angka ganjil akan mencetak '*'

## 2.4.1 Array

Hasil Kode Program:

![Screenshot](screenshot/array.png)

Langkah-Langkah:
1. Program mendeklarasikan beberapa array untuk menyimpan informasi mata kuliah :

- matkul → Nama mata kuliah
- bobotSKS → Jumlah SKS tiap mata kuliah
- nilai → Menyimpan nilai angka yang dimasukkan pengguna
- predikat → Menyimpan nilai huruf hasil konversi dari nilai angka
- bobot → Menyimpan bobot nilai berdasarkan nilai huruf
- totalBobot dan totalSKS → Variabel untuk menghitung IP semester

2. Program akan meminta memasukkan nilai angka untuk setiap mata kuliah dan nilai angka akan disimpan dalam array nilai
3. Setelah menerima nilai angka, program mengonversinya menjadi 

- NIlai Huruf (A, B+, B, C+, C, D, E) berdasarkan rentang nilai
- Bobot nilai sesuai dengan standar akademik

4. Bobot nilai dikalikan dengan jumlah SKS, lalu ditambahkan ke totalBobotSKS dan jumlah SKS juga dihitung dalam totalSKS
5. Program akan menampikan hasil konversi dalam format tabel dengan kolom

## 2.5.1 Praktikum Fungsi

Hasil Kode Program:

![Screenshot](screenshot/fungsi.png)

Langkah-Langkah:
1. Kode program fungsi digunakan untuk menghitung pendapatan dari penjualan bunga di beberapa cabang toko serta menampilkan stok bunga di cabang Royal Garden 4 setelah dilakukan pengurangan.
2. Program dimulai dengan mendeklarasikan array bunga yang berisi nama bunga, array harga yang menyimpan harga masing-masing bunga, array cabang yang menyimpan daftar cabang toko, serta array dua dimensi stok yang merepresentasikan jumlah stok setiap bunga di masing-masing cabang.
3. Dalam metode main, program memanggil dua fungsi, yaitu tampilPendapatan dan tampilStokBunga. Fungsi tampilPendapatan menghitung total pendapatan setiap cabang dengan mengalikan stok bunga di cabang tersebut dengan harga masing-masing bunga, lalu menjumlahkan totalnya. Hasil pendapatan untuk setiap cabang kemudian ditampilkan di layar.
4. Fungsi tampilStokBunga digunakan untuk menampilkan stok bunga di Royal Garden 4 setelah dikurangi dengan jumlah tertentu sesuai dengan array pengurang. Setelah pengurangan dilakukan, stok bunga yang tersisa ditampilkan ke layar.

## Tugas 
### Tugas 1

Hasil Kode Program:

![Screenshot](screenshot/tugas1.png)

Langkah-Langkah:
1. Program mendeklarasikan array kode yang berisi karakter kode plat nomor dan array KOTA yang menyimpan nama kota dalam bentuk array karakter dua dimensi.
2. Inputkan array kode plat
3. Program akan berjalan dan menampilkan hasil kota sesuai dengan kode plat yang kita inputkan
### Tugas 2

Hasil Kode Program:

![Screenshot](screenshot/tugas2.png)

Langkah-Langkah:
1. Program menampilkan menu pilihan kepada pengguna dengan empat opsi sebagai berikut:

- Menghitung Volume Kubus
- Menghitung Luas Permukaan Kubus
- Menghitung Keliling Kubus
- Keluar dari program
  
2. Pengguna menginputkan sesuai keinginan 

3. Program kemudian menggunakan switch-case untuk memanggil fungsi yang sesuai dengan pilihan pengguna

4. Program terus menampilkan menu dan meminta input hingga pengguna memilih opsi 4. Jika pengguna memasukkan angka selain 1, 2, atau 3, program akan menampilkan "Pilihan tidak valid". Setelah program selesai, Scanner ditutup untuk mencegah kebocoran sumber daya.

### Tugas 3

Hasil Kode Program:

![Screenshot](screenshot/tugas3-1.png)

![Screenshot](screenshot/tugas3-2.png)

![Screenshot](screenshot/tugas3-3.png)

Langkah-Langkah:
1. Program meminta pengguna untuk memasukkan jumlah mata kuliah yang akan dimasukkan. Untuk setiap mata kuliah, pengguna diminta mengisi nama mata kuliah, jumlah SKS, semester, dan hari kuliah. Data ini disimpan dalam array namaMk, sks, semester, dan hari.
2. Program menampilkan menu berisi lima pilihan:

- 1 : Menampilkan seluruh jadwal kuliah.
- 2 : Menampilkan jadwal berdasarkan hari tertentu.
- 3 : Menampilkan jadwal berdasarkan semester tertentu.
- 4 : Mencari mata kuliah berdasarkan namanya.
- 5 : Keluar dari program.

3. Pengguna menginput sesuai yang diperlukan, lalu program memanggil salah satu dari lima fungsi tersebut

4. Jika pengguna memilih untuk menampilkan jadwal berdasarkan hari, semester, atau mencari mata kuliah berdasarkan nama, program akan memeriksa apakah data yang dicari tersedia. Jika tidak ditemukan, program menampilkan pesan "Mata kuliah tidak ditemukan".

5. Program terus menampilkan menu hingga pengguna memilih opsi 5 (Keluar). Jika opsi ini dipilih, program menampilkan pesan "Program selesai." dan keluar dari perulangan menggunakan 'return'
