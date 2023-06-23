package com.example.demo;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;


@Component
public class ScheduledTransferModule {
 // FIXED DELAY WAITS
    // FIXED RATE DOES NOT WAIT FOR OTHERS
    //SPECIFY MAXIMUM SCHEDULED METHODS IN APPLICATION.PROPERTIES

//
//    @Scheduled(fixedRate = 2,timeUnit = TimeUnit.SECONDS)
//    public void doTransfer() throws InterruptedException {
////        LocalDateTime time = LocalDateTime.now();
////        time.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
////        System.out.println(time);
//        System.out.println("look at me im doing transfer");
//        Thread.sleep(3000);
//    }
//
//    public void doSomethingFancy(String fancyArgs){
//
//    }
//
//
//    @Scheduled(fixedDelay = 2,timeUnit = TimeUnit.SECONDS)
//    public void doTransfer3() throws InterruptedException {
//        System.out.println("3 - look at me im doing transfer");
//        Thread.sleep(3000);
//    }
//    @Scheduled(cron ="*/2 * * * * *")
//    public void doTransfer2() throws InterruptedException {
//        System.out.println("2 - look at me im doing transfer");
//        Thread.sleep(3000);
//    }
}
