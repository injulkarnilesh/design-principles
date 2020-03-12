# Inversion Of Control
A design principle heavily used by frameworks to take control of the flow inside applications built on top of them.

Consider a typical procedural command line application where flow is driven by a main function.
It can ask for input from user and then change the flow but overall the flow is written in main itself.
Main function/application controls the flow. If it asks user for input it waits until input is provided.

Now consider a GUI application built using some framework like Swing. 
Here the main flow of application like showing window or responding to user actions is done by the framework.
We write code to respond to user events like button click. That code would be called by the framework when button is actually clicked.
Code we write does not have the **control of the flow**, framework has it.
This is inversion of control.  

It is considered better way of implementing frameworks because it relieves application developers from flow related code.
They can focus on application logic. 
It also encourages loose coupling. 

Difference between framework and library is that, 
with a library, control of flow of application lies with application and we use some services provided by the library.
And with a frameworks, the control of flow lies with the framework and we write code that is called by the framework.

  
This principle is usually confused with Dependency Injection. 
The Dependency Injection is one of the ways to invert the **control of dependencies**, that is how the dependencies are provided to classes. 
Here inversion is that they are provided by frameworks instead of classes creating them themselves.

Using service-locator/factories, are another ways to invert control of dependencies in a compositional way.

Using template or factory method are another ways to invert the control but more in a polymorphic way.

With factory method pattern, control of creating objects inverted from a class to its subclass implementation. 
What object will be created is decided by subclass and not parent class while main logic is in parent class only. 

With template method pattern, the control of flow lies with parent class and not the subclass; when methods of subclass will be called is controlled by the parent class.

Frameworks like Spring rely on this principle to build loosely coupled, extensible applications.

# References
* [Stackoverflow Question](https://stackoverflow.com/questions/6550700/inversion-of-control-vs-dependency-injection)      

{% include codelink.html examples="1" %}