package br.com.fiap.b2w.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.b2w.bo.MetaBO;
import br.com.fiap.b2w.exception.MetaException;
import br.com.fiap.b2w.model.Meta;

@WebServlet("/metasExemplo")
public class MetaServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3651184726332034631L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String acao = request.getParameter("acao");
		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");
		String pontuacao = request.getParameter("pontuacao");
		
		if (acao.equals("cadastrar")) {
			Meta meta = new Meta();
			meta.setTitulo(nome);
			meta.setDescricao(descricao);
			meta.setPontuacao(Integer.parseInt(pontuacao));
			
			try {
				MetaBO metaBO = new MetaBO();
				metaBO.cadastrar(meta);
				response.sendRedirect("metasExemplo.jsp?msg=sucesso");
			} catch (MetaException e) {
				response.sendRedirect("metasExemplo.jsp?msg=" + e.getMessage());
			}
		}
		
	}
}
