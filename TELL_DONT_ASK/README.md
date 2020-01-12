# Tell Don't Ask
This design principles is about reducing coupling between classes 
and maintaining proper encapsulation and cohesion of classes.

The principle states 
> You should tell objects what you want them to do; do not ask them questions about their state, make a decision, and then tell them what to do.

Problem with asking is that the calling class in reading internal state of the target class 
and then deciding something based on some logic 
and then asking the target class to do something.
* The calling class need to know and use internal state of the target class violating its encapsulation.
* The calling class now is coupled with target class for two things one for reading the state and other for asking what to do.
* If the logic of deciding whether to ask to do something or not is depending only on the internal state of the target class, then that logic better be within the target class maintaining high cohesion of it.

If you tell the target class in the form of commands what to do instead of enquiring its state and then asking it to do the same, then you achieve :
* Loose coupling between target class and calling class as calling class does not need to know internal state of target class.
* Target class can make the same decision based on its own state maintaining the logic that acts on its state within itself.

Following this principle you may end up exposing more behaviours from target classes otherwise required, but you get more loosely coupled class structure.

This principle is related with following:
* Encapsulation
  *  Target class may not need to expose the internal state if logic that depends on it is moved into this class.
* Cohesion 
  * With moving logic that depends on object's state inside that class, you are achieving good object oriented design by putting related state and behaviour together.
* Law of Demeter
  * This can be considered as an extension of Tell Don't Ask principle avoiding train-wreck kind of code.     


   