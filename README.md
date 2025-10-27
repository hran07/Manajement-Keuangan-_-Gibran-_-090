# Sistem Keuangan CH

Program sederhana untuk mencatat **pemasukan** dan **pengeluaran**, sekaligus menampilkan total saldo secara otomatis.

---

##  Deskripsi Class

### `MainApp`
Class utama yang menjalankan program.  
Menampilkan menu utama dan menangani input pengguna.

####  Method:
| Method | Deskripsi |
|:--|:--|
| `main(String[] args)` | Menjalankan program, menampilkan menu utama, dan memanggil method dari `Keuangan` sesuai pilihan pengguna. |

#### Alur menu:
1. **Pemasukan** → input nominal & catatan, disimpan via `Keuangan.inputPemasukan()`.
2. **Pengeluaran** → input nominal & catatan, disimpan via `Keuangan.inputPengeluaran()`.
3. **Lihat Catatan** → menampilkan seluruh transaksi dan total uang.
4. **Keluar** → mengakhiri program.

---

### `Keuangan`
Class yang menyimpan semua data dan menghitung total keuangan.

#### Atribut:
| Atribut | Tipe | Deskripsi |
|:--|:--|:--|
| `incomeNotes` | `ArrayList<String>` | Menyimpan catatan pemasukan. |
| `expenseNotes` | `ArrayList<String>` | Menyimpan catatan pengeluaran. |
| `incomeAmounts` | `ArrayList<Double>` | Menyimpan nominal pemasukan. |
| `expenseAmounts` | `ArrayList<Double>` | Menyimpan nominal pengeluaran. |
| `totalIncome` | `double` | Total seluruh pemasukan. |
| `totalExpense` | `double` | Total seluruh pengeluaran. |
| `saldo` | `double` | Sisa uang saat ini (income - expense). |

#### Method:
| Method | Deskripsi |
|:--|:--|
| `lihatCatatan()` | Menampilkan total pemasukan, pengeluaran, saldo, dan daftar transaksi. |
| `inputPemasukan(Transaksi transaksi)` | Menambahkan transaksi pemasukan baru. |
| `inputPengeluaran(Transaksi transaksi)` | Menambahkan transaksi pengeluaran baru. |
| `getTotalIncome()` / `setTotalIncome()` | Getter dan setter untuk total pemasukan. |
| `getTotalExpense()` / `setTotalExpense()` | Getter dan setter untuk total pengeluaran. |
| `getSaldo()` / `setSaldo()` | Getter dan setter untuk saldo. |

---

### `Transaksi`
 menyimpan data satu transaksi.

####  Field:
| Field | Tipe | Deskripsi |
|:--|:--|:--|
| `nominal` | `double` | Jumlah uang pemasukan/pengeluaran. |
| `catatan` | `String` | Keterangan transaksi. |

Record ini digunakan saat membuat objek transaksi baru untuk dikirim ke `Keuangan`.

---

## Cara Menjalankan

```bash
  # Kompilasi semua file
  javac Tugas3/*.java

  # Jalankan program
  java Tugas3.MainApp
```