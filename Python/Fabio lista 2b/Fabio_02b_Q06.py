def main():
    turno = input('Digite a sigla do turno: ')

    if turno == 'm' or turno == 'M':
        print('Bom dia!')
    elif turno == 'v' or turno == 'V':
        print('Boa tarde!')
    elif turno == 'n' or turno == 'N':
        print('Boa noite!')
    else:
        print('Turno invalido')


if __name__ == '__main__':
    main()