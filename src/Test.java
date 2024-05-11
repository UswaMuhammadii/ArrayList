import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Movie> movie =  new ArrayList<>();

        movie.add(new Movie("Movie 1",1,"A",2019));
        movie.add(new Movie("Movie 2",2,"B",2009));
        movie.add(new Movie("Movie 3",3,"C",2009));

        for(Movie temp:movie) {
            System.out.println(temp);
        }
        System.out.println(movie.size());

        movie.remove(new Movie("Movie 2",2,"B",2009));
        for(Movie temp:movie) {
            System.out.println(temp);
        }
        System.out.println(movie.size());
    movie.set(0,new Movie("hey",3,"Z",2006));
        for(Movie temp:movie) {
            System.out.println(temp);
        }
        System.out.println("After increasing ranking");
        for(Movie temp:movie) {
            temp.setRating(temp.getRating()+1);
            System.out.println(temp);
        }
    }

}
