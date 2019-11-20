package org.ko.cor.demo1.handler;

public class Lead extends PriceHandler {

    @Override
    public void processDiscount(float discount) {

        if (discount <= 0.15) {
            System.out.format("%s approved: %.2f%n", this.getClass().getName(), discount);
        } else {
            successor.processDiscount(discount);
        }
    }

}
