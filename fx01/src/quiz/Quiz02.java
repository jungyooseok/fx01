package quiz;

import java.util.ArrayList;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Quiz02 extends Application{
	@Override
	public void start(Stage primaryStage) { 
		StackPane stack = new StackPane();
		BorderPane borderPane = new BorderPane();

		ImageView iv = new ImageView("/img/quiz.jpg");
		stack.getChildren().addAll(iv, borderPane);
				
		FlowPane flowTop = new FlowPane();
		flowTop.setPadding(new Insets(10,10,10,250));
		flowTop.setHgap(10);
		ArrayList<Label> lb = new ArrayList<>();
		lb.add(new Label("메뉴"));
		lb.add(new Label("홈"));
		lb.add(new Label("로그인"));
		flowTop.getChildren().addAll(lb);
		flowTop.setStyle("-fx-background-color:pink;");
		
		GridPane grid = new GridPane();
		//grid.setStyle("-fx-background-color:#FAF4C0;");
		grid.setPadding(new Insets(20));
		Button bt01 = new Button("아이디 입력");
		bt01.setPrefSize(100, 25);
		Button bt02 = new Button("비밀번호 입력");
		bt02.setPrefSize(100, 25);
		Button bt03 = new Button("로그인");
		bt03.setPrefSize(60, 50);
		FlowPane flowBt03 = new FlowPane(bt03);
		flowBt03.setMaxSize(0, 0);
		flowBt03.setAlignment(Pos.CENTER);
		grid.getChildren().addAll(bt01,bt02);
		grid.setConstraints(bt01,0,0);//아이디
		grid.setConstraints(bt02,0,1);//비밀번호
		grid.add(flowBt03, 1,0,1,2);//로그인
		
		AnchorPane ap = new AnchorPane();
		ListView<String> listView = new ListView<String>();
		
		listView.getItems().addAll("item1", "item2", "item3");
		listView.setMaxSize(100, 100);
		ap.getChildren().addAll(listView);
		
		FlowPane flowLeft = new FlowPane(ap);
		flowLeft.setMaxWidth(100);
		//flowLeft.setStyle("-fx-background-color:skyblue;");
		
		FlowPane flowCenter = new FlowPane(new Button("내용 들어가는 곳"));
		flowCenter.setMaxSize(100, 200);
		flowCenter.setMaxWidth(100);
		//flowCenter.setStyle("-fx-background-color:#BCE55C;");
		
		FlowPane flowBottom = new FlowPane(new Button("바닥글 들어가는 곳"));
		flowBottom.setMaxWidth(400);
		flowBottom.setAlignment(Pos.CENTER);
		//flowBottom.setStyle("-fx-background-color:#D2916C;");
		
		borderPane.setTop(flowTop);
		borderPane.setCenter(flowCenter);
		borderPane.setBottom(flowBottom);
		borderPane.setLeft(flowLeft);
		borderPane.setRight(grid);
		
		primaryStage.setTitle("Quiz02");
		primaryStage.setScene(new Scene(stack,400,200)); //배경 크기 설정
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
