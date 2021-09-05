package quiz;
import java.util.*;
import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class Quiz04 extends Application {
	private VBox getVBox(int insets, int space){
		VBox vbox = new VBox();
		vbox.setPadding(new Insets(insets));
		vbox.setSpacing(space);
		return vbox;
	}
	private HBox getHBox(int insets, int space){
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(insets));
		hbox.setSpacing(space);
		return hbox;
	}
	private Pane getPane(String style, int x, int y){
		Pane canvas = new Pane();
		canvas.setStyle(style);
		canvas.setPrefSize(x, y);
		return canvas;
	}
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		HBox hBox = getHBox(10, 10);
		VBox vBox = getVBox(0, 10);
		List<Pane>	lstPane = new ArrayList<Pane>();
		lstPane.add(getPane("-fx-background-color: blue;", 110, 110));
		lstPane.add(getPane("-fx-background-color: red;", 200, 50));
		lstPane.add(getPane("-fx-background-color: black;", 200, 50));
		vBox.getChildren().add(lstPane.get(1));
		vBox.getChildren().add(lstPane.get(2));
		hBox.getChildren().add(vBox);
		hBox.getChildren().add(lstPane.get(0));
		pane.getChildren().add(hBox);
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
