/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package thuy.dev;

import jakarta.servlet.ServletException;
import java.io.IOException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import thuy.dev.data.dao.DatabaseDao;
import thuy.dev.data.dao.ProductDao;
import thuy.dev.data.model.Product;
import thuy.dev.util.Constants;

/**
 *
 * @author Asus
 */
public class ProductServlet extends BaseServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       int productId = Integer.parseInt(request.getParameter("productId"));
       ProductDao productDao = DatabaseDao.getInstance().getProductDao();
       Product product = productDao.find(productId);
       List<Product> newsProductList = productDao.news(Constants.NUMBER_LIMIT);
       
       request.setAttribute("newsProductList", newsProductList);
       request.setAttribute("product", product);
       request.getRequestDispatcher("product.jsp").include(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
