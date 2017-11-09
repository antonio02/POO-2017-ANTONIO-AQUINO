#Apresentação

print('Conversor de idade em dias para anos e meses')
print('--------------------------------------------')

#Valores

dias = int(input('Digite a quantidade de dias: '))

#Calculo

anos = dias // 365
ranos = dias - anos * 365
meses = ranos // 30
rdias = ranos - meses * 30

#Saidas
if anos == 0 and meses == 0 and rdias <= 30:
    print('Para ser convertido o valor precisa ser maior que 30')
if anos == 0 and meses == 1 and rdias == 0:
    print(dias, 'dias equivalem a:', meses, 'mês.')
if anos == 0 and meses == 1 and rdias == 1:
    print(dias, 'dias equivalem a:', meses, 'mês e', rdias, 'dia.')
if anos == 0 and meses == 1 and rdias > 1:
    print(dias, 'dias equivalem a:', meses, 'mês e', rdias, 'dias.')
if anos == 0 and meses > 1 and rdias == 0:
    print(dias, 'dias equivalem a:', meses, 'meses.')
if anos == 0 and meses > 1 and rdias == 1:
    print(dias, 'dias equivalem a:', meses,'meses e', rdias, 'dia.')
if anos == 0 and meses > 1 and rdias > 1:
    print(dias, 'dias equivalem a:', meses, 'meses e', rdias, 'dias.')
if anos == 1 and meses == 0 and rdias == 0:
    print(dias, 'dias equivalem a:', anos, 'ano.')
if anos == 1 and meses == 1 and rdias == 0:
    print(dias, 'dias equivalem a:', anos, 'ano e', meses, 'mês.')
if anos == 1 and meses == 1 and rdias == 1:
    print(dias, 'dias equivalem a:', anos, 'ano,', meses, 'mês e', rdias, 'dia.')
if anos == 1 and meses == 1 and rdias > 1:
    print(dias, 'dias equivalem a:', anos, 'ano,', meses, 'mês e', rdias, 'dias.')
if anos == 1 and meses == 0 and rdias == 1:
    print(dias, 'dias equivalem a:', anos, 'ano e', rdias, 'dia.')
if anos == 1 and meses > 1 and rdias == 0:
    print(dias, 'dias equivalem a:', anos, 'ano e', meses, 'meses.')
if anos == 1 and meses > 1 and rdias == 1:
    print(dias, 'dias equivalem a:', anos, 'ano,', meses, 'meses e', rdias, 'dia.')
if anos == 1 and meses > 1 and rdias > 1:
    print(dias, 'dias equivalem a:', anos, 'ano,', meses, 'meses e', rdias, 'dias.')
if anos == 1 and meses == 0 and rdias > 1:
    print(dias, 'dias equivalem a:', anos, 'ano e', rdias, 'dias.')
if anos > 1 and meses == 0 and rdias == 0:
    print(dias, 'dias equivalem a:', anos, 'anos.')
if anos > 1 and meses == 0 and rdias == 1:
    print(dias, 'dias equivalem a:', anos, 'anos e', rdias, 'dia.')
if anos > 1 and meses == 0 and rdias > 1:
    print(dias, 'dias equivalem a:', anos, 'anos e', rdias, 'dias.')
if anos > 1 and meses == 1 and rdias == 0:
    print(dias, 'dias equivalem a:', anos, 'anos e', meses, 'mês.')
if anos > 1 and meses == 1 and rdias == 1:
    print(dias, 'dias equivalem a:', anos, 'anos,', meses, 'mês e', rdias, 'dia.')
if anos > 1 and meses == 1 and rdias > 1:
    print(dias, 'dias equivalem a:', anos, 'anos,', meses, 'mês e', rdias, 'dias.')
if anos > 1 and meses > 1 and rdias == 0:
    print(dias, 'dias equivalem a:', anos, 'anos e', meses, 'meses.')
if anos > 1 and meses > 1 and rdias == 1:
    print(dias, 'dias equivalem a:', anos, 'anos,', meses, 'meses e', rdias, 'dia.')
if anos > 1 and meses > 1 and rdias > 1:
    print(dias, 'dias equivalem a:', anos, 'anos,', meses, 'meses e', rdias, 'dias.')