c=0
for i in range(15):
    for j in range(15):
        print("#",end="")
        c+=1
    if i==5:
        break
print("\nTotal Hash: ",c)