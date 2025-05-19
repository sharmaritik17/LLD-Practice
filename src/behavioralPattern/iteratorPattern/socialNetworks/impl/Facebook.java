package behavioralPattern.iteratorPattern.socialNetworks.impl;

import behavioralPattern.iteratorPattern.iterators.ProfileIterator;
import behavioralPattern.iteratorPattern.iterators.impl.FacebookIterator;
import behavioralPattern.iteratorPattern.profile.Profile;
import behavioralPattern.iteratorPattern.socialNetworks.SocialNetwork;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements SocialNetwork {
    private List<Profile> profileList;

    public Facebook(List<Profile> cache) {
        if(cache != null) {
            this.profileList = cache;
        } else {
            this.profileList = new ArrayList<>();
        }
    }

    public Profile requestProfileFromFacebook(String profileEmail) {
        //POST call to create profile
        simulateNetworkLatency();
        System.out.println("Facebook loading profile " + profileEmail + "over the network ");
        //and return the test data
        return findProfile(profileEmail);
    }

    public List<String> requestProfileFriendsFromFacebook(String profileEmail, String contactType) {
        //POST call to create profile
        simulateNetworkLatency();
        System.out.println("Facebook loading " + contactType + "list of " + profileEmail + " over the network ");
        //and return the test data
        Profile profile = findProfile(profileEmail);
        if(profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    private Profile findProfile(String profileEmail) {
        for(Profile profile : profileList) {
            if(profile.getEmail().equals(profileEmail)) {
                return profile;
            }
        }
        return null;
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new FacebookIterator(this, "friends", profileEmail);
    }


    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
       return new FacebookIterator(this, "coworkers", profileEmail);
    }
}