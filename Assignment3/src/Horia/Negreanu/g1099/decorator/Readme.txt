Task Management application for businesses:

A task normally does not have files. Using a decorator add the functionality to a task to contain files and make sure they
are also deleted from the file system when deleting the task.

Advantages:
1. Adds new functionality to object, at run-time
2. Does not change base class
3. Can be handled using the same abstract class (AbstractTask).

Disadvantages:
1. Can become confusing if more decorators are used, causing unexpected behaviour.
2. Removing decorators can be tricky, depending on how many are applied to an object.