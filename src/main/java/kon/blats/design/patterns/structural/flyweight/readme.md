# Flyweight pattern

When to use a flyweight pattern:

    - when you want to reduce the amount of objects that you create,
      which leads to better memory usage
      
What you will need to implement a flyweight pattern:
      
    - Basically as I see it, flyweight is a factory which has the ability 
      to remember (through a hashmap) which objects has already been screated.
      So, the next time that the same object is requested and is already in
      the memory (hashmap) there is no need to crate a new one
      
Example:

In my example, I have a factory that creates football players this factory has 
the ability to remember the already created players (as a result, no need for new player creation)