package The6Chars;
import Interfaces.IChef;

public class Draketwo extends BaseCharacter implements IChef
{
    public Draketwo() 
    {
        super("Drake",", Seorang koki restoran");
    }

    @Override
    public void Cook() 
    {
        System.out.println(getName() +" memasak");
    }

}
