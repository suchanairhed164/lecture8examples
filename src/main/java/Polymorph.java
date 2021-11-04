/*
class Parent {
    int a=2;
}
class Child extends Parent {
    int a=3;
}

 */
/*
class Parent {
    static int a=2;
}
class Child extends Parent {
    static int a=3;
}

 */
class Parent {
    public int getValue() {
        return 0;
    }
    public void print() {
        System.out.println(getValue());
    }
}

class Child extends Parent {
    public int getValue() {
        return 1;
    }
}