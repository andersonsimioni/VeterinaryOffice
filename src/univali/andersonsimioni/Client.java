package univali.andersonsimioni;

public class Client {
    private final String Name;
    private final String Document;
    private final String Address;
    private final String Phone;

    /**
     * Validate constructor params
     * @param name
     * @param document
     * @param address
     * @param phone
     */
    private void validateParams(String name, String document, String address, String phone){
        if(name == null || name.isEmpty())
            throw new IllegalArgumentException("name is null or empty");
        if(document == null || document.isEmpty())
            throw new IllegalArgumentException("document is null or empty");
        if(address == null || address.isEmpty())
            throw new IllegalArgumentException("address is null or empty");
        if(phone == null || phone.isEmpty())
            throw new IllegalArgumentException("phone is null or empty");
    }

    public Client(String name, String document, String address, String phone) {
        validateParams(name, document, address, phone);

        this.Name = name;
        this.Document = document;
        this.Address = address;
        this.Phone = phone;
    }

    @Override
    public String toString() {
        return "Client{" +
                " \nName='" + Name + '\'' +
                ", \nDocument='" + Document + '\'' +
                ", \nAddress='" + Address + '\'' +
                ", \nPhone='" + Phone + '\'' +
                '}';
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
