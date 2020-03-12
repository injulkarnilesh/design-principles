---
parent: SOLID
nav_order: 4
---

# Interface Segregation Principle
This principle is fairly straight forward and easy to follow.

It states that 
> No client should be forced to depend on methods it does not use.

It is about how to do abstraction, how to design interfaces and suggests that it is better to have many smaller interfaces than few larger interfaces. 

Idea is that no class should be forced to implement a method that it does not support only because it implements some interface.

These smaller, very specific interfaces sometimes are called Role Interfaces.

{% include codelink.html examples="1" %}