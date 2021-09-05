package quiz;

import java.util.*;
import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class Quiz03 extends Application {
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
		VBox g = new VBox();
		List<HBox> lstHbox = new ArrayList<HBox>();
		List<Pane>	lstPane = new ArrayList<Pane>();
		lstHbox.add(getHBox(10, 10));
		lstHbox.add(getHBox(10, 10));
		lstPane.add(getPane("-fx-background-color: blue;", 200, 150));
		lstPane.add(getPane("-fx-background-color: red;", 200, 150));
		lstPane.add(getPane("-fx-background-color: black;", 300, 200));
		lstPane.add(getPane("-fx-background-color: blue;", 200, 150));
		lstPane.add(getPane("-fx-background-color: red;", 200, 150));
		lstPane.add(getPane("-fx-background-color: black;", 300, 200));
		System.out.println(lstPane.size()/lstHbox.size());
		/*
		 * 이코드를 먼저 실습하고 추후 아래처럼 변경하도록 실습시킴
for(int i=0;i<lstHbox.size();i++){
for(int j=0;j<(lstPane.size()/lstHbox.size());j++) lstHbox.get(i).getChildren().add(lstPane.get(j+(lstPane.size()/lstHbox.size())*i));
}
		 */
		for(int i=0;i<lstPane.size();i++)//for(i=0;i<6;i++)
			lstHbox.get(i/3).getChildren().add( lstPane.get(i) );
		for(HBox box:lstHbox)
			g.getChildren().add(box);
		Scene scene = new Scene(g);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
