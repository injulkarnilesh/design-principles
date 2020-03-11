---
parent: Design Principles
---

# Programming to Interfaces

This principle suggests that you write your code such that it depends upon interfaces, contracts, abstraction of dependencies and not their implementations.

This means that the code should depend on "what" the dependencies do instead of "how" they do it.

`Interfaces` here is a used as a concept from Object Oriented constructs, and not necessarily interfaces in programming languages like Java. 
You can think of them more like contracts between two parties.
Client code knows only the contract as to what all things the dependencies can do. Client does not need to know how those behaviours are implemented.

Though using interfaces is a common way to programming to interfaces at code level, at higher level you can think of examples like
API (Application Program Interface) or CLI (Command Line Interface) as ways to programming to interfaces.

With API, REST API for example, client code of the REST API only knows the contract as to what URL is, what parameters are, what body is etc. The client of the REST API does not need to know how that REST service is actually implemented.
Similarly, for CLI, you, while using it, know only what command to use and what parameters to pass, you don't know or need to know how that command does what it does.
 
Advantages of Programming to Interfaces are manifold
* Loose coupling between client code and the implementations.
* Implementation can be changed to do things differently or different implementation could be used without client even noticing it.
* Testability is achieved as implementation can be easily mocked. Helps with TDD to write a tests without actual behaviour yet.