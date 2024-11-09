class Node:
    def __init__(self, value):
        self.value = value
        self.next = None
class LinkedList:
    def __init__(self):
        self.head = None
    def addNodeCircle(self, value):
        if self.head is None:
            self.head = Node(value)
            self.head.next = self.head
        else:
            temp = self.head
            while temp.next is not self.head:
                temp = temp.next
            temp.next = Node(value)
            temp.next.next = self.head
        print("Node added", value)
    def detectCycle(self):
        slow = self.head
        fast = self.head
        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                return True
        return False
    def display(self):
        temp = self.head
        while temp.next is not self.head:
            print(temp.value, end='->')
            temp = temp.next
        print(temp.value)
if __name__ == '__main__':
    n=True
    while n:
        try:
            n = int(input("\nCoice:\n1. List \n2. Exit\nEnter your choice: "))
            if n==2:
                print("\nExiting...")
                break
            values = list(map(int, input().split()))
            ll = LinkedList()
            for value in values:
                print("Adding Node", value)
                ll.addNodeCircle(value)
            if ll.detectCycle():
                print("Cycle Detected")
            else:
                print("No Cycle Detected")
            ll.display()
        except EOFError:
            print("EOFError")
            break
