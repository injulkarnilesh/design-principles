---
parent: Design Principles
---

# Law of Demeter
This design principle is about reducing coupling between classes.

Idea is to limit interaction of an object with objects it has direct access to and no other objects.

It can be stated as
> Method M in class C can invoke methods of 
> * Class C
> * Fields of class C 
> * Parameters of method M
> * Locally created variables inside M
> * Global Objects

In other words, it recommends to only talk to immediate friends and don't talk to strangers.

This principles tries to reduce coupling between classes by not making them talk to objects they should't know about.

Violation of this principle can be spotted in the code with multiple . (dots) in statements. 
When you are calling a method on some object you have access to, and calling another method on what first object returned as so on. 
A train-wreck.

It also encourages encapsulation by not exposing internals of the dependent classes to depending classes.

It can be considered as an extension of *tell don't ask* principle.

As it is easy to violate this principle, it is sometimes called Suggestion of Demeter.
It is also known as Principle of Least Knowledge.

Following it may require you to write some more code by exposing more methods to accept specific commands, but if you do, you will be rewarded with loosely coupled system. 

For following it, you are not always required to add wrapper methods into the train-wreck objects.
But you also can move methods into different objects and call those with appropriate parameters.

## References
* [Dzone Article](https://dzone.com/articles/the-genius-of-the-law-of-demeter) 