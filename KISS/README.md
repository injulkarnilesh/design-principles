#KISS
KISS principle, not specific or limited to Software Development, `simply` states:
> Keep It Simple, Stupid.

It is hard to write a simple code.

To keep your code simple, you need to have very good understanding of the domain and you need to know and religiously follow other important design principles and patterns.

Knowing that your code is going to be written once, modified a few times but is going to be read a lot more times, should make you emphasize more on its simplicity and readability.


It is easy to fall for an urge to write complex code or logic because that might make you think of yourself a better programmer, but it is quite the contrary.

Writing simple code requires more efforts. You need to achieve a correct level of abstraction in your code to hide the complexities of parts of the systems from each other.
While doing that, you need to take care to not to overuse Inheritance or other constructs where they are actually not needed.

You need to put in a lot of efforts to make your code readable. Naming is one of the hardest parts of the programming.
Giving ~~correct~~ better names to classes, functions and variables, hiding enough level of details with extracting smaller functions, 
moving code pieces at appropriate places etc. can help you to achieve better readability.

Many nested conditionals, or loops can make your code very complex.
Constructs like Cyclomatic Complexity can help you measure complexity of your code and help to keep it simple.
Unit testing is another one; if the code is hard to test, it is probably not simple enough.

There are many design, programming principles that you can read, understand and follow. 
But if you come up with practices for yourself which reflect the principles, that would help you to follow those principles naturally.
Eg. Long, nested conditions in IFs should be avoided could be a principle but if you remember to use methods in IFs with appropriate names representing conditions you always follow the principle.

Refactoring your code intermittently can also help you to simplify your code.
With refactoring, your new insights into domain and programming can be incorporated into your existing code.

I highly recommend a book Clean Code by Uncle Bob for learning to write a clean code which usually is simple.
A quote from the book says :
>Any fool can write code that a computer can understand. Good programmers write code that humans can understand.
—Martin Fowler

Try to aim for `Keep it 'Stupid Simple'`, but even if you achieve simple that's great as well.