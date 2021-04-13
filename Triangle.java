public class Triangle {

      //for initializing you need to write.
      
      double base;
      double height;
      double sidelenone;
      double sidelentwo;
      double sidelenthree;

      public Triangle(double base , double height , 
      double sidelenone , double sidelentwo ,                  //Constructor function.
      double sidelenthree){
            this.base = base;
            this.height  = height;
            this.sidelenone = sidelenone;
            this.sidelentwo = sidelentwo;
            this.sidelenthree = sidelenthree; 
      }
      
      public double findarea(){                                         //Void methods cannot return a value.
            double area  = (this.base * this.height) / 2;
            return area;
      }
}
