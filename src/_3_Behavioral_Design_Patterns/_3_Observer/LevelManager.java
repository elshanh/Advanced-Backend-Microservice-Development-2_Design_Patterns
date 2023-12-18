package _3_Behavioral_Design_Patterns._3_Observer;

import _3_Behavioral_Design_Patterns._3_Observer.Imp.LevelObserverImp;
import _3_Behavioral_Design_Patterns._3_Observer.Imp.LevelSubjectImp;
import java.util.List;
import java.util.ArrayList;

public class LevelManager implements LevelSubjectImp {
    private int currentLevel;
    private List<LevelObserverImp> levelObserver = new ArrayList<>();

    public void setLevel(int newLevel) {
        this.currentLevel = newLevel;
        notifyObservers();
    }

    @Override
    public void addObserver(LevelObserverImp levelObserverImp) {
        levelObserver.add(levelObserverImp);
    }

    @Override
    public void removeObserver(LevelObserverImp levelObserverImp) {
        levelObserver.remove(levelObserverImp);
    }

    @Override
    public void notifyObservers() {
        for (LevelObserverImp levelObserverImp : levelObserver) {
            levelObserverImp.update(currentLevel);
        }
    }
}
