def main():

    testes = int(input())
    total = 0
    total_c = 0
    total_s = 0
    total_r = 0

    while testes != 0:

        testes -= 1
        dados = input()
        quan, tip = dados.split()
        tipo = tip.upper()
        quantidade = int(quan)

        total += quantidade

        if tipo == 'C':
            total_c += quantidade
        elif tipo == 'R':
            total_r += quantidade
        elif tipo == 'S':
            total_s += quantidade
        else:
            print('Tipo invalido')

    percentual_c = (total_c / total) * 100
    percentual_r = (total_r / total) * 100
    percentual_s = (total_s / total) * 100

    print('Total: %d cobaias' % total)
    print('Total de coelhos: %d' % total_c)
    print('Total de ratos: %d' % total_r)
    print('Total de sapos: %d' % total_s)
    print('Percentual de coelhos: %.2f %%' % percentual_c)
    print('Percentual de ratos: %.2f %%' % percentual_r)
    print('Percentual de sapos: %.2f %%' % percentual_s)



if __name__ == '__main__':
    main()