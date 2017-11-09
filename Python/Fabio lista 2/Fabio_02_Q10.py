def main():
    print('Insira a data atual separada por espaço')
    numero = input('Data: ')

    dia = int(numero.split()[0])
    mes = int(numero.split()[1])
    ano = int(numero.split()[2])

    if dia == 29 and mes == 2 and ano % 4 != 0:
        print('Data invalida')
    elif dia >= 30 and mes == 2:
        print('Data invalida')
    elif 0 < dia <= 30 and 0 < mes <= 12 and ano > 0:
        print('Data valida')
    elif dia == 31:
        if mes == 2 or mes == 4 or mes == 4 or mes == 6 or mes == 9 or mes == 11 and ano > 0:
            print('Data invalida')
        else:
            print('Data Valida')
    else:
        print('Data invalida')


if __name__ == '__main__':
    main()