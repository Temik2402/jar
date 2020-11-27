import javax.swing.JFrame;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class expl  extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group group = new Group();
        Scene scene = new Scene(group, 1800, 800);

        primaryStage.setTitle("Звездные империи тест1)");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {

        System.out.println("HW!");
        reader r = new reader("Моя программа");
        r.setVisible (true);
        r.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        r.setSize(300, 200);

        System.out.println("HW2!");
    }
    /*/
    public static void main(String[] args) {
        System.out.println("HW!");
    }
    //*/
}
