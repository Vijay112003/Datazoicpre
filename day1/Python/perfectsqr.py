import math

def has_perfect_square_factor(n):
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % (i * i) == 0:
            print(i*i,end="->")
            return True
    return False

def perfect_square_factors(start, end):
    for num in range(start, end + 1):
        if has_perfect_square_factor(num):
            print(num)

# Example usage
start = int(input("Enter start number: "))
end =  int(input("Enter end number: "))
perfect_square_factors(start, end)