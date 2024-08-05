package texh.siloxa.anahita.coderman;

import tech.siloxa.anahita.Anahita;

import java.awt.*;

public class Coderman {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                new Anahita(args, Coderman.class).run();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }
}