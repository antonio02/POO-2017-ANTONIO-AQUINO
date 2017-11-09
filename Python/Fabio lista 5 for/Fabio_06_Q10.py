def main():

    palavra = input('Digite uma palavra: ')
    upper_palavra = palavra.upper()
    nova_palavra = ''

    for i in range(len(upper_palavra) -1, -1, -1):
        nova_palavra += upper_palavra[i]

    if upper_palavra == nova_palavra:
        print('Essa palavra é palíndroma')
    else:
        print('Não é palíndroma')



if __name__ == '__main__':
    main()