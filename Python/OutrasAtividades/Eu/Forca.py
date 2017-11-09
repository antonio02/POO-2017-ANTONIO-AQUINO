from random import randint as random
import os
import platform

def main():

    while True:
        limpar_tela()
        palavra, dica = inicializar()
        opcao = int(input(menu()))

        if opcao == 1:
            novo_jogo(palavra,dica)
        elif opcao == 0:
            break
        else:
            print('Opção invalida')


def novo_jogo(palavra,dica):
    crip = '-' * len(palavra)
    forca = ['┌────┐', '│    ', '│   ', '│   ', '│      ']
    boneco = [[' '], ['O'], ['/', '│', '\\'], ['/', ' ', '\\'], [' ']]
    erros = 6
    while True:
        limpar_tela()
        print()
        printboneco(forca,boneco)
        print()
        print('Dica: %s' % dica)
        print('>> %s' % crip)
        print('Numero de tentativas restantes: %d' % erros)
        letra = input('\nDigite uma letra: ')
        if verificar_letra(palavra,letra):
            crip = revelar_letras(crip,palavra,letra)

        else:
            erro(boneco)
            erros -= 1
            if erros == 0:
                limpar_tela()
                printboneco(forca,boneco)

                print('\nFIM DE JOGO!')
                input('Continuar...')
                return

        if '-' not in crip:
            limpar_tela()
            print('A palavra era: %s' % crip)
            print('\nVOCÊ GANHOU!')
            input('Continuar...')
            return


def revelar_letras(crip,palavra,letra):
    novo_crip = ''
    for i in range(len(palavra)):
        if palavra[i].upper() == letra.upper():
            novo_crip += letra
        else:
            novo_crip += crip[i]

    return novo_crip


def verificar_letra(palavra, letra):
    if letra.upper() in palavra.upper():
          return True
    return False



def inicializar():
    palavras = open('Palavras.txt').readlines()
    palavra, dica = palavras[random(0,len(palavras)-1)].strip().split('$')
    return palavra,dica


def limpar_tela():
    if platform.system() == 'Windows':
        os.system('cls')
    else:
        os.system('clear')


def printboneco(forca, boneco):
    for index in range(len(forca)):
        print(forca[index], end='')
        for i in boneco[index]:
            print(i, end='')
        print()


def erro(boneco):
    for index in range(len(boneco)-1,-1,-1):
        for i in range(len(boneco[index])):
            if boneco[index][i] != ' ':
                boneco[index][i] = ' '
                return


def menu():
    return '┌─────────────────────────────────────────────┐\n' \
           '├─────────────── JOGO DA FORCA ───────────────┤\n' \
           '├─────────────────────────────────────────────┤\n' \
           '│   ┌────┐                                    │\n' \
           '│   │    O                                    │\n' \
           '│   │   /│\                                   │\n' \
           '│   │   / \                                   │\n' \
           '│   │                                         │\n' \
           '│                                             │\n' \
           '├>(1) Novo Jogo                               │\n'\
           '├>(0) Sair                                    │\n'\
           '└─────────────────────────────────────────────┘\n'\
           '\n OP >>> '



if __name__ == '__main__':
    main()