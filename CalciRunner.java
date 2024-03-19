class Calci {

    public static void sum() {
        System.out.println("Welcome to sum");
    }

    public void sub() {
        System.out.println("Welcome to sub");
    }
}

class CalciRunner {

    public static void main(String args[]) {

        Calci c = new Calci();
        c.sum();
        c.sub();
    }
}