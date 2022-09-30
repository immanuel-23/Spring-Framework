package com.aurionpro.springClassConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppFootBall 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(FootBallCoachConfig.class);
       FoodBallCoach bean= context.getBean("footBallCoach",FoodBallCoach.class);
       Coach bean1= context.getBean("footBallCoach",FoodBallCoach.class);
       System.out.println(bean==bean1);
       System.out.println(bean.getDiet());
       System.out.println(bean.getCountry());
       context.close();
    }
}
