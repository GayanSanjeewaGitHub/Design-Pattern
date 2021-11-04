package pkg13_bridge_structural.design.pattern;

/**
 *
 * @author GAYAN SANJEEWA
 */
abstract class Soldier {

    Weapon weapon;

    public abstract void run();

    public abstract void setGun(Weapon w);

    public abstract void dropGun();

    public abstract void fire();
}

abstract class Weapon {

    String name;

    public abstract void shoot();

}

class Infantry extends Soldier {

    public void run() {
        System.out.println("Runing");
    }

    public void setGun(Weapon w) {
        weapon = w;
        System.out.println("Taking the " + weapon.name);
    }

    public void dropGun() {
        System.out.println("Dropping the " + weapon.name);
    }

    @Override
    public void fire() {
        weapon.shoot();

    }

}

class Ranger extends Soldier {

    public void run() {
        System.out.println("Runing");
    }

    public void setGun(Weapon w) {
        weapon = w;
        System.out.println("Taking the " + weapon.name);
    }

    public void dropGun() {
        System.out.println("Dropping the " + weapon.name);
    }

    @Override
    public void fire() {

        weapon.shoot();

    }

}

class Commando extends Soldier {

    public void run() {
        System.out.println("Runing");
    }

    public void setGun(Weapon w) {
        weapon = w;
        System.out.println("Taking the " + weapon.name);
    }

    public void dropGun() {
        System.out.println("Dropping the " + weapon.name);
    }

    public void fire() {
        weapon.shoot();

    }

}
//////////////////////////////////////////////////////////

class Snipper extends Weapon {

    Snipper( ) {
        name = "Snipper";
    }

    @Override
    public void shoot() {
        System.out.println("Shoot from Snipper");
    }

}

class Pistol extends Weapon {

    Pistol( ) {
        name = "Pistol";
    }

    @Override
    public void shoot() {
        System.out.println("Shoot from Pistol");
    }

}

class ShotGun extends Weapon {

    ShotGun( ) {
        name = "ShotGun";
    }

    @Override
    public void shoot() {
        System.out.println("Shoot from ShotGun");
    }

}

public class Bridge_Exam {

    public static void main(String[] args) {
//        Ranger ranger = new Ranger();
//        ranger.run();
//        ranger.setGun(new Snipper());
//        ranger.fire();
//        ranger.dropGun();
//        ranger.setGun(new Pistol());
//        ranger.fire();
//        
//        System.out.println("/////////////////////");
//        System.out.println("/////////////////////");
//        System.out.println("/////////////////////");
//        Commando commando = new Commando();
//        commando.run();
//        commando.setGun(new ShotGun());
//        commando.fire();
//        commando.dropGun();
//        commando.setGun(new Snipper());
//        commando.fire();

        System.out.println(10+20+"aaa");
        System.out.println("aaa"+10+20);
        
        
        
        
    }

}
