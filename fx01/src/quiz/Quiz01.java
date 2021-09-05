package quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Quiz01 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		BorderPane pb = new BorderPane();
		
		Label labelMenu = new Label();
		labelMenu.setText("메뉴");
		Label labelHome = new Label("홈");
		Label labelLogin = new Label("로그인");
		
		FlowPane topPane = new FlowPane();
		topPane.getChildren().addAll(labelMenu,labelHome,labelLogin);
		topPane.setAlignment(Pos.CENTER_RIGHT);
		topPane.setHgap(20);
		topPane.setPadding(new Insets(10,30,10,0));
		topPane.setStyle("-fx-background-color:pink;");
		topPane.setPrefSize(500, 50);
		pb.setTop(topPane);
		
		Button leftBtn = new Button("메뉴 나열");
		FlowPane leftPane = new FlowPane();
		leftPane.getChildren().addAll(leftBtn);
		leftPane.setStyle("-fx-background-color:skyblue;");
		leftPane.setPrefSize(100, 300);
		pb.setLeft(leftPane);
		
		Button centerBtn = new Button("내용 들어가는 곳");
		FlowPane centerPane = new FlowPane();
		centerPane.getChildren().addAll(centerBtn);
		centerPane.setStyle("-fx-background-color:#CEF279;");
		pb.setCenter(centerPane);
		
		Button bottomBtn = new Button("내용 들어가는 곳");
		bottomBtn.setPrefSize(300, 20);		
		FlowPane bottomPane = new FlowPane();
		bottomPane.setAlignment(Pos.CENTER);
		bottomPane.getChildren().addAll(bottomBtn);
		bottomPane.setStyle("-fx-background-color:gray;");
		
		pb.setBottom(bottomPane);
		
		
		Button idBtn = new Button("아이디 입력");
		Button pwdBtn = new Button("비밀번호 입력");
		Button loginBtn = new Button("로그인");
		
		idBtn.setPrefSize(100, 20);
		pwdBtn.setPrefSize(100, 20);
		loginBtn.setPrefSize(70, 40);
		
		GridPane rightPane = new GridPane();
		rightPane.add(idBtn, 0, 0);
		rightPane.add(pwdBtn, 0, 1);
		rightPane.add(loginBtn, 1, 0, 1, 2);
		
		rightPane.setPadding(new Insets(100,20,0,20));
		
		rightPane.setStyle("-fx-background-color:hotpink;");
		rightPane.setPrefSize(200, 350);
		pb.setRight(rightPane);
		
		
		
		arg0.setScene(new Scene(pb, 500, 400));
		
		arg0.show();
	}
}









