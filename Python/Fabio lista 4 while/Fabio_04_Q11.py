def main():

    matricula = 1
    aprovados = 0
    reprovados = 0

    while matricula != 0:

        matricula = int(input('Digite a matricula do aluno: '))
        if matricula == 0:
            break
        nota1 = float(input('Digite a primeira nota do aluno: '))
        nota2 = float(input('Digite a segunda nota do aluno: '))
        nota3 = float(input('Digite a terceira nota do aluno: '))

        media_final = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10

        if media_final >= 7:
            aprovados += 1
        elif media_final < 7:
            reprovados += 1

    print()
    print('Quantidade de alunos aprovados: %d' % aprovados)
    print('Quantidade de alunos reprovados: %d' % reprovados)


if __name__ == '__main__':
    main()