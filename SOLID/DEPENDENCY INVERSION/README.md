# Dependency Inversion
This principle is about decoupling and modularization.

This can be stated as:
> High-level modules should not depend on low-level modules. Both should depend on abstractions. 

> Abstractions should not depend on details. Details should depend on abstractions.

At class level, higher level classes are the ones which depend on services provided by other classes and these classes providing the services are refered to as lowe level classes. When such a is the case, the higher level modules should not depend on lower level modules directly.

This direct dependency could be in the form of instantiation of lower level implementation classes inside the higher level classes. This instantiation can be taken out of the higher level classes by Dependency Injection by injecting those dependencies preferably through constructor.

To take this decoupling to next level, the higher level classes should not depend on lower level class details even at compile time. To achieve this we add abstraction level between these higher level and lower level modules, could be in the form of interfaces. Then higher level classes depend on these abstraction interfaces and lower level classes also depend on these abstraction interfaces. Lower level classes need to implement this abstraction and that's why they depend on this abstraction.

This is still not a complete picture of dependency inversion. Question yet to be answered is who defines this abstracion. If Higher level module defines this abstraction then only the dependency gets inverted.

It is inverted as: 
* Earlier higher level classes were depending on lower level classes so dependency ran from higher level modules to lower level modules 
* Now after having higher level modules define abstraction in itself and higher level module depend on abstraction and lower level module also depend on abstraction present in higher level modules, the dependency run from lower level modules to higher level modules (for abstraction).

## References
* [Hackernoon Blog](https://hackernoon.com/dependency-inversion-principle-e402e5b69e70)