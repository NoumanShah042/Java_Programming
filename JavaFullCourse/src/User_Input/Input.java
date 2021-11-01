package User_Input;
/*

Modifier and Type	Method and Description


void	close()
Closes this scanner.


Pattern	delimiter()
Returns the Pattern this Scanner is currently using to match delimiters.


String	findInLine(Pattern pattern)
Attempts to find the next occurrence of the specified pattern ignoring delimiters.

String	findInLine(String pattern)
Attempts to find the next occurrence of a pattern constructed from the specified string, ignoring delimiters.

String	findWithinHorizon(Pattern pattern, int horizon)
Attempts to find the next occurrence of the specified pattern.


String	findWithinHorizon(String pattern, int horizon)
Attempts to find the next occurrence of a pattern constructed from the specified string, ignoring delimiters.

boolean	hasNext()
Returns true if this scanner has another token in its input.


boolean	hasNext(Pattern pattern)
Returns true if the next complete token matches the specified pattern.

boolean	hasNext(String pattern)
Returns true if the next token matches the pattern constructed from the specified string.

boolean	hasNextBigDecimal()
Returns true if the next token in this scanner's input can be interpreted as a BigDecimal using the nextBigDecimal() method.

boolean	hasNextBigInteger()
Returns true if the next token in this scanner's input can be interpreted as a BigInteger in the default radix using the nextBigInteger() method.

boolean	hasNextBigInteger(int radix)
Returns true if the next token in this scanner's input can be interpreted as a BigInteger in the specified radix using the nextBigInteger() method.


boolean	hasNextBoolean()
Returns true if the next token in this scanner's input can be interpreted as a boolean value using a case insensitive pattern created from the string "true|false".

boolean	hasNextByte()
Returns true if the next token in this scanner's input can be interpreted as a byte value in the default radix using the nextByte() method.


boolean	hasNextByte(int radix)
Returns true if the next token in this scanner's input can be interpreted as a byte value in the specified radix using the nextByte() method.

boolean	hasNextDouble()
Returns true if the next token in this scanner's input can be interpreted as a double value using the nextDouble() method.

boolean	hasNextFloat()
Returns true if the next token in this scanner's input can be interpreted as a float value using the nextFloat() method.

boolean	hasNextInt()
Returns true if the next token in this scanner's input can be interpreted as an int value in the default radix using the nextInt() method.

boolean	hasNextInt(int radix)
Returns true if the next token in this scanner's input can be interpreted as an int value in the specified radix using the nextInt() method.

boolean	hasNextLine()
Returns true if there is another line in the input of this scanner.

boolean	hasNextLong()
Returns true if the next token in this scanner's input can be interpreted as a long value in the default radix using the nextLong() method.

boolean	hasNextLong(int radix)
Returns true if the next token in this scanner's input can be interpreted as a long value in the specified radix using the nextLong() method.

boolean	hasNextShort()
Returns true if the next token in this scanner's input can be interpreted as a short value in the default radix using the nextShort() method.

boolean	hasNextShort(int radix)
Returns true if the next token in this scanner's input can be interpreted as a short value in the specified radix using the nextShort() method.

IOException	ioException()
Returns the IOException last thrown by this Scanner's underlying Readable.

Locale	locale()
Returns this scanner's locale.

MatchResult	match()
Returns the match result of the last scanning operation performed by this scanner.

String	next()
Finds and returns the next complete token from this scanner.

String	next(Pattern pattern)
Returns the next token if it matches the specified pattern.

String	next(String pattern)
Returns the next token if it matches the pattern constructed from the specified string.

BigDecimal	nextBigDecimal()
Scans the next token of the input as a BigDecimal.

BigInteger	nextBigInteger()
Scans the next token of the input as a BigInteger.


BigInteger	nextBigInteger(int radix)
Scans the next token of the input as a BigInteger.

boolean	nextBoolean()
Scans the next token of the input into a boolean value and returns that value.

byte	nextByte()
Scans the next token of the input as a byte.

byte	nextByte(int radix)
Scans the next token of the input as a byte.


double	nextDouble()
Scans the next token of the input as a double.

float	nextFloat()
Scans the next token of the input as a float.

int	nextInt()
Scans the next token of the input as an int.

int	nextInt(int radix)
Scans the next token of the input as an int.

String	nextLine()
Advances this scanner past the current line and returns the input that was skipped.

long	nextLong()
Scans the next token of the input as a long.

long	nextLong(int radix)
Scans the next token of the input as a long.

short	nextShort()
Scans the next token of the input as a short.

short	nextShort(int radix)
Scans the next token of the input as a short.

int	radix()
Returns this scanner's default radix.

void	remove()
The remove operation is not supported by this implementation of Iterator.

Scanner	reset()
Resets this scanner.

Scanner	skip(Pattern pattern)
Skips input that matches the specified pattern, ignoring delimiters.

Scanner	skip(String pattern)
Skips input that matches a pattern constructed from the specified string.

String	toString()
Returns the string representation of this Scanner.

Scanner	useDelimiter(Pattern pattern)
Sets this scanner's delimiting pattern to the specified pattern.

Scanner	useDelimiter(String pattern)
Sets this scanner's delimiting pattern to a pattern constructed from the specified String.

Scanner	useLocale(Locale locale)
Sets this scanner's locale to the specified locale.

Scanner	useRadix(int radix)
Sets this scanner's default radix to the specified radix.

*/

import java.util.Scanner;

 
public class Input
{
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your name? ");
    String name = scanner.nextLine();

    System.out.println("How old are you? ");
    int age = scanner.nextInt();
    scanner.nextLine();

    System.out.println("What is your favorite food?");
    String food = scanner.nextLine();

    System.out.println("Hello "+name);
    System.out.println("You are "+age+" years old");
    System.out.println("You like "+food);
    }
}
