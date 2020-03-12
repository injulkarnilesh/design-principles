# Encapsulation
In Object Oriented Programming, Objects consist of behaviour and state.

>The process of binding relevant state and behaviour into single unit is called Encapsulation. 

In well encapsulated Objects, internal state of an object is not visible to external world.

We can consider Abstraction as a way to hide feature/behaviour implementation details while, Encapsulation as a way to hide internal state of an object.

Though Encapsulation is more about capsulating, putting related things together in classes, 
it is also about doing it right by not exposing internal state of an object outside the capsulated objects.
This is achieved by using most restrictive access modifiers to the fields of classes and providing access methods like getters and setters *only if they are necessary*.

It is always recommended to start with most restrictive access modifiers for fields, classes and without any access methods. 
Then, as and when access methods are required those are to be added.

{% include codelink.html examples="2" %}