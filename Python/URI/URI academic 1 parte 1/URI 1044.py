def main():
    valores = input()

    a = int(valores.split()[0])
    b = int(valores.split()[1])

    if a % b == 0 or b % a == 0:
        print('Sao Multiplos')
    else:
        print('Nao sao Multiplos')


if __name__ == '__main__':
    main()