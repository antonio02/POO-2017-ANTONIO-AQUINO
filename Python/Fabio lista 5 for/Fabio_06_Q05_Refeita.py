def main():

    data = input('Digite uma data no formato DD/MM/AAAA: ')

    dia, m, ano = data.split('/')
    mes = int(m) -1
    meses = ['Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto',
            'Setembro','Outubro','Novembro','Dezembro',]

    if mes > 12 or int(dia) > 31:
        print('Data Incorreta')
    else:
        mes = meses[mes]
        print('%s de %s de %s' % (dia, mes, ano))


if __name__ == '__main__':
    main()