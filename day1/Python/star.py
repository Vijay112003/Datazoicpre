n=int(input("Enter the Number: "))
star=0
while n!=0:
    if n>0 and n<=12:
        print("*",end="")
        star+=1
    elif n>12 and n<=24:
        print("**",end="")
        star+=2
    elif n>24 and n<=30:
        print("*",end="")
        star+=1
    n-=1
print("\nTotal Star: ",star)