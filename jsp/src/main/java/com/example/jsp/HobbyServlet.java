package com.example.jsp;

import com.sun.org.apache.xerces.internal.xs.StringList;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(urlPatterns = "/hobbyFind")
public class HobbyServlet extends HttpServlet {
    private Map<String, List<String>> userHobby;

    public List getList(String a){
        List<String> list = new ArrayList<>();
        list.add(a);
        return list;
    }
    @Override
    public void init() {
        userHobby = new HashMap<>();
        userHobby.put("Vicky",getList("swimming"));
        userHobby.put("Lisa", getList("dancing"));
        userHobby.put("Tina", getList("singing"));
        userHobby.put("Tom", getList("playing the piano"));
        userHobby.get("Vicky").add("playing basketball");

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String hobby = request.getParameter("hobby");
        List<String> names = new ArrayList<>();
        userHobby.forEach((k, v) -> {
            for (String h:v) {
                if (h.equals(hobby)){
                    names.add(k);
                    break;
                }
            }
        });
        request.setAttribute("names", names);
        request.setAttribute("hobby", hobby);
        request.getRequestDispatcher("hobbyResult.jsp").forward(request, response);
    }

}