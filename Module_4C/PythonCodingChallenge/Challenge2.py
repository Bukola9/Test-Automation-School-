def convert_length(value, from_unit, to_unit):
    # Conversion factors to meters
    conversion_factors_to_meters = {
        'meters': 1.0,
        'kilometers': 1000.0,
        'miles': 1609.34,
        'feet': 0.3048,
        'inches': 0.0254
    }

    # Check if the units are valid
    if from_unit not in conversion_factors_to_meters or to_unit not in conversion_factors_to_meters:
        raise ValueError("Invalid units")

    # Convert the value to meters
    value_in_meters = value * conversion_factors_to_meters[from_unit]

    # Convert from meters to the target unit
    conversion_factors_from_meters = {unit: 1/factor for unit, factor in conversion_factors_to_meters.items()}
    converted_value = value_in_meters * conversion_factors_from_meters[to_unit]

    return converted_value

# Example usage
value = 10  # Value to be converted
from_unit = 'miles'  # Original unit
to_unit = 'kilometers'  # Target unit

converted_value = convert_length(value, from_unit, to_unit)
print(f"{value} {from_unit} is equal to {converted_value} {to_unit}")
