#Apresentação
print('Calcular o valor de venda final de uma carro pelo custo de fabrica')
print('------------------------------------------------------------------')

#Valores

cfabri = float(input('Digite o custo de fabrica em R$: '))

#Calculo

distri = (cfabri * 28) / 100
imposto = (cfabri * 45) / 100
vfinal = cfabri + distri + imposto

#Saida

print('O valor final de venda é de: R$', "%.2f" % vfinal)

