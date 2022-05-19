
public class Program {
    public static void main(String[] args) {
        Pet dog = new Pet("Тузик", 3, "собака");
        Pet cat = new Pet("Васька", 5, "кот");
        Pet dog2 = new Pet("Рекс", 7, "собака");
        Pet dog3 = new Pet("Скай", 2, "собака");
        Client client1 = new Client("Наталья", "Беляева");
        Client client2 = new Client("Антон", "Иванов");
        PetClinic petClinic = new PetClinic("AльфаВет");
        petClinic.addClient(client1);
        petClinic.addPetToClient(client1,dog);
        petClinic.addPetToClient(client1,cat);
        petClinic.addPetToClient(client1,dog);
        petClinic.addPetToClient(client2,dog2);
        petClinic.getAllClients();
    }

}
