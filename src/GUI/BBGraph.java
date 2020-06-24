/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Model.ModBB;
import java.util.List;
import java.util.Random;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 *
 * @author mbohd
 */
public class BBGraph extends JFXPanel {
    
    List<ModBB> lbb;
    private Scene scene;
    DataGenerator dg = new DataGenerator(lbb);
    
    
    public List<ModBB> getLbb() {
        return lbb;
    }

    public void setLbb(List<ModBB> lbb) {
        this.lbb = lbb;
        dg.setLbb(lbb);
        Platform.runLater(this::refresh);
    }
    
    public BBGraph() {
        this.scene = dg.buatScene();
        init();
    }

    private void init() {
        Platform.runLater(this::createScene);
    }

    private void createScene() {
        setScene(scene);
    }

    private void refresh() {
        
        scene = dg.buatScene();
        setScene(scene);
    }
}
