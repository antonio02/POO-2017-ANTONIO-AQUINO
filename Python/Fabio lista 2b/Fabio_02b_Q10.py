def main():
    nota1 = float(input('Digite a primeira nota: '))
    nota2 = float(input('Digite a segunda nota: '))

    media = (nota1 + nota2) / 2

    if media >= 9:
        nota = 'A'
    elif media >= 7.5:
        nota = 'B'
    elif media >= 6:
        nota = 'C'
    elif media >= 4:
        nota = 'D'
    elif media < 4:
        nota = 'E'

    if nota == 'A' or nota == 'B' or nota == 'C':
        print('Nota:', nota)
        print('APROVADO')
    else:
        print('Nota:', nota)
        print('REPROVADO')


if __name__ == '__main__':
    main()