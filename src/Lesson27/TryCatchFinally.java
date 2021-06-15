package Lesson27;

public class TryCatchFinally {
    public static void main(String[] args) {
        int array [] = {4, 8, 1};
        System.out.println("array is created");

        // try и finally не имеют параметров, сразу тело
        try {
            System.out.println("Block try is working");
            System.out.println(array[1]);
        }

        // catch имеет параметры; catch-блоков может быть несколько
        catch (ArrayIndexOutOfBoundsException e){ // поймали exception и дали ему имя "е"
            System.out.println(e+ " Exception is catched");
        }

        finally {
            System.out.println("finally is allready working");
        }

        System.out.println("Goodbye");

    }
}
