package HeadFirst.Ep1.Ep1;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by јдминистратор on 01.04.2016.
 */
public class Student
{
    private int number;
    private String name;
    private int age;

    public boolean equals(Object o)
    {//переопредел€ем метод equals
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (number != student.number) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {//переопредел€ем метод hashCode
        int result = number;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    public int getNumber()
    {

        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Student(int number, String name, int age)
    {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    public String toString()
    {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public static void main(String[] args)
    {


        Map<String, Student> map = new Hashtable<String, Student>();
        Student st = new Student(0, "Alex", 18);
        Student er = new Student(1, "Dno", 22);
        Student var = new Student(2, "Loh", 23);
        map.put("Alex", st);
        map.put("Dno", er);
        map.put("Loh", var);//добавл€ю студента Alex по ключу Alex
        System.out.println(map.get("Alex"));//работает
        System.out.println(map.get("Al" + "ex"));
        System.out.println(map.get("Dn"+"o"));
        System.out.println(map.get("Loh"));
        System.out.println(map.get(st.getName()));//работает
        String s = "a";//пытаюсь обмануть компил€тор
        s = s.toUpperCase() + "lex";
        System.out.println(map.get(s)); //работает

    }
}

