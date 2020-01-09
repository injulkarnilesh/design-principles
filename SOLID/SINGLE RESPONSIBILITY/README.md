# Single Responsibility Principle

This is a simple, important yet most missed design principle. This is about defining responsibilities of code units like Classes or Modules.

In simple words, this principle states that a code unit, Eg. Class should have a single responsibility. This is very vague statement.

In Uncle Bob's words it is :
> Gather together the things that change for the same reasons. Separate those things that change for different reasons.

Here we are talking about responsibility in terms of reason for a change. Reason not in terms of bug fixes or refactoring, but rather business case changes. If same class is being changed in response to multiple business case changes then that class has multiple reasons to change and so the multiple responsibilities.

This principle is closely related to other few principles:
* Cohesion
  * Dictates what belongs together, closely associated with responsibility.
* Encapsulation
  * Classes designed with Single Responsibility tend to hide changes behind encapsulation boundries limiting cascade of changes.
* Dependency Injection
  * More dependencies the class has more likely that it is doing more that it should.


## References
* [Clean code blog](https://blog.cleancoder.com/uncle-bob/2014/05/08/SingleReponsibilityPrinciple.html)
* [Hackernoon blog](https://hackernoon.com/you-dont-understand-the-single-responsibility-principle-abfdd005b137)
