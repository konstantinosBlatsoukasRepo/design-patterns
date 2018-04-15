# Decorator pattern

When to use a builder pattern:

  - When you want to add a behaviour or even a state

Let's look an example:

  - You want to create a Class called Sandwich that you
    can get the price and the ingredients
  - But you can have many combinations, for example one sandwich might
    have hum and cheese, while another one could have cheese, hum and chicken
    (+ different price)
  - The problem here is that we want to find a way to add the chicken

Decorator to the rescue! What you will need to develop a decorator:

  - an interface (in my example Sandwich)
  - a decorator class, which is composed by the above interface
    (in my example the decorator is the SandwichDecorator and
    the composed interface is the Sandwich)


  