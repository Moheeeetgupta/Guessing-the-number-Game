package com.mohit.higherorlowerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int n;
    public void makeText(String s){
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
    public void guess(View view){
        EditText editText =(EditText)findViewById((R.id.editText));
        String  guessString =  editText.getText().toString();
        int guessInt =Integer.parseInt(guessString);
        if(guessInt>n){
        makeText("Enter a lower number");
        }else if(guessInt<n){
            makeText("Enter a higher number ");

            }else{
            makeText("You won,Play again");
            Random rand = new Random();
            n=rand.nextInt(20)+1;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        n=rand.nextInt(20)+1;
    }
}
