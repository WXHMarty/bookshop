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
 * 新增商品Action
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class HandleProdAction extends AdmPageAction {
	private int id = 0;
	private Book book;
	private File upload;//上传的文件
	private List<Book> books;
	private String uploadContentType;//上传文件的类型
	private String uploadFileName;//上传文件名称
	private List<String> categores;//分类
	
	@Resource(name="productService")
	private ProductService productService;
	
	//跳转至新增商品填写页面
	public String toAddPro() throws Exception{
		return "to_addPro";
	}
	
	//跳转至商品list页面
	public String toupAndDe() throws Exception{
		int pnum = 0;
		pnum = productService.getBookAll().size();
		books = productService.getBook(page, size);
		
		// 计算该目录所需页面
		if (pnum == 0) {
			maxPage = 1;
		} else if (pnum % size == 0) {
			maxPage = pnum / size;
		} else {
			maxPage = pnum / size + 1;
		}
		return "to_prodList";
	}
	
	//跳转到指定商品详细信息页面
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
	
	//跳转至修改页面
	public String toRevProd() throws Exception{
		return "to_revProd";
	}
	
	//处理添加商品
	public String addPro() throws Exception{
		Book b = new Book();
		b = productService.getBookByName(book.getBname());
		
		if(b.getBname() != null){
			request.setAttribute("fail", "名字相同的书籍已存在！");
			return "to_addPro";
		}
		
		//保存书籍
		book.setPicture(uploadFileName);
		productService.addBook(book, categores);
		
		//上传商品图片
		String path = ServletActionContext.getServletContext().getRealPath("/productImages");
		File file = new File(path);
		if(!file.exists()) file.mkdir();
		FileUtils.copyFile(upload, new File(file, uploadFileName));
		System.out.println("上传了照片"+uploadFileName+"成功！");
		return "success";
	}
	
	//修改商品
	public String updateProd() throws Exception{
		if(upload != null){
			//上传商品图片
			String path = ServletActionContext.getServletContext().getRealPath("/productImages");
			File file = new File(path);
			if(!file.exists()) file.mkdir();
			FileUtils.copyFile(upload, new File(file, uploadFileName));
			book.setPicture(uploadFileName);
		}
		productService.updateBook(book, categores);
		return "revprod_ok";
	}
	
	//删除商品
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
