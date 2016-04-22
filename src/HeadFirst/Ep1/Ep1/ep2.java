package HeadFirst.Ep1.Ep1;

/**
 * Created by Администратор on 11.02.2016.
 */
public class ep2
{
    public static void main(String[] args){
        Dog d = new Dog();
        d.size = 40;
        d.bark();
        d.name = "Tuzik";
        d.breed = "Toy4ik";
        System.out.println(d.size + d.breed + d.name);

    }
   public static class Dog  {
        int size;
        String breed;
        String name;

        void bark(){
            System.out.println("Gav Gav");
        }
    }
}
