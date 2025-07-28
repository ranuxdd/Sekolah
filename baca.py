# Program menghilangkan tanda baca dari teks
import string

def hilangkan_tanda_baca(teks):
    return teks.translate(str.maketrans("","", string.punctuation))

teks = input("masukan teks: ")
print("Teks tanpa tanda baca:",hilangkan_tanda_baca(teks))