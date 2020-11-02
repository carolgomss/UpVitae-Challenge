package br.com.fiap.b2w.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.b2w.bo.PerfilBO;
import br.com.fiap.b2w.model.Perfil;

//REQUEST DISPATCHER N FUNCIONA? N RECONHECE ESSES IMPORTS PQ ERA UM PROJETO JAVA?

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//
//@WebServlet("/perfilServlet")
//public class PerfilServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//		doPost(request, response);
//
//	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//		request.setCharacterEncoding("UTF-8");
//
//		String acao = request.getParameter("acao");
//
//		switch (acao) {
//		case "cadastrar":
//			try {
//				inserirPerfil(request, response);
//			} catch (SQLException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			break;
//
////		case "listarTodos":
////			listarPerfilTodos(request, response);
////			break;
////
////		case "listarId":
////			listarPerfil(request, response, Integer.parseInt(request.getParameter("id_cad")));
////			break;
////
////		case "atualizar":
////			atualizarPerfil(request, response);
////			break;
////
////		case "excluir":
////			excluirPerfil(request, response);
////			break;
//		}
//	}

//	public void inserirPerfil
//	(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException {
//
//		// Recuperando os dados do request e adicionando a um objeto
//
//		Perfil pf = new Perfil();
//
////		pf.setAreaCad(request.getParameter("area"));
//
//		// Passar os dados para o BO
//		PerfilBO pb = new PerfilBO();
//
//		int resultado = pb.cadastroPerfil(pf);
//		// Verifica��o do resultado para gerar uma mensagem para o usu�rio
//
//		if (resultado == 1) {
////			// Criando um redirecionamento com par�metros de sucesso
////
////			response.sendRedirect("index.jsp?msgStatus=Os dados foram gravados com SUCESSO!");
////		} else {
////
////		}
////		// Criando um redirecionamento com par�metros de erro
////		response.sendRedirect("index.jsp?msgStatus=Ocorreu um erro ao gravar os dados.");
////	}
////
//	public void listarCadAssociadoTodos(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
//		//Instanciar a classe BO
//		
//		PerfilBO pb = new PerfilBO();
//		List<Perfil> lista = (List<Perfil>) pb.listagemPerfil(0);
//		
//		if(lista != null) {
//			
//			//Criando um atributo no request com a lista de clientes
//			request.setAttribute("lista_pf", lista);
//			
//			//Realizar o encaminhamento para a p�gina lista.jsp para carregar a lista de clientes
//			request.getRequestDispatcher("listaCadastro.jsp").forward(request,response);
//			}else {
//					
//				
//			//Criando um par�metro no com uma mensagem de erro para a p�gina JSP index.
//			//nao tem isso na index, talvez tirar 		
//			response.sendRedirect("index.jsp?msgStatus=Ocorreu um erro com a" + "listagem dos associados!");
// }

//		de onde vai vir esse m�todo, est� sendo criado aqui???
//	public void listarPerfil(HttpServletRequest request , HttpServletResponse response, int idPf) throws ServletException,IOException {
//				
//		//Instanciar a classe BO
//		PerfilBO pbo = new PerfilBO();
//		
//		Perfil pf = pbo.listagemPerfil(idPf);
//				
//		if(pf != null) {
//				
//			//Criando um atributo no request com o objeto 
//			request .setAttribute("objPf", pf);
//			request .setAttribute("objIdPf", idPf);
//			
//			//Realizar o encaminhamento para a p�gina atualiza.jsp
//			request .getRequestDispatcher("atualiza.jsp").forward(request ,response);
//				
//		}else {
//				//Criando um par�metro com uma mensagem de erro.
//				response.sendRedirect("index.jsp?msgStatus=Ocorreu um erro com a sele��o atual.");
//			}
//}
//	
	
//	public void atualizarPerfil(HttpServletRequest request,HttpServletResponse response) throws IOException {
//			
//			//Recuperando os dados do request e adicionando em um objeto.
//			CadAssociado cad = null;
//			
//			pf = new CadAssociado();
//			pf.setAreaCad(request.getParameter("area"));
//			pf.setNomeCad(request.getParameter("nome"));
//			pf.setCpfCad(request.getParameter("cpf"));
//			pf.setNascCad(request.getParameter("nasc"));
//			pf.setEmailCad(request.getParameter("email"));
//			pf.setSenhaCad(request.getParameter("senha"));
//			pf.setValidaCad(request.getParameter("valida"));
//			pf.setTelCad(request.getParameter("telefone"));
//			
//			//Passar os dados para o BO
//			PerfilBO pb = new PerfilBO();
//			
//			int resultado = cb.atualizaPerfil(pf,Integer.parseInt(request.getParameter("id")));
//			//Verifica��o do resultado para gerar uma mensagem para o usu�rio
//			
//			
//			if(resultado == 1) {
//			//Criando um redirecionamento com par�metros.
//			response.sendRedirect("index.jsp?msgStatus=Os dados foram"
//			+ "ATUALIZADOS com SUCESSO!");
//			}else {
//			//Criando um redirecionamento com par�metros.
//			response.sendRedirect("index.jsp?msgStatus=Ocorreu um erro ao"
//			+ "tentar ATUALIZAR os dados.");
//		}
//	}
	
//	private void excluirPerfil(HttpServletRequest request,HttpServletResponse response) throws IOException {
//			
//		//Passar os dados para o BO
//			PerfilBO cb = new PerfilBO();
//			int resultado = pb.apagaCadAssociado(Integer.parseInt(request.getParameter("id_pf")));
//			
//		//Verifica��o do resultado para gerar uma mensagem para o usu�rio.
//			if(resultado == 1) {
//			
//		//Criando um redirecionamento com par�metros.
//			response.sendRedirect("index.jsp?msgStatus=Registro excluido com" + "SUCESSO!");
//			}else {
//				
//			}
//			//Criando um redirecionamento com par�metros.
//			response.sendRedirect("index.jsp?msgStatus=Ocorreu um erro ao"
//			+ "tentar EXCLUIR o registro.");
//			}
//// 	 }
//}
