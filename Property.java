public class Property {
      private double askingprice;
      private String propertyType;
      private double lotsize;
      private int numBaths;
      private int numbeds;

      public Property(double askingprice , String propertyType , double lotsize){
            this.askingprice = askingprice;
            this.lotsize = lotsize;
            this.propertyType = propertyType;
            numBaths = 0;
            numbeds = 0;
      }

      /** .. Second .. Constructor .. */

      public Property(double askingprice, String propertyType, double lotsize , int numBaths  , int numbeds) {
            this.askingprice = askingprice;
            this.lotsize = lotsize;
            this.propertyType = propertyType;
            this.numBaths = numBaths;
            this.numbeds = numbeds;
      }

      public String toString(){
            return "Asking Price : $" + askingprice + 
            "\nProperty type : " + propertyType + 
            "\n Lot size : " + lotsize + 
            "\n number of baths : " + numBaths + 
            "\n number of beds : " + numbeds ;
            

      }


}
