package futbol; 
public  class Jugador extends Futbolista{ 
  public short golesMarcados;
  public byte  dorsal;
  public Jugador(String nombre, int edad, String posicion,short golesMarcados, byte dorsal){ 
     super(nombre,edad,posicion);
     this.golesMarcados = golesMarcados;
     this.dorsal = dorsal;
   }
   public Jugador(){
    super();
    this.golesMarcados = 289;
    this.dorsal = 7;
   }

  public int compareTo(Futbolista f){
    return Math.abs(this.getEdad()-f.getEdad());
  }
  @Override
  public boolean jugarConLasManos(){
    return false;
  }
  @Override
  public String toString(){
    return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+ ", y juega de "+this.getPosicion()+" con el dorsal "+this.dorsal+". Ha marcado "+this.getGolesMarcados();
  }
  public short  getGolesMarcados(){
    return this.golesMarcados;
  }
  public byte getDorsal(){
    return this.dorsal;
  }
  public void setGolesMarcados(short goles){
    this.golesMarcados = goles;
  }
  public  void  setDorsal(byte dorsal){
    this.dorsal = dorsal;
  }
}
