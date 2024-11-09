def is_balanced(expression):
    stack = []
    opening = set('([{')
    closing = set(')]}')
    matches = {')': '(', ']': '[', '}': '{'}

    for char in expression:
        if char in opening:
            stack.append(char)
        elif char in closing:
            if not stack or stack[-1] != matches[char]:
                return False
            stack.pop()

    return not stack

if __name__ == '__main__':
    n=1
    while n:
        n = input("Choice 1: Expression checking\nChoice 2: Exit\nEnter your choice: ")
        if n == '1':
            n = input("Enter the expression: ")
            print("Balanced" if(is_balanced(n)) else "Not balanced")
        elif n == '2':
            print("Exiting...")
            break
        else:
            print("Invalid choice. Please try again.")
