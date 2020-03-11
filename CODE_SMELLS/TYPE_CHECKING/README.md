---
parent: Code Smells
---

# Type Checking
One of the reasons you need type checking is before down casting, 
and as down casting is itself a code smell and should be avoided, we can get rid of this reason for type checking.

If you need to check type of an object to decide something, or use it in some logic then you are doing it even worse than needing it for down casting.
The fact that your logic depends upon type of an object is something to worry about.

You have an object, that means you know what its current type is,
and if you are checking type of it with some other type, then that type most probably is of subtype/implementation of current known type.

Type checking implies following:
* Your code and logic depends upon subtype/implementation as you need to check type (actual implementation) of what should have been pure abstraction.
* This dependency on implementations makes code `more coupled` to details of implementation.
* As you depend on implementation, that means you could have got your abstraction wrong.
* As type checking are conditionals and *conditionals tend to breed*, 
your code would require changes when new types (so the new conditions) are added, making your code violate `Open Closed Principle`.    
* Your type checking conditionals can be replaced with polymorphism with right abstraction.

Such a well known feature can act as great hint for design problems that need fixing.
