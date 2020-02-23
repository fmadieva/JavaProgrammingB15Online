package day59;

public class Notes {

    // Definition: An exception is an event, which occurs during the execution of a program,
    // that disrupts the normal flow of the program's instructions.


/*
The previous sections described how to construct the try, catch, and finally code blocks for the writeList method in the ListOfNumbers class. Now, let's walk through the code and investigate what can happen.

When all the components are put together, the writeList method looks like the following.

public void writeList() {
    PrintWriter out = null;

    try {
        System.out.println("Entering" + " try statement");

        out = new PrintWriter(new FileWriter("OutFile.txt"));
        for (int i = 0; i < SIZE; i++) {
            out.println("Value at: " + i + " = " + list.get(i));
        }
    } catch (IndexOutOfBoundsException e) {
        System.err.println("Caught IndexOutOfBoundsException: "
                           +  e.getMessage());

    } catch (IOException e) {
        System.err.println("Caught IOException: " +  e.getMessage());

    } finally {
        if (out != null) {
            System.out.println("Closing PrintWriter");
            out.close();
        }
        else {
            System.out.println("PrintWriter not open");
        }
    }
}
As mentioned previously, this method's try block has three different exit possibilities; here are two of them.

Code in the try statement fails and throws an exception. This could be an IOException caused by the new FileWriter statement or an IndexOutOfBoundsException caused by a wrong index value in the for loop.
Everything succeeds and the try statement exits normally.
Let's look at what happens in the writeList method during these two exit possibilities.


 */



}
