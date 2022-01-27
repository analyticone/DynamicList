# DynamicList<Item>
Edit the DynamicList class.  Implement all of the methods below.  Please make sure that the signatures of all of the methods exactly match the specifications of the assignment.  The signature includes the method name, the return type, and the number of parameters and their types.

Method Signature 	  | Description
|----------------------------------------------------------|---|
DynamicList ()|This is the default constructor. It creates a dynamic list with an initial capacity of 10 items.  The list doubles its capacity when full and halves its capacity when the list is ¼ full.
DynamicList (capacity:Item)|This constructor creates a dynamic list with the specified initial capacity  
DynamicList (other:DynamicList)|This is the copy constructor. It creates a new dynamic list from an existing one.
DynamicList (fileName:String)|This creates a dynamic list from the values contained in the file called filename.  Assume that filename is in the current directory.
add(item:  Item) : void|This method adds an item to the end of the list
addAt(index: int, item: Item) : void|This method inserts an item at the specified position (index) in the list, moving items to make room.
get(index: int) : Item|This method returns the item at the specified position (index) in the list
set(index: int, item: Item) : boolean|Replaces the item at the specified index with the item passed as an argument to the method. It returns true if the replacement was made.
replace(oldItem: Item, newItem: Item) : boolean|Replaces the first occurrence of oldItem in the list with newItem.  It returns true if the replacement was made.
replaceAll(oldItem: Item, newItem: Item) : boolean|Replaces all occurrences of oldItem in the list with newItem. It returns true if the replacements were made.
remove(item: Item) : boolean|This removes from the list the first occurrence of item and returns true if the item was removed
removeAt(index: int) : Item|This removes from the list the item at index and returns the item was removed or null if it was not removed
indexOf(item: Item) : int |Returns the index of the first occurrence of item in the list or returns -1 if item is not in the list
lastIndexOf(item: Item) : int |Returns the index of the last occurrence of item in the list starting at the end of the list or returns -1 if the item is not in the list
contains(item : Item) : boolean|Returns true if the list contains item
size() : int|This returns a count of the number of values in the list
isEmpty() : boolean|This returns true if the list is empty – has no items in it
clear() : void|This makes the list empty
toString() : String|This returns a String representation of the dynamic list
iterator() : Iterator<Item> |This returns an interator that iterates over the items in the dynamic list.  Enables for each loop

### Setup command
N/A

### Run command
`gradle test`

### Notes
- The JDK is installed on GitHub Actions machines, so you're also able to directly invoke `javac`, `java`, or any other CLI command included in the JDK. 


