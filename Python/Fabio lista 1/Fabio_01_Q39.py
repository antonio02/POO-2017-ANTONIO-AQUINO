#Apresentação

print('Calcular a função: D = R + S / 2')
print('Onde R = (a + b)² e S = (b + c)²')
print('--------------------------------')
print()

#Valores

a = int(input('Digite o valor de "a": '))
b = int(input('Digite o valor de "b": '))
c = int(input('Digite o valor de "c": '))

#Calculos

R = (a + b)**2
S = (b + c)**2
D = (R + S) / 2

#Saida

print('O resultado é igual a:', "%.2f" % D)
