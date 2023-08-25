package desgin;

import javax.swing.*;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        System.out.println("Start getting tickets!");
        Random random = new Random();
        for (int i = 0 ; i <=5  ;i ++){
             int index = random.nextInt(0,3);
              Ticket ticket =  new Ticket();
              ticket.setName("Ticket " + (i+1));
              ticket.setPrice(50);
              switch (index){
                  case  0:
                      ticket.setPromoteStrategy(new NoDiscountStrategy());
                      break;
                  case  1:
                      ticket.setPromoteStrategy(new QuarterDiscountStrategy() );
                      break;
                  case  2:
                      ticket.setPromoteStrategy(new HalfDiscountStrategy());
                      break;
              }
            System.out.println("Promoted price of " + ticket.getName()+" is "
                    +ticket.GetPromotedPrice()+" "+ ticket.getPromoteStrategy().getClass()) ;
            System.out.println();
        }
    }
}