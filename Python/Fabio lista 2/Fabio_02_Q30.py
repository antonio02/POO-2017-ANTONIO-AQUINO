def main():
    num = int(input('Digite o numero: '))

    dez1 = num // 100
    dez2 = num % 100
    soma = (dez1 + dez2)**2

    if soma == num:
        print('Esse numero dividido em duas dezenas e elas somadas e elevadas a 2, o resultado é igual ao proprio numero')
    else:
        print('O numero não obedece a regra')

if __name__ == '__main__':
    main()