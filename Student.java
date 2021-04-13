public class Student {

      String firstname;
      String lastname;
      int year;
      double GPA;
      String Major;

      public Student(String firstname , String lastname  ,
       int year , double GPA , String Major){

            this.firstname = firstname;
            this.lastname = lastname;
            this.year = year;
            this.GPA = GPA;

      }

      public int incrementExpectedgraduationyear(){
            int newyear = this.year + 1;
            return newyear;
      }
      
}
