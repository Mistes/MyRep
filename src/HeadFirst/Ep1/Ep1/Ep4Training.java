package HeadFirst.Ep1.Ep1;

/**
 * Created by Администратор on 15.02.2016.
 */
public class Ep4Training
{
    public static void main(String[] args)
    {
        Cat cat = new Cat(5,5);
        Cat cat2 = new Cat();
        Cat cat3 = new Cat(cat);
        System.out.println(cat3.Volume() + cat.Volume());

    }
   static class Cat{
       int Volume(){return age * birthsday;}
        int age;
        int birthsday;
        Cat(int i, int j){
            age = i;
            birthsday = j;
        }
       Cat(int i){
           this(i,i);
       }
       Cat(){this(0);}
       Cat(Cat no){
       age = no.age;
           birthsday = no.birthsday;
       }
    }



}
