package model.impl;

import dao.Profile;

import java.util.List;

public interface ProfileService {

        void installWhatsapp(List<Profile> profiles);
        Profile goToProfile(List<Profile> profiles);
        void getaAllWhatsappStatus();
        Profile changeProfilePhoto(List<Profile>profiles);
        void changeWhatsappStatus(List<Profile>profiles);
        void addContact(List<Profile>profiles);
        void sendMassage();
        void deleteWhatsapp();
    }


