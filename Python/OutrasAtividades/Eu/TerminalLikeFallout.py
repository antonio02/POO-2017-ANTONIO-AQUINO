import os
import platform
from time import sleep

def main():
    introducao = '---ROBCO INDUSTRIES UNIFIED OPERATING SYSTEM---\n'\
                 '------COPYRIGHT 2075-2077 ROBCO INDUSTRIES-----\n\n'\
                 '> BATTERY: 50%\n'\
                 '> 00:54 - QUARTA-FEIRA - 04.10.2017\n'\
                 '> TEMPERATURA: 39°'

    printfall(introducao,0.02)
    input('\nEnd...')


def printfall(texto,tempo=0.03):
    novotexto = ''

    for i in range(0,len(texto),2):

        novotexto += texto[i]
        if i != len(texto)-1:
            novotexto += texto[i+1]

        if i == len(texto)-1 or i == len(texto)-2:
            print(novotexto)
            return
        else:
            print('\033[0;32;0m'+novotexto+'\033[m' + '█')
            sleep(tempo)
            if platform.system() == 'Windows':
                os.system('cls')
            else:
                os.system('clear')


if __name__ == '__main__':
    main()