def adalah_anagram(str1, str2):

# Hapus spasi dan ubah ke huruf kecil untuk perbandingan yang tepat
    str1 = str1.replace(" ","").lower()
    str2 = str2.replace(" ","").lower()

# Periksa apakah panjang string sama
    if len(str1) != len(str2):
        return False

# Urutkan string dan bandingkan
    return sorted(str1) == sorted(str2)

# Contoh penggunaan
string1 = "evil"
string2 = "vile"

if adalah_anagram(string1, string2):
    print(f'"{string1}" dan "{string2}" adalah anagram.')
else:
    print(f'"{string1}" dan "{string2}" bukan anagram.')

string3 = "hello"
string4 = "world"

if adalah_anagram(string3, string4):
    print(f'"{string3}" dan "{string4}" adalah anagram.')
else:
    print(f'"{string3}" dan "{string4}" bukan anagram.')