class NamedCow extends Cow
{
  private String cowname;
  public NamedCow(String type, String sound, String name)
  {
    cowname = name;
  }
  public String getName()
  {
    return cowname;
  }
}
