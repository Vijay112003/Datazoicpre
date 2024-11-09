import sys
class palindrome:
    def __init__(self):
        self.s = ""
    def __init__(self, s):
        self.s = s
    def is_palindrome(self):
        return self.s == self.s[::-1]
if __name__ == "__main__":
    p = sys.argv[1]
    pal = palindrome(p)
    print("Palindrome" if pal.is_palindrome() else "Not a palindrome")