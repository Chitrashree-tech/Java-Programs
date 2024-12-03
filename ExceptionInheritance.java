import java.util.Scanner;
class WrongAgeException extends Exception {
    public WrongAgeException(String message) {
        super(message);
    }
}

class Father {
    int fage;
    public Father(int fage) throws WrongAgeException {
        if (fage < 0) {
            throw new WrongAgeException("Father's age cannot be negative.");
        }
        this.fage = fage;
    }
}
class Son extends Father {
    int sage;
    public Son(int fage, int sage) throws WrongAgeException {
        super(fage); 
        if (sage < 0) {
            throw new WrongAgeException("Son's age cannot be negative.");
        }
        if (sage >= fage) {
            throw new WrongAgeException("Son's age cannot be greater than or equal to father's age.");
        }
        this.sage = sage;
    }
}
public class ExceptionInheritanceDemo {
    public static void main(String[] args) {
        try {
            Father father = new Father(45);
            Son son = new Son(45, 18);
            System.out.println("Father's age: " + father.fage);
            System.out.println("Son's age: " + son.sage);
            Father father = new Father(-45); 
        } catch (WrongAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            Son son = new Son(40, 50); 
        } catch (WrongAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
