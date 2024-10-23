// 1.1 Tilføj fire metoder
public class Flows {

public void methodA(String input) {
    if (input.equals("start")) {
        System.out.println("J");
        System.out.println("a");
        methodB(input);
    } else {
        System.out.println("a");
        methodC("Java er sjov");
        System.out.println("o");
        methodB("end");
    }
}

public void methodB(String input) {
    if (input.equals("start")) {
        System.out.println("v");
        methodA("continue");
    } else {
        System.out.println("v");
        System.out.println("t");
    }
}

public int methodC(String input) {
    System.out.println("e");
    methodD(input.length());
    return input.length() * 2;
}

public void methodD(int number) {
    System.out.println("r");
    if(number > 5) {
        System.out.println("s");
    }
    System.out.println("j");
}
}
