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
               System.out.println("Esses número formam um triângulo Equilátero");
            else  if ((x == y) || (x == z) || (y == z))
               System.out.println("Esses número formam um triângulo Isósceles");
            else  if ((x!=y) && (y!=z) && (x!=z))
               System.out.println("Esses número formam um triângulo Escaleno");
        }
        else
             System.out.println("Esses número Não formam um triângulo");
    }
}