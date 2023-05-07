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
import java.text.SimpleDateFormat;
import java.util.Date;


// Declare NguyenFutureValueApp class that extends Application
public class NguyenEnhancedFutureValueApp extends Application {
	// Declare private instance variables for GUI components
	private TextField txtMonthlyPayment = new TextField();
	private TextField txtInterestRate = new TextField();
	private TextArea txtResults = new TextArea("");
	private Label lblMonthlyPayment = new Label("Monthly Payment:");
	private Label lblInterestRate = new Label("Interest Rate:");
	private Label lblYears = new Label("Years:");
	private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
	private Label lblFutureValueDate = new Label("");
	private ComboBox<Integer> cbYears = new ComboBox<>();
	private Button btnCalculate = new Button("Calculate");
	private Button btnClear = new Button("Clear");
	
// Add private method clearFormFields() to clear the form fields

	private void clearFormFields() {
		txtMonthlyPayment.setText("");
	    txtInterestRate.setText("");
	    cbYears.setValue(0);
	    lblFutureValueDate.setText("");
	    txtResults.setText("");
	  }
// Add private method getTodaysDate() to return today's date in the format "MM/dd/yyyy"
	private String getTodaysDate() {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	    String todaysDate = dateFormat.format(new Date());
	    return todaysDate;
	}
 // Add private method getTodaysDate() to return today's date in the format "MM/dd/yyyy"
	private void calculateResults() {
	    String todaysDate = getTodaysDate();
	    lblFutureValueDate.setText("Calculation as of " + todaysDate);
	    double monthlyPayment = Double.parseDouble(txtMonthlyPayment.getText());
	    double interestRate = Double.parseDouble(txtInterestRate.getText());
	    int years = cbYears.getValue();
	    double futureValue = FinanceCalculator.calculateFutureValue(monthlyPayment,interestRate,years);
	    txtResults.setText(String.format("The future value is:  $%,6.2f\n",futureValue));
	    
	}
	// Override start method to create GUI
	@Override
	public void start(Stage primaryStage) {
	    // Create GridPane
	    GridPane pane = new GridPane();
	    pane.setAlignment(Pos.CENTER);
	    pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
	    pane.setHgap(5.5);
	    pane.setVgap(5.5);
        cbYears.getItems().addAll(2, 4, 6, 8, 10, 15, 30);

	    // Add labels and text fields to pane
	    pane.add(lblMonthlyPayment, 0, 0);
	    pane.add(txtMonthlyPayment, 1, 0);
	    pane.add(lblInterestRate, 0, 1);
	    pane.add(txtInterestRate, 1, 1);

	    // Add ComboBox for years to pane
	    cbYears.setMaxWidth(Double.MAX_VALUE);
	    pane.add(lblYears, 0, 3);
	    pane.add(cbYears, 1, 3);
	    
	    // Add label for interest rate format and set text color to red
	    lblInterestRateFormat.setTextFill(Color.RED);
	    pane.add(lblInterestRateFormat, 1, 2);
	    GridPane.setHalignment(lblInterestRateFormat,HPos.RIGHT);

	    
	    HBox actionBtnContainer = new HBox();
	    actionBtnContainer.setAlignment(Pos.CENTER_RIGHT);
	    actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
	    actionBtnContainer.setSpacing(10);
	    // Add Clear and Calculate buttons to pane
	    Button btnClear = new Button("Clear");
	    btnClear.setOnAction(e -> clearFormFields());
	    Button btnCalculate = new Button("Calculate");
	    btnCalculate.setOnAction(e -> calculateResults());
	    // Add TextArea for future value to pane

	    GridPane.setColumnSpan(txtResults, 2);
	    actionBtnContainer.getChildren().add(btnClear);
	    actionBtnContainer.getChildren().add(btnCalculate);
	    GridPane.setColumnSpan(lblFutureValueDate, 2);
	    pane.add(actionBtnContainer,1,4);
	    pane.add(lblFutureValueDate,0,5);
	    pane.add(txtResults, 0, 8);
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