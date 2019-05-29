package The6Chars;
import Interfaces.IArtist;
import Interfaces.IDriver;
import Interfaces.IWorker;

public class Highfive extends BaseCharacter implements IWorker, IDriver, IArtist
{

    public Highfive() 
    {
        super("High",", seorang pekerja, pengemudi dan seorang pelukis");
    }

    @Override
    public void Paint() 
    {
        System.out.println(getName() + " melukis");
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

}
