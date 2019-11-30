package in.kiran.basicarithmetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNum1;
    EditText etNum2;
    Button btnSum, btnTask, btnSubtract, btnMultiply, btnDivide;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "welcome", Toast.LENGTH_LONG).show();

        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        btnSum = findViewById(R.id.btnSum);
        btnTask = findViewById(R.id.btnTask);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        tvResult = findViewById(R.id.tvResult);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str1 = etNum1.getText().toString();
                String str2 = etNum2.getText().toString();
                int num1 = 0;
                int num2 = 0;

                // To check whether user has kept empty field or not.
                if (str1.isEmpty()) {
                    etNum1.setError("Please enter number1");
                    etNum1.requestFocus();
                    return;
                }

                // To check whether user has entered only integer or not.
                boolean numeric1 = true;
                try {
                    num1 = Integer.parseInt(str1);
                } catch (NumberFormatException e) {
                    numeric1 = false;
                }

                if (!numeric1) {
                    etNum1.setError("Please enter Integer only");
                    etNum1.requestFocus();
                    return;
                }

                // To check whether user has kept empty field or not.
                if (str2.isEmpty()) {
                    etNum2.setError("Please enter number2");
                    etNum2.requestFocus();
                    return;
                }

                // To check whether user has kept empty field or not.
                boolean numeric2 = true;
                try {
                    num2 = Integer.parseInt(str2);
                } catch (NumberFormatException e) {
                    numeric2 = false;
                }

                if (!numeric2) {
                    etNum2.setError("Please enter Integer only");
                    etNum2.requestFocus();
                    return;
                }


                num1 = Integer.parseInt(str1);
                num2 = Integer.parseInt(str2);
                int result = num1 + num2;

                // To display result on Toast.
                Toast.makeText(MainActivity.this, "Sum = " + Integer.toString(result), Toast.LENGTH_LONG).show();

                // To display result in TextView.
                tvResult.setText("Sum = " + Integer.toString(result));
            }
        });


        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = etNum1.getText().toString();
                String str2 = etNum2.getText().toString();

                int num1 = 0;
                int num2 = 0;


                if (str1.isEmpty()) {
                    etNum1.setError("Please enter number1");
                    etNum1.requestFocus();
                    return;
                }

                boolean numeric1 = true;
                try {
                    num1 = Integer.parseInt(str1);
                } catch (NumberFormatException e) {
                    numeric1 = false;
                }

                if (!numeric1) {
                    etNum1.setError("Please enter Integer only");
                    etNum1.requestFocus();
                    return;
                }

                if (str2.isEmpty()) {
                    etNum2.setError("Please enter number2");
                    etNum2.requestFocus();
                    return;
                }


                boolean numeric2 = true;
                try {
                    num2 = Integer.parseInt(str2);
                } catch (NumberFormatException e) {
                    numeric2 = false;
                }

                if (!numeric2) {
                    etNum2.setError("Please enter Integer only");
                    etNum2.requestFocus();
                    return;
                }


                num1 = Integer.parseInt(str1);
                num2 = Integer.parseInt(str2);
                int result = num1 - num2;

                Toast.makeText(MainActivity.this, "Subtraction = " + Integer.toString(result), Toast.LENGTH_LONG).show();

                tvResult.setText("Subtraction = " + Integer.toString(result));
            }
        });


        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = etNum1.getText().toString();
                String str2 = etNum2.getText().toString();

                int num1 = 0;
                int num2 = 0;

                if (str1.isEmpty()) {
                    etNum1.setError("Please enter number1");
                    etNum1.requestFocus();
                    return;
                }

                boolean numeric1 = true;
                try {
                    num1 = Integer.parseInt(str1);
                } catch (NumberFormatException e) {
                    numeric1 = false;
                }
                //
                if (!numeric1) {
                    etNum1.setError("Please enter Integer only");
                    etNum1.requestFocus();
                    return;
                }

                if (str2.isEmpty()) {
                    etNum2.setError("Please enter number2");
                    etNum2.requestFocus();
                    return;
                }

                boolean numeric2 = true;
                try {
                    num2 = Integer.parseInt(str2);
                } catch (NumberFormatException e) {
                    numeric2 = false;
                }

                if (!numeric2) {
                    etNum2.setError("Please enter Integer only");
                    etNum2.requestFocus();
                    return;
                }


                num1 = Integer.parseInt(str1);
                num2 = Integer.parseInt(str2);
                int result = num1 * num2;

                Toast.makeText(MainActivity.this, "Multiplication = " + Integer.toString(result), Toast.LENGTH_LONG).show();

                tvResult.setText("Multiplication = " + Integer.toString(result));
            }
        });


        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = etNum1.getText().toString();
                String str2 = etNum2.getText().toString();
                int num1 = 0;
                int num2 = 0;
                if (str1.isEmpty()) {
                    etNum1.setError("Please enter number1");
                    etNum1.requestFocus();
                    return;
                }


                boolean numeric1 = true;
                try {
                    num1 = Integer.parseInt(str1);
                } catch (NumberFormatException e) {
                    numeric1 = false;
                }

                if (!numeric1) {
                    etNum1.setError("Please enter Integer only");
                    etNum1.requestFocus();
                    return;
                }


                if (str2.isEmpty()) {
                    etNum2.setError("Please enter number2");
                    etNum2.requestFocus();
                    return;
                }


                boolean numeric2 = true;
                try {
                    num2 = Integer.parseInt(str2);
                } catch (NumberFormatException e) {
                    numeric2 = false;
                }

                if (!numeric2) {
                    etNum2.setError("Please enter Integer only");
                    etNum2.requestFocus();
                    return;
                }


                num1 = Integer.parseInt(str1);
                num2 = Integer.parseInt(str2);
                int division = num1 / num2;
                int remainder = num1 % num2;

                Toast.makeText(MainActivity.this, "Division = " + Integer.toString(division) + " and Remainder = " + Integer.toString(remainder), Toast.LENGTH_LONG).show();

                tvResult.setText("Division = " + Integer.toString(division) + " and Remainder = " + Integer.toString(remainder));
            }
        });


        btnTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

    }
}


