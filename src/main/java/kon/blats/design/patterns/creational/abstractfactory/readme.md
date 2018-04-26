# Abstract Factory pattern (Factory of factories)

When to use a Abstract Factory pattern:

  - when you have more than one related factories (see method factory)

What you will need to develop a factory method:

  - a class that provides a method that you can fetch the related factories
  - the related factories
  - some concrete classes that the related classes can produce
  
Let's see my example:

   - motivation: A piece of code that is able to produce transformers
   - how I did it: one factory for autobots, another one for decepticons
   - the two factories (e.g. autobots and decepticons) are related 
     (both are producing transformers)
   - now an abstract factory construction fits in that case 
     (e.g. a factory that is able to produce a factory that produces either 
     decepticons or autobots)     