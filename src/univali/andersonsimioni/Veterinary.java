package univali.andersonsimioni;

public class Veterinary {
    private final String name;
    private final String Address;
    private final String Document;
    private final String Phone;
    private final String Licence;

    /**
     * Validate constructor params
     * @param name
     * @param address
     * @param document
     * @param phone
     * @param licence
     */
    private void validateParams(String name, String address, String document, String phone, String licence){
        if(name == null || name.isEmpty())
            throw new IllegalArgumentException("name is null or empty");
        if(address == null || address.isEmpty())
            throw new IllegalArgumentException("address is null or empty");
        if(document == null || document.isEmpty())
            throw new IllegalArgumentException("document is null or empty");
        if(phone == null || phone.isEmpty())
            throw new IllegalArgumentException("phone is null or empty");
        if(licence == null || licence.isEmpty())
            throw new IllegalArgumentException("licence is null or empty");
    }

    public Veterinary(String name, String address, String document, String phone, String licence) {
        validateParams(name, address, document, phone, licence);
        this.name = name;
        this.Address = address;
        this.Document = document;
        this.Phone = phone;
        this.Licence = licence;
    }

    @Override
    public String toString() {
        return "Veterinary{" +
                " \nname='" + name + '\'' +
                ", \nAddress='" + Address + '\'' +
                ", \nDocument='" + Document + '\'' +
                ", \nPhone='" + Phone + '\'' +
                ", \nLicence='" + Licence + '\'' +
                '}';
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
