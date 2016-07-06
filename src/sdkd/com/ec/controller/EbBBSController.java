package sdkd.com.ec.controller;

import sdkd.com.ec.dao.impl.EbBBSDao;
import sdkd.com.ec.model.EbBBS;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by sdust on 2016/7/7.
 */
@WebServlet(name = "EbBBSController")
public class EbBBSController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EbBBSDao bbsDao = new EbBBSDao();
        List<EbBBS> list = bbsDao.getBBS();
        request.setAttribute("bbsList", list);

        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
