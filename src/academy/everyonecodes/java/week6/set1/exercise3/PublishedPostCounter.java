package academy.everyonecodes.java.week6.set1.exercise3;

public class PublishedPostCounter {

    public int count(Blog blog){
        int publishedPosts = 0;
        for (Post post:blog.getPosts()
             ) {
            if(post.isPublished()){
                publishedPosts++;
            }
        }
        return publishedPosts;
    }
}
