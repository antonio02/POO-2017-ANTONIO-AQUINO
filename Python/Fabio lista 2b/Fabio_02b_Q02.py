def main():
    sexo = input('Digite a sigla para o sexo: ')

    if sexo == 'f' or sexo == 'F':
        print('Sexo feminino')
    elif sexo == 'm' or sexo == 'M':
        print('Sexo masculino')
    else:
        print('Sexo invalido')


if __name__ == '__main__':
    main()