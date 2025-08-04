# Program konversi mata uang dari IDR ke JPY
idr = float(input("Masukkan jumlah dalam IDR: "))
kurs = 0.009031  # 1 IDR = 0.009031 JPY (kurs dapat berubah tergantung nilai pasar)
yen = idr * kurs
print(f"Rp{idr:.0f} sama dengan ¥{yen:.2f}")
