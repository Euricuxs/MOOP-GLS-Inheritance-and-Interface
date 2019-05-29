package The6Chars;
import Interfaces.IDriver;
import Interfaces.IWorker;

public class Aliciafour extends BaseCharacter implements IWorker, IDriver
{

    public Aliciafour() 
    {
        super("Alicia",", seorang pekerja dan pengemudi");
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
