# Premature Abstraction
Abstraction is a great programming concept that helps you to hide complexities of implementation from client and extract out common code to avoid duplication.

But, care must be taken to avoid adding layer of abstraction where it is really not required as of now.

Adding abstraction to a place where it is not required can add unnecessary layer of indirection. 
If it is done to extract common code into single place to be reused in future, which might never happen, then you are spending unnecessary time on that unnecessary abstraction.

While working on a larger problem or system, you might come across smaller sub-problems which have a few things in common. 
And there, you might feel an urge to extract that common code by adding an abstraction and making those sub-problems to extends from this new abstraction.
But that abstraction might be proved to be wrong in future as we get more clarity of the system and those sub-systems diverge from each other.
In such a cases, if we stick with common abstraction because that was already there, then that abstraction hierarchy will quickly become brittle and hard to refactor.

If it comes to choose between duplicating code or extracting common code with Abstraction, choose to duplicate code for now.
Because it is easier to extract common code later if we know for sure that that is what is right than to pull and keep together abstraction hierarchy which does not belong together. 

If you have had a premature abstraction, you will start seeing clues like need of casting or type checking.
And that is the time to rethink if that abstraction hierarchy is really worth it. 

The `DRY` principle talks more about having duplicate knowledge than about duplicate code.
So if you extracting abstract hierarchy for sake of `DRY` code, think twice.

If you understand `YAGNI`, you would rather focus on solving current specific problem at hand than trying to generalize it for future need which may never be required.

If code reuse is your aim, then please `Prefer Composition Over Inheritance`.

{% include codelink.html examples="1" %}