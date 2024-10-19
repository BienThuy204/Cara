/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuy.dev.admin;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import thuy.dev.data.dao.Database;
import thuy.dev.data.dao.DatabaseDao;

/**
 *
 * @author Asus
 */
public class BaseAdminServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException{
        super.init(config);
        DatabaseDao.init(new Database());
    }
}
