def print_multiplication_table():
    # Define the size of the multiplication table
    size = 10

    # Print the header row
    print("   ", end=" ")
    for i in range(1, size + 1):
        print(f"{i:4}", end=" ")
    print("\n" + "-" * (size * 5))

    # Print each row of the multiplication table
    for i in range(1, size + 1):
        # Print the row header
        print(f"{i:2} |", end=" ")

        for j in range(1, size + 1):
            # Print the product
            print(f"{i * j:4}", end=" ")

        # Newline at the end of the row
        print()


# Call the function to print the multiplication table
print_multiplication_table()
