package observer;

//wrapping a food using news paper
public class ComedyMovies implements Observer{

    //accept the email
    @Override
    public void notifyObserver(String movie, String movie_type)
    {
        System.out.println("Movie_Type :"+movie_type+"and Movie:"+movie);
    }
}
