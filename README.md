# CSC120-A3: Chatbot

## Outline
This assignment has two main purposes. The first is to help you become familiar with some of the resources available to help you succeed in the course, and get you used to using them. The second is to review the programming concepts you learned in CSC 110 (or its equivalent), while beginning your introduction to Java and object oriented programming. This assignment should use techniques and ideas that are already familiar to you, but implementing them using the Java syntax and compiler will be new.

You will document your work on the assignment in a written journal entry. These reflections, which you will complete each week, will serve as a chance to consider and describe what you have learned from the assignment, any areas where you had trouble, etc. For this assignment in particular, you will augment it with the information described below. This part of each week's assignment should be prepared alongside the code, in a file called ``reflection.md``. More details may be found below.

All the files necessary for this assignment are contained within this repository. For each assignment, your submission will always include:
* all files necessary to compile your program
* the interface your solution must adhere to
* ``reflection.md`` containing your reflections and notes
* ``rubric.md`` where you document which elements of the assignment you have attempted and/or completed
* future assignments may also ask for additional specific elements

## Resource Exploration
Most learning experiences are more fun when shared, and programming is no exception. Your classmates can serve as a source of support, inspiration, and ideas. Read the policy on collaboration in the syllabus and notice how much freedom it gives you to discuss the project with your peers. **We encourage you to use that freedom!**

Find at **least two classmates** with whom you can discuss this assignment. We recommend doing this _before_ you start writing the program (but don't let this become a reason to delay getting an early start). You may fulfill this requirement at any point before submitting your ``readme.md``. Make sure you identify which classmates you talked with (since this is mutual, they should also identify you in their reflection!), and note any ways that your conversation changed your thinking about the assignment.

Check the professors' office hours and the TA help session hours, and attend at least one. Record in your reflection which session(s) you attended, and any ways that it changed your thinking about the assignment.

## Program: `Conversation.java`
For the main part of the assignment, you will write in Java a program similar to those you might have written in CSC 110 or other introductory course. The program you will write is a basic chatbot, a form originally popularized by the [program called Eliza](http://psych.fullerton.edu/mbirnbaum/psych101/eliza.htm). Your program will carry out a simple back-and-forth conversation with the user, like this:

 - It will first ask the user to choose a number of rounds of conversation. 
 - Next, it will print a short greeting to start the conversation (such as `"Hi there!  What's on your mind?"`)
 - Then it will take turns accepting input from the user and printing responses until the specified number of rounds are complete. 
 - Finally, it will say goodbye and then print a transcript of the entire conversation.

If at any point the user's input contains pronouns or other words that can be mirrored ("I" <-> "you" for example) then the computer's next response will be a mirrored version of the previous statement. Otherwise, it will select a random response from a set of pre-made ("canned") phrases. Below is an example conversation:

```
$ java Conversation
How many rounds?  2

Hi there!  What's on your mind?
I'm thinking about clouds.
You're thinking about clouds?
Yes, but nothing very profound.
Mmm-hm.
See ya!

TRANSCRIPT:
Hi there!  What's on your mind?
I'm thinking about clouds.
You're thinking about clouds?
Yes, but nothing very profound.
Mmm-hm.
See ya!
```

Your program should be able to mirror the following sets of words (at minimum):
* I -> you
* me -> you
* am -> are
* you -> I
* my -> your
* your -> my

You may expand this list if you wish.

## Interface
`Conversation.java` must implement the `Chatbot.java` interface. For this assignment, we've given you skeleton code that "implements" each method in the interface (currently each method does nothing) and provides Javadoc comments for each method. Your job is to modify the body of each method to complete its task. The purpose of this skeleton code is to help you think about solving this assignment in an object-oriented way. Pay attention to the call signatures and Javadoc comment for each method; they tell you the return and parameters, and give a brief description of the method's task.

## Hints
Start early on this assignment to give yourself plenty of time to plan and implement your program. Although you may have written a similar program before, many things are different with Java.

For this assignment, you will not be required to catch `Exceptions` that might be generated by the user entering unexpected input (such as something non-numeric for the number of conversation rounds). You also don't need worry yet about creating multiple classes; a single class with static fields and methods will do.  

Because Java has an extensive web presence, you may be able to find code on the web related to this and other assignments. Resist the temptation to copy from these sources! Code taken from the web will not necessarily meet the requirements of this assignment, even if it solves the same general problem. Furthermore, representing someone else's work as your own is a violation of the Honor Code. (That said, looking at related examples for ideas and general concepts is fine, as long as you cite your sources and then proceed to write the program on your own.)

## Grading
The file ``checklist.md`` shows the items on which your program will be graded.  As before, you are asked to enter your own assessment of these points and submit it with the rest of your work.  

_Some advice:  Start small, slow, and simple - S^4! First priority is to get a basic program running; you can add and debug features once you have the framework established. Use the levels in `rubric.md` to help you figure out where to start. This generally works out better than trying to write everything first and then debugging all at once._

Your written reflection will be graded only based on the thought and effort displayed by the entry; all reasonable submissions will receive full credit. For this assignment, the reflection prompts ask you describe the differences between Python and Java that you observed / experienced while completing the assignment. 

- What are your initial impressions of Java? 
- Can you draw any conclusion about programming in general from the similarities or the differences between Python and Java? 

You may also use the reflection as a means of expressing to me parts of the assignment that you found difficult, did not complete, etc. Rest assured: your grade will NOT be negatively impacted because you tell us that something is unclear to you; in grading, we will rely only on the evidence of the programs and supporting documentation you submit. The reflection serves simultaneously as a means of self-improvement for the student, a form of feedback for the professors, and a way for the class to share ideas as a group. A final reminder: don't forget to tell us which TA / office hours session(s) you visited!
