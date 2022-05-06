To develop an online game (with superheroes) implement a software solution that allows:

Decorator - add a shield without modifing abstractHero or Knight
1. Changing the characteristics of some superheroes during the game / run-time
- During the game superheroes can be equipped with new equipment
- The superhero's behavior can change dynamically depending on the interaction with the other characters in the game

Facade
2. In order to allow other companies or players to develop external solutions that connect to the game, a library (an API)
 must be developed.
- The API contains many classes with many details
- not all classes are documented
- The API should provide a simplified interface for a set of basic functions

Proxy (login) - about adding an extra layer without changing the base class (the login class in this case)
Proxy changes the flow, not the class
3. At this moment the login is based on username and password and if the password is wrong the user can try several times
- there are attacks on the players' accounts and the attacker guesses the password related to the account after several attempts
- it is desired to modify the login module by limiting the number of attempts to a maximum of 3/add 2 step authentication
- the existing login module must be modified without interrupting the game

Composite
4. Create the possibility that the players and the game should be able to handle groups of characters
- multiple players or NPCs can be grouped together
- groups can grow by including other groups or individual characters
- some characters can control groups

FlyWeight - when memory is a problem. Prototype is when time is a problem
5. To efficiently manage (from a memory point of view) scenarios in which players interact with multiple computer-controlled characters find a solution based on:
- the collection of computer-coordinated characters contains elements of the same kind (the same 3D models)
- the space occupied by a 3D model is significant
- generating such a scenario requires a significant memory space for the client
- 3D models are displayed on the screen at different coordinates and can have textures of different colors
- an efficient solution must be found regarding the management of these situations