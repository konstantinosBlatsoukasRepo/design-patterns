# Adapter pattern

When to use a builder pattern:

  - When a new code must be translated in some way to a legacy code interface
  - In my mind is like this: 
  
    You have created something that can execute some behaviour/method but does not
    complies with the a legacy interface (i.e. you have the desired behaviour but this
    is not enough, you have to comply with this legacy interface)
    Somehow you need to use a legacy interface, a solution is that you
    have to create an "Adapter" so that the your code adapts to the legacy code

Let's look an example:

  - A pojo called Employee
  - Too interfaces that doing the same thing, basic operations in DB
    (get an employee, delete one and update) 
  - Imagine that we are requested to use only Repositories 
    (i.e. the format XXXRepository and the corresponding naming convention)

Adapter to the rescue! What you will need to develop a builder:

  - a class that implements the adapter 
  - this class takes as an argument the object that you want to adapt (in my example an EmployeeDAO)
  - the constructor returns the "adapted" object (in my example an EmployeeRepository)
  