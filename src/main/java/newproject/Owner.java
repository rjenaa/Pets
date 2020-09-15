package newproject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Owner {
    public void startProgram(){
        System.out.println("How many pets do you have?");
        Scanner scanner = new Scanner(System.in);
        int numberOfPets = scanner.nextInt();
        ArrayList<String> PetsSpeech= new ArrayList<>();
        ArrayList<String>PetsNames= new ArrayList<>();
        ArrayList<String>PetsTypes = new ArrayList<>();
        boolean access = true;
        do {
            System.out.println("What type of pets are they? Press n to exit");
            String petTypes = scanner.next();
            if (petTypes.equals("n")){
                break;
            }
            PetsTypes.add(petTypes);
            System.out.println("What is their name?");
            String petNames = scanner.next();
            PetsNames.add(petNames);
            if(petTypes.equalsIgnoreCase("dog")){
                Dog dog =  new Dog();
                dog.setName(petNames);
                PetsSpeech.add(dog.speak());
            }
            if(petTypes.equalsIgnoreCase("cat")){
                Cat cat =  new Cat();
                cat.setName(petNames);
                PetsSpeech.add(cat.speak());

            }
            if(petTypes.equalsIgnoreCase("bird")){
                Bird bird =  new Bird();
                bird.setName(petNames);
                PetsSpeech.add(bird.speak());

            }

        }while(true);
        System.out.println(Arrays.toString(PetsTypes.toArray()));
        System.out.println(Arrays.toString(PetsNames.toArray()));
        System.out.println(Arrays.toString(PetsSpeech.toArray()));
    }
}
