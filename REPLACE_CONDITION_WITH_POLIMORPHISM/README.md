---
parent: Design Principles
---

# Replace Conditional With Polymorphism
If you have code that splits a flow or acts differently based on some condition with limited values, with constructs like `if` or `switch` statements,
then that code naturally violates Open Closed principle because to add a new conditional flow you will have to modify that class.

Such a conditional check, if not designed correctly, is likely to be duplicated at multiple places.
 
This principle suggests to use polymorphism to replace the conditional.

Idea is to add new conditional flow as a new implementation of well defined abstraction instead of a new case in `if-else` ladder or `switch` statement.

In many cases, you can not get rid of all the conditionals 
as somewhere you will have to make a decision to choose the correct implementation of inheritance hierarchy.
But idea is to limit such conditionals, probably, to a single place instead spreading it all over the code.

If can not be completely gotten rid of, the single conditional should be at boundaries of the code integrations.
Prefer to have the code flow split as early as possible, so that maximum of code would be independent of the conditional. 

Advantages of this are:
* Code duplication will be removed, because conditional comparison if not moved to single place is likely to be replicated at multiple places.
* This enables the **Open Closed principle**, making it easy to add new conditionals by extending hierarchy rather than modifying the same code.

This principle has a slight variation where Composition is used instead of Polymorphism and is known as 
Replace Conditional With State/Strategy Pattern.
When you have only single method that varies behaviour with condition or there is not explicit `is-a` relationship in hierarchy you might create, 
then consider composition over inheritance.
