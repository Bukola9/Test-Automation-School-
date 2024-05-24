def sort_numbers_desc_in_place(arr):
    arr.sort(reverse=True)
    return arr

# Example usage
numbers = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
sort_numbers_desc_in_place(numbers)
print(numbers)
