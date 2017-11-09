def main():

    nome = input('Digite um nome: ')
    primeiro_nome = ''
    sobre = ''

    for i in nome:
        primeiro_nome += i
        if i == ' ':
            break

    for i in range(len(nome) -1, -1, -1):
        if nome[i] == ' ':
            break
        sobre += nome[i]

    sobrenome = ''

    for i in range(len(sobre) -1, -1, -1):
        sobrenome += sobre[i]

    print(sobrenome + '/' + primeiro_nome)


if __name__ == '__main__':
    main()