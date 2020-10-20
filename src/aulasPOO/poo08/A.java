package aulasPOO.poo08;

class A {

    public A() {

        System.out.println("Construtor A");

    }

}

class B extends A {

    public B() {

        System.out.println("Construtor B");

    }

}

class C extends B {

    public C() {

        super();

        System.out.println("Construtor C");

    }

}

class D extends C {

    public D() {

        super();

        System.out.println("Construtor D");

    }

}

class E extends D {

    E() {

        System.out.println("Construtor E");

    }

    public static void main(String[] args) {

        E x = new E();

    }

}
