package pethotel;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PetEntity{
    @JsonProperty (value = "id")
    private int id;
    @JsonProperty (value = "pName")
    private String pName;
    @JsonProperty (value = "pBreed")
    private String pBreed;
    @JsonProperty (value = "pColor")
    private String pColor;
    @JsonProperty (value = "pCheckIn")
    private boolean pCheckIn;
    @JsonProperty (value = "pCheckInDate")
    private Date pCheckInDate;
    @JsonProperty (value = "pOwner")
    private int pOwner;
    @JsonProperty (value = "url")
    private String url;

    public int getId() {
        return this.id;
    }
    public String getPetName(){
        return this.pName;
    }

    public String getBreedName() {
        return this.pBreed;
    }
    public String getColor() {
        return this.pColor;
    }

    public boolean getCheckIn() {
        return this.pCheckIn;
    }

    public Date getCheckInDate(){
        return this.pCheckInDate;
    }
    public int getPetOwnerId(){
        return this.pOwner;
    }
    public String getPetUrl(){
        return this.url;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPetName(String pName){
        this.pName = pName;
    }

    public void setPetBreed(String pBreed){
        this.pBreed = pBreed;
    }
    public void setPetColor(String pColor){
        this.pColor = pColor;
    }

    public void setCheckIn(boolean pCheckIn){
        this.pCheckIn = pCheckIn;
    }

    public void setCheckInDate(Date pCheckInDate){
        this.pCheckInDate = pCheckInDate;
    }

    public void setPetOwnerId(int pOwner){
        this.pOwner = pOwner;
    }
    public void setPetUrl(String url){
        this.url = url;
    }
    public PetEntity (){}
    public PetEntity (int id, String pName, String pBreed, String pColor, boolean pCheckIn, Date pCheckInDate, int pOwner, String url){ 
        this.id = id;
        this.pName = pName;
        this.pBreed = pBreed;
        this.pColor = pColor;
        this.pCheckIn = pCheckIn;
        this.pCheckInDate = pCheckInDate;
        this.pOwner = pOwner;
        this.url = url;
    }
}