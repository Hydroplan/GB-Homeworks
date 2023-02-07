'''
Задача 24: В фермерском хозяйстве в Карелии выращивают чернику. Она растет на
круглой грядке, причем кусты высажены только по окружности. Таким образом, у
каждого куста есть ровно два соседних. Всего на грядке растет N кустов.
Эти кусты обладают разной урожайностью, поэтому ко времени сбора на них
выросло различное число ягод – на i-ом кусте выросло ai
 ягод.
В этом фермерском хозяйстве внедрена система автоматического сбора черники.
Эта система состоит из управляющего модуля и нескольких собирающих модулей.
Собирающий модуль за один заход, находясь непосредственно перед некоторым
кустом, собирает ягоды с этого куста и с двух соседних с ним.
Напишите программу для нахождения максимального числа ягод, которое может
собрать за один заход собирающий модуль, находясь перед некоторым кустом
заданной во входном файле грядки.

'''

import random
n = int(input('Введите количество кустов черники: '))
gryadka = [random.randint(0,9) for i in range(n)]
print(gryadka)
max_income_of_berries = 0
first_index_income_of_berries = gryadka[-1] + gryadka[0] + gryadka[1]
last_index_income_of_berries = gryadka[-2] + gryadka[-1] + gryadka[0]
max_income_of_berries = max(first_index_income_of_berries, last_index_income_of_berries)
for i in range(1, len(gryadka) - 1):
    i_index_income_of_berries = gryadka[i-1] + gryadka[i] + gryadka[i+1]
    max_income_of_berries = max(max_income_of_berries, i_index_income_of_berries)
print(max_income_of_berries)