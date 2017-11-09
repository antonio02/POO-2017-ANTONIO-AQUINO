def main():
    litros = float(input('Digite a quantidade de litros vendida: '))
    tipo   = input('Digite o tipo de combustivel (A ou G): ')

    precog = 2.50
    precoa = 1.9

    if tipo == 'a' or tipo == 'A':
        if litros <= 20:
            total = litros * precoa - ((litros * precoa) * 3) / 100
            print('Valor a pagar: R$ %.2f' % total)
        else:
            total = litros * precoa - ((litros * precoa) * 5) / 100
            print('Valor a pagar: R$ %.2f' % total)
    elif tipo == 'g' or tipo == 'G':
        if litros <= 20:
            total = litros * precog - ((litros * precog) * 4) / 100
            print('Valor a pagar: R$ %.2f' % total)
        else:
            total = litros * precog - ((litros * precog) * 6) / 100
            print('Valor a pagar: R$ %.2f' % total)
    else:
        print('Tipo de combustivel invalido')


if __name__ == '__main__':
    main()