package com.example.week3;

import com.talanlabs.avatargenerator.Avatar;
import com.talanlabs.avatargenerator.TriangleAvatar;
import com.talanlabs.avatargenerator.cat.CatAvatar;

import javax.imageio.ImageIO;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

@WebServlet(name = "AvatarServlet", value = "/AvatarServlet")
public class AvatarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,
            IOException {

        Avatar avatar = CatAvatar.newAvatarBuilder().build();
        String data = request.getParameter("data");
        System.out.println("get data");
        long l=Long.parseLong(data);
        System.out.println("l");

        BufferedImage image = avatar.create(l);

        ImageIO.write(image, "PNG", response.getOutputStream());

    }
}
