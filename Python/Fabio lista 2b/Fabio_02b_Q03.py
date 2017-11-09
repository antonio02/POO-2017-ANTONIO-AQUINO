def main():
    letra = input('Digite uma letra: ')

    if letra == 'a' or  letra == 'e' or letra == 'i' or letra == 'o' or letra == 'u':
        print('Vogal')
    elif letra == 'A' or  letra == 'E' or letra == 'I' or letra == 'O' or letra == 'U':
        print('Vogal')
    else:
        print('Consoante')


if __name__ == '__main__':
    main()