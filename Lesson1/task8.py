# Требуется определить, можно ли от шоколадки размером n ×m долек отломить k
# долек, если разрешается сделать один разлом по
# прямой между дольками (то есть разломить шоколадку на два прямоугольника).
n = int(input('Введите ширину шоколадки: '))
m = int(input('Введите длину шоколадки: '))
k = int(input('Сколько долек хотите отломить за раз? '))
square = m * n
if k < m or k < n:
    print('Не получится')
elif k == m or k == n:
    print('Получится')
elif k > square:
    print('Не получится')
elif k % m == 0 or k % n == 0:
    print('Получится')
else:
    print('Не получится')
