class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        print("Node created with data: ", data)
class LinkedList:
    def __init__(self):
        self.head = None
    def append(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            return
        last_node = self.head
        while last_node.next:
            last_node = last_node.next
        last_node.next = new_node
    def findmid(self):
        slow=self.head
        fast=self.head
        while fast and fast.next:
            slow=slow.next
            fast=fast.next.next
        return slow.data
    def print_list(self):
        cur_node = self.head
        while cur_node:
            print(cur_node.data)
            cur_node = cur_node.next
if __name__ == '__main__':
    n=1
    while n:
        n=int(input("coice 1: Find the middle of the linked list\n choice 2: Exit\n Enter your choice: "))
        if n==1:
            llist = LinkedList()
            n1=int(input("Enter the number of elements in the linked list: "))
            for i in range(n1):
                llist.append(int(input("Enter the element: ")))
            llist.print_list()
            print("Middle element of the linked list is: ", llist.findmid())
        elif n==2:
            break
        else:
            print("Invalid choice")
