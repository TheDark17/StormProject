class Rectangulo{
    
    public String ejemplo;
    public int longitud;
    public int ancho;
    public int perimetro;
    public int area;
    
    public Rectangulo(String ejemplo){
        this.longitud= 1;
        this.ancho= 1;
        this.ejemplo= ejemplo;
    }
    
    public void perimetro(int longitud, int ancho){
        if(longitud >=1 && longitud <=20){
            if(ancho >=1 && ancho <=20){
                this.longitud = longitud;
                this.ancho= ancho;
                perimetro= (ancho*2)+(longitud*2);
                System.out.println("El perimetro del rectangulo " + ejemplo + " es: " + perimetro);
            }else{
                System.out.println("El valor de ancho para el perimetro del rectangulo " + ejemplo + "  no se acepta en los parametros.");
            }
        }else{
            System.out.println("El valor de longitud para el perimetro del rectangulo " + ejemplo + " no se acepta en los parametros.");
        }       
    }
    
    public void area(int longitud, int ancho){
        if(longitud >=1 && longitud <=20){
            if(ancho >=1 && ancho <=20){
                this.longitud = longitud;
                this.ancho= ancho;
                area= ancho*longitud;
                System.out.println("El area del rectangulo " + ejemplo + " es: " + area);
            }else{
                System.out.println("El valor de ancho para el area del rectangulo " + ejemplo + " no se acepta en los parametros.");
            }
        }else{
            System.out.println("El valor de longitud para el area del rectangulo " + ejemplo + " no se acepta en los parametros.");
        }       
    }
}