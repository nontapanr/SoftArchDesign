package edu.parinya.softarchdesign.structural;

public class TaxPayingHealthcareWorker extends HealthcareWorkerDecorator{
    public TaxPayingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
        System.out.println("Decorate " + worker.getName() + " with TaxPaying.");
    }

    @Override
    public double getPrice() {
        double priceWithTax = 0.0;
        priceWithTax = super.getPrice() * 1.1;
        return priceWithTax;
    }
}
