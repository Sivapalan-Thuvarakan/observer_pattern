package observer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //My scenario is all about movie subscribe,there are different kind of  movie subscribers like Action, Comedy,Horror movies subscriber.
        //when new movie is released ,all subscriber will be notified through message.in message movie name and Type will be included
        //based on that movie subscriber subscribe movie or unsubscribe movie!!!


        //publisher -> Subject
        //subscriber -> Observer
        //types of observers -> Action_movie_subscriber,Horror_movie_subscriber,Romance_movie_subscriber,Comedy_movies_subscriber
        Observer Thuvarakan=new ActionMovies();//watching Action movies
        Observer Thivijan=new HorrorMovies();//watching Horror Movies
        Observer Sivapalan=new ComedyMovies();//Watching Comedy Movies
        Observer Rajani=new RomanceMovies();//Watching Romance movies
        Observer Thenisha=new ThrillerMovies();//Watching Thriller movies
        Observer Kavija=new ComedyMovies();//Watching Comedy Movies
        Observer saja=new HorrorMovies();//wWatching Horror movies

        Subject netflix=new Subject();
        netflix.subscribe(Thuvarakan);
        netflix.subscribe(Thivijan);
        netflix.subscribe(Sivapalan);
        netflix.subscribe(Rajani);
        netflix.subscribe(Thenisha);
        netflix.subscribe(Kavija);
        netflix.subscribe(saja);

        netflix.notifyObserver("Action","Raid");
        netflix.Unsubscribe(Thivijan);
        System.out.println("Thivijan has unsubscribed");
        netflix.Unsubscribe(Sivapalan);
        System.out.println("Sivapalan has unsubscribed");
        netflix.Unsubscribe(Rajani);
        System.out.println("Rajani has unsubscribed");
        netflix.Unsubscribe(Thenisha);
        System.out.println("Thenisha has unsubscribed");
        netflix.Unsubscribe(Kavija);
        System.out.println("Kavija has unsubscribed");
        netflix.Unsubscribe(saja);
        System.out.println("saja has unsubscribed");

        Thread.sleep(10000);//wait for 10 seconds
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        netflix.notifyObserver("Horror","conjuring 3");

        Thread.sleep(5000);//wait for 10 seconds

        netflix.Unsubscribe(Thuvarakan);
        System.out.println("Thuvarakan has unsubscribed");
        netflix.subscribe(Thivijan);
        System.out.println("Thivijan has subscribed");
        netflix.subscribe(saja);
        System.out.println("saja has subscribed");

        Thread.sleep(5000);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        netflix.notifyObserver("Romance","Rebeca");
        netflix.    Unsubscribe(Thivijan);
        System.out.println("Thivijan has unsubscribed");
        netflix.Unsubscribe(saja);
        System.out.println("saja has unsubscribed");
        netflix.subscribe(Rajani);
        System.out.println("Rajani has subscribed");


    }
    //you can create a folder called news
    //when ever u have news u can create new text file and add news to that file and copy and paste into created news folder
    //our subject class keep watching created news folder-> and when ever new file pasted into that folder then it call notifyObserver Method
    //then you can delete the file and keep watching news folder

    //create a small gui
    //create a form to enter the name email address of user
    // and submit -> you can add him to the observer list
}
