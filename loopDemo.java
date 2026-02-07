class loopDemo {
      public static void main (String mjlj[]) {

      int i;
      for (i=1; i<=10; i=i+1)
           System.out.print(i+"   ");  
  
       System.out.println();
      i=1;
      while(i<=10) {
       System.out.print(i+"   ");
         i+=1;
        }

      System.out.println();
      i=1;
        do{
        System.out.print(i+"   ");
        ++i;
    }  while(i<=10);
      System.out.println();

       for (int x=1; x<=5; ++x) {
       for (int y=1; y<=5; ++y)
        System.out.print("|"+(x*y)+"|"+ "\t");
        System.out.println();
        }

      

  
 

       for(int a=1; a<=5; ++a) {
       for(int b=1; b<=a; ++b) 
       System.out.print("*");
       System.out.println();
  
         
      }
      for(int a=1; a<=5; ++a) {
       for(int b=5; b>=a; --b) 
       System.out.print("*");
       System.out.println();
    }
   } 
}


