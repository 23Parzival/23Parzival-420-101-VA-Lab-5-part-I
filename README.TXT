
Answers to Lab 5, Part I and II.

Part I:

#3 The first one checks the first postion in the index, the second version 
   has an offset so it will test the first position in the index after having
   applied the offset.
   
#4 endsWith(Strin suffix). Parameter of string for the suffix it's trying to find
   return type of boolean (true or false).
   
#5 length(). No parameters. Return type int.

#6 They are found in the documentation by searching by letter to find 
   certain methods. It is easy to find using crtl f because you can 
   scroll through the found methods by letter. 

#7 public String trim()
   String result = text.trim();

#10 The return type is boolean (true or false).

#12 

Part II:

#24 A HashMap is a class that implements the map interface, it stores data using <K,V>
    which stands for key value; basically there is a key assigned to each value which gets stored 
    in specific way. That's where the word hash comes in as it is the way things are stored and dealt with.
   
#25 get, put, containsKey, containsValue... Yes the same type can be used for both its parameters.

#26 size()

#28 The previous value contained in that key is replaced by the new one inputted.

#29 The value is added under a different key. 

#30 contacts.containsKey(key);

#31 null is returned.

#32 contacts.keySet();

#34 A HashSet and ArrayList are both collections of objects but a set is unordered and doesn't allow duplicates 
    of the same object. 

#35 A HashSet will return the words randomly and an array list will return them in order of how they were inputted.
    A HashSet will also ignore duplicates and not return them as opposed to an ArrayList that will.

#36 No.

#40 Add a HashMap of the keys of the responses hash map and then add values of different words.
    When the input is recorded and it is a synonym it will check if it's a synonym before returning 
    the value.

#41 Change the code into a for loop so that it loops through the words in the input set,
    when a word is matched to the map it will output its value along with an \n and then output the second
    response.

#42 Add default responses to the hashmap of responses, they will just have "why", "how"... as keys.


