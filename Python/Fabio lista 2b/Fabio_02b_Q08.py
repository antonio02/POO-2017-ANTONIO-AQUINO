def main():
    hora = float(input('Digite o valor da hora: '))
    trab = int(input('Digite a quantidade de horas trabalhadas: '))

    salario_bruto = hora * trab
    desconto_sindi = (salario_bruto * 3) / 100
    desconto_fgts = (salario_bruto * 11) / 100
    desconto_inss = (salario_bruto *10) / 100

    if salario_bruto <= 900:
        print('Salario bruto: (%.2f * %d)   : R$ %.2f' % (hora, trab, salario_bruto))
        print('(-) Sindicato (3%' + ')           : R$ %.2f' % desconto_sindi)
        print('(-) INSS (10%' + ')               : R$ %.2f' % desconto_inss)
        print('FGTS (11%' + ')                   : R$ %.2f' % desconto_fgts)
        print('Total de descontos           : R$ %.2f' % (desconto_sindi + desconto_inss))
        print('Salario liquido              : R$ %.2f' % (salario_bruto - desconto_sindi - desconto_inss))
    else:
        if salario_bruto <= 1500:
            desconto_ir = (salario_bruto * 5) / 100
            print('Salario bruto: (%.2f * %d)   : R$ %.2f' % (hora, trab, salario_bruto))
            print('(-) IR (5%'+')                  : R$ %.2f' % desconto_ir)
            print('(-) Sindicato (3%'+')           : R$ %.2f' % desconto_sindi)
            print('(-) INSS (10%'+')               : R$ %.2f' % desconto_inss)
            print('FGTS (11%'+')                   : R$ %.2f' % desconto_fgts)
            print('Total de descontos           : R$ %.2f' % (desconto_sindi + desconto_inss + desconto_ir))
            print('Salario liquido              : R$ %.2f' % (salario_bruto - desconto_ir - desconto_sindi - desconto_inss))
        elif salario_bruto <= 2500:
            desconto_ir = (salario_bruto * 10) / 100
            print('Salario bruto: (%.2f * %d)   : R$ %.2f' % (hora, trab, salario_bruto))
            print('(-) IR (10%' + ')                  : R$ %.2f' % desconto_ir)
            print('(-) Sindicato (3%' + ')           : R$ %.2f' % desconto_sindi)
            print('(-) INSS (10%' + ')               : R$ %.2f' % desconto_inss)
            print('FGTS (11%' + ')                   : R$ %.2f' % desconto_fgts)
            print('Total de descontos           : R$ %.2f' % (desconto_sindi + desconto_inss + desconto_ir))
            print('Salario liquido              : R$ %.2f' % (salario_bruto - desconto_ir - desconto_sindi - desconto_inss))
        else:
            desconto_ir = (salario_bruto * 20) / 100
            print('Salario bruto: (%.2f * %d)   : R$ %.2f' % (hora, trab, salario_bruto))
            print('(-) IR (20%' + ')                  : R$ %.2f' % desconto_ir)
            print('(-) Sindicato (3%' + ')           : R$ %.2f' % desconto_sindi)
            print('(-) INSS (10%' + ')               : R$ %.2f' % desconto_inss)
            print('FGTS (11%' + ')                   : R$ %.2f' % desconto_fgts)
            print('Total de descontos           : R$ %.2f' % (desconto_sindi + desconto_inss + desconto_ir))
            print('Salario liquido              : R$ %.2f' % (salario_bruto - desconto_ir - desconto_sindi - desconto_inss))

if __name__ == '__main__':
    main()