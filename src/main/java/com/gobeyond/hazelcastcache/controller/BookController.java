package com.gobeyond.hazelcastcache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gobeyond.hazelcastcache.model.Book;
import com.gobeyond.hazelcastcache.services.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@PostMapping("/book")
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}

	@PutMapping("/book")
	public Book updateBook(@RequestBody Book book) {
		return bookService.updateBook(book);
	}

	@GetMapping("/book/{id}")
	public Book getBook(@PathVariable long id) {
		return bookService.getBook(id);
	}

	@DeleteMapping("/book/{id}")
	public String deleteBook(@PathVariable long id) {
		return bookService.deleteBook(id);
	}
}
