package farmacie;

/*
public class Person {

   public int number;
}

*/
/*class Student extends Person{

    public void talk(){
        System.out.println("fgh");
    }
}*/


public class Atom {
    Atom() {
        System.out.println("atom");
    }

}

class Rock extends Atom{
    Rock(String type){
        System.out.println(type);
    }
}

class Mountain extends Rock{
    Mountain(){
        super("granite");
        System.out.println("mountain");
        // new Rock("granite");
    }

    public static void main(String[] args) {
        new Mountain();
    }
}