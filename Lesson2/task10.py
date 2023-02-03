# Задача 10: На столе лежат n монеток. Некоторые из них лежат вверх решкой,
#  а некоторые – гербом. Определите минимальное число монеток, которые нужно
#  перевернуть, чтобы все монетки были повернуты вверх одной и той же стороной.
#  Выведите минимальное количество монет, которые нужно перевернуть.

import random

n_monetok = int(input('Введите количество монеток на столе: '))
spisok_monet = [random.randint(0,1) for i in range(n_monetok)]
print(spisok_monet)
tails = 0
heads = 0
for i in spisok_monet:
    if i:
        tails += 1
    else:
        heads += 1
print(f'Надо перевернуть {min(tails, heads)}')