package com.vaqif_taqiyev.spinnerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.vaqif_taqiyev.spinnerapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   private ActivityMainBinding bind;
   private ArrayList<Integer> kredit = new ArrayList<>();
   private ArrayAdapter<Integer> adapter;
   String y1,y2,y3,y4,y5,y6;
   int bal1,bal2,bal3,bal4,bal5,bal6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this,R.layout.activity_main);

        kredit.add(2);
        kredit.add(3);
        kredit.add(4);
        kredit.add(5);
        kredit.add(6);
        kredit.add(7);
        kredit.add(8);


        adapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1,android.R.id.text1,kredit);

        bind.s1.setAdapter(adapter);
        bind.s2.setAdapter(adapter);
        bind.s3.setAdapter(adapter);
        bind.s4.setAdapter(adapter);
        bind.s5.setAdapter(adapter);
        bind.s6.setAdapter(adapter);



        bind.s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
               y1 = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        bind.s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                y2 = adapterView.getItemAtPosition(i).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        bind.s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                y3 = adapterView.getItemAtPosition(i).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        bind.s4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                y4 = adapterView.getItemAtPosition(i).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        bind.s5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                y5 = adapterView.getItemAtPosition(i).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        bind.s6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                y6 = adapterView.getItemAtPosition(i).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        bind.shwBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            int k6 = Integer.parseInt(y6);
            int k5 = Integer.parseInt(y5);
            int k4 = Integer.parseInt(y4);
            int k3 = Integer.parseInt(y3);
            int k2 = Integer.parseInt(y2);
            int k1 = Integer.parseInt(y1);


