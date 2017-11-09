#Apresentação
print('Calcular a distancia entre 2 pontos (x1,y1) e (x2,y2) em um plano')
print('-----------------------------------------------------------------')

#Valores

x1 = int(input('Digite o valor de x1: '))
y1 = int(input('Digite o valor de y1: '))
x2 = int(input('Digite o valor de x2: '))
y2 = int(input('Digite o valor de y2: '))

#Calculos

from math import sqrt
distan = sqrt((x2 - x1)**2 + (y2 - y1)**2)

#Saida

print('A distancia entre','(',x1,',',y1,') e (',x2,',',y2,') é igual a:', "%.3f" % distan)