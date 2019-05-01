import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Calculator extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		
		TextField textField = new TextField();
		root.setTop(textField);
		VBox RightVBox = new VBox();
		Button Add = new Button("+");
		Button Subtract = new Button("-");
		Button Multiply = new Button("*");
		Button Divide = new Button("/");
		Button Enter = new Button("=");
		RightVBox.getChildren().addAll(Add, Subtract, Multiply, Divide, Enter);
		root.setRight(RightVBox);
		
		GridPane gridpane = new GridPane();
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		Button b5 = new Button("5");
		Button b6 = new Button("6");
		Button b7 = new Button("7");
		Button b8 = new Button("8");
		Button b9 = new Button("9");
		Button b0 = new Button("0");
	
		
		gridpane.add(b1, 0, 0);
		gridpane.add(b2, 1, 0);
		gridpane.add(b3, 2, 0);
		gridpane.add(b4, 0, 1);
		gridpane.add(b5, 1, 1);
		gridpane.add(b6, 2, 1);
		gridpane.add(b7, 0, 2);
		gridpane.add(b8, 1, 2);
		gridpane.add(b9, 2, 2);
		gridpane.add(b0, 1, 4);
		root.setCenter(gridpane);
		
		
		HBox hBox = new HBox();

		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}
}
