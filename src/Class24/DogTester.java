package Class24;

public class DogTester {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.apperance();
        d.bark();
        d.eat();
        d.sleep();


        d=new bulldog();
        bulldog b=(bulldog) d;
        b.special();
        b.hunt();
        b.apperance();
    }
}
