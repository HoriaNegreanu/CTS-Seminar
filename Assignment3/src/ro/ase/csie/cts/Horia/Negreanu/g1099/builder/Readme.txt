Task Management application for businesses:

When creating a task the user should be able to create one without giving values to all the attributes, but there
are also some attributes which are mandatory.

Advantages:
1. Since not all attributes are necessary for a task, this allows the user to select which attributes of the tasked are assigned.
2. Not all parts of the object are necessarily created, which leads to better performance.

Disadvantages:
1. Attributes which are not mandatory might be omitted by mistake.
2. If the setters are private, it is not possible to change attributes after building the object.