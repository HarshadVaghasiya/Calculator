package com.example.calculator;

import android.content.Intent;
import         android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Scince extends AppCompatActivity {


    Button B1;
    Button B2;
    Button B3;
    Button B4;
    Button B5;
    Button B6;
    Button B7;
    Button B8;
    Button B9;
    Button B0;
    Button Bplus;
    Button Bsub;
    Button Bmul;
    Button Bdiv;
    Button Bequal,Bpoint,Br,Bremove,Bmod,Bchange;
    Button Bsin,Bcos,Btan,Bx2,Brootx,Bsinh,Bcosh,Btanh,Bfac,Blog2,Blog10;
    double ans,m1=0,m2=0;
    String a2,ans1,flag=null;
    char notation;
    TextView a1,aans;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scince);



        B1=(Button)findViewById(R.id.b1);
        B2=(Button)findViewById(R.id.b2);
        B3=(Button)findViewById(R.id.b3);
        B4=(Button)findViewById(R.id.b4);
        B5=(Button)findViewById(R.id.b5);
        B6=(Button)findViewById(R.id.b6);
        B7=(Button)findViewById(R.id.b7);
        B8=(Button)findViewById(R.id.b8);
        B9=(Button)findViewById(R.id.b9);
        B0=(Button)findViewById(R.id.b0);
        Bequal=(Button)findViewById(R.id.bequal);
        Bmul=(Button)findViewById(R.id.bmul);
        Bdiv=(Button)findViewById(R.id.bdiv);
        Bplus=(Button)findViewById(R.id.bplus);
        Bsub=(Button)findViewById(R.id.bsub);
        Bpoint=(Button)findViewById(R.id.bpoint);
        a1=(TextView)findViewById(R.id.input);
        aans=(TextView)findViewById(R.id.output);
        Br=(Button)findViewById(R.id.bcc);
        Bmod=(Button)findViewById(R.id.bmod);
        Bremove=(Button)findViewById(R.id.bremove);
        Bchange=(Button)findViewById(R.id.bchange);

        Bx2.setText(Html.fromHtml("x<sup>2</sup>"));
        Bchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent main=new Intent(Scince.this,MainActivity.class);
                startActivity(main);

            }
        });


        Br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a2="0";
                ans=0;
                ans1="0";
                m1=0;
                m2=0;
                flag="0";
                aans.setText(String.valueOf(ans));
                a1.setText(String.valueOf(a2));


            }
        });

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="0";
                if(a2==null)
                    a2="1";
                else if (a2.length()==1&&a2.charAt(a2.length()-1)=='0')
                    a2="1";
                else
                    a2=a2+ "1";

                if(ans1==null)
                    ans1="1";
                else
                    ans1=ans1+ "1";

                a1.setText(String.valueOf(a2));
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a2==null)
                    a2="2";
                else if (a2.length()==1&&a2.charAt(a2.length()-1)=='0')
                    a2="2";
                else
                    a2=a2+ "2";
                if(ans1==null)
                    ans1="2";
                else
                    ans1=ans1+ "2";
                flag="0";
                a1.setText(String.valueOf(a2));
            }
        });

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a2==null)
                    a2="3";
                else if (a2.length()==1&&a2.charAt(a2.length()-1)=='0')
                    a2="3";
                else
                    a2=a2+ "3";
                if(ans1==null)
                    ans1="3";
                else
                    ans1=ans1+ "3";
                flag="0";

                a1.setText(String.valueOf(a2));
            }
        });

        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a2==null)
                    a2="4";
                else if (a2.length()==1&&a2.charAt(a2.length()-1)=='0')
                    a2="4";
                else
                    a2=a2+ "4";
                if(ans1==null)
                    ans1="4";
                else
                    ans1=ans1+ "4";
                flag="0";

                a1.setText(String.valueOf(a2));
            }
        });

        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a2==null)
                    a2="5";
                else if (a2.length()==1&&a2.charAt(a2.length()-1)=='0')
                    a2="5";
                else
                    a2=a2+ "5";
                if(ans1==null)
                    ans1="5";
                else
                    ans1=ans1+ "5";
                flag="0";

                a1.setText(String.valueOf(a2));
            }
        });

        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a2==null)
                    a2="6";
                else if (a2.length()==1&&a2.charAt(a2.length()-1)=='0')
                    a2="6";
                else
                    a2=a2+ "6";
                if(ans1==null)
                    ans1="6";
                else
                    ans1=ans1+ "6";
                flag="0";

                a1.setText(String.valueOf(a2));
            }
        });

        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a2==null)
                    a2="7";
                else if (a2.length()==1&&a2.charAt(a2.length()-1)=='0')
                    a2="7";
                else
                    a2=a2+ "7";
                if(ans1==null)
                    ans1="7";
                else
                    ans1=ans1+ "7";
                flag="0";

                a1.setText(String.valueOf(a2));
            }
        });

        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a2==null)
                    a2="8";
                else if (a2.length()==1&&a2.charAt(a2.length()-1)=='0')
                    a2="8";
                else
                    a2=a2+ "8";

                if(ans1==null)
                    ans1="8";
                else
                    ans1=ans1+ "8";
                flag="0";

                a1.setText(String.valueOf(a2));
            }
        });

        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a2==null)
                    a2="9";
                else if (a2.length()==1&&a2.charAt(a2.length()-1)=='0')
                    a2="9";
                else
                    a2=a2+ "9";
                if(ans1==null)
                    ans1="9";
                else
                    ans1=ans1+ "9";
                flag="0";

                a1.setText(String.valueOf(a2));
            }
        });

        B0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ans1.length()==1&&a2.charAt(ans1.length()-1)=='0'){
                    if (a2 == null)
                        a2 = "0";
                    else
                        a2 =  "0";
                    if (ans1 == null)
                        ans1 = "0";
                    else
                        ans1 =  "0";
                }
                else {


                    if (a2 == null)
                        a2 = "0";
                    else
                        a2 = a2 + "0";
                    if (ans1 == null)
                        ans1 = "0";
                    else
                        ans1 = ans1 + "0";
                }
                flag="0";
                a1.setText(String.valueOf(a2));
            }
        });

        Bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(flag==null){
                a2="0";
            }
                else if(!(a2.charAt(a2.length()-1)=='+'||a2.charAt(a2.length()-1)=='-'||a2.charAt(a2.length()-1)=='*'||a2.charAt(a2.length()-1)=='/'||a2.charAt(a2.length()-1)=='%')) {

                    if(a2=="0"){
                        a2="0+";
                        m1=0;
                        ans1=null;
                        notation='+';
                    }
                    else {
                        if (a2 == null)
                            a2 = "+";
                        else
                            a2 = a2 + "+";
                        m1 = Double.valueOf(ans1);
                        ans1 = null;
                        notation = '+';
                    }
                }


                else {
                    a2 = (a2.substring(0,a2.length() - 1))+"+";
                    notation='+';

                }
                flag="0";
                a1.setText(String.valueOf(a2));


            }
        });

        Bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==null){
                    a2="0";
                }
               else if (!(a2.charAt(a2.length() - 1) == '+' || a2.charAt(a2.length() - 1) == '-' || a2.charAt(a2.length() - 1) == '*' || a2.charAt(a2.length() - 1) == '/' || a2.charAt(a2.length() - 1) == '%')) {
                    if (a2 == "0") {
                        a2 = "0-";
                        m1 = 0;
                        ans1 = null;
                        notation = '-';
                    }
                    else {
                        if (a2 == null)
                            a2 = "-";
                        else
                            a2 = a2 + "-";

                        m1 = Double.valueOf(ans1);
                        ans1 = null;
                        notation = '-';
                    }
                }



                else {
                    a2 = (a2.substring(0,a2.length() - 1))+"-";
                    notation='-';

                }
                flag="0";
                a1.setText(String.valueOf(a2));
            }
        });

        Bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==null){
                    a2="0";
                }
                else if(!(a2.charAt(a2.length()-1)=='+'||a2.charAt(a2.length()-1)=='-'||a2.charAt(a2.length()-1)=='*'||a2.charAt(a2.length()-1)=='/'||a2.charAt(a2.length()-1)=='%')) {

                    if (a2 == "0" ) {
                        a2 = "0*";
                        m1 = 0;
                        ans1 = null;
                        notation = '*';
                    } else {
                        if (a2 == null)
                            a2 = "*";
                        else
                            a2 = a2 + "*";
                        m1 = Double.valueOf(ans1);
                        ans1 = null;
                        notation = '*';
                    }
                }
                else {
                    a2 = (a2.substring(0,a2.length() - 1))+"*";
                    notation='*';

                }
                flag="0";
                a1.setText(String.valueOf(a2));
            }
        });

        Bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(flag==null){
                a2="0";
            }
                else if(!(a2.charAt(a2.length()-1)=='+'||a2.charAt(a2.length()-1)=='-'||a2.charAt(a2.length()-1)=='*'||a2.charAt(a2.length()-1)=='/'||a2.charAt(a2.length()-1)=='%')) {
                    if (a2 == "0" ) {
                        a2 = "0/";
                        m1 = 0;
                        ans1 = null;
                        notation = '/';
                    } else {
                        if (a2 == null)
                            a2 = "/";
                        else
                            a2 = a2 + "/";
                        m1 = Double.valueOf(ans1);
                        ans1 = null;
                        notation = '/';
                    }
                }


                else {
                    a2 = (a2.substring(0,a2.length() - 1))+"/";
                    notation='/';

                }
                flag="0";
                a1.setText(String.valueOf(a2));
            }
        });
        Bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==null)
                {
                    a2="0";
                }
               else if(!(a2.charAt(a2.length()-1)=='+'||a2.charAt(a2.length()-1)=='-'||a2.charAt(a2.length()-1)=='*'||a2.charAt(a2.length()-1)=='/'||a2.charAt(a2.length()-1)=='%')) {

                    if (a2 == "0" ) {
                        a2 = "0%";
                        m1 = 0;
                        ans1 = null;
                        notation = '%';
                    } else {
                        if (a2 == null)
                            a2 = "%";
                        else
                            a2 = a2 + "%";
                        m1 = Double.valueOf(ans1);
                        ans1 = null;
                        notation = '%';
                    }
                }



                else {
                    a2 = (a2.substring(0,a2.length() - 1))+"%";
                    notation='%';

                }
                flag="0";
                a1.setText(String.valueOf(a2));
            }
        });

        Bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a1.setText(String.valueOf(a2));
                m2 = Double.valueOf(ans1);
                if (flag==null)
                    ans=0;
                else {
                    if ((m1 == 0 && m2 == 0))
                        ans = 0;
                    else if (m2 == 0)
                        ans = m1;
                    else {
                        if (notation == '+')
                            ans = m1 + m2;
                        else if (notation == '-')
                            ans = m1 - m2;
                        else if (notation == '*')
                            ans = m1 * m2;
                        else if (notation == '/')
                            ans = m1 / m2;
                        else if (notation == '%')
                            ans = m1 % m2;
                    }
                    flag="0";
                    aans.setText(String.valueOf(ans));
                }
            }
        });

        Bpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!(ans1.indexOf(".")>=0)) {
                    if (a2 == null)
                        a2 = "0.";
                    else
                        a2 = a2 + ".";
                    if (ans1 == null)
                        ans1 = ".";
                    else
                        ans1 = ans1 + ".";
                }
                flag="0";
                a1.setText(String.valueOf(a2));
            }
        });
        Bremove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==null)
                {
                    a2="0";
                }
               else if (a2.charAt(a2.length() - 1) == '+'||a2.charAt(a2.length() - 1) == '-'||a2.charAt(a2.length() - 1) == '*'||a2.charAt(a2.length() - 1) == '/'||a2.charAt(a2.length() - 1) == '%')
                {
                    ans1=null;
                    a2 = (a2.substring(0,a2.length() - 1));
                    m2=0;
                    m1 = Double.valueOf(a2);
                    notation='0';

                }
                else  if(a2!=null&&a2.length()>0) {
                    if (a2.charAt(a2.length() - 1) == '.')
                        Bpoint.setEnabled(true);
                    if (a2.length()==1)
                        a2="0";
                    else
                        a2 = (a2.substring(0,a2.length() - 1));

                    if(ans1.length()>0)
                        ans1 = (ans1.substring(0,ans1.length() - 1));
                    else
                        ans1="0";
                }
                else {
                    a2="0";
                }
                flag="0";
                a1.setText(String.valueOf(a2));
            }
        });



    }
}
