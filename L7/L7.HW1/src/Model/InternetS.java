package Model;

import java.util.List;

public class InternetS {
    private InternetS(){};
    private static InternetS internetS = new InternetS();
    public static InternetS getInstance(){
        return internetS;
    }
    public List<InternetE> report(InternetE internetE) throws Exception{
        List<InternetE> internetES;
        try (InternetR internetR=new InternetR ()){
            internetES=internetR.select (internetE);
        }
        return internetES;
    }
    public void save(InternetE internetE) throws Exception{
        try (InternetR internetR = new InternetR ()) {
            if(internetE.getId()==1){
                internetE.setInternet_size(internetE.getInternet_size()+2);
                internetE.setPrice(internetE.getPrice()+1000);
                internetR.update (internetE);
                internetR.commit ();
            }else if (internetE.getId()==2){
                internetE.setInternet_size(internetE.getInternet_size()+4);
                internetE.setPrice(internetE.getPrice()+2000);
                internetR.update (internetE);
                internetR.commit ();
            }else if (internetE.getId()==3){
                internetE.setInternet_size(internetE.getInternet_size()+10);
                internetE.setPrice(internetE.getPrice()+5000);
                internetR.update (internetE);
                internetR.commit ();
            }else if (internetE.getId()==4){
                internetE.setInternet_size(internetE.getInternet_size()+25);
                internetE.setPrice(internetE.getPrice()+10000);
                internetR.update (internetE);
                internetR.commit ();
            }

        }
    }
}
