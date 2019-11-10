package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird implements Animal {
    private String migrationMonth;
    public String getMigrationMonth(){
        return migrationMonth;
    }
        public void setMigrationMonth(String migrationMonth){
        this.migrationMonth = migrationMonth;
        }
    public String color(){
        return "red";
    }
    public int getSpeed(){
        return 10;
    }
}
