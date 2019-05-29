import java.util.ArrayList;
import java.util.Scanner;
import Interfaces.IArtist;
import Interfaces.IChef;
import Interfaces.IDriver;
import Interfaces.IWorker;
import The6Chars.Abigailone;
import The6Chars.Aliciafour;
import The6Chars.BaseCharacter;
import The6Chars.Cindysix;
import The6Chars.Draketwo;
import The6Chars.Highfive;
import The6Chars.Lilythree;

public class Main 
{
    ArrayList<BaseCharacter> list = new ArrayList<>(); 
    Scanner scan = new Scanner(System.in);
    String isi = "";
    String input = "";
    String number = "";
    String[]pisah;
    String[]listnum;
   
    void space()
    {
        for(int i = 0;i<30;i++)
        {
            System.out.println();
        }
    }
    
    void add()
    {
        list.add(new Abigailone());
        list.add(new Draketwo());
        list.add(new Lilythree());
        list.add(new Aliciafour());
        list.add(new Highfive());
        list.add(new Cindysix());
    }
    
    void menu()
    {
        for(int i = 0;i < list.size();i++)
        {
            System.out.println(i + " : " + list.get(i).getName());
        }
        System.out.println("6 : Exit");
    }
    
    BaseCharacter a = new Abigailone();
    BaseCharacter b = new Draketwo();
    BaseCharacter c = new Lilythree();
    BaseCharacter d = new Aliciafour();
    BaseCharacter e = new Highfive();
    BaseCharacter f = new Cindysix();
    
    public Main() 
    {
        add();
        do
        {
            space();    
            System.out.println("Simulasi Kelompok Kemampuan");
            try 
            {
                menu();
                System.out.print("Input : ");
                isi = scan.nextLine();
                pisah = isi.split(" ");
                input = pisah[0];
                number = pisah[1];
                listnum = number.split(",");
                space();
                for(int i = 0;i<listnum.length;i++)
                {
                    switch (input)
                    {
                            case "Info" :
                            {
                                if(listnum[i].contains("0"))
                                {
                                    a.getInfo();
                                }
                                else if(listnum[i].contains("1"))
                                {
                                    b.getInfo();
                                }
                                else if(listnum[i].contains("2"))
                                {
                                    c.getInfo();
                                }
                                else if(listnum[i].contains("3"))
                                {
                                    d.getInfo();
                                }
                                else if(listnum[i].contains("4"))
                                {
                                    e.getInfo();
                                }
                                else if(listnum[i].contains("5"))
                                {
                                    f.getInfo();
                                }
                                break;
                            }
                            case "Cook" :
                            {
                                if(listnum[i].contains("1"))
                                {
                                    if(b instanceof IChef)
                                    {
                                        ((IChef) b).Cook();
                                    }
                                }
                                else if(listnum[i].contains("2"))
                                {
                                    if(c instanceof IChef)
                                    {
                                        ((IChef) c).Cook();
                                    }
                                }
                                else if(listnum[i].contains("5"))
                                {
                                    if(f instanceof IChef)
                                    {
                                        ((IChef) f).Cook();
                                    }
                                }
                                else 
                                {
                                    System.out.println("Karakter tidak bisa melakukan aksi");
                                }
                                break;
                            }
                            case "Work" :
                            {
                                if(listnum[i].contains("3"))
                                {
                                    if(d instanceof IWorker)
                                    {
                                        ((IWorker) d).Work();
                                    }
                                }
                                else if(listnum[i].contains("4"))
                                {
                                    if(e instanceof IWorker)
                                    {
                                        ((IWorker) e).Work();
                                    }
                                }
                                else if(listnum[i].contains("5"))
                                {
                                    if(f instanceof IWorker)
                                    {
                                        ((IWorker) f).Work();
                                    }
                                }
                                else 
                                {
                                    System.out.println("Karakter tidak bisa melakukan aksi");
                                }
                                break;
                            }
                            case "Drive" :
                            {
                                if(listnum[i].contains("2"))
                                {
                                    if(c instanceof IDriver)
                                    {
                                        ((IDriver) c).Drive();
                                    }
                                }
                                else if(listnum[i].contains("3"))
                                {
                                    if(d instanceof IDriver)
                                    {
                                        ((IDriver) d).Drive();
                                    }
                                }
                                else if(listnum[i].contains("4"))
                                {
                                    if(e instanceof IDriver)
                                    {
                                        ((IDriver) e).Drive();
                                    }
                                }
                                else if(listnum[i].contains("5"))
                                {
                                    if(f instanceof IDriver)
                                    {
                                        ((IDriver) f).Drive();
                                    }
                                }
                                else 
                                {
                                    System.out.println("Karakter tidak bisa melakukan aksi");
                                }
                                break;
                            }
                            case "Paint" :
                            {
                                if(listnum[i].contains("4"))
                                {
                                    if(e instanceof IArtist)
                                    {
                                        ((IArtist) e).Paint();
                                    }
                                }
                                else if(listnum[i].contains("5"))
                                {
                                    if(f instanceof IArtist)
                                    {
                                        ((IArtist) f).Paint();
                                    }
                                }
                                else 
                                {
                                    System.out.println("Karakter tidak bisa melakukan aksi");
                                }
                                break;
                            }
                    } 
                }
                System.out.println();
                System.out.println("Please enter to continue");
                scan.nextLine();
            }
            catch (Exception e) 
            {
                space();
                System.out.println("Input harus [Info/Work/Drive/Cook/Paint] [ID karakter] (ID Karakter boleh lebih dari 1)");
                System.out.println();
                System.out.println("Please enter to continue");
                scan.nextLine();
                continue;
            }
        }while(!input.equals("Exit"));
        space();
        System.out.println("=== Thank you ===");
        System.out.println("=== Have a nice day ===");
    }
       
    public static void main(String[] args) 
    {
        new Main();
    }

}
