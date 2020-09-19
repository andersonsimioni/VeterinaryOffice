package univali.andersonsimioni;

public class Client {
    private final String Name;
    private final String Document;
    private final String Address;
    private final String Phone;

    public Client(String name, String document, String address, String phone) {
        Name = name;
        Document = document;
        Address = address;
        Phone = phone;
    }

    public String getName() {
        return Name;
    }

    public String getDocument() {
        return Document;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone() {
        return Phone;
    }
}
