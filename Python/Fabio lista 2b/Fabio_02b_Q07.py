def main():
    salario = float(input('Digite o salario: '))

    if salario <= 280:
        aumento = (salario * 20) / 100
        novo_salario = salario + aumento
        print('Salario antes do reajuste: R$ %.2f' % salario)
        print('Aumento de 20%' + ': R$ %.2f' % aumento)
        print('Novo salario: R$ %.2f' % novo_salario)
    elif salario <= 700:
        aumento = (salario * 15) / 100
        novo_salario = salario + aumento
        print('Salario antes do reajuste: R$ %.2f' % salario)
        print('Aumento de 15%' + ': R$ %.2f' % aumento)
        print('Novo salario: R$ %.2f' % novo_salario)
    elif salario <= 1500:
        aumento = (salario * 10) / 100
        novo_salario = salario + aumento
        print('Salario antes do reajuste: R$ %.2f' % salario)
        print('Aumento de 10%' + ': R$ %.2f' % aumento)
        print('Novo salario: R$ %.2f' % novo_salario)
    else:
        aumento = (salario * 5) / 100
        novo_salario = salario + aumento
        print('Salario antes do reajuste: R$ %.2f' % salario)
        print('Aumento de 5%' + ': R$ %.2f' % aumento)
        print('Novo salario: R$ %.2f' % novo_salario)


if __name__ == '__main__':
    main()