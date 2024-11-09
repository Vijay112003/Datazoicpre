class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        print("Node created with data: ", data)
class LinkedList:
    def __init__(self):
        self.head = None
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
    def print_list(self):
        cur_node = self.head
        while cur_node:
            print(cur_node.data)
            cur_node = cur_node.next
    def sort(self):
        cur = self.head
        if cur:
            while cur.next:
                ptr = cur.next
                while ptr:
                    if cur.data > ptr.data:
                        cur.data, ptr.data = ptr.data, cur.data
                    ptr = ptr.next
                cur = cur.next
    def merge_sorted(self, llist):
        p=self.head
        while p.next:
            p=p.next
        p.next=llist.head
        self.sort()
        return self.head
if __name__ == '__main__':
    n=1
    while n:
        n=int(input("coice 1: Merge two sorted linked list\n choice 2: Exit\n Enter your choice: "))
        if n==1:
            llist_1 = LinkedList()
            llist_2 = LinkedList()
            llist_3 = LinkedList()
            n1=int(input("Enter the number of elements in the first linked list: "))
            for i in range(n1):
                llist_1.append(int(input("Enter the element: ")))
            n2=int(input("Enter the number of elements in the second linked list: "))
            for i in range(n2):
                llist_2.append(int(input("Enter the element: ")))
            llist_3.head = llist_1.merge_sorted(llist_2)
            print("Merged linked list is: ")
            llist_3.print_list()
        elif n==2:
            break
        else:
            print("Invalid choice")
            continue
