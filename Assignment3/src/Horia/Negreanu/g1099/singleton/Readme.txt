Task Management application for businesses:

When working with the database there should exist only one instance at most of the connection to the DB.

Advantages:
1. We avoid duplicate operations in the database.
2. The connection to the database is created only when necessary

Disadvantages:
1. Only performing one operation at a time on the database might affect the performance
2. In multithreading, different threads trying to perform operations on the same connection might lead to conflicts,
leading to one thread possibly not successfully being able to complete its operations.