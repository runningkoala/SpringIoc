package test;


public class boss {
	
  @Autowired
  public office office;
  
  @Autowired
  public car car;

  public String tostring(){
	  return "this boss has "+car.tostring()+" and in "+office.tostring();
  }
}
