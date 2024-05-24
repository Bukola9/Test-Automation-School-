def reverse_array(arr):
    start = 0
    end = len(arr) - 1

    while start < end:
        # Swap the elements
        arr[start], arr[end] = arr[end], arr[start]
        # Move the pointers
        start += 1
        end -= 1

    return arr


# Example usage
array = [1, 2, 3, 4, 5]
print(reverse_array(array))
