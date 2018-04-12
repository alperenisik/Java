package chief;
public class Building{
  private double width; // Genişlik
  private double height; //Yükseklik
  private double x;
  private double y;
  public double area; // Alan
  public double environment; // Çevre

public double widthGet(){
  return width;
}
public void widthSet(double width){
  this.width = Math.abs(width); //Mutlak değer
}

public double heightGet(){
  return height;
}
public void heightSet(double height){
  this.height = Math.abs(height); //Mutlak değer
}
public double xGet(){
  return x;
}
public void xSet(double x){
  this.x = x;
}
public double yGet(){
  return y;
}
public void ySet(double y){
  this.y = y;
}

public Building(){
}

public void area(){ //Alan
  area = this.width * this.height;
}

public void environment(){ //Çevre
  environment = 2*(this.width+this.height);
}

public void view(){ //  alan ve  çevre
  System.out.println("Dikdörtgenin Alanı : " + area);
  System.out.println("Dikdörtgenin Çevresi : " + environment);
}

public void changing(double newx , double newy){ // Öteleme
  this.x+=newx;
  this.y+=newy;
}
public void vista(){ // Görüntüleme
  System.out.println("Yeni X Değeri : " + this.x);
  System.out.println("Yeni Y Değeri : " + this.y);
}


}
