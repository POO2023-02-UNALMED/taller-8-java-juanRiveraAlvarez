package futbol;

public  abstract class Futbolista implements Comparable<Object>{
  private String nombre;
  private int edad;
  private String posicion;
  public Futbolista(String nombre, int edad, String posicion){
    this.nombre = nombre;
    this.edad = edad;
    this.posicion = posicion;
  }
  public Futbolista(){
    this.nombre = "Maradona";
    this.edad = 30;
    this.posicion = "delantero"; 
  }
  public String getNombre(){
    return this.nombre;
  }
  public int getEdad(){
    return this.edad;
  }
  public String getPosicion(){
    return this.posicion;
  }
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public void setEdad(int edad){
    this.edad = edad;
  }
  public String toString(){
    return "El futbolista "+this.getNombre()+" tiene "+this.edad+ ", y juega de "+this.getPosicion();
  }
  public boolean equals(Futbolista f){
   if(this == f){
     return true;
   }else{
   return false;
   }
  }
  @Override
  public  int compareTo(Object f){
    if (equals(f)){
      return  1;
    }else{
      return 2;
    }
  };
  public abstract boolean jugarConLasManos();

}
