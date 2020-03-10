# Dependency Injection
A design principle used to **decouple object creation from object usage**.

A class depending on another class should just use it without caring about how to create/get instance of it.
It rather relies on framework or container to provide those dependencies. 

This principle is used to implement another related principles
* Dependency Inversion
  * To invert the dependency from high level class to lower level details class, we need to put in an abstraction in between them. 
  * For high level class to be totally independent of lower level details, it should not directly instantiate the later and that is where Dependency Injection comes in.
* Inversion of Control
  * For inverting **control of dependencies** of a class it should not instantiate them from inside itself.
  * Those dependencies should be injected into the class from somebody outside like IoC container.
  
Advantages of this principle are
* Testability
  * Because the dependencies are not instantiated from within the class and are injected into them at runtime, 
  we can mock them in testing very easily.
* Loose coupling
  * Dependency Injection enables classes to use abstraction for dependencies.
  * This helps classes to be loosely coupled and have their dependencies changed with minimal changes.
  
There are around 4 common ways to implement Dependency Injection
* At Fields
  * A class only declares dependencies as the fields; and frameworks fill them up at runtime through something like reflection.
* Through Setters
  * A class provides POJO like setters for dependencies and are used for providing the dependencies.
  * If this way of injection is to be used programmatically, it does not explicitly showcase mandatory nature of the dependencies.
* Through Injection Interfaces
  * Each injectable class(better be abstraction like interface) has associated injection interface with setter like method.
  * A class 'A' with dependency on 'B' implements BInjection like interface with setter like setB to be implemented.
  * IoC containers then can inject B into all classes that implements BInjection
* Through Constructor
  * All dependencies of a class are explicitly mentioned in it's constructor parameters.
  * Most natural and easiest way to implement Dependency Injection.
  * As all the dependencies are declared in the constructor, those become explicit and well documented to whoever creates instance of this class.
  * Long list of constructor parameters acts as a good indicator of a class with too many dependencies that probably is doing more that it should.

{% for file in site.static_files %}
  * [{{ file.path }}]({{ site.baseurl }}{{ file.path }})
{% endfor %}

{% highlight java %}
  {% include_relative example/violation/Book.java %} 
{% endhighlight %}

