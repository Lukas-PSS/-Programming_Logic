class neri_questao_9
{
    public static void main(String args[])
    {
         double x,y,z;
         x=9;
         y=10;
         z=8;

         if ((x < (y + z)) && (y < (x + z)) && (z < (x + y)))
         {
            if ((x == y) && (y == z))
               System.out.println("Esses n�mero formam um tri�ngulo Equil�tero");
            else  if ((x == y) || (x == z) || (y == z))
               System.out.println("Esses n�mero formam um tri�ngulo Is�sceles");
            else  if ((x!=y) && (y!=z) && (x!=z))
               System.out.println("Esses n�mero formam um tri�ngulo Escaleno");
        }
        else
             System.out.println("Esses n�mero N�o formam um tri�ngulo");
    }
}