Task Management application for businesses:

We want to send a message to certain employees. The contents of the message are read from a file, which takes some time.
A better solution would be to create more instances of the same message without reading from the file more than once, the first
time, and then change the destination.

Advantages:
1. Not having to redo operations which take time, like reading from a file, leads to better performance.
2. Easier to call then a constructor with parameters.

Disadvantages:
1. Since copy of the object is returned by the clone() method, changes which might be needed, but overlooked, resulting in
two objects which do the same thing.
2. A bad implementation of the clone() method might lead to a shallow copy.