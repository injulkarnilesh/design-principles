# God Object
This design smell violates most of the design principles out there.
Such a design is just an opposite of `Single Responsibility`, `Loose Coupling` and `High Cohesion`.

A God Object is an object in the system which holds most of the responsibility of the system, most of the flows go through this object. When you have a God Object your system diagram looks like single very large class, with too many responsibilities, surrounded by small data classes.

Procedural Programming suggests to separate procedure from data, does not matter how big the procedure becomes.
On the other hand, Object Oriented Programming suggests to put behaviours and related data into smaller objects and have them talk to each other.
With this, we can consider God Object is just a procedural design put into class construct of object oriented programming language.

Drawbacks of such a design involve:
* Single class with too much coupling and responsibilities. Harder to refactor or modify it.
* No separation of concern.
* No object modeling of domain models.
* Flow gets complicated as all go through the same God Object.
* In Object Oriented Programming we try to model real world into Objects. 
As God does not exists in real world, there shouldn't God object in any system. 
