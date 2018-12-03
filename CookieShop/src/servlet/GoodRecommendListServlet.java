package servlet;

import model.Page;
import service.GoodsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "goodrecommendList",urlPatterns = "/goodsrecommend_list")
public class GoodRecommendListServlet extends HttpServlet {
    private GoodsService gService = new GoodsService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int type = Integer.parseInt(request.getParameter("type") ) ;
        int pageNumber = 1;
        if(request.getParameter("pageNumber") != null) {
            try {
                pageNumber=Integer.parseInt(request.getParameter("pageNumber") ) ;
            }
            catch (Exception e)
            {

            }
        }
        if(pageNumber<=0)
            pageNumber=1;
        Page p = gService.getGoodsRecommendPage(type, pageNumber);

        if(p.getTotalPage()==0)
        {
            p.setTotalPage(1);
            p.setPageNumber(1);
        }
        else {
            if(pageNumber>=p.getTotalPage()+1)
            {
                p = gService.getGoodsRecommendPage(type, p.getTotalPage());
            }
        }
        request.setAttribute("p", p);
        request.setAttribute("t", type);
        request.getRequestDispatcher("goodsrecommend_list.jsp").forward(request, response);
    }
}
