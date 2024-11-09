class node:
    def __init__(self, data):
        self.data = data
        self.next = None
class stack:
    def __init__(self):
        self.head = None
    def push(self, data):
        if self.head is None:
            self.head = node(data)
        else:
            new_node = node(data)
            new_node.next = self.head
            self.head = new_node
    def pop(self):
        if self.head is None:
            return None
        else:
            popped = self.head.data
            self.head = self.head.next
            return popped
    def display(self):
        if self.head is None:
            print("Stack is empty")
        else:
            temp = self.head
            while temp is not None:
                print("|",temp.data, end = "|\n")
                temp = temp.next
    def peek(self):
        if self.head is None:
            return None
        else:
            return self.head.data
if __name__ == "__main__":
    s = stack()
    n=1
    while(n):
        print("1.Push\n2.Pop\n3.Display\n4.Peek\n5.Exit")
        ch = int(input("Enter your choice: "))
        if ch == 1:
            ele = int(input("Enter the element to be pushed: "))
            s.push(ele)
        elif ch == 2:
            ele = s.pop()
            if ele is None:
                print("Stack is empty")
            else:
                print("Popped element is: ", ele)
        elif ch == 3:
            s.display()
        elif ch == 4:
            ele = s.peek()
            if ele is None:
                print("Stack is empty")
            else:
                print("Topmost element is: ", ele)
        elif ch == 5:
            n=0
        else:
            print("Invalid choice")