import turtle as tur
import colorsys as cs
tur.setup(800, 800)
tur.speed(0)
tur.width(2)
tur.bgcolor("black")
n = 25
m = 15
for j in range(n):
    for i in range(m):
        tur.color(cs.hsv_to_rgb(i/m, j/n, 1))
        tur.right(90)
        tur.circle(200 - j*4, 90)
        tur.left(90)
        tur.circle(200 - j*4, 90)
        tur.right(180)
        tur.circle(50, 24)
tur.hideturtle()
tur.done()