def main():
    print('---------------------------------------------------')
    print('Tipos de carne: F - File, A - Alcatra e P - Picanha')
    print('---------------------------------------------------')
    tipo = input('Digite o tipo da carne pela letra: ')
    quanti = float(input('Digite a quantidade de carne em kg: '))
    cartao = input('A compra sera paga com cartão tabajara?: ')

    if tipo == 'F' or tipo == 'f':
        if quanti <= 5:
            valor = quanti * 4.9
        else:
            valor = quanti * 5.8
        tipo = 'FILE'
    elif tipo == 'A' or tipo == 'a':
        if quanti <= 5:
            valor = quanti * 5.9
        else:
            valor = quanti * 6.8
        tipo = 'ALCATRA'
    elif tipo == 'P' or tipo == 'p':
        if quanti <= 5:
            valor = quanti * 6.9
        else:
            valor = quanti * 7.8
        tipo = 'PICANHA'
    else:
        print()
        print('TIPO DE CARNE INVALIDO')
        main()

    if cartao == 'SIM' or cartao == 'Sim' or cartao == 'sim':
        valort = valor - ((valor * 5) / 100)
        desconto = 5
        pagamento = 'CARTÃO TABAJARA'
    else:
        valort = valor
        desconto = 0
        pagamento = 'DINHEIRO'

    print('------------------------------------------------------------')
    print('CUPOM FISCAL')
    print('------------------------------------------------------------')
    print('Tipo de carne escolhida                    : %s' % tipo)
    print('Preço total                                : R$ %.2f' % valor)
    print('Tipo de pagamento                          : %s' % pagamento)
    print('Valor do desconto                          : %d' % desconto, '%')
    print('Valor a pagar                              : R$ %.2f' % valort)


if __name__ == '__main__':
    main()