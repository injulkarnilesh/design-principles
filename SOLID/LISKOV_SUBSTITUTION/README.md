---
parent: SOLID
nav_order: 3
---

# Liskov Substitution Principle
This principle is about inheritance, about substitutability of objects with parent child relationship.

Mathematical statement of this principle is :
> Let Φ(x) be a property provable about objects x of type T. Then Φ(y) should be true for objects y of type S where S is a subtype of T.

English :
> Functions that use pointers to base classes must be able to use objects of derived classes without knowing it.

In other words, if a system or module uses object of parent class then that system or module should continue to behave the same way if we replace object of parent class with that of subclass.

It is not limited to compile time substitutability but also considers run time behavioural substitutability. 
Meaning sub class should respect the contract set by parent class. This contract can be considered in three parts:
* Pre-conditions
  * Are the conditions that are guaranteed on entry of a routine. 
  * Overriding method of subclass needs to accept the same input parameters as superclass method. 
  * This implies subclass method can implement lesser or equal restrictive validation rules as that of superclass method.
* Post-conditions
  * Are the conditions on routine exit, on return value.
  * Return value of a subclass method needs to comply with the same rules as the return value of superclass method.
  * Subclass method can apply stricter or same rules for values it returns as what superclass method returns.
  * Subclass method can return a specific subclass of the defined return type of superclass method.
  * Subclass method can return a subset of the valid return values of the superclass method.
* Invariant
  * Class invariant is constraints on state of its objects.
  * Public methods of the class should preserve the invariant of the class.
  * Invaiants of the superclass should be preserved in the subclass.  

## References
* [Stackify blog](https://stackify.com/solid-design-liskov-substitution-principle/)
* [Hackernoon blog](https://hackernoon.com/liskov-substitution-principle-a982551d584a)

{% include codelink.html examples="1" %}

