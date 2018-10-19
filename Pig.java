class Pig implements Animal 
{     
  private String pigtype;
  private String pigsound;
  public Pig(String type, String sound)
  {
    pigtype = type;
    pigsound = sound;
  }
  public String gettype()
  {
    return pigtype;
  }
  public String getsound()
  {
    return pigsound;
  }
}
