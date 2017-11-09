import platform
import os


def main():
    limpar_tela()
    carros = inicializar()

    while True:

        opcao = int(input(menu()))

        if opcao == 1:
            novo_veiculo(carros)
        elif opcao == 2:
            listar_veiculos(carros)
        elif opcao == 3:
            media_idade_veiculos(carros)
        elif opcao == 4:
            listar_por_motorizacao(carros)
        elif opcao == 5:
            valor_medio_veiculos(carros)
        elif opcao == 6:
            maiscaro_maisbarato(carros)
        elif opcao == 0:
            limpar_tela()
            sair = input('Realmente deseja sair? (s ou n) : ').upper()
            if sair == 'N':
                pass
            else:
                break

        input('\nContinuar...')
        limpar_tela()
        guardar_dados(carros)


def novo_veiculo(carros):
    limpar_tela()
    carro = {}
    print('\n───────── CADASTRAR NOVO VEICULO ─────────\n')

    carro['Nome'] = input('> Digite o nome do veiculo: ')
    carro['Fabricante'] = input('> Digite o nome da fabricante: ')
    carro['Cor'] = input('> Digite a cor do veiculo: ')
    carro['Ano'] = input('> Digite o ano de fabricação do veiculo: ')
    carro['Motor'] = input('> Digite o motor do carro (ex: 1.0, 1.6): ')
    carro['Valor'] = input('> Digite o valor do veiculo sem os centavos (R$): ')
    print('\n VEICULO CADASTRADO')
    carros.append(carro)


def listar_veiculos(carros):
    limpar_tela()
    print('┌───────────────────────────────────────────────────────────────────┐')
    print('├───────────────── VEICULOS CADASTRADOS NO SISTEMA ─────────────────┤')
    print('├────┬──────────────┬──────────────┬──────────┬────┬─────┬──────────┤')
    print('│ N# │     Nome     │  Fabricante  │   Cor    │Ano │Motor│  Valor   │')
    print('├────┼──────────────┼──────────────┼──────────┼────┼─────┼──────────┤')

    quantidade = 1
    for carro in carros:
        print('│', end='')
        print(listinha(str(quantidade), 5), end='')
        print(listinha(carro['Nome'], 15), end='')
        print(listinha(carro['Fabricante'], 15), end='')
        print(listinha(carro['Cor'], 11), end='')
        print(listinha(carro['Ano'], 5), end='')
        print(listinha(carro['Motor'], 6), end='')
        print('R$ ' + listinha(carro['Valor'], 8))
        print('├────┼──────────────┼──────────────┼──────────┼────┼─────┼──────────┤')
        quantidade += 1

    print('└────┴──────────────┴──────────────┴──────────┴────┴─────┴──────────┘ ')


def media_idade_veiculos(carros):
    limpar_tela()

    idade_soma = 0

    for carro in carros:
        idade_soma += 2017 - int(carro['Ano'])

    media_idade = idade_soma // len(carros)

    print('\n > A media de idade dos veiculos é: %d anos' % media_idade)


def listar_por_motorizacao(carros):
    limpar_tela()

    motorizacao = input('> Digite a motorização desejada (ex:1.4, 1.6): ')
    limpar_tela()

    saida = '├────┬──────────────┬──────────────┬──────────┬────┬─────┬──────────┤\n'\
            '│ N# │     Nome     │  Fabricante  │   Cor    │Ano │Motor│  Valor   │\n'\
            '├────┼──────────────┼──────────────┼──────────┼────┼─────┼──────────┤\n'

    quantidade = 1
    for carro in carros:

        if float(carro['Motor']) == float(motorizacao):
            saida += '│' + listinha(str(quantidade), 5)
            saida += listinha(carro['Nome'], 15)
            saida += listinha(carro['Fabricante'], 15)
            saida += listinha(carro['Cor'], 11)
            saida += listinha(carro['Ano'], 5)
            saida += listinha(carro['Motor'], 6)
            saida += 'R$ ' + listinha(carro['Valor'], 8) + '\n'
            saida += '├────┼──────────────┼──────────────┼──────────┼────┼─────┼──────────┤\n'
            quantidade += 1

    if quantidade == 1:
        print('\nNenhum veiculo com essa motorização cadastrado.')
    else:
        print('┌───────────────────────────────────────────────────────────────────┐')
        print('├────────────────── VEICULOS COM MOTORIZAÇÃO %s ───────────────────┤'% motorizacao)
        saida += '└────┴──────────────┴──────────────┴──────────┴────┴─────┴──────────┘'
        print(saida)


def valor_medio_veiculos(carros):
    limpar_tela()

    valor_soma = 0

    for carro in carros:
        valor_soma += float(carro['Valor'])

    media_valor = valor_soma / len(carros)

    print('\n> O preço medio dos veiculos cadastrados é: R$ %.2f' % media_valor)


