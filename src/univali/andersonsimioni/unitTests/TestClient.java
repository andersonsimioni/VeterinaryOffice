package univali.andersonsimioni.unitTests;

import univali.andersonsimioni.Client;

public class TestClient {
    private Client client;

    public void run() {
            this.client = new Client(
                    "Willian de Souza",
                    "99999999999",
                    "Test Address",
                    "5548999999999"
                    );

            System.out.println("Running test on Client Class");
            System.out.println("Client name: " + this.client.getName());
            System.out.println("Client document: " + this.client.getDocument());
            System.out.println("Client address: " + this.client.getAddress());
            System.out.println("Client phone: " + this.client.getPhone());
    }
}
