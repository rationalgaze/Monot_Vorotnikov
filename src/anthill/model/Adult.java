package anthill.model;

public class Adult extends State {

  Role role;
  
  String state;
  public Adult(Role role) {
    this.state = "Egg";
    this.role = role;
  }

  Role r;
  
  Adult(){
    super();
  }
  
  @Override
  public String getState() {
    return this.state;
  }
  
  public Role getRole() {
    return this.role;
  }

}
