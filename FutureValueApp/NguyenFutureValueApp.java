/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, T. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

// Declare NguyenFutureValueApp class that extends Application
public class NguyenFutureValueApp extends Application {
	// Declare private instance variables for GUI components
	private TextField tfMonthyPayment = new TextField();
	private TextField tfInterestRate = new TextField();
	private TextArea taFutureValue = new TextArea();
	private Label lblMonthyPayment = new Label("Monthy Payment:");
	private Label lblInterestRate = new Label("Interest Rate:");
	private Label lblYears = new Label("Years:");
	private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
	private ComboBox<Integer> cbYears = new ComboBox<>();
	private Button btnCalculate = new Button("Calculate");
	private Button btnClear = new Button("Clear");

	// Override start method to create GUI
	@Override
	public void start(Stage primaryStage) {
	    // Create GridPane
	    GridPane pane = new GridPane();
	    pane.setAlignment(Pos.CENTER);
	    pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
	    pane.setHgap(5.5);
	    pane.setVgap(5.5);

	    // Add labels and text fields to pane
	    pane.add(lblMonthyPayment, 0, 0);
	    pane.add(tfMonthyPayment, 1, 0);
	    pane.add(lblInterestRate, 0, 1);
	    pane.add(tfInterestRate, 1, 1);

	    // Add ComboBox for years to pane
	    cbYears.setMaxWidth(Double.MAX_VALUE);
	    cbYears.getItems().addAll(10,15,30);
	    pane.add(lblYears, 0, 3);
	    pane.add(cbYears, 1, 3);

	    // Add label for interest rate format and set text color to red
	    lblInterestRateFormat.setTextFill(Color.RED);
	    pane.add(lblInterestRateFormat, 1, 2);
	    GridPane.setHalignment(lblInterestRateFormat,HPos.RIGHT);

	    // Add Clear and Calculate buttons to pane
	    HBox actionBtnContainer = new HBox();
	    actionBtnContainer.setAlignment(Pos.CENTER_RIGHT);
	    actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
	    actionBtnContainer.setSpacing(10);
	    actionBtnContainer.getChildren().add(btnClear);
	    actionBtnContainer.getChildren().add(btnCalculate);
	    pane.add(actionBtnContainer,1,4);

	    // Add TextArea for future value to pane
	    GridPane.setColumnSpan(taFutureValue, 2);
	    pane.add(taFutureValue, 0, 8);

	    // Set title, scene and show stage
	    primaryStage.setTitle("Nguyen Future Value App");
	    primaryStage.setScene(new Scene(pane, 300, 400));
	    primaryStage.show();
	}

	// Define main method to launch application
	public static void main(String[] args) {
	    launch(args);
	}
}