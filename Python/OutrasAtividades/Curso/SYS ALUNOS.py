import os
import platform

def main():
    apagar_tela()
    # banco de dados
    alunos = []

    while True:

        opcao = int(input(menu()))

        if opcao == 1:
            novo_aluno(alunos)
        elif opcao == 2:
            listar_alunos(alunos)
        elif opcao == 3:
            remover_aluno(alunos)
        elif opcao == 4:
            buscar_matricula(alunos)
        elif opcao == 5:
            buscar_nome(alunos)
        elif opcao == 6:
            editar_aluno(alunos)
        elif opcao == 0:
            apagar_tela()
            print('Bye..')
            break
        else:
            print('Opcao invalida!')

        input('continuar...')
        apagar_tela()


def novo_aluno(alunos):
    apagar_tela()

    print('----------------Incluir novo aluno----------------')
    aluno = {}

    aluno['Nome'] = input('Digite o nome do Aluno: ')
    aluno['Matricula'] = input('Digite a matricula do Aluno: ').upper()

    while matriculado(alunos, aluno['Matricula']):
        print('Essa matricula ja existe. Digite outra.')
        aluno['Matricula'] = input('Digite a matricula do Aluno: ').upper()

    aluno['Curso'] = input('Digite o curso do Aluno: ')
    alunos.append(aluno)
    print('> ALUNO ADICIONADO AO SISTEMA\n')


def listar_alunos(alunos):
    apagar_tela()

    print('----------------Alunos matriculados----------------')
    for dados in alunos:

        for informacao in dados:
            print('//'+informacao+':', dados[informacao], end=' ')
        print()

    print()

def remover_aluno(alunos):
    apagar_tela()

    print('----------------Remover aluno (pesquisa por matricula)----------------')
    matricula = input('Digite a matricula do aluno: ').upper()

    if matriculado(alunos, matricula):
        print('Matricula encontrada!')
        resposta = input('Essa operação não pode ser desfeita. Realmente deseja continuar? (s ou n)\n > ')

        if resposta.upper() == 'N':
            print('Voltando ao Menu...\n')
            return

    for dados in alunos:
        for informacao in dados:

            if informacao == 'Matricula' and dados[informacao] == matricula:
                print(dados['Nome'], 'removido do sistema\n')
                alunos.__delitem__(alunos.index(dados))
                return

    print('Aluno não encontrado.\n')

def buscar_matricula(alunos):
    apagar_tela()

    print('----------------Buscar aluno por matricula----------------')
    matricula = input('Digite a matricula do aluno: ').upper()

    for dados in alunos:
        for informacao in dados:

            if informacao == 'Matricula' and dados[informacao] == matricula:
                print('Aluno encontrado !\n---------------------------------------')
                print('Nome do aluno: %s' % dados['Nome'])
                print('Matricula do aluno: %s' % dados['Matricula'])
                print('Curso do aluno: %s\n' % dados['Curso'])
                return

    print('Aluno não encontrado.\n')

def buscar_nome(alunos):
    apagar_tela()

    print('----------------Buscar aluno(s) por nome----------------')
    nome = input('Digite o nome do aluno: ').upper()
    encontrados = 0

    for dados in alunos:
        for informacao in dados:

            if informacao == 'Nome' and nome in dados[informacao].upper():
                print('Nome do aluno: %s //' % dados['Nome'], end=' ')
                print('Matricula do aluno: %s //' % dados['Matricula'], end = ' ')
                print('Curso do aluno: %s' % dados['Curso'])
                encontrados += 1

    print('%s aluno(s) encontrado(s)\n' % encontrados)

def editar_aluno(alunos):
    apagar_tela()

    print('----------------Editar aluno (busca por matricula)----------------')
    matricula = input('Digite a matricula do aluno: ').upper()

    if matriculado(alunos, matricula):
        print('Matricula encontrada!')
        resposta = input('Realmente deseja continuar? (s ou n)\n > ')

        if resposta.upper() == 'N':
            print('Voltando ao Menu...\n')
            return

    for dados in alunos:
        for informacao in dados:

            if informacao == 'Matricula' and dados[informacao] == matricula:
                dados['Nome'] = input('Nome anterior: %s\nDigite o novo nome: ' % dados['Nome'])
                matricula2 = input('Matricula anterior: %s\nDigite a nova matricula: ' % dados['Matricula']).upper()

                while matriculado(alunos,matricula2):
                    if matricula == matricula2:
                        break

                    print('Essa matricula ja existe. Digite outra.')
                    matricula2 = input('Digite a nova matricula: ').upper()


                dados['Matricula'] = matricula2
                dados['Curso'] = input('Curso anterior: %s\nDigite a novo curso: ' % dados['Curso'])
                print('Os dados foram modificados!\n')
                return

    print('Matricula não encontrada.\n')

def matriculado(alunos, matricula):
    for dados in alunos:
        for informacao in dados:
            if informacao == 'Matricula' and dados[informacao] == matricula:
                return True

    return False

def apagar_tela():
    if platform.system() == 'Windows':
        os.system('cls')
    else:
        os.system('clear')


def menu():
    return '\n***** SysAlunos *****\n'\
           '1 - Novo Aluno\n'\
           '2 - Listar Alunos\n'\
           '3 - Remover pela matricula\n'\
           '4 - Buscar pela matricula\n'\
           '5 - Buscar pelo nome\n'\
           '6 - Editar aluno\n'\
           '0 - Sair\n'\
           '\nop >>>'


if __name__ == '__main__':
    main()