/*
            bal1 = Integer.parseInt(bind.bal1.getText().toString());
                bal2 = Integer.parseInt(bind.bal2.getText().toString());
                bal3 = Integer.parseInt(bind.bal3.getText().toString());
                bal4 = Integer.parseInt(bind.bal4.getText().toString());
                bal5 = Integer.parseInt(bind.bal5.getText().toString());
                bal6 = Integer.parseInt(bind.bal6.getText().toString());
*/


               if (bind.bal4.getText().toString().matches("") && (bind.bal5.getText().toString().matches("")) && bind.bal6.getText().toString().matches("")){
                   bal1 = Integer.parseInt(bind.bal1.getText().toString());
                   bal2 = Integer.parseInt(bind.bal2.getText().toString());
                   bal3 = Integer.parseInt(bind.bal3.getText().toString());



                   int kredit_cem = k1 + k2 + k3 ;
                   int yekun = (bal1 * k1) + (bal2 * k2) + (bal3 * k3);
                   int yekun_bal = yekun / kredit_cem;




                   //ballara uygun siniflendirme
                   if (51<=yekun_bal&& yekun_bal<=60){
                       bind.textView.setText("Your final score: " + yekun_bal + "\n You received an `E` score.");
                   } else if (61<=yekun_bal && yekun_bal<=70){
                       bind.textView.setText("Your final score: " + yekun_bal + "\n You received an `D` score.");
                   }else if (71<=yekun_bal&& yekun_bal<=80){
                       bind.textView.setText("Your final score: " + yekun_bal + "\n You received an `C` score.");
                   } else if ( 81 <= yekun_bal && yekun_bal <=90){
                       bind.textView.setText("Your final score: " + yekun_bal + "\n You received an `B` score.");
                   }else if (91<=yekun_bal && yekun_bal<100){
                       bind.textView.setText("Your final score: " + yekun_bal + "\n You received an `A` score.");

                   }else if (0<=yekun_bal && yekun_bal<51){
                       bind.textView.setText("Your final score: " + yekun_bal + "\n You received an `F` score. You could not pass the exam.");
                   }




               }else if ((bind.bal5.getText().toString().matches("")) && bind.bal6.getText().toString().matches("")){
                   bal1 = Integer.parseInt(bind.bal1.getText().toString());
                   bal2 = Integer.parseInt(bind.bal2.getText().toString());
                   bal3 = Integer.parseInt(bind.bal3.getText().toString());
                   bal4 = Integer.parseInt(bind.bal4.getText().toString());
                   int kredit_cem = k1 + k2 + k3 + k4 ;
                    int yekun = (bal1 * k1) + (bal2 * k2) + (bal3 * k3) + (bal4 * k4);
                    int yekun_bal = yekun / kredit_cem;


                    //ballara uygun siniflendirme
                   if (51<=yekun_bal&& yekun_bal<=60){
                       bind.textView.setText("Your final score: " + yekun_bal + "\n You received an `E` score.");
                   } else if (61<=yekun_bal && yekun_bal<=70){
                       bind.textView.setText("Your final score: " + yekun_bal + "\n You received an `D` score.");
                   }else if (71<=yekun_bal&& yekun_bal<=80){
                       bind.textView.setText("Your final score: " + yekun_bal + "\n You received an `C` score.");
                   } else if ( 81 <= yekun_bal && yekun_bal <=90){
                       bind.textView.setText("Your final score: " + yekun_bal + "\n You received an `B` score.");
                   }else if (91<=yekun_bal && yekun_bal<100){
                       bind.textView.setText("Your final score: " + yekun_bal + "\n You received an `A` score.");

                   }else if (0<=yekun_bal && yekun_bal<51){
                       bind.textView.setText("Your final score: " + yekun_bal + "\n You received an `F` score. You could not pass the exam.");
                   }


               } else if (bind.bal6.getText().toString().matches("")){
                   bal1 = Integer.parseInt(bind.bal1.getText().toString());
                   bal2 = Integer.parseInt(bind.bal2.getText().toString());
                   bal3 = Integer.parseInt(bind.bal3.getText().toString());
                   bal4 = Integer.parseInt(bind.bal4.getText().toString());
                   bal5 = Integer.parseInt(bind.bal5.getText().toString());
                   int kredit_cem = k1 + k2 + k3 + k4 + k5;
                int yekun = (bal1 * k1) + (bal2 * k2) + (bal3 * k3) + (bal4 * k4) + (bal5 * k5);
                int yekun_bal = yekun / kredit_cem;


                //ballara uygun siniflendirme
                   if (51<=yekun_bal&& yekun_bal<=60){
                       bind.textView.setText("Your final score: " + yekun_bal + "\n You received an `E` score.");
                   } else if (61<=yekun_bal && yekun_bal<=70){
                       bind.textView.setText("Your final score: " + yekun_bal + "\n You received an `D` score.");
                   }else if (71<=yekun_bal&& yekun_bal<=80){
                       bind.textView.setText("Your final score: " + yekun_bal + "\n You received an `C` score.");
                   } else if ( 81 <= yekun_bal && yekun_bal <=90){
                       bind.textView.setText("Your final score: " + yekun_bal + "\n You received an `B` score.");
                   }else if (91<=yekun_bal && yekun_bal<100){
                       bind.textView.setText("Your final score: " + yekun_bal + "\n You received an `A` score.");

                   }else if (0<=yekun_bal && yekun_bal<51){
                       bind.textView.setText("Your final score: " + yekun_bal + "\n You received an `F` score. You could not pass the exam.");
                   }


               }else{
                   bal1 = Integer.parseInt(bind.bal1.getText().toString());
                   bal2 = Integer.parseInt(bind.bal2.getText().toString());
                   bal3 = Integer.parseInt(bind.bal3.getText().toString());
                   bal4 = Integer.parseInt(bind.bal4.getText().toString());
                   bal5 = Integer.parseInt(bind.bal5.getText().toString());
                   bal6 = Integer.parseInt(bind.bal6.getText().toString());
                   int kredit_cem = k1 + k2 + k3 + k4 + k5 + k6;
                   int yekun = (bal1 * k1) + (bal2 * k2) + (bal3 * k3) + (bal4 * k4) + (bal5 * k5) + (bal6 * k6);
                   int yekun_bal = yekun / kredit_cem;


                   //ballara uygun siniflendirme
                   if (51<=yekun_bal&& yekun_bal<=60){
                       bind.textView.setText("Your final score: " + yekun_bal + "\n You received an `E` score.");
                   } else if (61<=yekun_bal && yekun_bal<=70){
                       bind.textView.setText("Your final score: " + yekun_bal + "\n You received an `D` score.");
                   }else if (71<=yekun_bal&& yekun_bal<=80){
                       bind.textView.setText("Your final score: " + yekun_bal + "\n You received an `C` score.");
                   } else if ( 81 <= yekun_bal && yekun_bal <=90){
                       bind.textView.setText("Your final score: " + yekun_bal + "\n You received an `B` score.");
                   }else if (91<=yekun_bal && yekun_bal<100){
                       bind.textView.setText("Your final score: " + yekun_bal + "\n You received an `A` score.");

                   }else if (0<=yekun_bal && yekun_bal<51){
                       bind.textView.setText("Your final score: " + yekun_bal + "\n You received an `F` score. You could not pass the exam.");
                   }





               }
























        }
        });
















    }
}