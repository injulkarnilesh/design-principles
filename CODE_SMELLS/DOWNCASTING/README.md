---
parent: Code Smells
---

# Downcasting
Downcasting is when you cast an object from super type to subtype. 

Downcasting is considered a code smell, and it is recommended to consider your design choices if you need to perform downcasting.

You need to perform downcasting when you need to call subtype specific behaviour and all you have is an object of supertype.
That means you are working with abstraction and you need to go into details of the implementation.

That is violation of abstraction as well as encapsulation, as you are getting into details of implementation which should have been hidden behind well defined abstraction.


The fact that you need to look into details/implementation of abstraction means that you have got the abstraction wrong or you are relying on abstraction when you should not be.

Impact of downcasting is not only that it can fail at runtime, which can be avoided by typechecking, but also that its need implies wrong abstraction and violation of encapsulation.

At some places, like libraries for serialization/de-serialization or equals methods, you might need downcasting; but in other core business level code places, you should avoid it.

{% include codelink.html examples="1" %}