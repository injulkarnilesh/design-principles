---
parent: Design Principles
---

# DRY
DRY stands for "Don't Repeat Yourself".
Here repeating is not about repeating a code but about duplicating business logic or business idea.

From the wording, it may sound like don't copy-paste your code at multiple places; but it is not about code duplication; it is more about business knowledge duplication. 
And it is stated as : 
> Every piece of knowledge must have a single, unambiguous, authoritative representation within a system.

Here, knowledge is representation of business functionality or a business entity.

This principle is related to `Single Responsibility Principle`.
If some business knowledge or logic belongs to some unit of code and we place it there only, then we can achieve DRY.

Code duplication could cause business logic duplication, but not all code duplications cause that. 
DRY only refers to those duplications which causes business logic to be represented in same or different way at multiple places.
And when that happens, updates to such a scattered business logic requires a lot of efforts, and leaves behind chances of missing a few places causing bigger issues.

Like premature abstraction, it is not recommended to premature DRY your code.
As long as business knowledge is not being duplicated at places, you can go ahead with code duplication, *conditions applied. 

For some code pieces, which now may seem duplicate, if there are slightest chance of those going in different paths in future, 
you better duplicate that code from now itself than have those extracted into a common place and then in future adding conditional there for accommodating those different paths. 

What worst you can do is to avoid code duplication or for purpose of reusing some code, you add inheritance hierarchy when there exists no is-a relationship.
Such a code is very soon going to be a pain to maintain.

### References
* [The Valuable Blog Post](https://thevaluable.dev/dry-principle-cost-benefit-example/)