package Finheritacnce;
//herachical inheritance
class sound {
    String so = "has a sound"; 
}

class cats extends sound {
    public void meth() {
        System.out.println(so);
    }
}

class dogs extends sound {
    public void meth2() {
        System.out.println(so);
    }
}

public class Main5 {
    public static void main(String[] args) {
        cats obj = new cats();
        dogs obj1 = new dogs();
        obj.meth();
        obj1.meth2();
    }
}