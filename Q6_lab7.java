class ABC {
    String a;

    ABC(String a) {
        this.a = a;
        System.out.println("ABC constructor called: " + a);
    }
}

class DEF extends ABC {
    String b;

    DEF(String a, String b) {
        super(a);
        this.b = b;
        System.out.println("DEF constructor called: " + b);
    }
}

class Main {
    public static void main(String[] args)
    {
        DEF de = new DEF("ABC", "DEF");
        System.out.println("Child constructor: "+ de.b);
    }
}

