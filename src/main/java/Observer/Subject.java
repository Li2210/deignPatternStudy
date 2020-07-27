package Observer;

public interface Subject {
    /**
     * add new observer
     * @param observer
     */
    void attach(Observer observer);

    /**
     * delete observer
     * @param observer
     */
    void detach(Observer observer);

    /**
     * notify observer
     * @param message
     */
    void notify(String message);
}
