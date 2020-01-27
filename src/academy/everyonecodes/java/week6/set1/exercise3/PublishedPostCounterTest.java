package academy.everyonecodes.java.week6.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PublishedPostCounterTest {
    PublishedPostCounter publishedPostCounter = new PublishedPostCounter();

    Post postTrue1 = new Post("Post1", "this is a post", new Date(12,3,2003), true);
    Post postTrue2 = new Post("Post1", "this is a post", new Date(12,3,2003), true);
    Post postFalse1 = new Post("Post1", "this is a post", new Date(12,3,2003), false);
    Post postFalse2 = new Post("Post1", "this is a post", new Date(12,3,2003), false);
    Post postFalse3 = new Post("Post1", "this is a post", new Date(12,3,2003), false);

    Date date = new Date(22,11,1983);

    @Test

    void countShouldReturn2(){
        List<Post> posts = List.of(postTrue1, postTrue2, postFalse3, postFalse1, postFalse2);
        Blog blog = new Blog("Blog1", posts, date);
        int expected = 2;
        int result = publishedPostCounter.count(blog);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void countShouldReturn0(){
        List<Post> posts = List.of(postFalse3, postFalse1, postFalse2);
        Blog blog = new Blog("Blog1", posts, date);
        int expected = 0;
        int result = publishedPostCounter.count(blog);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void countShouldReturnAlso0(){
        List<Post> posts = List.of();
        Blog blog = new Blog("Blog1", posts, date);
        int expected = 0;
        int result = publishedPostCounter.count(blog);
        Assertions.assertEquals(expected, result);
    }

}