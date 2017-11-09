def main():

    tamanho = int(input())
    nx = []

    numeros = input()
    valores = numeros.split()

    for i in valores:
        nx.append(int(i))

    menor = min(nx)
    print('Menor valor: %d' % menor)
    print('Posicao: %d' % nx.index(menor))


if __name__ == '__main__':
    main()