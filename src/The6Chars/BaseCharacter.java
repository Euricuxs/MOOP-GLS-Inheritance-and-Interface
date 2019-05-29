package The6Chars;

public class BaseCharacter 
{
    
    protected String name;
    protected String description;
    

    public BaseCharacter(String name, String description) 
    {
        this.name = name;
        this.description = description;
    }
    
    public void getInfo() 
    {
        System.out.println(name + description);
    }

    public String getName() 
    {
        return name;
    }

    protected String getDescription() 
    {
        return description;
    }

    protected void setName(String name) 
    {
        this.name = name;
    }

    protected void setDescription(String description) 
    {
        this.description = description;
    }


}
