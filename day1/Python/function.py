def funn(a,b):
    if a>1:
        return a*funn(b-6,a-4)
    else:
        return 1
    return a+b
print(funn(4,6))