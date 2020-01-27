package academy.everyonecodes.java.week6.set1.exercise4;

import academy.everyonecodes.java.week6.set1.exercise3.Blog;
import academy.everyonecodes.java.week6.set1.exercise3.Date;
import academy.everyonecodes.java.week6.set1.exercise3.Post;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BlogCheckerTest {
    BlogChecker blogChecker = new BlogChecker();
    Post postTrue1 = new Post("Post1", "this is a post", new Date(12,3,2003), true);
    Post postTrue2 = new Post("Post1", "this is a post", new Date(12,3,2003), true);
    Post postFalse1 = new Post("Post1", "this is a post", new Date(12,3,2003), false);
    Post postFalse2 = new Post("Post1", "this is a post", new Date(12,3,2003), false);
    Post postFalse3 = new Post("Post1", "this is a post", new Date(12,3,2003), false);

    Blog blog = new Blog("TheBlog", List.of(postFalse1,postFalse2,postFalse3,postTrue1, postTrue2), new Date(2,3,1920));
    Blog blog2 = new Blog("NotABlog", List.of(postFalse1,postFalse2), new Date(21,2,1928));
    Blog blog3= new Blog("TheLastOneWasALie,ButThisTimeItsTrue", List.of(), new Date(0,0,0));
    Website website1 = new Website("www.url.url", "braaaaap", Optional.of(blog));
    Website website2 = new Website("www.notablog.de", "parapapapa", Optional.empty());
    Website website3 = new Website("www.xinews.ch", "t-t-t-t-t-t-t-t-t", Optional.of(blog2));
    Website website4 = new Website("www.platypus.de", "ratatatata", Optional.of(blog3));

    @Test

    void hasBlogShouldReturnTrue(){
        boolean expected = true;
        boolean result = blogChecker.hasBlog(website1);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void hasBlogShouldReturnFalse(){
        boolean expected = false;
        boolean result = blogChecker.hasBlog(website2);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void hasBlogYes(){
        boolean expected = true;
        boolean result = blogChecker.hasBlog(website3);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void hasBlogYeahyeah(){
        boolean expected = true;
        boolean result = blogChecker.hasBlog(website4);
        Assertions.assertEquals(expected, result);
    }



}