def main():
    nota1 = float(input('Digite a primeira nota: '))
    nota2 = float(input('Digite a segunda nota: '))

    media = (nota1 + nota2) / 2

    if media >= 7:
        print('APROVADO')
    else:
        print('ALUNO EM EXAME')
        nexame = float(input('Digite a nota do exame: '))
        media_total = (media + nexame) / 2

        if media_total >= 5:
            print('ALUNO APROVADO POR EXAME FINAL')
        else:
            print('ALUNO REPROVADO')


if __name__ == '__main__':
    main()