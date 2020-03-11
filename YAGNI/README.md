# You Aren't Gonna Need It
This is more of a Software Engineering principle that a design principle.

It was introduced as one of XP(extreme programming) principles of agile software development.

It says
> Do not add any functionality until it's deemed necessary.

Simply said, don't write any code or functionality that you don't need in current situation.

It is very hard to predict future functionality changes or requirements, so it is better to avoid implementing them beforehand.
Not implementing them avoids rework if those change come with different requirements or don't come at all where the code should be deleted.

It is important to make code extensible though, with other design principles like `Open Closed Principle`, `Dependency Inversion` etc; 
so that when new requirements come, the existing code is extended with minimum changes to accommodate them.

This principle simply says even if you see changes coming in future, don't implement them now;
but it does not stop you from considering those changes to make you existing code ready for them.

It goes with the saying
> The best code is no code at all.  