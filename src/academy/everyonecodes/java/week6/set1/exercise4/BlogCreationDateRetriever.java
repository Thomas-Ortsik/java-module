package academy.everyonecodes.java.week6.set1.exercise4;

import academy.everyonecodes.java.week5.reflection.exercise2.StringToIntegersParser;
import academy.everyonecodes.java.week6.set1.exercise3.Blog;
import academy.everyonecodes.java.week6.set1.exercise3.Date;

import java.util.Optional;

public class BlogCreationDateRetriever {
    public String retrieve(Website website){
        Optional<Blog> oBlog = website.getBlog();
        if (oBlog.isEmpty()){
            return "00/00/00";
        }
        Blog blog = oBlog.get();
        Date date = blog.getDateCreated();
        String dayString = "00";
        if (date.getDay()<10){
            dayString = "0"+ String.valueOf(date.getDay());
        } else { dayString = String.valueOf(date.getDay());}
        String monthString = "00";
        if (date.getMonth()<10){
            monthString = "0"+ String.valueOf(date.getMonth());
        } else { monthString = String.valueOf(date.getMonth());}

        String yearString = String.valueOf(date.getYear());
        if (yearString.length()>2){yearString = yearString.substring(yearString.length()-2);}
        if (yearString.length()==1){yearString = "0"+yearString;}
        if (yearString.length()==0){yearString = "00";}
        String dateString = monthString+"/"+dayString+"/"+yearString;
        return dateString;

    }
}
