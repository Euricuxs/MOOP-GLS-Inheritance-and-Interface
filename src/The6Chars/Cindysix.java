package The6Chars;
import Interfaces.IArtist;
import Interfaces.IChef;
import Interfaces.IDriver;
import Interfaces.IWorker;

public class Cindysix extends BaseCharacter implements IChef, IWorker, IDriver, IArtist
{

    public Cindysix() 
    {
        super("Cindy", ", seorang koki restoran, pekerja, pengemudi dan seorang pelukis");
    }

    @Override
    public void Paint() 
    {
        System.out.println(getName()+ " melukis");
    }

    @Override
    public void Drive() 
    {
        System.out.println(getName() + " menyetir");
    }

    @Override
    public void Work() 
    {
        System.out.println(getName() + " bekerja");
    }

    @Override
    public void Cook() 
    {
        System.out.println("Cindy memasak");
    }

}
