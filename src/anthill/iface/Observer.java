package anthill.iface;

import anthill.model.Ant;
import anthill.model.Anthill;

public interface Observer {
  public void updateEggToMaggot(Ant egg);
  
  public void updateMaggotToChrysalis(Ant maggot);
  
  public void updateChrysalisToAdult(Ant chrysalis, Anthill ah);
  
}