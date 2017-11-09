#Apresentação
print('Calcular a quantidade de dinheiro que um fumante gastou com cigarros')
print('--------------------------------------------------------------------')

#Valores

anos = int(input('Informe a quantos anos ele fuma: '))
cdias = int(input('Informe a quantidade aproximadada de cigarros fumados por dia: '))
mvalor = float(input('Informe o valor da carteira de cigarros em R$: '))

#Calculos

dias = anos * 365
totalc = dias * cdias
cvalor = mvalor / 20
gasto = totalc * cvalor

#Saida

print('O gasto total com cigarros é de:', "%.2f" % gasto,'R$')
