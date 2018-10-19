class Farm 
{  
  private Animal[] animals;
  public Farm()
  {
    animals = new Animal[3];
    animals[0] = new Chick("Chick","Cheep","Cluck");
    animals[1] = new NamedCow("Cow","Moo","Bob");
    animals[2] = new Pig("Pig","Oink");
  }
  public void animalText()
  {
    for (int i = 0; i < animals.length; i++)
    {
      System.out.println(animals[i].gettype() + " goes " + animals[i].getsound());
    }
    System.out.println("The cow is known as " + ((NamedCow)animals[1]).getName());
  }
}
