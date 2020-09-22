package univali.andersonsimioni;

public class Veterinary {
    private final String name;
    private final String Address;
    private final String Document;
    private final String Phone;
    private final String Licence;

    public Veterinary(String name, String address, String document, String phone, String licence) {
        this.name = name;
        Address = address;
        Document = document;
        Phone = phone;
        Licence = licence;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    public String getDocument() {
        return Document;
    }

    public String getPhone() {
        return Phone;
    }

    public String getLicence() {
        return Licence;
    }
}
