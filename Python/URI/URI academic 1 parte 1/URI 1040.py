def main():
    valores = input()

    nota1 = float(valores.split()[0])
    nota2 = float(valores.split()[1])
    nota3 = float(valores.split()[2])
    nota4 = float(valores.split()[3])

    media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 4) + (nota4 * 1)) / (2 + 3 + 4 + 1)

    if media >= 7:
        print('Media: %.1f' % media)
        print('Aluno aprovado.')
    elif media < 5:
        print('Media: %.1f' % media)
        print('Aluno reprovado.')
    else:
        print('Media: %.1f' % media)
        print('Aluno em exame.')
        exame = float(input())

        mfinal = (media + exame) / 2

        if mfinal >= 5:
            print('Nota do exame: %.1f' % exame)
            print('Aluno aprovado.')
            print('Media final: %.1f' % mfinal)
        else:
            print('Nota do exame: %.1f' % exame)
            print('Aluno reprovado.')
            print('Media final: %.1f' % mfinal)


if __name__ == '__main__':
    main()