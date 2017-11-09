def main():
    entrada = input()

    cod    = int(entrada.split()[0])
    quanti = int(entrada.split()[1])

    if cod == 1:
        print('Total: R$ %.2f' % (quanti * 4))
    if cod == 2:
        print('Total: R$ %.2f' % (quanti * 4.50))
    if cod == 3:
        print('Total: R$ %.2f' % (quanti * 5))
    if cod == 4:
        print('Total: R$ %.2f' % (quanti * 2))
    if cod == 5:
        print('Total: R$ %.2f' % (quanti * 1.50))


if __name__ == '__main__':
    main()