
package graphic_arts;

import static graphic_arts.StdDraw.setPenColor;
import static java.awt.Color.black;
import static java.awt.Color.white;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите N (целое число): ");
        int N = in.nextInt();
        double sump = 0.5 / 3.f;
        int n = 2*N + 1;
        int kir = n/2 + 1; //середина
        StdDraw.setXscale(0, n);  //задаем размерность
        StdDraw.setYscale(0, n);
        for (int i=n; i>0; i--) {        //строка
              for(int t=1; t<=n; t++)    //столбец
              {
                  if((i%2!=0&&t%2!=0)||(i%2==0&&t%2==0))setPenColor(black);      //красим в чб основную сетку
                  else setPenColor(white);               
                  
                  StdDraw.filledSquare(i-0.5, t-0.5, 0.5); // центр большого квадрата
                  
                  if(t==kir && i!=t) // полоса квадратов горизонт середина
                  {
                    if((i%2!=0&&t%2!=0)||(i%2==0&&t%2==0))setPenColor(white);      //красим в контраст
                    else setPenColor(black);
                    if(2<=i && i<kir)  //1-ая половина
                    {                                              
                       StdDraw.filledSquare(i-0.05-sump, t-0.05-sump, sump-0.03);
                       StdDraw.filledSquare(i-0.05-sump, t-0.3-sump*3, sump-0.03);                       
                    }
                    if(kir<i && i<n)  //2-ая половина
                    {
                       StdDraw.filledSquare(i-0.3-sump*3, t-0.05-sump, sump-0.03);
                       StdDraw.filledSquare(i-0.3-sump*3, t-0.3-sump*3, sump-0.03);
                    }
                   
                  }
                  if(i==kir && t!=i) // полоса квадратов вертикаль середина
                    {
                      if((i%2!=0&&t%2!=0)||(i%2==0&&t%2==0))setPenColor(white);      //красим в контраст
                      else setPenColor(black);
                      if(2<=t && t<kir)  //2-ая половина
                    {                                              
                       StdDraw.filledSquare(i-0.3-sump*3, t-0.05-sump, sump-0.03);
                       StdDraw.filledSquare(i-0.05-sump, t-0.05-sump, sump-0.03);                       
                    }
                    if(kir<t && t<n)  //1-ая половина
                    {
                       StdDraw.filledSquare(i-0.3-sump*3, t-0.3-sump*3, sump-0.03);
                       StdDraw.filledSquare(i-0.05-sump, t-0.3-sump*3, sump-0.03);
                    }                    
                    }
                  if(kir<t && t<n) //верхние две половинки
                    {
                        if((i%2!=0&&t%2!=0)||(i%2==0&&t%2==0))setPenColor(white);      //красим в контраст
                        else setPenColor(black);
                        if((kir<i && i<kir+n-t)||(i==kir+1)||(i==n-1 && t==kir+1)) //правая четверть
                        {
                            StdDraw.filledSquare(i-0.3-sump*3, t-0.05-sump, sump-0.03);
                            StdDraw.filledSquare(i-0.05-sump, t-0.3-sump*3, sump-0.03);
                        }
                        if((kir-n+t<i && i<kir)||(i==kir-1)||(i==2&&t==kir+1)) //левая четверть
                        {
                            StdDraw.filledSquare(i-0.3-sump*3, t-0.3-sump*3, sump-0.03);
                            StdDraw.filledSquare(i-0.05-sump, t-0.05-sump, sump-0.03);
                        }
                    }
                   if(1<t&&t<kir)  //две нижние половинки
                   {                       
                       if((i%2!=0&&t%2!=0)||(i%2==0&&t%2==0))setPenColor(white);      //красим в контраст
                       else setPenColor(black); 
                       if((kir<i && i<kir+t-1)||(i==kir+1)||(i==n-1&&t==kir-1)) //правая четверть
                        {
                            StdDraw.filledSquare(i-0.3-sump*3, t-0.3-sump*3, sump-0.03);
                            StdDraw.filledSquare(i-0.05-sump, t-0.05-sump, sump-0.03);
                        }
                       if(( kir-t+1<i && i<kir)||(i==kir-1)||(i==2&&t==kir-1)) //левая четверть
                        {
                            StdDraw.filledSquare(i-0.3-sump*3, t-0.05-sump, sump - 0.03);
                            StdDraw.filledSquare(i- 0.05-sump, t-0.3-sump*3, sump - 0.03);
                        }
                   }
                  
              }
        }
    }
    
}
