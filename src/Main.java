import java.util.Scanner;

public  class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int)(Math.random() * 100) + 1;
        int maxTries = 10;
        boolean hasGuessedCorrectly  = false;

        System.out.println("Bienvenue au jeu de devinettes from charles !");
        System.out.println("J'ai choisis un nomnre entre 1 et 100 , vous avez " + maxTries + " essais pour deviner le nombre choisi . \n Bonne chance ! !" );

        for(int i = 1; i < maxTries ; i++){
            System.out.print("Essais N" + i + " " + "Devinez le nombre  : ");
            int userGuess = scanner.nextInt();

            if (userGuess == randomNumber){
                hasGuessedCorrectly  = true;
                System.out.println(("Vous avez gagnez au  ") + i + (" essai Congratulations !!! "));
                System.out.println("Succès !!");
                break;
            }else if (userGuess < randomNumber){
                System.out.println("Trop bas ! Essayer un nombre plus grand .");
            }else{
                System.out.println("Trop haut ! Essayer un nombre plus petit .");
            }
        }
        if(!hasGuessedCorrectly){
            System.out.println("Desolé et dommage , vous avez finis vos  " + maxTries + " essais ! ");
            System.out.println("Echec !");
        }
    }
}