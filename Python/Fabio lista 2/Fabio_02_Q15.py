def main():
    vhora1 = int(input('Valor da hora aula do professor 1: '))
    qhora1 = int(input('Quantidade de aulas do professor 1: '))
    vhora2 = int(input('Valor da hora aula do professor 2: '))
    qhora2 = int(input('Quantidade de aulas do professor 2: '))

    sal1 = qhora1 * vhora1
    sal2 = qhora2 * vhora2

    if sal1 > sal2:
        print('O professor 1 tem o maior salario (%.2f reais)' % sal1)
        print('Salario do professor 2: %.2f reais' % sal2)
    elif sal1 == sal2:
        print('Os salario são iguais (%.2f reais)' % sal1)
    else:
        print('O professor 2 tem o maior salario (%.2f reais)' % sal2)
        print('Salario do professor 1: %.2f reais' % sal1)


if __name__ == '__main__':
    main()