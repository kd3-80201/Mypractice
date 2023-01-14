public class oop5 {
    public static void main(String[] args) {
        phones up = new UpgradedPhone(); // can not define the object of abstract class, so we have to make one of the concrete class
        // so we can get the values straight,
        // while doing the values as UpgradedPhone up = new UpgradedPhone(); we are just getting the values from class UpgradePhone
        // But our aim is to get the values from Phones, NewPhone, so they didn't get idle that's why we have to use phones up = new UpgradedPhone();
        up.Iphone();
        up.Samsung();
        up.OnePlus();
    }
}
abstract class phones{ // Abstract Class
    public void Iphone(){
        System.out.println("Iphone: "+"17 chipset, Retina Display, Super Stability");
    }
    public abstract void Samsung();
    public abstract void OnePlus();
}
abstract class NewPhone extends phones{ // Abstract class
    public void Samsung(){
        System.out.println("Samsung: "+"Exynos 1000,80x zoom, Curve Display");
    }
    public abstract void OnePlus(); // if can't able to define its specification, just declare it abstract
}
class UpgradedPhone extends NewPhone{ // Concrete Class because we fulfilled the abstract requirement
public void OnePlus(){
    System.out.println("OnePlus: "+"Affordable, Better performance, HighEnd Gaming");
}
}
