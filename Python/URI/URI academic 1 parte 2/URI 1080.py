def main():
    x = 0
    lista = []

    while x < 100:
        x = x + 1
        num = int(input())
        lista.append(num)

    maior = max(lista)
    posicao = (lista.index(maior)) + 1
    print(maior)
    print(posicao)


if __name__ == '__main__':
    main()