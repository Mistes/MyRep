package HeadFirst.Ep1.Ep1;

/**
 * Created by Администратор on 11.02.2016.
 */
public class ep3
{
    public static void main(String[] args)
    {
        Movie one = new Movie();
        one.title = "Gone with Shock";
        one.genre = "Tragic";
        one.rating =-2;
        Movie two = new Movie();
        two.title = "Lost in cubrick Space";
        two.genre = "Thriller";
        two.rating = 127;

    }
   static class Movie {
        String title;
        String genre;
        int rating;

        void playIt(){
            System.out.println("Playing the movie");
        }

    }
}
