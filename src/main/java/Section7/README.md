# Section 7: OOP part 2 - Composition, Encapsulation and Polymorphism

###Composition
Modeling parts of a whole (e.g computer has motherboard, case, monitor)
and these classes don't extend since we can only inherit from one class at a time.

The [Computer Class](./lectures/composition/Computer.java) doesn't extend to 
[Case Class](./lectures/composition/computer/Case.java), [Monitor Class](./lectures/composition/computer/Monitor.java),
or [Motherboard Class](./lectures/composition/computer/Motherboard.java) since it's composed by all three classes.

###Encapsulation

Mechanism that restricts access to certain components of the objects created (restrict access from another class).

By making the attributes private makes them inaccessible to any class outside like in 
[this example class](./lectures/encapsulation/encapsulation/EnhancedPlayer.java).

###Polymorphism
Mechanism in OOP that allows actions to act different based on the actual object that the action is being 
performed on.

As we assign different functionalities to plot method on the class 
[Movie](./lectures/polymorphism/Movie.java) depending on the object that
was created (for example the plot difference between [Independence Day](./lectures/polymorphism/IndependenceDay.java)
and [Jaws](./lectures/polymorphism/Jaws.java).

