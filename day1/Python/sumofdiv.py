import time

def prod(num):
    product=1
    while(num>0):
        product*=num%10
        num//=10
    return product
def sumofdiv(num):
    sum=0
    while(num>0):
        sum+=num%10
        num//=10
    return sum
n=int(input("Enter the starting number:"))
m=int(input("Enter the ending number:"))
sum=0
for i in range(n,m+1):
    if(prod(i)%sumofdiv(i)==0):
        print(i,end=" ")
        sum+=i
print("Sum of numbers whose product of digits is divisible by sum of digits:",sum)