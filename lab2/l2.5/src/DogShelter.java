class DogShelter {
    private Dog[] dogs;
    private int index = 0;


    public DogShelter(int size) {
        dogs = new Dog[size];
    }


    public void addDog(Dog dog) {
        if (index < dogs.length) {
            dogs[index++] = dog;
        } else {
            System.out.println("Shelter is full!");
        }
    }

    public static void main(String[] args) {
        DogShelter shelter = new DogShelter(5);

        shelter.addDog(new Dog("Bublic", 3));
        shelter.addDog(new Dog("Sharic", 5));
        shelter.addDog(new Dog("Laika", 2));

        for (Dog dog : shelter.dogs) {
            if (dog != null) {
                System.out.println(dog.toString());
            }
        }
    }
}