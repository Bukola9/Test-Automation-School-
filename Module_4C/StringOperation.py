name = "  Testify for ia and  Testify ai Testttify    "
#len -> get the size of a string
size = len(name)
print("Size", size)

#upper case
upper_value=name.upper()
print("upper:", upper_value)

#lower
lower_value=name.lower()
print("upper:", lower_value)

#capitalize
capitalized_value= name.capitalize()
print("Capitalized ", capitalized_value)

#count - count the occurence of a value
testify_count=name.count("Testify")
print("testify count", testify_count)

t_count =name.count("t")
print("t count", t_count)

#find - position of a string in a value
for_position= name.find("for")
print("For_position", for_position)

#strip
stripped_name=name.strip()
print("stripped_name: ", stripped_name)

#rstrip
rstripped_name=name.rstrip()
print("rstripped_name: ", rstripped_name)

#lstrip
lstripped_name=name.lstrip()
print("lstripped_name: ", lstripped_name)

splitted_name =name.split("and")
print("splitted_name(and)", splitted_name)

#format
unformatted_one = "My name is {name}, I am {occupation}"
formatted_one = unformatted_one.format(name="Olubukola", occupation="QA Engineer")
print("Name formatter:", formatted_one)
