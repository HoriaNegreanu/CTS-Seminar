Task Management application for businesses:

We have the ability to delete a file or a task. When deleting a task from the database, 
find a solution to also delete all files associated with that task.

Advantages:
1. The base classes are not modified.
2. Certain action (delete task and all its data in this case) is more easily called.

Disadvantages:
1. A new wrapper object of has to be declared in order to see the methods, which are otherwise hidden.
2. Might also run make some unneeded operations, which would have a negative impact on performance.