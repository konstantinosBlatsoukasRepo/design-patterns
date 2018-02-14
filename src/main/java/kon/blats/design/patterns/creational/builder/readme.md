# Builder pattern

When to use a builder pattern (According to Bloch):

  - Too many fields, some of them are optional

One solution could be the telescoping constructor, some drawbacks:

  - Difficult to maintain
  - hard to read it
  - does not scales (i.e. in case of a new field, a lot of writing is required)

A second one could be a JavaBean (i.e. private fields along with getters and setters)
Drawbacks in this case:

  - mandates mutability (i.e. fields are not final)
  - allows inconsistency

Builder to the rescue! What you will need to develop a builder:

  - a public static inner class named Builder,
    this static class usually has as arguments the required fields
  - a private constructor of the class that takes as an argument the builder
  - in the static Builder a build method that returns the class object