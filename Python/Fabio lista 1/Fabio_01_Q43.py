#Apresentação
print('Calcular um sistema de equações lineares do tipo: (ax+by=c)(dx+ey=f)')
print('--------------------------------------------------------------------')

#Valores

a = int(input('Digite o valor de "a": '))
b = int(input('Digite o valor de "b": '))
c = int(input('Digite o valor de "c": '))
d = int(input('Digite o valor de "d": '))
e = int(input('Digite o valor de "e": '))
f = int(input('Digite o valor de "f": '))

#Calculos

x = (c*e - b*f) / (a*e - b*d)
y = (a*f - c*d) / (a*e - b*d)

#Saida

print('O valor de x e y são respectivamente:', "%.2f" % x, ',', "%.2f" % y,)