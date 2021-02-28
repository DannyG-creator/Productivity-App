package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Calendar calendar;
    private String date;
    private EditText ToDoInput;
    private TextView ToDoList;

    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Date and Time */
        TextView dateTimeDisplay = (TextView) findViewById(R.id.dateView);
        calendar = Calendar.getInstance();
        date = DateFormat.getDateInstance().format(calendar.getTime());
        dateTimeDisplay.setText(date);


        /* To Do list */
        TextView ToDo = (TextView) findViewById(R.id.todoText);
        ToDoInput = findViewById(R.id.textInput);
        ToDoList = findViewById(R.id.ToDoList);
        Button Enter = findViewById(R.id.button);
        Enter.setOnClickListener(this);




        /* Meals */
        TextView Meals = (TextView) findViewById(R.id.mealsText);




        /* Exercise */
        TextView Exercise = (TextView) findViewById(R.id.exerciseText);
        TextView ExerciseList = (TextView) findViewById(R.id.exerciseList);
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        if (day == 1) {
            String Sunday = "Rest Day";
            ExerciseList.setText(Sunday);
        }
        if (day == 2) {
            String Monday = "Push-ups 2x25"+ "\n" + "Leg Raises 2x25" + "\n" + "Pull-ups 2x20";
            ExerciseList.setText(Monday);
        }
        if (day == 3) {
            String Tuesday = "Bridges 2x15";
            ExerciseList.setText(Tuesday);
        }
        if (day == 4) {
            String Wednesday = "Pull-ups 2x20"+ "\n" + "Squats 3x35" + "\n" + "Push-ups 2x25";
            ExerciseList.setText(Wednesday);
        }
        if (day == 5) {
            String Thursday = "Leg Raises 2x25";
            ExerciseList.setText(Thursday);
        }
        if (day == 6) {
            String Friday = "Squats 3x35"+ "\n" + "Bridges 2x15";
            ExerciseList.setText(Friday);
        }
        if (day == 7) {
            String Saturday = "Rest Day";
            ExerciseList.setText(Saturday);
        }
    }

    /* button code to update list */
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button:
                String Input = ToDoInput.getText().toString();
                ToDoList.append(Input);
                ToDoList.append("\n");
                ToDoInput.setText("");
                break;
        }
    }
}
