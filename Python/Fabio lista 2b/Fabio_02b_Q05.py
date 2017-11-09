def main():
    produto1 = float(input('Digite o valor do produto 1: '))
    produto2 = float(input('Digite o valor do produto 2: '))
    produto3 = float(input('Digite o valor do produto 3: '))

    if produto1 <= produto2 and produto1 <= produto3:
        print('O produto mais barato é o primeiro')
    elif produto2 <= produto1 and produto2 <= produto3:
        print('O produto mais barato é o segundo')
    elif produto1 == produto2 == produto3:
        print('Todos tem o mesmo preço')
    else:
        print('O produto mais barato é o terceiro')


if __name__ == '__main__':
    main()