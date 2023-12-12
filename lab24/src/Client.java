public class Client {
    public void sit(Chair chair) {
        chair.sitOn();
    }

    public static void main(String[] args) {
        ChairFactory factory = ChairFactory.getFactory();

        Chair victorianChair = factory.createChair("victorian");
        Chair multifunctionalChair = factory.createChair("multifunctional");
        Chair magicChair = factory.createChair("magic");

        Client client = new Client();

        client.sit(victorianChair);
        client.sit(multifunctionalChair);
        client.sit(magicChair);
    }
}