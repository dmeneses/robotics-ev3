package dia05;

class Auto {
     int NROventanas;
     String color;
     String marca;
     double velocidad;
     boolean estaencendido;
     double aceleracion;
     
     public Auto(String uncolor, String unamarca, int unNRO, double unavelocidad,  boolean siestaencendido, String unColor, double unaAceleracion){
     color = uncolor;
     marca = unamarca;
     NROventanas = unNRO;
     velocidad = unavelocidad;
     estaencendido = siestaencendido;
     color = unColor;
     aceleracion = unaAceleracion;
     }
     public void arrancarAuto(){
estaencendido = true;

System.out.println("ahorita no joven");
     }
     public String  devolverunColor(){
    	 
    	 System.out.println(color);
    			 return color;
     }
     public double acelerar(double ac){
    	 aceleracion = ac; 
    	 System.out.println(velocidad + aceleracion);
    	 velocidad = velocidad + aceleracion;
    	 return velocidad;
     }
     
}