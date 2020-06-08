package servlet;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/checkCodeServlet")
public class CheckCodeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     int width = 100;
     int height = 50;
        //1.创建一个对对象，在内存中画图（验证码图片对象）
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

        // 2.美化图片
        //2.1填充背景色
        final Graphics g = image.getGraphics();//画笔对象
        g.setColor(Color.pink);//设置画笔颜色
        g.fillRect(0,0,width,height);
        //2.2画边框
        g.setColor(Color.blue);
        g.drawRect(0,0,width,height);

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        //生成随机角标
        Random r = new Random();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 4; i++) {
            int index = r.nextInt(str.length());
            //获取字符
            char ch = str.charAt(index);//随机字符
            sb.append(ch);
            //2.3写验证码
            g.drawString(String.valueOf(ch),width/5*i,height/2);
        }
        String checkCode_session = sb.toString();

        request.getSession().setAttribute("checkCode_session",checkCode_session);

        //2.4 画干扰线
        g.setColor(Color.green);
        //随机生成坐标点

        for (int i = 0; i < 5; i++) {
             int w = r.nextInt(width);
             int h = r.nextInt(height);
             int w1 = r.nextInt(width);
             int h1 = r.nextInt(height);
            g.drawLine(w,h,w1,h1);
        }
        // 3.将图片输出到页面
        ImageIO.write(image,"jpg",response.getOutputStream());

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
