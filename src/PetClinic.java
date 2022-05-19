import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class PetClinic {
    String name;
    Map<Client, HashSet<Pet>> clients = new HashMap<>();

    public PetClinic(String name) {
        this.name = name;
    }

    public void addClient(Client client) {
        if (clients.containsKey(client)) {
            System.out.println("Клиент уже есть в базе");
        } else {
            clients.put(client, new HashSet<>());
        }
    }

    public void addPetToClient(Client client, Pet pet) {
        if (!clients.containsKey(client)) {
            addClient(client);
        }
        HashSet<Pet> petsClient = clients.get(client);
        if (petsClient.add(pet)) {
            System.out.println("Добавлено животное " + pet.name + " для клиента " +
                    client.firstName + " " + client.lastName);
        } else {
            System.out.println("Животное " + pet.name + " уже добавлено в базу для клиента " +
                    client.firstName + " " + client.lastName);
        }


    }

    public void getAllClients() {
        for (Map.Entry<Client, HashSet<Pet>> entry : clients.entrySet()) {
            int i = 0;
            Client client = entry.getKey();
            HashSet<Pet> pets = entry.getValue();
            System.out.print(client.lastName + " " + client.firstName + " (");
            for (Pet pet : pets) {
                if (i == pets.size() - 1) {
                    System.out.print(pet.name);
                } else {
                    System.out.print(pet.name + ", ");
                }
                i++;
            }
            System.out.print(")");
            System.out.println();
        }
    }
}
