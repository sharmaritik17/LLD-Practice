package behavioralPattern.iteratorPattern.iterators;

import behavioralPattern.iteratorPattern.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}