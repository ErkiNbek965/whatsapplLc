import dao.Profile;
import model.impl.ProfileImpl;
import model.impl.ProfileService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Profile> profiles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        ProfileService profileService = new ProfileImpl();
        while (true){
            System.out.println("""
                1-> Install Whatsapp
                2-> Go to Profie
                3-> Get all whatsapp status
                4-> Change profile photo
                5-> Change whatsapp status
                6-> Add contact
                7-> Send message
                8-> Delete whatsapp""");
            switch (scanner.nextInt()){
                case 1-> profileService.installWhatsapp(profiles);
                case 2-> System.out.println(profileService.goToProfile(profiles));
                case 3-> profileService.getaAllWhatsappStatus();
                case 4-> System.out.println(profileService.changeProfilePhoto(profiles));
                case 5-> profileService.changeWhatsappStatus(profiles);
            }
        }




    }
}
