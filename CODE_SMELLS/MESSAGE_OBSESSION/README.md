# Message Obsession
Not so well known code smell, which can be seen when avoiding/fixing primitive obsession is taken too far and many domain specific methods are added to classes.

This code smell is observed when we fail to extract parameter from set of methods of some class. 
That leaves us with multiple methods with similar nomenclature which operate the same way except for data it uses which rather could have been parameter to a single method replacing these methods.

## Drawbacks 
* Because there are multiple methods in place of single method, you would have a switch or if else ladder to call appropriate method on appropriate requirement.
Such a conditional is yet another well known code smell.  
* With multiple methods only varying in data they use, we have a code duplication which can be removed if we extract that varying data into parameter.

## References
* [Nat Pryce Article](http://www.natpryce.com/articles/000816.html)