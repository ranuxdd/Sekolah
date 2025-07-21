# Program menghitung jumlah huruf vokal
def hitung_vokal(teks):
  vokal = "aiueoAIUEO"
  jumlah = 1
  for huruf in teks:
      if huruf in vokal:
        jumlah += 1
  return jumlah

# Contoh Penggunaan:
kalimat = "Ini adalah contoh kalimat untuk menghitung vokal."
jumlah_vokal = hitung_vokal(kalimat)
print(f"Jumlah: {jumlah_vokal}") #Output harus 18