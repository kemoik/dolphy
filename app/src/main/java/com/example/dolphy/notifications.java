package com.example.dolphy;

public class notifications {
     String image;
     String nameCompany;
     String description;
     String job;

     public notifications(){

     }
    public notifications(String image,String nameCompany, String description, String job){
         this.image= image;
         this.nameCompany= nameCompany;
         this.description=description;
         this.job=job;
    }


    public String getImage() {
        return image;
    }
    public String getNameCompany() {
        return nameCompany;
    }
    public String getDescription() {
        return description;
    }
    public String getJob() {
        return job;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
