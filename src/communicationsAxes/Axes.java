package communicationsAxes;

import java.security.PublicKey;

/**
 * Axes go through Views Services Controllers
 */
public interface Axes<T> {
    public void show(String message);

    public String showAll();

    public void create();

    T select(String message);
}
