package com.aurionpro.springClassConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(CoachConfig.class);
       CricketCoach bean= context.getBean("cricketCoach",CricketCoach.class);
       System.out.println(bean.getTrainingDetails());
       System.out.println(bean.getDiet());

       context.close();
    }
}
