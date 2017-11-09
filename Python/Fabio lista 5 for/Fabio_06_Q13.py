def main():

    nome = input('Digite do nome: ')

    bio = nome[0] + '.'
    biografia = ''

    for i in range(len(nome)):

        if nome[i] == ' ' and nome[i+1] + nome[i+2] != 'de':
            bio += nome [i+1] + '.'

    for i in range(0, len(bio) -2):

        biografia += bio[i]

    x = nome.split()
    sobrenome = x[len(x) -1] + ','

    print(sobrenome, biografia)


if __name__ == '__main__':
    main()