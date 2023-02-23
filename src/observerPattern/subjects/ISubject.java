package observerPattern.subjects;

import observerPattern.observers.IObserver;

public interface ISubject {
    void registerObserver(IObserver o);
    void removeObserver(IObserver o);
    void notifyObservers();
}
