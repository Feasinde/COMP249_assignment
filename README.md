# COMP249_assignment
Holds the source code of the COMP 249 assignment on inheritance as written by the Droids

##UPDATE 2015-10-04

Our code is organised into *packages_v1* and *packages_v2*; the former contains the code according to the specifications of part 1 while the latter contains the modifications specified in part 2: 1) all attributes are set to private and 2) the equals method checks for object nullity and class sameness, returning `false` if either condition is not met. Since `book.class` used protected attributes because of its own subclasses, the only way of complying with part 2 was to use its accessor methods within its subclasses, much like we did for `PaperPublications.class`.

##UPDATE 2015-10-01:

Our code is now organised into packages in the directory called “packages”:

* *book* contains `Book.class`, `ChildrenBook.class`, and `EducationBook.class`
* *journal* contains `Journal.class`
* *magazine* contains `Magazine.class`
* *publications* contains `PaperPublications.class`

##UPDATE 2015-09-28: 

Change of procedure guys, we better **not** use the local repository as our Java workspace. I ran into some trouble concerning the merging of our metadata folder, which Eclipse updates automatically after saving or compiling. Each one of us has a different metadata folder, which is apparently going to be different each time we update and therefore it might give us constant merging errors.

Instead, we better put our work somewhere else *and then* manually copy our source code into the repository folder and then push.

<s>The folder “comp249_assignment” within the repository is the project folder. Once you pull the contents of the repository into your computer, add this folder to your workspace on Eclipse. That way, you don't need to worry about looking up the appropriate project every time you open the IDE. Sorry if these instructions seem obvious, they weren't for me when I first started messing around git and github :p</s>

-Andrés

*These aren't the Droids you're looking for*
