package anthill.model.roles;

import java.awt.Point;

/**
 * Defini le role de soldat.
 * @author Monot_Vorotnikov
 *
 */

public class Soldier extends Role {
  
  public Soldier(Point p) {
    super();
    position = p;
  }
  
  public void defend() {
    //TODO
  }

  @Override
  public void move() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public Point getPosition() {
    // TODO Auto-generated method stub
    return null;
  }
}
