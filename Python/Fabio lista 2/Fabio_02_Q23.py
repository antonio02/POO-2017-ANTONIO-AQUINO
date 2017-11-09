def main():
    print('Digite a data no formato DD/MM/AAAA')
    data1 = input('Digite a primeira data: ')
    data2 = input('Digita a segunda data: ')

    dia1 = int(data1.split('/')[0])
    mes1 = int(data1.split('/')[1])
    ano1 = int(data1.split('/')[2])
    dia2 = int(data2.split('/')[0])
    mes2 = int(data2.split('/')[1])
    ano2 = int(data2.split('/')[2])


    if dia1 == 29 and mes1 == 2 and ano1 % 4 != 0 or dia2 == 29 and mes2 == 2 and ano2 % 4 != 0:
        print('Data invalida')
    elif dia1 >= 30 and mes1 == 2 or dia2 >= 30 and mes2 == 2:
        print('Data invalida')
    elif dia1 <= 0 or mes1 <= 0 or ano1 <= 0 or dia2 <= 0 or mes2 <= 0 or ano2 <= 0:
        print('Data invalida')
    elif dia1 == 31:
        if mes1 == 2 or mes1 == 4 or mes1 == 4 or mes1 == 6 or mes1 == 9 or mes1 == 11:
            print('Data invalida')
    elif dia2 == 31 and mes2 == 2 or mes2 == 4 or mes2 == 4 or mes2 == 6 or mes2 == 9 or mes2 == 11:
        print('Data invalida')
    elif dia1 > 31 or mes1 > 12:
        print('Data invalida')
    else:
        if ano1 > ano2:
            print(data1, 'é mais recente que', data2)
        elif ano1 < ano2:
            print(data2, 'é mais recente que', data1)
        elif ano1 == ano2 and mes1 > mes2:
            print(data1, 'é mais recente que', data2)
        elif ano1 == ano2 and mes1 < mes2:
            print(data2, 'é mais recente que', data1)
        elif ano1 == ano2 and mes1 == mes2 and dia1 > dia2:
            print(data1, 'é mais recente que', data2)
        elif ano1 == ano2 and mes1 == mes2 and dia1 < dia2:
            print(data2, 'é mais recente que', data1)
        else:
            print('As datas são iguais')


if __name__ == '__main__':
    main()