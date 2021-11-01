package Exception_Handling;


import java.util.InputMismatchException;
import java.util.Scanner;

/*
 There are some important methods available in the Throwable class which are as follows:

public String getMessage() – Provides information about the exception that has occurred through a message, which is initialized in the Throwable constructor.
public Throwable getCause() – Provides root cause of the exception as represented by a Throwable object.
public void printStackTrace() – Used to display the output of toString() along with the stack trace to System.err (error output stream).
public StackTraceElement [] getStackTrace() – Returns an array with each element present on the stack trace. The index 0 element will symbolize the top of the call stack, and the last element of array will identify the bottom of the call stack.

*****************************************************************************

In Java exceptions under Error and RuntimeException classes are unchecked exceptions,
everything else under throwable is checked.

Throwable class and Exception class and its sub classes all put together is called as Checked Exception.
Error and RuntimeException  and all its Sub classes is known as Unchecked Exception

*****************************************************************************

There are basically 3 types of exceptions/abnormal conditions –

Checked Exceptions
Unchecked Exceptions
Errors


1) Checked Exception ************************  
    The classes that extend Throwable class except RuntimeException and Error are known as checked exceptions
    
        Some of the Checked exceptions are:
        IOException
        SQLException
        FileNotFoundException
        ClassNotFoundException
        MalformedURLException
        InvocationTargetException

    * checked at compile time.  
    * must be handle using try-catch or specified using throws keyword
    

2) Unchecked Exception  ************************  
    The classes that extend RuntimeException are known as unchecked exceptions

    Some of the Unchecked Exceptions are:
    ArithmeticException
    NullPointerException
    NumberFormatException
    ArrayIndexOutOfBoundsException
    IllegalArgumentException
    programming bugs like logical errors,
    and using incorrect APIs.

    * Unchecked exceptions are not checked at compile-time rather they are checked at runtime.
    * Unchecked exceptions also called as Runtime exceptions.
 

3) Error   ************************  
    Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc.

 
*/

/*

ways to handle exceptions
1) throw keyword
2) try-catch block

 */
public class exception_handling 
{
 public static void main(String[] args) {
		
            // exception = 	an event that occurs during the execution of a program that,
            //				disrupts the normal flow of instructions

            Scanner scanner = new Scanner(System.in);

            try {

                    System.out.println("Enter a whole number to divide: ");
                    int x = scanner.nextInt();

                    System.out.println("Enter a whole number to divide by: ");
                    int y = scanner.nextInt();

                    int z = x/y;

                    System.out.println("result: " + z);
            }
            catch(ArithmeticException e) {
                    System.err.println("You can't divide by zero! IDIOT!"); //  show error in red color
                    //System.out.println("You can't divide by zero! IDIOT!");
            }
            catch(InputMismatchException e) {
                    System.out.println("PLEASE ENTER A NUMBER OMFG!!!");
            }
            catch(Exception e)   // this universal catch block should be at last 
                                // otherwise other catch blocks are useless and cause error

            {
                    System.out.println("Something went wrong");
            }
            finally {
                // this will always run after try catch
                //  can be used before we move to the rest of the code 
                    scanner.close();
            }

    }
}


