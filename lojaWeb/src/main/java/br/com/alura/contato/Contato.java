package br.com.alura.contato;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.maven.Produto;
import br.com.caelum.stella.tinytype.CPF;
@WebServlet(urlPatterns = {"/contato"})
public class Contato extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.print("<html><h2>Ola</h2></html>");
	}
}
