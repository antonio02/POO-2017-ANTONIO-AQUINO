#Apresentação

print('Calcular um sistema de uma entrada e duas prestações em uma compra')
print('------------------------------------------------------------------')

#Valores

valor = float(input('Digite o valor da compra: '))

#Calculos

divisao  = valor // 3
rdivisao = valor - divisao * 3
entrada  = divisao + rdivisao

#Saida

print('Esse valor pode ser parcelado em uma entrada de R$', "%.2f" % entrada,'e duas parcelas de R$', "%.2f" % divisao)