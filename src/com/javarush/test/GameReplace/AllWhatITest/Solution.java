package com.javarush.test.GameReplace.AllWhatITest;

import com.javarush.test.level17.lesson10.bonus01.Person;
import com.javarush.test.level17.lesson10.bonus01.Sex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution
{
    public static List<Person> allPeople = new ArrayList<Person>();

    static
    {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String data = reader.readLine();
            String[] parsed = data.split(" ");
            if (parsed[0].equals("-c"))
            {
                create(parsed);

            } else if (parsed[0].equals("-u"))
            {
                update(parsed);
            } else if (parsed[0].equals("-d"))
            {
                delete(parsed);
            } else if (parsed[0].equals("-i"))
            {
                info(parsed);
            } else if(parsed[0].equals("break"))
            {
                System.out.println("You quit");
                break;
            }
        }
        // System.out.println(allPeople.get((allPeople.size()-1)).toString());

    }

    public static void create(String[] parsed)
    {

        if (parsed[2].equals("м"))
        {
            allPeople.add(Person.createMale(parsed[1],new Date(parsed[3])));
            System.out.println(allPeople.size() - 1);
        } else
        {
            allPeople.add(Person.createFemale(parsed[1],new Date(parsed[3])));
            System.out.println(allPeople.size() - 1);
        }

    }

    public static void info(String[] parsed)
    {
        int n = Integer.parseInt(parsed[1]);
        Person person = allPeople.get(n);
        Date printDate = person.getBirthDay();
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String name = person.getName();
        String sex = "";
        if (person.getSex().equals(Sex.MALE))
            sex = "м";
        if (person.getSex().equals(Sex.FEMALE))
            sex = "ж";
        System.out.println(name + " " + sex + " " + format.format(printDate));
    }

    public static void update(String[] parsed)
    {
        int id = Integer.parseInt(parsed[1]);
        if (parsed[3].equals("м"))
        {
            allPeople.add(id,Person.createMale(parsed[2], new Date(parsed[4])));

        } else
        {
            allPeople.add(id,Person.createFemale(parsed[2], new Date(parsed[4])));
        }
    }
    public static void delete(String[] parsed)
    {
        int id = Integer.parseInt(parsed[1]);
        Person per = allPeople.get(id);
        per.setBirthDay(null);
    }
}

