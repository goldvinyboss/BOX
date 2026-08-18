class box <T>
{
  Object elements [];


  public box (int capacity )
  {
      elements =  new Object[capacity];
  }

  public void add (T element, int index)
  {
      elements [index] = element;
  }
   public T get (int index )
   {
       return (T)  elements [index];
   }
}

class Main
{
    static void main()
    {

        box <Double> boxPrice = new box<>(5);
        boxPrice.add(25.0, 2);
        System.out.println("Element: " + boxPrice.get(2));


        box <Character> boxLetter = new box<>(10);
        boxLetter.add('V', 8);
        System.out.println("Letter: " + boxLetter.get(8));

    }
}