
public class Airplane {
    
    private static int id = 0;
    private int model;

    public Airplane(int model) {
        id+=1;
        this.model = model;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Airplane.id = id;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
    
    
    @Override
    public String toString()
    {
        return "ID:"+id+"\nMODEL:"+model;
    }
    
    
}
