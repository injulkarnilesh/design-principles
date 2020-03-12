---
parent: Code Smells
---

# Primitive Obsession
This Code Smell is easy to fall for especially for lazy developers, means for all of us.

This code smell appears when 
> We use language supported primitives to represent domain objects.

This can happen 
* When developers use primitives to represent domain ideas like using String for ZipCode
* Use variables for coding information like using int ADMIN_ROLE = 1 to represent role.

Effects of this code smell are
* Primitives can have a lot of different values that might not be valid for domain.
* We can add validation, but as we don't have class to represent this domain object we will have that code spread at multiple places.
* Single responsibility and Cohesion is lost when you separate domain object values and its behaviour. 
 
To fix this, we must create and use classes to represent domain objects with values and behaviour inside them.
Mostly you would end-up having small value objects to replace these primitives. 

## References
* [DZone Article](https://dzone.com/articles/code-quality-fighting-primitive-obsession-code-sme-1)  

{% include codelink.html examples="2" %}