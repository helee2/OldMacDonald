class Chick implements Animal 
{     
  private String chtype;
  private String chsound;
  public Chick(String type, String sound, String sound2)
  {
    chtype = type;
    if (Math.random() < .5)
      chsound = sound;
    else
      chsound = sound2;
  }
  public String gettype()
  {
    return chtype;
  }
  public String getsound()
  {
    return chsound;
  }
  
}
