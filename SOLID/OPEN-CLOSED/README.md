# Open Closed Principles

As one of the most important principles for designing system units like classes, methods or modules, the Open Closed Principle is about how we should be able to make changes into these units.

Changes to software systems are inevitable. Incorporating changes should not involve rewriting the code unit, but it should involve extending behaviour with/as a new one and be using that instead of old one.

So this principle states :
> Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.

## Closed for Modification
A code unit should do what is its clear responsibility and it should do it well. If there is any behaviour that it depends on which can change, then it should not have that behaviour inside it nor directly depend on it. If that dependent behaviour changes then this unit should not be modified.

## Open for Extension
If a behaviour is to be changed for a unit of code, then those changes can be implemented as an extension than rewriting of the same behaviour. This extension could be in the form of writing new behaviour and making other units that depend on it to use new behaviour instead of old. This extension should preferably be done with composition instead of inheritance.


This principle is closely related with
* Dependency Injection
  * If dependency is injected into a class from outside, then this class need not be modified when there is a need to replace or change that dependency.
* Programming to interfaces
  * Extension can be done easily if we program to interfaces than direct code dependencies.
* Strategy Design Pattern
  * It is a good example of usage of this principle.  