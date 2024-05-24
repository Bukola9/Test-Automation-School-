def filter_negative_numbers(nums):
    return [num for num in nums if num >= 0]

# Example usage
numbers = [-1, 2, -3, 4, -5, 6]
filtered_numbers = filter_negative_numbers(numbers)
print(filtered_numbers)
