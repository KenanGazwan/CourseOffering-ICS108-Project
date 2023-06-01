
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class WeekPane{
    private GridPane schedule = new GridPane();
    private ListView listView = new ListView();


    public WeekPane() {
        Run();
    }

    public void Run() {
        listView.getItems().add(schedule);;
        schedule.setMaxWidth(1000);
        listView.setPadding(new Insets(15));
        listView.setMaxWidth(1050);
        listView.setMaxHeight(700);
        schedule.setPadding(new Insets(15));
        schedule.setGridLinesVisible(false);

        schedule.setStyle("-fx-background-radius: 25; -fx-background-color: rgb(0, 153, 153);");
        Label[] weekDays = {new Label("Sunday"), new Label("Monday"), new Label("Tuesday"),
                new Label("Wednesday"), new Label("Thursday")};
        Label[] times = {new Label("7:00\n.\n7:30\n."),new Label("8:00\n.\n8:30\n."),
                new Label("9:00\n.\n9:30\n."), new Label("10:00\n.\n10:30\n."),
                new Label("11:00\n.\n11:30\n."), new Label("12:00\n.\n12:30\n."),
                new Label("1:00\n.\n1:30\n."), new Label("2:00\n.\n2:30\n."), new Label("3:00\n.\n3:30\n."),
                new Label("4:00\n.\n4:30\n."), new Label("5:00\n.\n5:30\n.")};


        for (int i = 0; i < weekDays.length; i++) {
            //Filling Columns
            weekDays[i].setFont(Font.font("Calibri", FontWeight.BOLD, FontPosture.REGULAR, 20));
            weekDays[i].setTextFill(Color.WHITE);
            schedule.add(weekDays[i], i + 1, 0);
        }


        //Filling Rows
        for (int i = 0; i < times.length; i++) {
            times[i].setFont(Font.font("Calibri", FontWeight.BOLD, FontPosture.REGULAR, 15));
            times[i].setTextFill(Color.WHITE);
            schedule.add(times[i], 0, i + 1);

        }

        ColumnConstraints[] columns = new ColumnConstraints[weekDays.length + 1]; //Plus 1 for the first Empty Column
        RowConstraints[] rows = new RowConstraints[times.length + 1]; //Plus 1 for the first Empty Row

        //First Empty Column
        columns[0] = new ColumnConstraints();
        columns[0].setPrefWidth(50);
        schedule.getColumnConstraints().add(columns[0]);

        for (int i = 0; i < weekDays.length; i++) {
            columns[i + 1] = new ColumnConstraints();
            columns[i + 1].setPrefWidth(175);
            columns[i + 1].setHalignment(HPos.CENTER);
            schedule.getColumnConstraints().add(columns[i + 1]);
        }

        //First Empty Row
        rows[0] = new RowConstraints();
        rows[0].setPrefHeight(30);
        schedule.getRowConstraints().add(rows[0]);

        for (int i = 0; i < times.length; i++) {
            rows[i + 1] = new RowConstraints();
            rows[i + 1].setPrefHeight(100);
            schedule.getRowConstraints().add(rows[i + 1]);
        }

    }

    /*public void doItVisually(String courseName, int startTime, int endTime, char[] days, String location)
    {


        int hours = (endTime - startTime) / 100;
        int RowIndex = hours - 6;
        int height = (endTime = startTime) % 100;
        for(int i = 0; i < days.length; i++)
        {
            if(days[i] == 'U')
            {
                Rectangle rectangle = new Rectangle();
                rectangle.setHeight(height);
                rectangle.setWidth(175);
                rectangle.setFill(Color.YELLOW);
                rectangle.setStroke(Color.GRAY);
                StackPane stack = new StackPane();
                Label lb = new Label(courseName + "\n" + location);
                stack.getChildren().addAll(rectangle, lb);
                schedule.add(stack, 1, RowIndex);
            }
            else if(days[i] == 'M')
            {
                Rectangle rectangle = new Rectangle();
                rectangle.setHeight(height);
                rectangle.setWidth(175);
                rectangle.setFill(Color.YELLOW);
                rectangle.setStroke(Color.GRAY);
                StackPane stack = new StackPane();
                Label lb = new Label(courseName + "\n" + location);
                stack.getChildren().addAll(rectangle, lb);
                schedule.add(stack, 2, RowIndex);
            }
            else if(days[i] == 'T')
            {
                Rectangle rectangle = new Rectangle();
                rectangle.setHeight(height);
                rectangle.setWidth(175);
                rectangle.setFill(Color.YELLOW);
                rectangle.setStroke(Color.GRAY);
                StackPane stack = new StackPane();
                Label lb = new Label(courseName + "\n" + location);
                stack.getChildren().addAll(rectangle, lb);
                schedule.add(stack, 3, RowIndex);
            }
            else if(days[i] == 'W')
            {
                Rectangle rectangle = new Rectangle();
                rectangle.setHeight(height);
                rectangle.setWidth(175);
                rectangle.setFill(Color.YELLOW);
                rectangle.setStroke(Color.GRAY);
                StackPane stack = new StackPane();
                Label lb = new Label(courseName + "\n" + location);
                stack.getChildren().addAll(rectangle, lb);
                schedule.add(stack, 4, RowIndex);
            }
            else if(days[i] == 'R')
            {
                Rectangle rectangle = new Rectangle();
                rectangle.setHeight(height);
                rectangle.setWidth(175);
                rectangle.setFill(Color.YELLOW);
                rectangle.setStroke(Color.GRAY);
                StackPane stack = new StackPane();
                Label lb = new Label(courseName + "\n" + location);
                stack.getChildren().addAll(rectangle, lb);
                schedule.add(stack, 5, RowIndex);
            }
        }

    }*/

    public ListView getListView()
    {
        return listView;
    }


}