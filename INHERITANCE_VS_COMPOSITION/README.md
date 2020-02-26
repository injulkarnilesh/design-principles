# Inheritance Vs Composition
This design principle simply states 
> Prefer Composition over Inheritance for reusing the code.

This does not mean Inheritance is evil and should be avoided.
Inheritance is a great Object Oriented Programming construct.

But purpose of Inheritance has never been the code reuse, but to represent IS-A relationship.
Inheritance brings in great gifts of Abstraction and Polymorphism.

It is easy to start building Inheritance hierarchies for the purpose of code reuse because parent class methods and fields are directly accessible to child classes.
'Extracting common code into abstract classes' is many times has been used to reuse the code.

But for reusing a code, we have a better construct that is `Composition`.
The code to be used is in another class and those who need it or depend on it has a reference to its object as a field.

Inheritance `is` responsible for following
* Sub class has to directly know the super class at compile time. That is compile time dependency.
* Changes in superclass might require unnecessary and avoidable changes to subclasses.
* Inheritance breaks encapsulation as internals of the parent class are visible to the child classes.
* Without proper care, inheritance hierarchies can run too deep making refactoring harder.
* Unit testing is difficult as it also depend upon the parent class and mocking becomes hard.
* Child class gets all the behaviour of parent class even if it might be undesired. 

On the other hand, Composition `has` following perks:
* With dependency injection, dependent class can me made to depend on abstraction only and actual implementation can be provided at runtime.
* Dependent class does not need to directly depend on other class at compile time.
* Dependent class can choose to use only required behaviour of the class it depends upon.
* Proper encapsulation is maintained as the classes only expose public interfaces.
* Unit testing becomes easier with composition as mocking can be easily done.

So, remember to use Inheritance for is-a relationship and composition for code reuse. 