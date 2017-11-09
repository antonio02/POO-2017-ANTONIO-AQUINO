def main():
    numero = int(input('Numero: '))

    if numero == 2 or numero == 3 or numero == 5 or numero == 7 or numero == 11:
        print('é primo')
    elif numero % 2 == 0 or numero % 3 == 0 or numero % 5 == 0 or numero % 7 == 0 or numero % 11 == 0:
        print('Não é primo')
    else:
        print('é primo')
    main()


if __name__ == '__main__':
    main()