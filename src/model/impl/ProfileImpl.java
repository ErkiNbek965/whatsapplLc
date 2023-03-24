package model.impl;

import dao.Profile;
import model.enums.Status;
import model.myException.MyException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProfileImpl implements ProfileService {
    private static Long counter;
    List<Profile> profiles = new ArrayList<>();
    List<String> users = new ArrayList<>();

    public void installWhatsapp(List<Profile> profiles) {
        try {

            System.out.print("номер жаз : ");
            int number = new Scanner(System.in).nextInt();
            for (Profile pr : profiles) {
                if (pr.getPhoneNumber() == number) {
                    throw new MyException("мындай номер бар ");
                }


            }
            System.out.print("Атынды жаз : ");
            String name = new Scanner(System.in).nextLine();
            System.out.print("пароль жаз : ");
            String password = new Scanner(System.in).nextLine();
            if (counter == null) {
                counter = 1L;
            }
            Profile profile = new Profile(counter++, name, number, password, "defalt image ", new ArrayList<>(), Status.HELLO_I_USE_WHATSAPP);
            profiles.add(profile);
            System.out.println(profile);

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public Profile goToProfile(List<Profile> profiles) {
        System.out.print("Атынды жаз : ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("пароль жаз : ");
        String password = new Scanner(System.in).nextLine();
        for (Profile pr : profiles) {
            if (pr.getUserName().equalsIgnoreCase(name)) {
                if (pr.getPassword().equalsIgnoreCase(password)) {
                    return pr;
                }
            }
        }
        return null;
    }


    @Override
    public void getaAllWhatsappStatus() {
        List<Status> statusList = new ArrayList<>(Arrays.asList(Status.HELLO_I_USE_WHATSAPP, Status.AT_WORK, Status.BUSY, Status.TO_THE_CINEMA));
        System.out.println("все статусы по умолчанию");
        for (Status s : statusList) {
            System.out.println(s + " ");
            System.out.println("===============");

        }


    }

    @Override
    public Profile changeProfilePhoto(List<Profile> profiles) {

        Profile profile = new Profile();

            try {
                System.out.println(" image ");
                System.out.print("Enter name : ");
                String name = new Scanner(System.in).nextLine();
                System.out.print("Enter password : ");
                String password = new Scanner(System.in).nextLine();
                for (Profile pr : profiles) {
                    if (pr.getUserName().equalsIgnoreCase(name)) {
                        if (pr.getPassword().equalsIgnoreCase(password)) {
                            System.out.println(pr);
                            System.out.print("Izmenit image :");
                            String image = new Scanner(System.in).nextLine();
                            pr.setImage(image);
                            System.out.println(pr);

                        }
                    } else {
                        throw new MyException("not this profile :");
                    }


                }

            } catch (MyException e) {
                System.out.println(e.getMessage());
            }

            return null;


    }



    @Override
    public void changeWhatsappStatus(List<Profile>profiles) {

            System.out.println("Поменять статус");
            System.out.println("Введите имя ползователья");
            String name = new Scanner(System.in).nextLine();
            System.out.println("Введите пароль ");
            String password = new Scanner(System.in).nextLine();
            for (Profile pr:profiles) {
                if (pr.getUserName().equalsIgnoreCase(name) && pr.getPassword().equalsIgnoreCase(password)){
                    System.out.println(pr);
                    System.out.println("---->>> Выберите статус<<<----");
                    System.out.println('\n'+"1:At Working(На работе" +
                            '\n'+"2:To the Cinema(В кинотеатре) " +
                            '\n'+"3: Busy (Еду в маршрутке 101)" +
                            '\n'+"4: Hello i use whatsapp(привет я использую ватсап) ");
                }
                int status = new Scanner(System.in).nextInt();
                switch (status){
                    case 1->pr.setStatus(Status.AT_WORK);
                    case 2->pr.setStatus(Status.TO_THE_CINEMA);
                    case 3->pr.setStatus(Status.BUSY);
                    case 4->pr.setStatus(Status.HELLO_I_USE_WHATSAPP);
                }

                System.out.println(status);
            }

        }

    @Override
    public void addContact(List<Profile> profiles) {

    }

    @Override
    public void sendMassage() {

    }

    @Override
    public void deleteWhatsapp() {

    }
}