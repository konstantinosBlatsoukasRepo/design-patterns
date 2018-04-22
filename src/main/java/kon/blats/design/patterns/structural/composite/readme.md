# Composite pattern

When to use a builder pattern:

  - When you need to describe a structure that is in the form of tree

Let's look an example:
  - I tried to describe the files/directory relationship by this pattern
  - It turns out that how the directories are structured are more or less
    a tree

## participants
  - Each node of the tree could be a file or a directory
  - A directory could have more files or directories or none, Directory class
    (according to GOF book this is called a composite, a object that can hold
     children's, in our case the children's could be a files nad directories)
  - A file can't have (compose) any files or directories, File class
    (in GOF book this kind of object is called a leaf, an object that can't hold
     any children's)
  - An Abstraction that can represent both objects (File or Directory)
    (in GOF book this is called a component)

What you will need to develop a composite (I am going to use the GOF terms):

  1.  A Leaf: an object that is an element in the tree that is not able
      to hold any children's
  2.  A Composite: an object that can hold Leafs or other Composites
      (e.g. it is able to hold children's)
  3.  A Component: an abstract class that can be a Composite or a Leaf

  