package Lesson3;

public class MainPlayer {
    public static void main(String[] args) {
//		Player player = new Player();
//		player.name = "Tim";
//		player.health=20;
//		player.weapon="Sword";
//
//		int damage =10;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());
//
//		damage = 11;
//
//		player.health=200;
//
//		//Player has fields not private but public
//		// the outcome would be 189; so you overwrite the value
//		// thus you open up your app to be accessed in a way that you don't want it to do
//		// because you may not want the player to be able to change the health like that
//
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }

}

