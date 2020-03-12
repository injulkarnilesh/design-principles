# Cohesion And Coupling
While designing a system, aim for high cohesion and loose coupling in the system.

In simple words
> * High Cohesion is when things which should be together are together. 
> * Loose Coupling is when things which should not be together are not together.

### Cohesion
Cohesion is a measure of how the related pieces in the system are placed near to each other, probably in a single unit.
If things are related to each other functionally, or should act together as a single unit, then those should be bundled together.

Higher cohesion means code pieces which are related to each other are put into same module or class etc.; 
and they work together with a `Single Responsibility`. 
With higher cohesion, changes related to one functionality require changes, ideally, at single place only. 

Lower cohesion means code for some responsibility is scattered at multiple places; 
so when you are to make any changes related to that responsibility then you need to make changes at multiple places.

### Coupling
Coupling is measure of interdependence between pieces.
If code pieces are not related to each other, them there is no reason to put them together or have them connected by some direct way.
 
Lower coupling means system or code pieces work, and can be changed independent of each other.
There are multiple principles that come handy for designing a system with lower coupling like:
`Dependency Inversion`, `Law Of Demeter` etc.

Higher coupling means modules or code pieces are coupled with each other where they should/need not be.
Higher coupling makes changes in system difficult or makes changes propagate to multiple places, even unrelated places.

{% include codelink.html examples="1" %}