# PRG1203-Assignment
How-To's:
1. git clone (HTTPS Git Repo URL)
2. Always do git pull --all or --rebase (Just in case) //If you have the repo setup on your laptop.
3. git add . //For commits only
4. git commit -m "Test commit"
5. git push -u origin main
6. //NOTE: MAKE SURE TO HAVE YOUR TOKEN SET UP PROPERLY.//
7. git config --global user.name "[your-username]"
8. git config --global user.email "[your-email]"


BONUS:
1. You guys can also do git branching so It wouldn't mess with the main branch.
2. git branch your-branch
3. git branch //This is just to check if it worked
4. git checkout your-branch
5. If you are pushing something just refer back to How-To's No.3 and 4
6. git push -u origin your-branch
7. git status //To check the current branch

How-To Update:
1. To update your branch just run:
2. git checkout your-branch
3. git merge main
4. and then make sure to git push -u origin your-branch 


Guidelines:
1. Identify the classes and their attributes.
2. Determine the class relationships.
3. Create a UML Diagram to visualize the design.
4. Initiate the coding phase.

Criteria:
1. Modularity: The program is divided into classes and objects, with each class having a clear
and distinct responsibility. This promotes code reusability and maintainability.
2. Encapsulation: Classes encapsulate their data (attributes) and behavior (methods),
restricting direct access to internal state. Access to data is controlled through getter and
setter methods.
3. Inheritance: Inheritance is used when a class shares common attributes and behavior with
another class. It allows for code reuse and the creation of specialized classes based on a
common base.
4. Polymorphism: Polymorphism enables objects of different classes to be treated as objects of
a common superclass. It allows for flexibility and dynamic method dispatch.
5. Loose Coupling: Objects are loosely coupled when they interact with each other through
well-defined interfaces. This reduces the interdependence of components, making the
system more flexible and maintainable.
6. High Cohesion: Classes and modules should have a single, well-defined purpose, with
methods and attributes that are closely related. This minimizes the need for excessive
dependencies between classes.
7. Single Responsibility Principle (SRP): Each class should have only one reason to change,
meaning it should have a single responsibility. This principle leads to more maintainable and
understandable code.
8. Code Reusability: Reusable components (classes, libraries, and modules) are designed to
minimize redundancy and promote efficient code reuse.
9. Consistent Naming and Coding Conventions: Adherence to consistent naming conventions
and coding styles improves the readability and maintainability of the codebase.
10. Flexibility and Scalability: Object-oriented design should allow the program to evolve and
scale over time by accommodating new features and changes without major overhauls.

To-Do List:
1. Report that include:
a. Cover page with the team group ID, team members name and student ID.
b. UML diagram (class and class relationship diagram) that includes all the classes and
class relationships of the system.
c. Reflection that includes:
i. A description of the object-oriented concepts you have applied in the
assignment (e.g. design of classes, inheritance, polymorphism, etc.).
ii. A description of the add-on feature(s) you have implemented in the
assignment.
d. Video URL for item (2)
2. A short video (not more than 3 minutes) that describe and show the program is working for
the basic features and any add-on feature(s) you have implemented. Upload the video to
YouTube and attach the URL in the report.
3. Project/solution files, including all the source code (*.java) and application program. (Note:
zip the whole project folder).



