# Задача 18: Требуется найти в массиве A[0..N-1] самый близкий по
#  величине элемент к заданному числу X. Пользователь в первой строке
#  вводит натуральное число N – количество элементов в массиве. 
# В последующих строках записаны N целых чисел A[i]. Последняя строка содержит число X

import random
n = int(input('Введите количество натуральных чисел: '))
list_n = [random.randint(0,99) for i in range(n)]
print(list_n)
x = int(input('Введите число X: '))
modul_min = 100
min_diff = 0
for element in list_n:
    modul = abs(element-x)
    if modul < modul_min:
        modul_min = modul
        min_diff = element

print(f'Число {min_diff} ближайшее к {x}')