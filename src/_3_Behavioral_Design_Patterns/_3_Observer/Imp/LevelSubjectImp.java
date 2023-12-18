package _3_Behavioral_Design_Patterns._3_Observer.Imp;

public interface LevelSubjectImp {
    void addObserver(LevelObserverImp levelObserverImp);

    void removeObserver(LevelObserverImp levelObserverImp);

    void notifyObservers();
}
