package z20210822.varargs;

public class SamochodVMAin {
    public static void main(String[] args) {


        SamochodV car=SamochodV.builderCar()
                .withkolor("biały")
                .withMarka("seat")
                .build();

        System.out.println(car.getKolor());

      //  System.out.println(car.); ------> rozkmin to - jestes blisko

        }


    }

