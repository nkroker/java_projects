package sample;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // 1. Create a class to encapsulate the information for a company
        // we will use a static class for this
        // Done! Notice how we used properties to hold the quantities we are
        // interested in. Also note how there was nothing in the class that
        // was specific to the fact that it will be used in a table.

        // 2. Set up the table view
        TableView tableView = new TableView();

        // 2.a set up the table columns and wire up their input property
        //     i.e. for each column, what property of the row will the cell
        //     value come from?

        TableColumn<CompanyMetrics, String> nameColumn = getColumn("Company","name");
        TableColumn<CompanyMetrics, String> revColumn = getColumn("Revenue","revenue");
        TableColumn<CompanyMetrics, String> mktCapColumn = getColumn("Valuation","mktCap");
        TableColumn<CompanyMetrics, String> growthColumn = getColumn("Growth Rate","growthRate");

        // 2.b set up an ObservableList which the table columns can hook up to.
        tableView.getColumns().addAll(nameColumn,mktCapColumn,revColumn,growthColumn);
        ObservableList<CompanyMetrics> data = FXCollections.observableArrayList(
          new CompanyMetrics("Google",427.3,17.72,11),
                new CompanyMetrics("Amazon",243.9,23.18,20),
                new CompanyMetrics("Apple",657.7,49.6,33),
                new CompanyMetrics("Twitter",18.5,0.502,61)
        );
        // in case we are wondering what these numbers are
        // the first is the valuation (market cap) of the company in $ Billion (as of September 16)
        // the second is the revenue in $B in the quarter ended June
        // the last is the growth rate in % of revenue in that quarter
        // usually we would have these numbers in a file somewhere, and would have had
        // our ObservableList read those in from file. But for our little example, we will just
        // type them out by hand

        tableView.setItems(data);
        tableView.setPrefHeight(800);
        tableView.setPrefWidth(350);

        // 3. Set up the chart

        // 3.a create axes for the chart
        final NumberAxis xAxis = new NumberAxis(-5,70,7);
        final NumberAxis yAxis = new NumberAxis(0,70,7);

        // 3.b create the chart object and pass in those axes
        BubbleChart<Number,Number> bubbleChart = new BubbleChart<Number, Number>(xAxis,yAxis);
        // 3.c add each data point (we need to do this one point at a time, unlike the tableview
        // which is why the table control is cooler to use than the charts

        // 3.c.i create a series
        XYChart.Series<Number,Number> series = new XYChart.Series<>();
        for (CompanyMetrics companyMetrics : data) {
            // 3.c.ii add each data point to the series
            XYChart.Data<Number,Number> dataPoint = new XYChart.Data<>(
                    companyMetrics.getRevenue(),
                    companyMetrics.getGrowthRate(),
                    companyMetrics.getMktCap() / 100 // this is the 'extraValue' parameter
                    // BubbleCharts are the only type of chart that use this third parameter -
                    // it specifies in pixels the radius of the bubble that will be used for this point
            );
            series.getData().add(dataPoint);

            // 3.c.iii for each data point add a custom node to hold the company's name
            StackPane stackPane = new StackPane();
            Text label = new Text(companyMetrics.getName());
            // Oops! we had forgotten to add this label, which is why the points did not have
            // labels in the graph. Let's fix that.
            stackPane.getChildren().addAll(label);
            dataPoint.setNode(stackPane);

        }


        // 3.d add data to the chart
        bubbleChart.getData().add(series);
        bubbleChart.setLegendVisible(false);

        // 4. wire up all the elements (table and chart) in the UI
        BorderPane borderPane = new BorderPane();

        borderPane.setLeft(tableView);
        borderPane.setCenter(bubbleChart);

        primaryStage.setTitle("Charts and Tables");
        primaryStage.setScene(new Scene(borderPane,1200,800));
        primaryStage.show();
    }

    private TableColumn<CompanyMetrics, String> getColumn(String columnName, String propertyName) {
        TableColumn<CompanyMetrics,String> nameColumn = new TableColumn<>(columnName);
        nameColumn.setMinWidth(100);
        nameColumn.setCellValueFactory(new PropertyValueFactory<CompanyMetrics, String>(propertyName));

        // what did we just do? We created a TableColumn object, and specified
        // its type (String), and the type of object it will take its value from.
        // That begs the question - from what property of the object will this column
        // take its value? The answer is in the PropertyValueFactory - which tells the
        // tablecolumn to take its value from the "name" property of that CompanyMetrics object

        // We now need to do this for each column, so let's extract this out into a helper
        // method so we don't retype it a bunch o times. Copy-pasting code is always a bad idea
        return nameColumn;
    }

    public static class CompanyMetrics {

        private StringProperty name = new SimpleStringProperty();
        private DoubleProperty mktCap = new SimpleDoubleProperty();
        private DoubleProperty revenue = new SimpleDoubleProperty();
        private DoubleProperty growthRate = new SimpleDoubleProperty();

        public String getName() {
            return name.get();
        }

        public StringProperty nameProperty() {
            return name;
        }

        public void setName(String name) {
            this.name.set(name);
        }

        public double getMktCap() {
            return mktCap.get();
        }

        public DoubleProperty mktCapProperty() {
            return mktCap;
        }

        public void setMktCap(double mktCap) {
            this.mktCap.set(mktCap);
        }

        public double getRevenue() {
            return revenue.get();
        }

        public DoubleProperty revenueProperty() {
            return revenue;
        }

        public void setRevenue(double revenue) {
            this.revenue.set(revenue);
        }

        public double getGrowthRate() {
            return growthRate.get();
        }

        public DoubleProperty growthRateProperty() {
            return growthRate;
        }

        public void setGrowthRate(double growthRate) {
            this.growthRate.set(growthRate);
        }

        public CompanyMetrics(String name, double mktCap, double revenue, double growthRate){
            this.setName(name);
            this.setMktCap(mktCap);
            this.setRevenue(revenue);
            this.setGrowthRate(growthRate);
        }



    }


    public static void main(String[] args) {
        launch(args);
    }
}
