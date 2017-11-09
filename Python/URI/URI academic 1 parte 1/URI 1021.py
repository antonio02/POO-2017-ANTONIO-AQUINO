def main():
    valor = float(input())

    nota100 = valor // 100
    rnota100 = valor   - nota100 * 100
    nota50 = rnota100 // 50
    rnota50 = rnota100 - nota50 * 50
    nota20 = rnota50 // 20
    rnota20 = rnota50 - nota20 * 20
    nota10 = rnota20 // 10
    rnota10 = rnota20 - nota10 * 10
    nota5 = rnota10 // 5
    rnota5 = rnota10 - nota5 * 5
    nota2 = rnota5 // 2
    rnota2 = rnota5 - nota2 * 2
    moeda01 = rnota2 // 1
    rmoeda1 = float('%.2f' % (rnota2 - moeda01 * 1)) * 100
    moeda50 = rmoeda1 // 50
    rmoeda50 = rmoeda1 - moeda50 * 50
    moeda25 = rmoeda50 // 25
    rmoeda25 = rmoeda50 - moeda25 * 25
    moeda10 = rmoeda25 // 10
    rmoeda10 = rmoeda25 - moeda10 * 10
    moeda5 = rmoeda10 // 5
    rmoeda5 = rmoeda10 - moeda5 * 5
    moeda1 = rmoeda5


    print('NOTAS:')
    print('%d nota(s) de R$ 100.00' % nota100)
    print('%d nota(s) de R$ 50.00' % nota50)
    print('%d nota(s) de R$ 20.00' % nota20)
    print('%d nota(s) de R$ 10.00' % nota10)
    print('%d nota(s) de R$ 5.00' % nota5)
    print('%d nota(s) de R$ 2.00' % nota2)
    print('MOEDAS:')
    print('%d moeda(s) de R$ 1.00' % moeda01)
    print('%d moeda(s) de R$ 0.50' % moeda50)
    print('%d moeda(s) de R$ 0.25' % moeda25)
    print('%d moeda(s) de R$ 0.10' % moeda10)
    print('%d moeda(s) de R$ 0.05' % moeda5)
    print('%d moeda(s) de R$ 0.01' % moeda1)


if __name__ == '__main__':
    main()