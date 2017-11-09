import random

def main():

    nome = input('Digite o seu primeiro nome: ')
    novo_nome = ''
    vogais = 'aeiou'
    consoantes = 'bcdfghjklmnpqrstvwxyz'
    y = 0

    for i in nome:

        novo_nome += i
        if len(novo_nome) > len(nome) - 3:
            break

    z = novo_nome

    while len(novo_nome) < len(nome) + 1:
        if novo_nome[len(novo_nome) -1] in vogais:
            x = random.randint(0,20)
            novo_nome += consoantes[x]
        if novo_nome[len(novo_nome) -1] in consoantes:
            x = random.randint(0,4)
            novo_nome += vogais[x]
        if len(novo_nome) > len(nome):
            print(novo_nome)
            novo_nome = z
            y += 1
            if y == 5:
                break



if __name__ == '__main__':
    main()