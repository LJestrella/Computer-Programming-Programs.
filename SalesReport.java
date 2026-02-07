class SalesReport {
    public static void main (String pito []) {
     int[][] sales = {
     {1200, 1500, 1700},
     {100, 1100, 1300},
     {900, 1200,1600}
      };

  for( int n = 0; n < sales.length; n++) {
     int total = 0;
     for (int j = 0; j < sales[n].length; j++) {
     total += sales[n][j];
  }
  System.out.println("Total sales for stores " + (n + 1) + ": " + total);
     }
   }
}
