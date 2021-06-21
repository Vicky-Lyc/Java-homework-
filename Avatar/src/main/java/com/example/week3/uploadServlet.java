package com.example.week3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
@WebServlet("/uploadServlet")
public class uploadServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,
            IOException {
        /**
         * 文件上传
         * servlet将multipart/form-data的post请求封装成part 通过part对上传的文件进行操作
         * getPart(name):name代表的是表单元素（file文件域）的name属性值
         *
         */
        //得到part对象
        Part part=request.getPart("myfile");
        //得到上传文件的名字
        String filename=part.getName();
        //得到项目存放的真实路径(得到文件想要存放的路径）
        String realPath= request.getServletContext().getRealPath("/upload/");
        System.out.println(realPath);
        //文件上传
        part.write(realPath+filename);

    }
}
