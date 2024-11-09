class ZeroEnd:
    def __init__(self, n, a):
        self.__n = n
        self.__a = a
    def iszero(self):
        return 0 in self.__a
    def zeroend(self):
        count = 0
        for i in range(0, self.__n):
            if self.__a[i] != 0:
                self.__a[count] = self.__a[i]
                count += 1
        while count < self.__n:
            self.__a[count] = 0
            count += 1
        print("Array after pushing zeros to the end:")
        for i in range(0, self.__n):
            print(self.__a[i], end=" ")
def main():
    n = int(input("Enter the number elements:"))
    li = []
    for i in range(0, n):
        li.append(int(input("Enter element:")))
    obj = ZeroEnd(n, li)
    if obj.iszero():
        obj.zeroend()
    else:
        print("Array does not contain zero")
if __name__ == '__main__':
    main()