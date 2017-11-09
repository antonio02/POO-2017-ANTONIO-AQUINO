def main():
    numero = float(input('Digite o numero: '))

    if numero % 1 == 0:
        print('O numero é inteiro')
    else:
        print('O numero é decimal')



if __name__ == '__main__':
    main()