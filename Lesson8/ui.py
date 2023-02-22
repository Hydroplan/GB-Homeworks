from logger import input_data, print_data, filter_data, delete_data, edit_data


def interface():
    print("""Выберите режим работы:
                1 - запись данных
                2 - вывод данных
                3 - поиск данных
                4 - удаление строки данных
                5 - изменение данных""")
    command = int(input("Ввод: "))
    while command < 1 or command > 5:
        command = int(input("Некорректная команда, введите заново: "))
    if command == 1:
        input_data()
    elif command == 2:
        print_data()
    elif command == 3:
        filter_string = input('Введите параметры поиска через ";" :')
        filter_data(filter_string)
    elif command == 4:
        filter_string = input('Введите параметры для поиска через ";" :')
        delete_data(filter_string)
    elif command == 5:
        filter_string = input('Введите параметры для поиска через ";" :')
        edit_data(filter_string)

