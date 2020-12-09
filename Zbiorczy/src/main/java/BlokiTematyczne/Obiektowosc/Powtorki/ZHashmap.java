package BlokiTematyczne.Obiektowosc.Powtorki;

import java.util.HashMap;

public class ZHashmap {
    public static void main(String[] args) {
        HashMap<String, Samochod> mapasamoch=new HashMap<>();
        mapasamoch.put("s1",new Samochod("audi"));
        mapasamoch.put("s2",new Samochod("seat"));
        mapasamoch.put("s3",new Samochod("bmw"));
        mapasamoch.put("s4",new Samochod("fiat"));

        Samochod s1=mapasamoch.get("s1");
//iter
        for (String key : mapasamoch.keySet()) {
            System.out.println(mapasamoch.get(key).getNazwa());
        }
        //kolejnosc czemu, poszukaj na necie

    }
    }

