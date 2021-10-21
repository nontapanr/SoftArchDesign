package edu.parinya.softarchdesign.structural;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class HealthcareWorkerTeam implements HealthcareServiceable{

    private Set<HealthcareServiceable> members = new LinkedHashSet<>();

    public HealthcareWorkerTeam() {
    }

    public void addMember(HealthcareServiceable worker) {
        this.members.add(worker);
    }

    public void removeMember(HealthcareWorker worker){
        this.members.remove(worker);
    }

    public void service() {
        for (HealthcareServiceable member: members){
            member.service();
        }
    }

    public double getPrice() {
        double totalPrice = 0.0;

        for (HealthcareServiceable member : members){
            totalPrice += member.getPrice();
        }

        return totalPrice;
    }
}
