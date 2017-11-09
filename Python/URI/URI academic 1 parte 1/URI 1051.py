def main():
    salario = float(input())

    if 0 < salario <= 2000:
        print('Isento')
    elif 2000 < salario <= 3000:
        imposto1 = ((salario - 2000) * 8) / 100
        print('R$ %.2f' % imposto1)
    elif 3000 < salario <= 4500:
        imposto2 = (((salario - 3000) * 18) / 100) + 80
        print('R$ %.2f' % imposto2)
    else:
        imposto3 = (((salario - 4500) * 28) / 100) + 350
        print('R$ %.2f' % imposto3)


if __name__ == '__main__':
    main()