package com.badr.matchimage;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Collections;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {



    ImageView imag1,imag2,imag3,imag4,imag5,imag6,imag7,imag8,imag9,imag10,imag11,imag12,imag13,imag14,imag15,imag16;

     Integer[] imagearray={101,102,103,104,105,106,107,108,201,202,203,204,205,206,207,208};

    int image101,image102,image103,image104,image105,image106,image107,image108
            ,image201,image202,image203,image204,image205,image206,image207,image208;

    int firstcard,secondcard;
    int clickedfirst,clickedsecond;
    int flag=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        imag1=(ImageView)findViewById(R.id.im1);
        imag2=(ImageView)findViewById(R.id.im2);
        imag3=(ImageView)findViewById(R.id.im3);
        imag4=(ImageView)findViewById(R.id.im4);
        imag5=(ImageView)findViewById(R.id.im5);
        imag6=(ImageView)findViewById(R.id.im6);
        imag7=(ImageView)findViewById(R.id.im7);
        imag8=(ImageView)findViewById(R.id.im8);
        imag9=(ImageView)findViewById(R.id.im9);
        imag10=(ImageView)findViewById(R.id.im10);
        imag11=(ImageView)findViewById(R.id.im11);
        imag12=(ImageView)findViewById(R.id.im12);
        imag13=(ImageView)findViewById(R.id.im13);
        imag14=(ImageView)findViewById(R.id.im14);
        imag15=(ImageView)findViewById(R.id.im15);
        imag16=(ImageView)findViewById(R.id.im16);

        imag1.setTag("0");
        imag2.setTag("1");
        imag3.setTag("2");
        imag4.setTag("3");
        imag5.setTag("4");
        imag6.setTag("5");
        imag7.setTag("6");
        imag8.setTag("7");
        imag9.setTag("8");
        imag10.setTag("9");
        imag11.setTag("10");
        imag12.setTag("11");
        imag13.setTag("12");
        imag14.setTag("13");
        imag15.setTag("14");
        imag16.setTag("15");

        frontoncardresource();
        Collections.shuffle(Arrays.asList(imagearray));


        imag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              int thecard=Integer.parseInt((String) v.getTag());
                dostuff(imag1,thecard);
            }
        });
        imag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                dostuff(imag2,thecard);
            }
        });
        imag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                dostuff(imag3,thecard);
            }
        });
        imag4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                dostuff(imag4,thecard);
            }
        });
        imag5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                dostuff(imag5,thecard);
            }
        });
        imag6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                dostuff(imag6,thecard);
            }
        });
        imag7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                dostuff(imag7,thecard);
            }
        });
        imag8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                dostuff(imag8,thecard);
            }
        });
        imag9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                dostuff(imag9,thecard);
            }
        });
        imag10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                dostuff(imag10,thecard);
            }
        });
        imag11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                dostuff(imag11,thecard);
            }
        });
        imag12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                dostuff(imag12,thecard);
            }
        });
        imag13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                dostuff(imag13,thecard);
            }
        });
        imag14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                dostuff(imag14,thecard);
            }
        });
        imag15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                dostuff(imag15,thecard);
            }
        });
        imag16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                dostuff(imag16,thecard);
            }
        });
    }


    private void dostuff(ImageView iv,int card){
        if(imagearray[card]==101){
            iv.setImageResource(image101);
        }else if(imagearray[card]==102){
            iv.setImageResource(image102);
        }
        else if(imagearray[card]==103){
            iv.setImageResource(image103);
        }
        else if(imagearray[card]==104){
            iv.setImageResource(image104);
        }
        else if(imagearray[card]==105){
            iv.setImageResource(image105);
        }
        else if(imagearray[card]==106){
            iv.setImageResource(image106);
        }
        else if(imagearray[card]==107){
            iv.setImageResource(image107);
        }
        else if(imagearray[card]==108){
            iv.setImageResource(image108);
        }
        else if(imagearray[card]==201){
            iv.setImageResource(image201);
        }
        else if(imagearray[card]==202){
            iv.setImageResource(image202);
        }
        else if(imagearray[card]==203){
            iv.setImageResource(image203);
        }
        else if(imagearray[card]==204){
            iv.setImageResource(image204);
        }
        else if(imagearray[card]==205){
            iv.setImageResource(image205);
        }
        else if(imagearray[card]==206){
            iv.setImageResource(image206);
        }
        else if(imagearray[card]==207){
            iv.setImageResource(image207);
        }
        else if(imagearray[card]==208){
            iv.setImageResource(image208);
        }


         if(flag==1){
             firstcard=imagearray[card];
             if(firstcard > 200){
                 firstcard=firstcard-100;
             }
             flag=2;
             clickedfirst=card;
            iv.setEnabled(false);
         }else if(flag==2){
             secondcard=imagearray[card];
             if(secondcard > 200){
                 secondcard=secondcard-100;
             }
             flag=1;
             clickedsecond=card;


             imag1.setEnabled(false);
             imag2.setEnabled(false);
             imag3.setEnabled(false);
             imag4.setEnabled(false);
             imag5.setEnabled(false);
             imag6.setEnabled(false);
             imag7.setEnabled(false);
             imag8.setEnabled(false);
             imag9.setEnabled(false);
             imag10.setEnabled(false);
             imag11.setEnabled(false);
             imag12.setEnabled(false);
             imag13.setEnabled(false);
             imag14.setEnabled(false);
             imag15.setEnabled(false);
             imag16.setEnabled(false);

            Handler handler=new Handler();
             handler.postDelayed(new Runnable() {
                 @Override
                 public void run() {
                     //check if the selected images are equal
                  calculate();
                 }
             },250);


         }
    }

    private void calculate(){

        if(firstcard==secondcard){
            if(clickedfirst==0){
                imag1.setVisibility(View.INVISIBLE);
            }else if(clickedfirst==1){
                imag2.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst==2){
                imag3.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst==3){
                imag4.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst==4){
                imag5.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst==5){
                imag6.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst==6){
                imag7.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst==7){
                imag8.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst==8){
                imag9.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst==9){
                imag10.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst==10){
                imag11.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst==11){
                imag12.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst==12){
                imag13.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst==13){
                imag14.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst==14){
                imag15.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst==15){
                imag16.setVisibility(View.INVISIBLE);
            }

            if(clickedsecond==0){
                imag1.setVisibility(View.INVISIBLE);
            }else if(clickedsecond==1){
                imag2.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond==2){
                imag3.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond==3){
                imag4.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond==4){
                imag5.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond==5){
                imag6.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond==6){
                imag7.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond==7){
                imag8.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond==8){
                imag9.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond==9){
                imag10.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond==10){
                imag11.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond==11){
                imag12.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond==12){
                imag13.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond==13){
                imag14.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond==14){
                imag15.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond==15){
                imag16.setVisibility(View.INVISIBLE);
            }



        }else {
            imag1.setImageResource(R.drawable.ic_menu);
            imag2.setImageResource(R.drawable.ic_menu);
            imag3.setImageResource(R.drawable.ic_menu);
            imag4.setImageResource(R.drawable.ic_menu);
            imag5.setImageResource(R.drawable.ic_menu);
            imag6.setImageResource(R.drawable.ic_menu);
            imag7.setImageResource(R.drawable.ic_menu);
            imag8.setImageResource(R.drawable.ic_menu);
            imag9.setImageResource(R.drawable.ic_menu);
            imag10.setImageResource(R.drawable.ic_menu);
            imag11.setImageResource(R.drawable.ic_menu);
            imag12.setImageResource(R.drawable.ic_menu);
            imag13.setImageResource(R.drawable.ic_menu);
            imag14.setImageResource(R.drawable.ic_menu);
            imag15.setImageResource(R.drawable.ic_menu);
            imag16.setImageResource(R.drawable.ic_menu);


        }

        imag1.setEnabled(true);
        imag2.setEnabled(true);
        imag3.setEnabled(true);
        imag4.setEnabled(true);
        imag5.setEnabled(true);
        imag6.setEnabled(true);
        imag7.setEnabled(true);
        imag8.setEnabled(true);
        imag9.setEnabled(true);
        imag10.setEnabled(true);
        imag11.setEnabled(true);
        imag12.setEnabled(true);
        imag13.setEnabled(true);
        imag14.setEnabled(true);
        imag15.setEnabled(true);
        imag16.setEnabled(true);

      checkend();
    }

    private void checkend(){
        if(     imag1.getVisibility()==View.INVISIBLE&&
                imag2.getVisibility()==View.INVISIBLE&&
                imag3.getVisibility()==View.INVISIBLE&&
                imag4.getVisibility()==View.INVISIBLE&&
                imag5.getVisibility()==View.INVISIBLE&&
                imag6.getVisibility()==View.INVISIBLE&&
                imag7.getVisibility()==View.INVISIBLE&&
                imag8.getVisibility()==View.INVISIBLE&&
                imag9.getVisibility()==View.INVISIBLE&&
                imag10.getVisibility()==View.INVISIBLE&&
                imag11.getVisibility()==View.INVISIBLE&&
                imag12.getVisibility()==View.INVISIBLE&&
                imag13.getVisibility()==View.INVISIBLE&&
                imag14.getVisibility()==View.INVISIBLE&&
                imag15.getVisibility()==View.INVISIBLE&&
                imag16.getVisibility()==View.INVISIBLE ){

            AlertDialog.Builder AlertDialogBuilder=new AlertDialog.Builder(MainActivity.this);
            AlertDialogBuilder
                    .setMessage("مبروك لقد فزت")
                    .setCancelable(false)
                    .setPositiveButton("Refill", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
            AlertDialog alertDialog=AlertDialogBuilder.create();
            alertDialog.show();
        }
    }
    public void frontoncardresource(){
        image101=R.drawable.image101;
        image102=R.drawable.image102;
        image103=R.drawable.image103;
        image104=R.drawable.image104;
        image105=R.drawable.image105;
        image106=R.drawable.image106;
        image107=R.drawable.image107;
        image108=R.drawable.image108;
        image201=R.drawable.image201;
        image202=R.drawable.image202;
        image203=R.drawable.image203;
        image204=R.drawable.image204;
        image205=R.drawable.image205;
        image206=R.drawable.image206;
        image207=R.drawable.image207;
        image208=R.drawable.image208;

    }

}
