
/**
 * Write a description of class Matematico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Matematico
{
    private String nombre;
    public Matematico(String nombre){
        this.nombre = nombre;
    }
    public String calMayorMenor(int a,  int b, int c){
       String mensaje = "";
       int mayor = 0;
       int medio = 0;
       int menor = 0;
       if(a > b && a > c){
           mayor = a;
       }else{
          if(b > a && b > c){
               mayor = b;
          }else{
             if(c > b && c > a){
                  mayor = c;
             }  
          }
       } 
       if(a < b && a < c){
           menor = a;
       }else{
          if(b < a && b < c){
               menor = b;
          }else{
             if(c < b && c < a){
                  menor = c;
             }  
          }
       }
       if((a > b && a < c) || (a < b && a > c)){
           medio = a;
       }else{
          if((b > a && b < c) || (b < a && b > c)){
               medio = b;
          }else{
            if((c > a && c < b)||(c < a && c > b)){
                  medio = c;
            }
          }
       }
       mensaje = "el menor "+ menor +", el medio "+ medio +", el mayor "+ mayor;
       return mensaje;
    }
    public double calArea(double altura, double base){
        double area = altura * base;
        return area;
    }
    public double calDistancia(Punto punto1, Punto punto2){
       double dis = Math.sqrt(Math.pow((punto2.getX()-punto1.getX()),2) + Math.pow((punto2.getY()-punto1.getY()),2)); 
       return dis;
    }
    public String calCuadrante(Punto punto){
        String mensaje = "";
        if(punto.getX()> 0 && punto.getY()> 0){
           mensaje = "esta en el primer cuadrante";
        }else{
           if(punto.getX()< 0 && punto.getY()> 0){
              mensaje = "esta en el segundo cuadrante ";
           }else{
              if(punto.getX()< 0 && punto.getY()< 0){
                 mensaje = "esta en el tercer cuadrante"; 
              }else{
                 if(punto.getX()> 0 && punto.getY()< 0){
                     mensaje = "esta en el cuarto cuadrante";  
                 }  
              }
           }
        }
        return mensaje; 
    }
}
