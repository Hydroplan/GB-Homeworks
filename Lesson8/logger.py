'''
Задача 38: Дополнить телефонный справочник возможностью изменения и удаления данных.
Пользователь также может ввести имя или фамилию, и Вы должны реализовать функционал
для изменения и удаления данных
'''
import os
import data_input

file_name = "data.txt"
def print_data():

    if os.path.exists(file_name):
        print("Вывод данных из файла: ")
        with open(file_name, "r", encoding = "utf-8") as file:
            list_data = file.readlines()
            for element in list_data:
                print(element)
    else:
        print("файла не существует, записей нет")

def input_data():
    print("Введите данные для записи в файл: ")
    name = data_input.name_data()
    surname = data_input.surname_data()
    phone = data_input.phone_data()
    address = data_input.address_data()
    with open(file_name, "a", encoding="utf-8") as f:
        f.write(f'{name}; {surname}; {phone}; {address}\n')

def filter_data(filter_string):
    with open(file_name, "r", encoding = "utf-8") as file:
        list_data = file.readlines()
        list_filter = filter_string.split(';')
        is_found = False
        for element in list_data:
            temp_record = element.split(";")
            count = 0
            for record in temp_record:
                for element_filter in list_filter:
                    if element_filter.lower() in record.lower() and len(element_filter) == len(record.strip()):
                        count += 1
            print(count, len(list_filter))
            if count == len(list_filter):
                print(element)
                is_found = True
    if not is_found:
        print('Записей не найдено')

def delete_data(filter_string):
    with open(file_name, "r", encoding = "utf-8") as file:
        list_data = file.readlines()
    with open(file_name, "w", encoding="utf-8") as file:
        list_filter = filter_string.split(';')
        is_found = False
        for element in list_data:
            temp_record = element.split(";")
            count = 0
            for record in temp_record:
                for element_filter in list_filter:
                    if element_filter.lower() in record.lower() and len(element_filter) == len(record.strip()):
                        count += 1
            if count == len(list_filter):
                print(element)
                is_found = True
                delete = input("Для удаления данной строки введите 'Yes'").lower()
                if delete == "yes":
                    print("Строка удалена")
                    continue
            file.write(element)

    if not is_found:
        print('Записей не найдено')

def edit_data(filter_string):
    with open(file_name, "r", encoding = "utf-8") as file:
        list_data = file.readlines()
    with open(file_name, "w", encoding="utf-8") as file:
        list_filter = filter_string.split(';')
        is_found = False
        for element in list_data:
            temp_record = element.split(";")
            count = 0
            for record in temp_record:
                for element_filter in list_filter:
                    if element_filter.lower() in record.lower() and len(element_filter) == len(record.strip()):
                        count += 1
            if count == len(list_filter):
                print(element)
                is_found = True
                delete = input("Для редактирования данной строки введите 'Yes'").lower()
                if delete == "yes":
                    new_string = []
                    for el in temp_record:
                        print("Текущие данные: ", el)
                        new_data = input("Введите новые данные или пустую строку для пропуска:")
                        if new_data:
                            new_string.append(new_data)
                        else:
                            new_string.append(el.strip())
                    element = "; ".join(new_string)
                    print("Строка отредактирована")
                    print (f"новая строка: {element}")

            file.write(element)

    if not is_found:
        print('Записей не найдено')
