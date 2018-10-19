class Cow implements Animal 
{     
  protected String cowtype;
  protected String cowsound;
  public Cow(String type, String sound)
  {
    cowtype = type;
    cowsound = sound;
  }
  public Cow()
  {
    cowtype = "Cow";
    cowsound = "Moo";
  }
  public String gettype()
  {
    return cowtype;
  }
  public String getsound()
  {
    return cowsound;
  }
}
