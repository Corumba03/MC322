package biblioteca.models.padraoprojeto;

import biblioteca.models.padraoprojeto.Observer;

public class CObserver implements Observer {
    private String name;

    public CObserver(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}
