Task Management application for businesses:

We already have out own tasks with our already defined functions. 
We want to also implement tasks from a different platform which uses a different library (will be called ExternalTask).

Advantages:
1. Already existing class and the newly added class are not modified.
2. Multiple adapters can be created for each newly added class.

Disadvantages:
1. Depending on the functions offered by the newly imported class, a case may appear in which not all functions of the 
existing class can be adaptapted from the new class.