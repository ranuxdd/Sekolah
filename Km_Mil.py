def kilometer_to_mil(km):
    # 1 kilometer = 0.621371 mil
    mil = km * 0.621371
    return mil

# Input dari pengguna
km_input = float(input("Masukkan jarak dalam kilometer: "))
mil_output = kilometer_to_mil(km_input)

print(f"{km_input} kilometer sama dengan {mil_output:.2f} mil")
16