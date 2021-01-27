class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    double Total = 55*9;
    System.out.println("Total:" + " " + Total);
  double Blue = 495*.24;
    System.out.println("Blue:" + " " + Blue);  
  double Brown = 495*.13;
    System.out.println("Brown:" + " " + Brown); 
    double Green = 495*.16;
    System.out.println("Green:" + " " + Green); 
    double Orange = 495*.20;
    System.out.println("Orange:" + " " + Orange); 
    double Red = 495*.13;
    System.out.println("Red:" +  " " + Red); 
    double Yellow = 495*.14;
    System.out.println("Yellow:" + " " + Yellow); 
     double Sum = Blue + Brown + Green + Orange + Red + Yellow;
    System.out.println("Sum:" + " " + Sum);
    if ( Blue > Brown && Green > Red)
     System.out.println( "Blue over Brown and Green over Red");
     if ( Brown <= Orange)
     System.out.println( "Brown is less than or equal to Orange");
     if ( Sum == Total)
     System.out.println( "Numbers match");
  }
}