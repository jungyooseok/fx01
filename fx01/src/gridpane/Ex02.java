package gridpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex02 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		GridPane gridpane = new GridPane();
		Button button = new Button("Button");
		GridPane.setConstraints(button,0,0);
		
		Label label = new Label("Lable");
		GridPane.setConstraints(label,1,1);
		
		gridpane.getChildren().addAll(button, label);
		Button btn = new Button("1, 0");
		gridpane.add(btn, 1, 0);
		gridpane.add(new Label("0, 1"), 0, 1);
		
		gridpane.setPadding(new Insets(20)); // 위, 오른, 아래, 왼 모두 20
		gridpane.setHgap(50); //세로
		gridpane.setVgap(10); //가로
		arg0.setScene(new Scene(gridpane, 300,300));
		
		FlowPane flowPane = new FlowPane();
		flowPane.getChildren().add( new Button("merge col(0), row(2)") );
		flowPane.setStyle("-fx-background-color:black;");
		flowPane.setAlignment(Pos.CENTER);
		gridpane.add(flowPane, 0, 2,2,1);//가로, 세로, 가로병합, 세로병합
		
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}








