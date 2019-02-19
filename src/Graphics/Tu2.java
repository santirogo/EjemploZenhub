package Graphics;

//Tu2.java
import ch.aplu.turtle.*;

class Tu2
{
Turtle joe = new Turtle();

Tu2()
{
 int i = 0;            //Starting value
 while (i < 360)         //Condition
 {
   joe.forward(1);   //Actions
   joe.right(1);
   i++;                //Increasing starting value
 }
}

public static void main(String[] args)
{
 new Tu2();
}
}
