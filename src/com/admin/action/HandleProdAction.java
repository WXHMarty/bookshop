package com.admin.action;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.apache.commons.io.FileUtils;
import org.springframework.test.context.ContextConfiguration;

import com.admin.service.ProductService;
import com.entity.Book;
/**
 * ������ƷAction
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class HandleProdAction extends AdmPageAction {
	private int id = 0;
	private Book book;
	private File upload;//�ϴ����ļ�
	private List<Book> books;
	private String uploadContentType;//�ϴ��ļ�������
	private String uploadFileName;//�ϴ��ļ�����
	private List<String> categores;//����
	
	@Resource(name="productService")
	private ProductService productService;
	
	//��ת��������Ʒ��дҳ��
	public String toAddPro() throws Exception{
		return "to_addPro";
	}
	
	//��ת����Ʒlistҳ��
	public String toupAndDe() throws Exception{
		int pnum = 0;
		pnum = productService.getBookAll().size();
		books = productService.getBook(page, size);
		
		// �����Ŀ¼����ҳ��
		if (pnum == 0) {
			maxPage = 1;
		} else if (pnum % size == 0) {
			maxPage = pnum / size;
		} else {
			maxPage = pnum / size + 1;
		}
		return "to_prodList";
	}
	
	//��ת��ָ����Ʒ��ϸ��Ϣҳ��
	public String toProd() throws Exception{
		if(id != 0){
			book = productService.getBookById(id);
			return "to_prodDetail";
		}else if(!(book.getBname().replaceAll(" ", "").equals(""))){
			book = productService.getBookByName(book.getBname());
			return "to_prodDetail";
		}else{
			return "to_prodList";
		}
	}
	
	//��ת���޸�ҳ��
	public String toRevProd() throws Exception{
		return "to_revProd";
	}
	
	//���������Ʒ
	public String addPro() throws Exception{
		Book b = new Book();
		b = productService.getBookByName(book.getBname());
		
		if(b.getBname() != null){
			request.setAttribute("fail", "������ͬ���鼮�Ѵ��ڣ�");
			return "to_addPro";
		}
		
		//�����鼮
		book.setPicture(uploadFileName);
		productService.addBook(book, categores);
		
		//�ϴ���ƷͼƬ
		String path = ServletActionContext.getServletContext().getRealPath("/productImages");
		File file = new File(path);
		if(!file.exists()) file.mkdir();
		FileUtils.copyFile(upload, new File(file, uploadFileName));
		System.out.println("�ϴ�����Ƭ"+uploadFileName+"�ɹ���");
		return "success";
	}
	
	//�޸���Ʒ
	public String updateProd() throws Exception{
		if(upload != null){
			//�ϴ���ƷͼƬ
			String path = ServletActionContext.getServletContext().getRealPath("/productImages");
			File file = new File(path);
			if(!file.exists()) file.mkdir();
			FileUtils.copyFile(upload, new File(file, uploadFileName));
			book.setPicture(uploadFileName);
		}
		productService.updateBook(book, categores);
		return "revprod_ok";
	}
	
	//ɾ����Ʒ
	public String deleteProd() throws Exception{
		productService.deleteBook(id);
		return "delete_ok";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public List<String> getCategores() {
		return categores;
	}

	public void setCategores(List<String> categores) {
		this.categores = categores;
	}
}
