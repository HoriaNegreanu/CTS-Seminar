Task Management application for businesses:

There are multiple types of employees, for example Programmer, QA or Project Manager. All types should be created in 
an easier using a factory. New positions may appear in the future. 

Advantages:
1. All types of employees are more easily created using the same interface.
2. All employees are handled by the same interface.
3. Changing the stucture of an employee class will trigger errors in the Factory class, not in main.

Disadvantages:
1. Harder to modify the attributes of objects. Downcasting is necessary.
2. The attributes which are not common between the different types of employees are not initialised with user values.