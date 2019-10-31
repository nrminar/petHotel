package pethotel;

public class Owner{
    private int id;
    private String owner_name;

    public int getId() {
        return this.id;
    }

    public String getOwnerName() {
        return this.owner_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwnerName(String owner_name) {
        this.owner_name = owner_name;
    }

    public Owner (){}
    public Owner (int id, String owner_name){ 
        this.id = id;
        this.owner_name = owner_name;
    }
}