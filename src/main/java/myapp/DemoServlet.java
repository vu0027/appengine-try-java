/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package myapp;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class DemoServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws IOException {
    resp.setContentType("text/plain");
    resp.getWriter().println("{ \"name\": \""+listNumber()+"\" }");


    //out.print("ABC");
  }
    public int listNumber() {
        int output =0;
        Random rand = new Random();
        List<Integer> list = new ArrayList<Integer>();

        // Generate random integers in range 0 to 999
        int rand_int1 = 0;
        for(int i = 0; i < 1000; i++) {
            // Print random integers
            rand_int1 = rand.nextInt(1000000000);
            //list.add(rand_int1);
            output = rand_int1;
            //System.out.println(rand_int1);
        }

        return output;
    }
}
