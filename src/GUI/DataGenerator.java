/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Model.ModBB;
import java.util.List;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 *
 * @author mbohd
 */
public class DataGenerator{

    List<ModBB> lbb;

    public DataGenerator(List<ModBB> lbb) {
        this.lbb = lbb;
    }

    public List<ModBB> getLbb() {
        return lbb;
    }

    public void setLbb(List<ModBB> lbb) {
        this.lbb = lbb;
    }
    
    
    
    public Scene buatScene() {
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Month");
        final LineChart<String, Number> lineChart
                = new LineChart<>(xAxis, yAxis);

        lineChart.setTitle("JavaFX graph ning njero jframe");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Seri 1");
        
        
        if (lbb != null) {
            Double bbNow = 0.0;
            for (ModBB bb : lbb) {
                if(bb.getBb()!=0.0){
                    bbNow = bb.getBb();
                }
                series1.getData().add(new XYChart.Data(bb.getTanggal(), bbNow));
                System.out.println(String.valueOf(bbNow));
            }
        }

        Scene scene = new Scene(lineChart);
        lineChart.getData().add(series1);
        return scene;
    }

}
