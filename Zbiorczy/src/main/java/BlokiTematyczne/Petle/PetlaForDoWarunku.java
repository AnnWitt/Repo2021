package BlokiTematyczne.Petle;

import java.io.IOException;

class PetlaForDoWarunku {
    public static void main(String[] args) throws IOException {


        System.out.println("podaj S aby zakonczyc");

        for (int i = 0; (char) System.in.read() != 'S'; i++) {
            System.out.println("i= " + i);

        }

    }
}
