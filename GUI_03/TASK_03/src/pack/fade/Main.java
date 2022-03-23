package pack.fade;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        LandlinePhone LLP = new LandlinePhone("iPhoneLandline", "Apple", 2137.0, true);
        MobilePhone MP = new MobilePhone("Erixon 2", "Sony", 2000.0,true);
        SmartPhone SP = new SmartPhone("TurboFon3000", "Small Indie Company", 9999.9, true, true);
        SmartPhone SP2 = new SmartPhone("TurboFon3000 bieda edyszyn", "Small Indie Company", 999.9, true, false);
        GameConsole GC = new GameConsole("GrajStacja 34", "Microsoft",133.7, true);

        GC.playGames();
        MP.call(SP);
        SP.internet();

        Device[] devices = {LLP, MP, SP, SP2, GC};

        System.out.println("Presort");

        for (Device device: devices){
            System.out.println(device);
        }

        Arrays.sort (devices, new Comparator<Device>(){
                @Override
                public int compare(Device o1, Device o2) {
                    return o2.getPrice().compareTo(o1.getPrice());
                }
            }
        );

        System.out.println("Postsort");
        for (Device device: devices){
            System.out.println(device);
        }

    }
}
