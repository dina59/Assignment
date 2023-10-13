def generate_numbers_array():
    numbers = []
    for i in range(1, 101):
        numbers.append(i)
    return numbers



if __name__ == "__main__":
    # Using an array to generate numbers
    array_numbers = generate_numbers_array()

    # Comparing the two approaches
    print("Array Numbers:")
    print(array_numbers)

    
