def main():
    salario = float(input())

    aumento15 = (salario * 15) / 100
    aumento12 = (salario * 12) / 100
    aumento10 = (salario * 10) / 100
    aumento7 = (salario * 7) / 100
    aumento4 = (salario * 4) / 100

    if 0 < salario <= 400:
        novosal = salario + aumento15
        print('Novo salario: %.2f' % novosal)
        print('Reajuste ganho: %.2f' % aumento15)
        print('Em percentual: 15 %')
    elif 400 < salario <= 800:
        novosal = salario + aumento12
        print('Novo salario: %.2f' % novosal)
        print('Reajuste ganho: %.2f' % aumento12)
        print('Em percentual: 12 %')
    elif 800 < salario <= 1200:
        novosal = salario + aumento10
        print('Novo salario: %.2f' % novosal)
        print('Reajuste ganho: %.2f' % aumento10)
        print('Em percentual: 10 %')
    elif 1200 < salario <= 2000:
        novosal = salario + aumento7
        print('Novo salario: %.2f' % novosal)
        print('Reajuste ganho: %.2f' % aumento7)
        print('Em percentual: 7 %')
    else:
        novosal = salario + aumento4
        print('Novo salario: %.2f' % novosal)
        print('Reajuste ganho: %.2f' % aumento4)
        print('Em percentual: 4 %')


if __name__ == '__main__':
    main()