package pethotel;

import java.sql.Date;

public class PetEntity{
    private int id;
    private String p_name;
    private String p_breed;
    private boolean p_checkIn;
    private Date p_checkInDate;
    private int p_owner_id;

    public int getId() {
        return this.id;
    }
    public String getPetName(){
        return this.p_name;
    }

    public String getBreedName() {
        return this.p_breed;
    }

    public boolean getCheckIn() {
        return this.p_checkIn;
    }

    public Date getCheckInDate(){
        return this.p_checkInDate;
    }
    public int getPetOwnerId(){
        return this.p_owner_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPetName(String p_name){
        this.p_name = p_name;
    }

    public void setPetBreed(String p_breed){
        this.p_breed = p_breed;
    }

    public void setCheckIn(boolean p_checkIn){
        this.p_checkIn = p_checkIn;
    }

    public void setCheckInDate(Date p_checkInDate){
        this.p_checkInDate = p_checkInDate;
    }

    public void setPetOwnerId(int p_owner_id){
        this.p_owner_id = p_owner_id;
    }
    public PetEntity (){}
    public PetEntity (int id, String p_name, String p_breed, boolean p_checkIn, Date p_checkInDate, int p_owner_id){ 
        this.id = id;
        this.p_name = p_name;
        this.p_breed = p_breed;
        this.p_checkIn = p_checkIn;
        this.p_checkInDate = p_checkInDate;
        this.p_owner_id = p_owner_id;
    }
}