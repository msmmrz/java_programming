public class Carfactory {
    public static Car getCar(int x){
        switch (x){
            case 1:{
                return new Bmv();}
            case 2:{
                return new Benz();
            }
            case 3:{
                return new Bogati();
            }
            default:return null;
        }

    }
}
