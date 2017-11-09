def main():
    print('Calcular IMC')
    altura = float(input('Digite a altura: '))
    peso = float(input('Digite o peso: '))

    imc = peso / (altura**2)

    if imc <= 17:
        print('Abaixo do peso')
    elif imc <= 25:
        print('Peso normal')
    elif imc <= 30:
        print('Obeso')
    else:
        print('Obesidade morbida')


if __name__ == '__main__':
    main()