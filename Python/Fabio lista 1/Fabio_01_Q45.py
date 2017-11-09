def main():
    valor = float(input())


    nota100  = valor    // 100
    rnota100 = valor    - nota100 * 100
    nota50   = rnota100 // 50
    rnota50  = rnota100 - nota50  * 50
    nota20   = rnota50  // 20
    rnota20  = rnota50  - nota20  * 20
    nota10   = rnota20  // 10
    rnota10  = rnota20  - nota10  * 10
    nota5    = rnota10  // 5
    rnota5   = rnota10  - nota5   * 5
    nota2    = rnota5   // 2
    rnota2   = rnota5 - nota2     * 2
    nota1    = rnota2


    print(valor)
    print(nota100, 'nota(s) de R$ 100,00')
    print(nota50, 'nota(s) de R$ 50,00')
    print(nota20, 'nota(s) de R$ 20,00')
    print(nota10, 'nota(s) de R$ 10,00')
    print(nota5, 'nota(s) de R$ 5,00')
    print(nota2, 'nota(s) de R$ 2,00')
    print(nota1, 'nota(s) de R$ 1,00')


if __name__ == '__main__':
    main()