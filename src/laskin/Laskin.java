package laskin;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Laskin extends Application {

    public static void main(String[] args) {
        launch(Laskin.class);
    }

    @Override
    public void start(Stage stage) {

        BorderPane asettelu = new BorderPane();
        
        TextField ylakentta = new TextField("0");
        ylakentta.setMinSize(215, 50);
        ylakentta.setAlignment(Pos.CENTER_RIGHT);
               

        // Nappien teko
        Button nappi0 = new Button("0");
        Button nappi1 = new Button("1");
        Button nappi2 = new Button("2");
        Button nappi3 = new Button("3");
        Button nappi4 = new Button("4");
        Button nappi5 = new Button("5");
        Button nappi6 = new Button("6");
        Button nappi7 = new Button("7");
        Button nappi8 = new Button("8");
        Button nappi9 = new Button("9");
        Button nappiKerto = new Button("*");
        Button nappiJako = new Button("/");
        Button nappiPlus = new Button("+");
        Button nappiMiinus = new Button("-");
        Button nappiTulos = new Button("=");
        Button nappiNollaus = new Button("c");

        // Nappien koko
        nappi0.setMinSize(50, 50);
        nappi1.setMinSize(50, 50);
        nappi2.setMinSize(50, 50);
        nappi3.setMinSize(50, 50);
        nappi4.setMinSize(50, 50);
        nappi5.setMinSize(50, 50);
        nappi6.setMinSize(50, 50);
        nappi7.setMinSize(50, 50);
        nappi8.setMinSize(50, 50);
        nappi9.setMinSize(50, 50);
        nappiKerto.setMinSize(50, 50);
        nappiJako.setMinSize(50, 50);
        nappiPlus.setMinSize(50, 50);
        nappiMiinus.setMinSize(50, 50);
        nappiTulos.setMinSize(50, 50);
        nappiNollaus.setMinSize(50, 50);

        
        GridPane gridPane = new GridPane();

        // GridPanen määrityksiä
        gridPane.setMinSize(200, 230);
        gridPane.setPadding(new Insets(20, 20, 20, 20));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);

        // Nappien asemointi
        gridPane.add(nappi0, 1, 3);
        gridPane.add(nappi1, 0, 2);
        gridPane.add(nappi2, 1, 2);
        gridPane.add(nappi3, 2, 2);
        gridPane.add(nappi4, 0, 1);
        gridPane.add(nappi5, 1, 1);
        gridPane.add(nappi6, 2, 1);
        gridPane.add(nappi7, 0, 0);
        gridPane.add(nappi8, 1, 0);
        gridPane.add(nappi9, 2, 0);
        gridPane.add(nappiKerto, 3, 0);
        gridPane.add(nappiMiinus, 3, 1);
        gridPane.add(nappiPlus, 3, 2);
        gridPane.add(nappiJako, 3, 3);
        gridPane.add(nappiTulos, 2, 3);
        gridPane.add(nappiNollaus, 0, 3);

         
        HBox numeroNakyma = new HBox();
        numeroNakyma.getChildren().add(ylakentta);
        numeroNakyma.setAlignment(Pos.CENTER);
        numeroNakyma.setPadding(new Insets(20, 0, 0, 0));
               
        asettelu.setTop(numeroNakyma);
        asettelu.setCenter(gridPane);

    
        Scene scene = new Scene(asettelu);

        // Ikkunan otsikko
        stage.setTitle("Laskin");

        stage.setScene(scene);
        stage.show();

    }

}
