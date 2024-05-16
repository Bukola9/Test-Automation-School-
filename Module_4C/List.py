languages = ["python", "java", "C#"]
print("List:", languages)

#append --> Add a new item to our list

languages.append("Javascript")
print("Append:", languages)

#insert---> Add a new item at any position in the list
languages.insert(0,"c")
languages.insert(2,"PHP")
print("insert:",languages)

#pop ----> Remove an item from a specific position
languages.pop(0)
print("pop:", languages)
languages.pop()
print("pop:", languages)


#remove -----> Remove item by value
languages.remove("PHP")
print("remove:", languages)

#Count -----> return the number of occurence
languages.append("java")
con_java=languages.count("java")
print("count:", con_java)

#len -------->count number of items in a list
length = len(languages)
print("len:", length)

#clear ---------> simply delete all items in a list
languages.clear()
length = len(languages)
#print("clear:", languages)
print("clear:", languages, length)

languages = ["python", "java", "C#"]

#copy -------> return a copy of the list
lan_copy = languages.copy()
print("copy:", lan_copy)

#reverse ------> changes the order of items
before_reverse = languages.copy()
languages.reverse()
print("before reverse",before_reverse, "after reverse", languages)

#sort ------->sort items in ascending or descending order
languages.sort()
print("sort-asc", languages)
languages.sort(reverse=True)
print("sort-dsc", languages)

#extend ------>Add the content of the specific list to our current list
languages.extend(["bukola","Sam","Kunle", "Ajayi"])
print("extend:", languages)

