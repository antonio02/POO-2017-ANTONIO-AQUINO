#Apresentação

print('Calcular a quantidade de cobre e zinco contida em certo peso de latão')
print('---------------------------------------------------------------------')

#Valor

peso = float(input('Digite o peso do latão em Kg: '))

#Calculos

cobre = (peso * 70) / 100
zinco = (peso * 30) / 100

#Saida

print('A quantidade de cobre e zinco contida em', peso,'Kg de latão é de:', cobre,'Kg de cobre e', zinco, 'Kg de zinco.')