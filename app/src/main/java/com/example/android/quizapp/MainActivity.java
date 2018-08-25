package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int correctAnswers = 0;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        Button submitButton = (Button) findViewById (R.id.submitScore);
        submitButton.setOnClickListener (submitOnClickListener);
    }


    public void checkQuestion1Answer() {
        RadioButton radioButton1 = (RadioButton) findViewById (R.id.radioButton1);
        boolean isRadioButton1Checked = radioButton1.isChecked ();
        if (isRadioButton1Checked) {
            correctAnswers++;
        }
    }

    public void checkQuestion2Answer() {
        RadioButton radioButton6 = (RadioButton) findViewById (R.id.radioButton6);
        boolean isRadioButton6Checked = radioButton6.isChecked ();
        if (isRadioButton6Checked) {
            correctAnswers++;
        }
    }

    public void checkQuestion3Answers() {
        CheckBox checkbox1a = (CheckBox) findViewById (R.id.checkbox1a);
        CheckBox checkbox1b = (CheckBox) findViewById (R.id.checkbox1b);
        CheckBox checkbox1c = (CheckBox) findViewById (R.id.checkbox1c);
        boolean isCheckBox1aChecked = checkbox1a.isChecked ();
        boolean isCheckBox1bChecked = checkbox1b.isChecked ();
        boolean isCheckBox1cChecked = checkbox1c.isChecked ();
        if (isCheckBox1aChecked && !isCheckBox1bChecked && isCheckBox1cChecked) correctAnswers++;

    }

    public void checkQuestion4Answers() {
        CheckBox checkbox2a = (CheckBox) findViewById (R.id.checkbox2a);
        CheckBox checkbox2b = (CheckBox) findViewById (R.id.checkbox2b);
        CheckBox checkbox2c = (CheckBox) findViewById (R.id.checkbox2c);
        boolean isCheckBox2aChecked = checkbox2a.isChecked ();
        boolean isCheckBox2bChecked = checkbox2b.isChecked ();
        boolean isCheckBox2cChecked = checkbox2c.isChecked ();
        if (isCheckBox2aChecked && !isCheckBox2bChecked && isCheckBox2cChecked) correctAnswers++;
    }

    public void checkQuestion5Answers() {
        CheckBox checkbox3a = (CheckBox) findViewById (R.id.checkbox3a);
        CheckBox checkbox3b = (CheckBox) findViewById (R.id.checkbox3b);
        CheckBox checkbox3c = (CheckBox) findViewById (R.id.checkbox3c);
        boolean isCheckBox3aChecked = checkbox3a.isChecked ();
        boolean isCheckBox3bChecked = checkbox3b.isChecked ();
        boolean isCheckBox3cChecked = checkbox3c.isChecked ();
        if (!isCheckBox3aChecked && isCheckBox3bChecked && isCheckBox3cChecked) correctAnswers++;
    }

    public void checkQuestion6Answers() {
        CheckBox checkbox4a = (CheckBox) findViewById (R.id.checkbox4a);
        CheckBox checkbox4b = (CheckBox) findViewById (R.id.checkbox4b);
        CheckBox checkbox4c = (CheckBox) findViewById (R.id.checkbox4c);
        boolean isCheckBox4aChecked = checkbox4a.isChecked ();
        boolean isCheckBox4bChecked = checkbox4b.isChecked ();
        boolean isCheckBox4cChecked = checkbox4c.isChecked ();
        if (isCheckBox4aChecked && !isCheckBox4bChecked && isCheckBox4cChecked) correctAnswers++;
    }

    public void checkAllQuestions() {
        checkQuestion1Answer ();
        checkQuestion2Answer ();
        checkQuestion3Answers ();
        checkQuestion4Answers ();
        checkQuestion5Answers ();
        checkQuestion6Answers ();
    }

    private void resetCorrectAnswers() {
        correctAnswers = 0;
    }
    View.OnClickListener submitOnClickListener = new View.OnClickListener () {
        public void onClick(View v) {
            checkAllQuestions ();
            EditText nameField = (EditText) findViewById (R.id.nameField);
            Editable nameEditable = nameField.getText ();
            String name = nameEditable.toString ();
            Toast.makeText (MainActivity.this, "Hey ! " + name + " you got " + +correctAnswers + " /6 ", Toast.LENGTH_LONG).show ();
            resetCorrectAnswers ();

        }

    };

}
