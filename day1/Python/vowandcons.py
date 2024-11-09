var=str(input("Enter a string: "))
c,v=0,0
vc,cc="",""
for i in var:
    if i in 'aeiouAEIOU':
        v+=1
        vc+=" "+i
    else:
        c+=1
        cc+=" "+i
print("Number of vowels: ",v,vc)
print("Number of consonants: ",c,cc)