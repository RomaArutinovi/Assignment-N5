package com.example.java_razmik_arutinovi;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        AirlinesUtil.createTable();

        TextField textField1 = new TextField("Direction");
        textField1.setTranslateY(40);
        textField1.setTranslateX(40);

        TextField textField2 = new TextField("Date");
        textField2.setTranslateY(80);
        textField2.setTranslateX(40);

        TextField textField3 = new TextField("Places");
        textField3.setTranslateY(120);
        textField3.setTranslateX(40);

        TextField textField4 = new TextField("Price");
        textField4.setTranslateY(160);
        textField4.setTranslateX(40);

        Button button1 = new Button("Submit");
        button1.setOnAction(event -> {
                    String insertSql = "INSERT INTO AIRLINES(DIRECTION, DATE, PLACES, PRICE) VALUES(" +
                            "'"+ textField1.getText() + "', " +
                            "'"+ textField2.getText() + "', " +
                            ""+ textField3.getText() + "" +
                            ""+ textField4.getText() + ")";;
                    try {
                        JDBCUtil.getStatement().executeUpdate(insertSql);
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Inserted...");;
        });
        button1.setTranslateY(200);
        button1.setTranslateX(40);
//
//        Button button2 = new Button("-");
//        button2.setOnAction(actionEvent -> {
//            text.setText(String.valueOf(Integer.parseInt(textField1.getText())-Integer.parseInt(textField2.getText())));
//        });
//        button2.setTranslateY(120);
//        button2.setTranslateX(80);
//

//        Rectangle rectangle = new Rectangle();
//        rectangle.setTranslateX(200);
//        rectangle.setTranslateY(100);
//        rectangle.setWidth(100);
//        rectangle.setHeight(50);
//        rectangle.setFill(Color.RED);

//        Box box = new Box();
//        box.setTranslateX(200);
//        box.setTranslateY(200);
//        box.setWidth(100);
//        box.setHeight(200);
//        box.setDepth(50);

//        PerspectiveCamera perspectiveCamera = new PerspectiveCamera();
//        perspectiveCamera.setTranslateX(100);
//        perspectiveCamera.setTranslateY(50);
//        perspectiveCamera.setTranslateZ(50);

//        PieChart pieChart = new PieChart();
//        pieChart.setTranslateX(100);
//        pieChart.setTranslateY(200);
//        pieChart.setData(getData());

        Group root = new Group();
        root.getChildren().add(textField1);
        root.getChildren().add(textField2);
        root.getChildren().add(textField3);
        root.getChildren().add(textField4);
        root.getChildren().add(button1);

        Scene scene = new Scene(root, 600, 400);
//        scene.setCamera(perspectiveCamera);
        stage.setScene(scene);
        stage.setTitle("First Application");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}