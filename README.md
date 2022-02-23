## Problem 1: Maps practice
1.1) Write a function `hasManyVowels`, for an arbitrary string, determines whether the string contains at least two of each vowel. Use a data structure `Map<Character, Integer>` to keep track of counts and `toCharArray()` to change `s` to a list of characters. 

1.2) Similarly, write `hasManyOfType` where instead of values, the user can specify the characters the string must have and how many of each. `hasManyOfType(s, "aeiou", 2)` is the same as `hasVowels(s)`.


## Problem 2: Maps practice, continued
Write a function `addDelivery` which, for a stream of FruitOrders, tallies the inventory left in the store at the end of the month. `itemCount` should add with each delivery, while `oldestDate` remains unchanged once set.

Refer to the maps lecture for some background: https://docs.google.com/presentation/d/1j6g3OsZ5P1oOjfX0I-FARfWpsybEjQp4Dvw8AFbNIbg/edit?usp=sharing



## Problem 3: Trees
Refer to the trees lecture for help in getting started: https://docs.google.com/presentation/d/1NZeue2naoEM7WkQSUhbSmiLm5MGcamoKhL36YkRsiLk/edit?usp=sharing 

3.1) Write a preorder traversal which will prints all the leaves of a tree. A leaf is a node that has no children, i.e. node.left is null and node.right is null. This should be a normal preorder traversal, except that only some nodes are printed.


3.2) Write an inorder traversal which prints the values of the tree from right to left.
