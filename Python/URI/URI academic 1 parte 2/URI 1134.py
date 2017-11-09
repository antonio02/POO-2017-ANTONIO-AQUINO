def main():

    tipo = int(input())
    alcool = 0
    gasolina = 0
    diesel = 0

    while tipo != 4:
        if tipo == 1:
            alcool += 1
        elif tipo == 2:
            gasolina += 1
        elif tipo == 3:
            diesel += 1

        tipo = int(input())

    print('MUITO OBRIGADO')
    print('Alcool: %d' % alcool)
    print('Gasolina: %d' % gasolina)
    print('Diesel: %d' % diesel)


if __name__ == '__main__':
    main()