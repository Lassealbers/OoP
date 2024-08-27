public class Array{
  private   boolean[]   available;
/*Sichtbar  Datentyp    Name*/

  private boolean[] _available =   new boolean[4];
                              /* Neues Array Länge = 4*/
    
  private boolean[] available_ = new boolean[] {true,false,true,true};
                                              /*Werte festlegen*/

  public void printArray(){ //Alle Arrayinhalte werden abgerufen
    for(boolean /*Datentyp*/ available_Bool:/*Abruf*/ available_/*Arrayname*/){
          System.out.println(available_Bool);
        }
    }
}
