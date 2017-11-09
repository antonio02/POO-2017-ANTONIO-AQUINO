def main():
    senha = int(input('Digite a sua senha: '))

    if senha == 1234:
        print('Acesso permitido')
    else:
        print('Acesso negado')


if __name__ == '__main__':
    main()