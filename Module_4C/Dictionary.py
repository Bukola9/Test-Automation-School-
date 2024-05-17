animals ={
    "bird": "Parrot",
    "mammal": "Cow",
    "fish":"Titus"
}

print("Dictionary:", animals)

#get---> get value using specific keys
bird =animals.get("bird")
print("get-1:", bird)
mammal = animals.get("mammal")
print("get-2:", mammal)

#items---->list of dictionary key-value pair
animal_item =animals.items()
print("items:", animal_item)

#keys-----> return key as a list
animal_key =animals.keys()
print("keys:", animal_key)

#values-----> return value as a dictionary
animal_value =animals.values()
print("keys:", animal_value)

#pop-------> remove a key-value pair using the specific key
animals.pop("mammal")
print("pop:", animals)

#update------> Add more key-value pairs into dictionary
animals.update({"mammal":"Goat"})
print("update", animals)

#popitem-----> Remove the last key-value
animals.popitem()
print("popitem", animals)

#copy-------> return a copy of dictionary
copied_animals=animals.copy()
print("copy:", copied_animals)

#clear------> remove all the element
animals.clear()
print("clear", animals)