# Program menghitung volume tabung
import math

radius = float(input("Tulis jari-jari tabung: "))
tinggi = float(input("Tulis tinggi tabung: "))

volume = math.pi * (radius ** 2) * tinggi
print(f"Volume tabung adalah {volume:.0f}")