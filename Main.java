class Main {
  public static void main(String[] args) 
  {
    double C = 0;
   // double F = 32+((9.0)/(5.0))*C;

    System.out.println("\nCelsjusza\tFahrenheita");
    for(int i=0; i<301; i++)
     {
       double F = 32+((9.0)/(5.0))*C;
       System.out.println("\t" +C+ "\t\t\t" +F);
       C++;
     }
  }
}