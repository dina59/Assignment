

def generate_numbers_linked_list():
    numbers = []
    for i in range(1, 101):
        numbers.append(i)
    return numbers

if __name__ == "__main__":
    
    # Using a linked list to generate numbers
    linked_list_numbers = generate_numbers_linked_list()

    print("\nLinkedList Numbers:")
    print(linked_list_numbers)
