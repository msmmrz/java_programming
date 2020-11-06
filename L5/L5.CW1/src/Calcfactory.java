public class Calcfactory {

    public static Calculate getCalculate(int x) {

        if(x==1){
           return new Calmines();

        }else if (x==2){
            return new Calplus();
        }else return null;


    }
}