def maiscaro_maisbarato(carros):
    limpar_tela()
    maiscaro = int(carros[0]['Valor'])
    maisbarato = int(carros[0]['Valor'])

    for carro in carros:
        if int(carro['Valor']) > maiscaro:
            maiscaro = int(carro['Valor'])
        if int(carro['Valor']) < maisbarato:
            maisbarato = int(carro['Valor'])

    print('┌───────────────────────────────────────────────────────────────────┐')
    print('├──────────────────── VEICULO(s) MAIS CARO(s) ──────────────────────┤')
    print('├────┬──────────────┬──────────────┬──────────┬────┬─────┬──────────┤')
    print('│ N# │     Nome     │  Fabricante  │   Cor    │Ano │Motor│  Valor   │')
    print('├────┼──────────────┼──────────────┼──────────┼────┼─────┼──────────┤')

    quantidade = 1
    for carro in carros:
        if carro['Valor'] == str(maiscaro):
            print('│', end='')
            print(listinha(str(quantidade), 5), end='')
            print(listinha(carro['Nome'], 15), end='')
            print(listinha(carro['Fabricante'], 15), end='')
            print(listinha(carro['Cor'], 11), end='')
            print(listinha(carro['Ano'], 5), end='')
            print(listinha(carro['Motor'], 6), end='')
            print('R$ ' + listinha(carro['Valor'], 8))
            quantidade += 1
            print('├────┼──────────────┼──────────────┼──────────┼────┼─────┼──────────┤')
    print('└────┴──────────────┴──────────────┴──────────┴────┴─────┴──────────┘ ')

    input('\nEnter para ver o(s) mais barato(s)...')
    limpar_tela()

    print('┌───────────────────────────────────────────────────────────────────┐')
    print('├─────────────────── VEICULO(s) MAIS BARATO(s) ─────────────────────┤')
    print('├────┬──────────────┬──────────────┬──────────┬────┬─────┬──────────┤')
    print('│ N# │     Nome     │  Fabricante  │   Cor    │Ano │Motor│  Valor   │')
    print('├────┼──────────────┼──────────────┼──────────┼────┼─────┼──────────┤')

    quantidade = 1
    for carro in carros:
        if carro['Valor'] == str(maisbarato):
            print('│', end='')
            print(listinha(str(quantidade), 5), end='')
            print(listinha(carro['Nome'], 15), end='')
            print(listinha(carro['Fabricante'], 15), end='')
            print(listinha(carro['Cor'], 11), end='')
            print(listinha(carro['Ano'], 5), end='')
            print(listinha(carro['Motor'], 6), end='')
            print('R$ ' + listinha(carro['Valor'], 8))
            quantidade += 1
            print('├────┼──────────────┼──────────────┼──────────┼────┼─────┼──────────┤')
    print('└────┴──────────────┴──────────────┴──────────┴────┴─────┴──────────┘ ')


def inicializar():
    if os.path.isfile('Carros.cc'):

        arquivo = open('Carros.cc').readlines()
        carros = []

        for dados in arquivo:
            carro = {}
            dados.strip()
            carro['Nome'] = dados.split('#')[0]
            carro['Fabricante'] = dados.split('#')[1]
            carro['Cor'] = dados.split('#')[2]
            carro['Ano'] = dados.split('#')[3]
            carro['Motor'] = dados.split('#')[4]
            carro['Valor'] = dados.split('#')[5]

            carros.append(carro)

        return carros

    else:
        return []


def guardar_dados(carros):
    arquivo = open('Carros.cc', 'w')

    for carro in carros:
        for dados in carro:
            arquivo.write(carro[dados] + '#')
        arquivo.write('\n')

    arquivo.close()


def limpar_tela():
    if platform.system() == 'Windows':
        os.system('cls')

    else:
        os.system('clear')


def listinha(palavra, tam):
    if len(palavra) > tam - 1:
        nova_palavra = ''
        for index in range(len(palavra)):
            if index == tam - 4:
                break
            nova_palavra += palavra[index]

        nova_palavra += '...│'
        return nova_palavra

    else:
        for index in range(len(palavra), tam - 1):
            palavra += ' '

        palavra += '│'
        return palavra


def menu():
    return '┌─────────────────────────────────────────────────────┐\n' \
           '├────── SYSCAR: Sistema de cadastro de veículos ──────┤\n' \
           '├─────────────────────────────────────────────────────┤\n' \
           '├> 1 - Cadastrar novo veículo                         │\n' \
           '├> 2 - Listar todos os veículos                       │\n' \
           '├> 3 - Media de idade dos veículos                    │\n' \
           '├> 4 - Listar veículos por motorização                │\n' \
           '├> 5 - Valor médio dos veículos                       │\n' \
           '├> 6 - Veículo mais caro e mais barato                │\n' \
           '├> 0 - Sair                                           │\n' \
           '└─────────────────────────────────────────────────────┘\n' \
           '\n OP → '


if __name__ == '__main__':
    main()
