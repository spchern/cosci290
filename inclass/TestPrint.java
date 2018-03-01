/*
This application is a demo to test different
print examples
*/

// javac xxx.java to compile the file
public class TestPrint{

    //main method, where the application starts
  public static void main(String[] args){
    System.out.println("Hello World");
    System.out.println(2 + 2);
    System.out.println("cat" + 2 + 'c');
    System.out.println(2 + 'c' + "cat"); //101cat
    System.out.println("'S"); //'S
    System.out.print("'S\n"); // \n = new line
    System.out.println("Hello \t World"); // \t = tab
    System.out.println(" __________                      ___________                                      \n "
                +      "\\______   \\ ____   ____   _____ \\_   _____/ ______ ____ _____  ______   ____    \n " 
                +      " |       _//  _ \\ /  _ \\ /     \\ |    __)_ /  ___// ___\\\\__  \\ \\____ \\_/ __ \\   \n "
                +      " |    |   (  <_> |  <_> )  Y Y  \\|        \\\\___ \\\\  \\___ / __ \\|  |_> >  ___/   \n "
                +      " |____|_  /\\____/ \\____/|__|_|  /_______  /____  >\\___  >____  /   __/ \\___  >  \n "
                +      "        \\/                    \\/        \\/     \\/     \\/     \\/|__|        \\/      "
); //RoomEscape
  }
}
