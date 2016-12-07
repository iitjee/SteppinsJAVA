//You can see all errors in the 'Problems' Category in the file-structure drop-down menu


/* https://docs.oracle.com/javase/tutorial/essential/exceptions/definition.html
When an error occurs within a method, the method creates an object and hands it off to the runtime system. The object, called an exception object, contains information about the error, including its type and the state of the program when the error occurred. Creating an exception object and handing it to the runtime system is called throwing an exception.
After a method throws an exception, the runtime system attempts to find something to handle it. The set of possible "somethings" to handle the exception is the ordered list of methods that had been called to get to the method where the error occurred. The list of methods is known as the call stack
The runtime system searches the call stack for a method that contains a block of code that can handle the exception. This block of code is called an exception handler. 
The search begins with the method in which the error occurred and proceeds through the call stack in the reverse order in which the methods were called. When an appropriate handler is found, the runtime system passes the exception to the handler.
An exception handler is considered appropriate if the type of the exception object thrown matches the type that can be handled by the handler.

The exception handler chosen is said to catch the exception. If the runtime system exhaustively searches all the methods on the call stack without finding an appropriate exception handler, as shown in the next figure, the runtime system (and, consequently, the program) terminates.

Using exceptions to manage errors has some advantages over traditional error-management techniques.
*/

/* https://docs.oracle.com/javase/tutorial/essential/exceptions/catchOrDeclare.html
The Catch or Specify Requirement:
A code that might throw certain exceptions must be enclosed by either of the following:
A try statement that catches the exception. The try must provide a handler for the exception, as described in Catching and Handling Exceptions.
A method that specifies that it can throw the exception. The method must provide a throws clause that lists the exception.

The Three Kinds of Exceptions:
- checked exception (exceptional conditions that a well-written application should anticipate and recover from)
EG: suppose an application prompts a user for an input file name, then opens the file by passing the name to the constructor for java.io.FileReader. Normally, the user provides the name of an existing, readable file, so the construction of the FileReader object succeeds.
But sometimes the user supplies the name of a nonexistent file, and the constructor throws java.io.FileNotFoundException. A well-written program will catch this exception and notify the user of the mistake, possibly prompting for a corrected file name.

All exceptions are checked exceptions, except for those indicated by Error, RuntimeException, and their subclasses.
Checked exceptions are subject to the Catch or Specify Requirement

- Error: (exceptional conditions that are external to the application, and that the application usually cannot anticipate or recover from.)
Eg: suppose that an application successfully opens a file for input, but is unable to read the file because of a hardware or system malfunction. 
The unsuccessful read will throw java.io.IOError. An application might choose to catch this exception, in order to notify the user of the problem — but it also might make sense for the program to print a stack trace and exit.

 Errors are those exceptions indicated by Error and its subclasses.
 Errors are not subject to the Catch or Specify Requirement.
 
 - Runtime Exception: (exceptional conditions that are internal to the application, and that the application usually cannot anticipate or recover from.)
Eg: consider the application described previously that passes a file name to the constructor for FileReader. If a logic error causes a null to be passed to the constructor, the constructor will throw NullPointerException. 
The application can catch this exception, but it probably makes more sense to eliminate the bug that caused the exception to occur.

These usually indicate programming bugs, such as logic errors or improper use of an API.
Runtime exceptions are those indicated by RuntimeException and its subclasses.
Runtime exceptions are not subject to the Catch or Specify Requirement.

Errors and runtime exceptions are collectively known as unchecked exceptions.

Bypassing Catch or Specify:
Some programmers consider the Catch or Specify Requirement a serious flaw in the exception mechanism and bypass it by using unchecked exceptions in place of checked exceptions. In general, this is not recommended. 
*/
