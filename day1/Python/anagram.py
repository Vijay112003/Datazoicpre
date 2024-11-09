word1=str(input("Enter the first word: "))
word2=str(input("Enter the second word: "))
if sorted(word1)==sorted(word2):
    print("The words are anagrams.")
else:
    print("The words are not anagrams.")
