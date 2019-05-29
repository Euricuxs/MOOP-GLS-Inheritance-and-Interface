package The6Chars;
import Interfaces.IChef;
import Interfaces.IDriver;

public class Lilythree extends BaseCharacter implements IChef, IDriver
{
    public Lilythree() 
    {
        super("Lily",", seorang koki restoran dan seorang pengemudi");
    }

    @Override
    public void Cook() 
    {
        System.out.println(getName() + " memasak");
    }

    @Override
    public void Drive() 
    {
        System.out.println(getName() + " menyetir");
    }

}
