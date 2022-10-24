package sesi5.kampus;

public class Personn {
    private String name;
    private String address;

    public Personn(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setName(String address){
        this.address = address;
    }

    public String toString(){
        return
        "Nama: " + getName() +
        "\nAlamat: " + getAddress();
    }
}