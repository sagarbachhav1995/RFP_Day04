import java.util.Random;
public class SL_Game_OptionCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random Dice = new Random();
        int a = Dice.nextInt(6)+1;
        System.out.println(a);
        if(a == 0){
            System.out.println("Sorry No Play");

        }else if(a == 2){
            System.out.println("Oop's There is SNAKE");
        }else if(a == 4){
            System.out.println("Go Up..! There is Ladder");
        }else{
            System.out.println("Play Again");
        }

    }

}
