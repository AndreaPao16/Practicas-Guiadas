public class Main {
    public static void main(String args[]){
        /* 
        int[] numbers = {10, 20, 30, 40, 50};
        String[] fruits = new String[3];

        System.out.println(numbers[2] + ", " + fruits[2]);
        */

        Person person = new Person("Andrea", 19, new PetManager(8));
        Pet pet = new Pet("Goldie", "Fish");
        Pet pet2 = new Pet("Tessa", "Dog");
        Pet pet3 = new Pet("Sammy", "Dog");

        person.addPet(pet);


        if(person.addPet(pet2)){

     
            IOManager.read("Pet added succesfully");

        }else{

            IOManager.read("Failed to add pet");
        }

        /* for(Pet pet : person.getPets() ){

            IOManager.read(pet.getPetName());

        }

        */

        if(person.removePet(pet)){

            IOManager.read("Pet removed succesfully");

        }else{

            IOManager.read("Failed to remove pet");

        }

        if(person.updatePets(pet3, 8)){

            IOManager.read("Update succesfully");

        }else{

            IOManager.read("Failed to update");
        }

        if(person.getPets().length == 0){

            IOManager.read("No pets found");

        }else{

            for(Pet pets : person.getPets()){
                IOManager.read(pets.getPetName());
            }
        }

        
            

        
    }
}
