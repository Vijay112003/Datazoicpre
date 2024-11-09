class stack:
    def __init__(self):
        self.items = []
        Max_size=int(input("Enter the maximum size of stack:"))
        global Max
        Max=Max_size
    def push(self, item):
        if self.size()==Max:
            print("Stack is full")
        else:
            self.items.append(item)
    def pop(self):
        if self.size()==0:
            print("Stack is empty")
        else:
            return self.items.pop()
    def isEmpty(self):
        return self.items == []
    def size(self):
        return len(self.items)
    def peek(self):
        if self.size()==0:
            print("Stack is empty")
        else:
            return self.items[len(self.items)-1]
    def display(self):
        if self.size()==0:
            print("Stack is empty")
        else:
            for i in range(len(self.items)-1,-1,-1):
                print("-----\n[",self.items[i],end=" ]\n")
        print("-----")
if __name__ == '__main__':
    n=1
    s=stack()
    while n:
        n=int(input("\nStack\n--------------------------\n1.Push\n2.Pop\n3.Peek\n4.Display\n0.Exit\n--------------------------\nEnter choice:"))
        if n==1:
            item=input("Enter item:")
            s.push(item)
        elif n==2:
            if s.isEmpty():
                print("Stack is empty")
            else:
                print("Popped item is:",s.pop())
        elif n==3:
            if s.isEmpty():
                print("Stack is empty")
            else:
                print("Topmost item is:",s.peek())
        elif n==4:
            if s.isEmpty():
                print("Stack is empty")
            else:
                s.display()
        elif n==0:
            break
        else:
            print("Invalid choice")