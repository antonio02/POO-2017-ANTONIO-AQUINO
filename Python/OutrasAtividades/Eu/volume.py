import platform
import os

def main():

    caixa = ['┌─┐╱│ ','│ │ │ ','└─┘╲│ ']
    barra = ['┌─┐ ','│ │ ','└─┘ ']
    volume = [[caixa[0]], [caixa[1]],[caixa[2]]]

    while True:

        printar_volume(volume)
        opcao = input('Aumentar ou diminuir: ').upper()

        if opcao == 'A':
            if volume_max(volume):
                print('O volume ja esta no maximo')
                input('Continuar...')
            else:
                aumentar(volume,barra)

        elif opcao == 'D':
            if volume_min(volume):
                print('O volume ja esta no minimo')
                input('Continuar...')
            else:
                diminuir(volume)

        else:
            print('Opcao invalida')

        limpar()


def aumentar(volume,barra):
    contador = 0
    for i in volume:
        i.append(barra[contador])
        contador += 1


def diminuir(volume):
    for i in volume:
        i.__delitem__(len(i)-1)


def volume_max(volume):
    for i in volume:
        if len(i) > 10:
            return True
        else:
            return False


def volume_min(volume):
    for i in volume:
        if len(i) < 2:
            return True
        else:
            return False


def printar_volume(volume):
    for i in volume:
        for j in i:
            print(j, end= '')
        print()


def limpar():
    if platform.system() == 'Windows':
        os.system('cls')
    else:
        os.system('clear')


if __name__ == '__main__':
    main()