# Abstraction
Abstraction as an Object Oriented Programming concept dealing with hiding implementation details from the client code.

When you abstract out something, you are hiding the internals, details of it.
Advantage of such an abstraction is that client does not need to know or deal with complexity of details or actual implementation.

Even simple `print()` function that prints a message to console can be considered as an abstraction as printing anything to console is very complex piece of code when looked into details of it.
But, with `print` abstraction, developers only need to know that there exists such a function which when passed a message just prints it to the console. 
Developers don't need to know how `print` is actually implemented.
 
Interfaces are a usual way of achieving abstraction as Interfaces only define the contract.
Implementation details are not required to be known by client to use that functionality.

Abstraction, when done right, provides us loose coupling, as client is unaware of implementation insides.

{% include codelink.html examples="1" %}