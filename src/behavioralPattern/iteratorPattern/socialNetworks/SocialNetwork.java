package behavioralPattern.iteratorPattern.socialNetworks;

import behavioralPattern.iteratorPattern.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
