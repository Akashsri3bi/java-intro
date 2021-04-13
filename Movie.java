public class Movie {

      String name;
      int year;
      int runtime;
      double movierating;

      public Movie(String name , int year , int runtime , double movierating){

            this.name = name;
            this.year = year;
            this.runtime = runtime;
            this.movierating = movierating;

      }

      public String toString(){
            return "Name of movie is : " + this.name +
            "\n Year of movie is : " + this.year + 
            "\n Runtime of movie is : " + this.runtime + 
            "\n and the movie rating is : " + this.movierating;

      }
}
