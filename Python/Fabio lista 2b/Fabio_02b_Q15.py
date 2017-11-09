def main():
    kgmorango = float(input('Digite a quantidade de morangos em kg: '))
    kgmaca    = float(input('Digite a quantidade de maçãs em kg: '))


    if kgmorango <= 5:
        valor1 = kgmorango * 2.5
    else:
        valor1 = kgmorango * 2.2
    if kgmaca <= 5:
        valor2 = kgmaca * 1.8
    else:
        valor2 = kgmaca * 1.5

    valor_total = valor1 + valor2

    if kgmorango + kgmaca > 8 or valor_total > 25:
        valor_total = valor_total - ((valor_total * 10) / 100)

    print('Valor a ser pago: R$ %.2f' % valor_total)



if __name__ == '__main__':
    main()