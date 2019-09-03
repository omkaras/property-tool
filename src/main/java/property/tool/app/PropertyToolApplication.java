package property.tool.app;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PropertyToolApplication extends Application implements Initializable {

	@FXML
	private Button migrateBtn;
	@FXML
	private Button reportBtn;
	@FXML
	private Button drOverrideBtn;

	@FXML
	private Pane welcomePane;
	@FXML
	private GridPane mpGrid;

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/PropertyTool.fxml"));

		fxmlLoader.setController(this);
		Parent panel = fxmlLoader.load();
		Scene scene = new Scene(panel);
		stage.setScene(scene);
		stage.setTitle("Property Tool");
		stage.setResizable(false);
		stage.show();
		panel.requestFocus();

		startUp();
	}

	public void startUp() {
		welcomePane.setAccessibleText("Welcome to Property Tools!");
		mpGrid.setVisible(false);
	}

	@FXML
	public void handleMigrateBtnClick(ActionEvent event) {

		mpGrid.setVisible(true);
	}

	@FXML
	public void handleReportBtnClick(ActionEvent event) {

		mpGrid.setVisible(false);
	}

	@FXML
	public void handleDRBtnClick(ActionEvent event) {

		mpGrid.setVisible(false);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}
}
