package officehours;

/*
 * ArrayList<String[]> r day32.example:
Each item in ArrayList is a String Array

r = [
["1","title","content1"],
["2","another title","content2"],
["3","yet another title","content3"]
]

the String id argument of blogDb method is referring to a row from the table the arraylist holds.
You need to loop through each element in the ArrayList and find the matching String[] with that id.
Then return the title and content in the format below.

for day32.example

blogDb(r,"1")
returns:
title
content1

blogDb(r,"2")
returns:
another title
content2

when you return the string make sure there is a line break between the title and content.
you can use " \n " to line break in a string

 */

import java.util.*;

public class BlogPostDB {

    public String blogDb(ArrayList<String[]> r, String id) {

    /*
     *
     r arraylisti

     { "1", "title 1", "content" } => 0.;
     { "2", "title 2", "content" } => 1.;
     { "3", "title 3", "content3" }=> 2.;

     id = 3
     */

        String str = "";

        //       i = 0; i < 3; i++
        for (int i = 0; i < r.size(); i++) {
            // r.get(0)[0] = 1 id = 3
            // { "1", "title 1", "content" }

            // r.get(1)[0] = 2 id = 3
            // { "2", "title 2", "content" }

            // r.get(2)[0] = 3 id = 3
            // { "3", "title 3", "content3" }
            if (r.get(i)[0].equals(id)) {
                str = r.get(i)[1] + "\n" + r.get(i)[2];
                //  str = r.get(2)[1] + "\n" + r.get(2)[2]
                //    "title 3"  + "\n" +  "content3"
            }
        }

        return str;

    }

    public static void main(String[] args) {
        BlogPostDB m = new BlogPostDB();
        ArrayList<String[]> arr = new ArrayList<String[]>();
        arr.add(new String[] { "1", "title 1", "content" });
        arr.add(new String[] { "2", "title 2", "content" });
        arr.add(new String[] { "3", "title 3", "content3" });

        String post3 = m.blogDb(arr, "3");
        System.out.println(post3);
        // should output:
        // title 3
        // content3
        System.out.println("*************************************");
        String post2 = m.blogDb(arr, "2");
        System.out.println(post2);

        System.out.println("*************************************");

        String post1 = m.blogDb(arr, "1");
        System.out.println(post1);

    }// end main
}