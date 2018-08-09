package ch.uzh.marugoto.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ch.uzh.marugoto.backend.data.entity.Page;
import ch.uzh.marugoto.backend.service.PageService;

@RestController
public class PageController extends BaseController {

	@Autowired
	private PageService pageService;

	@RequestMapping("/getPages")
	public Iterable<Page> getPages() {
		Iterable<Page> pages = this.pageService.getAllPages();
		return pages;
	}
	
	@RequestMapping("/getPage")
	public Page getPage(@RequestParam(value="id") String id) {
		Page page = this.pageService.getPage(id);
		return page;
	}
}
