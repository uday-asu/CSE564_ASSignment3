package Plotter;

import java.util.ArrayList;

public class Observable {
    private boolean changed = false;
    private ArrayList<Observer> observers;

    public Observable() {
        observers = new ArrayList<Observer>();
    }

    /**
     * Adds an observer to the list
     * @param   o   an observer to be added.
     */
    public void addObserver(Observer o) {
        if (o != null){
            if (!observers.contains(o)) {
                observers.add(o);
            }
        }
    }

    /**
     * Deletes an observer from the list
     * @param   o   the observer to be deleted.
     */
    public void deleteObserver(Observer o) {
        observers.remove(o);
    }

    /**
     * Notifies the observers without any arguments
     */
    public void notifyObservers() {
        notifyObservers(null);
    }

    /**
     * Notifies the observers with arguments
     */
    public void notifyObservers(Object arg) {
        Object[] arrLocal;

//        synchronized (this) {
        if (!changed)
            return;
        arrLocal = observers.toArray();
        clearChanged();
//        }

        for (int i = arrLocal.length-1; i>=0; i--)
            ((Observer)arrLocal[i]).update(this, arg);
    }

    /**
     * Remove all observers.
     */
    public void deleteObservers() {
        observers = new ArrayList<>();
    }

    /**
     * Marks self as changed
     */
    protected void setChanged() {
        changed = true;
    }

    /**
     * Marks self as not changed
     */
    protected void clearChanged() {
        changed = false;
    }

    /**
     * Check if self has changed
     * @return true if the object has changed
     */
    public boolean hasChanged() {
        return changed;
    }

    /**
     * Returns the number of observers
     * @return  the number of observers of this object.
     */
    public int countObservers() {
        return observers.size();
    }
}
