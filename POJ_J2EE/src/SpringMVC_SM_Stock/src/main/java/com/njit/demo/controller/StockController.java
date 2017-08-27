package com.njit.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.njit.demo.entity.Stock;
import com.njit.demo.service.StockService;

@Controller
@RequestMapping("stock")
public class StockController {
	@Autowired
	private StockService stockService;

	@RequestMapping("/login.do")
	public ModelAndView login(String Stockname, String password, HttpServletRequest request) {
		Stock stock = new Stock();
		List<Stock> stockList = stockService.selectStock(stock);
		request.setAttribute("message", "登录");
		if (stockList.size() > 0) {
			request.setAttribute("stockList", stockList);
			return new ModelAndView("success");
		} else
			return new ModelAndView("fail");
	}

	@RequestMapping("/register.do")
	public ModelAndView regist(String stockname, String password, HttpServletRequest request) {
		Stock stock = new Stock();
		boolean flag = true;
		flag = stockService.existStock(stockname);
		request.setAttribute("message", "注册");
		if (!flag) {
			stockService.insertStock(stock);
			return new ModelAndView("success");
		} else {
			return new ModelAndView("fail");
		}
	}

	/**
	 * 股票数据下载(CSV格式）
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping("/download.do")
	public ModelAndView download(HttpServletRequest request) {
		stockService.download();
		request.setAttribute("message", "下载");
		return new ModelAndView("success");
	}

	/**
	 * 导入股票表(stockTBL)
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping("/importStockTBL.do")
	public ModelAndView importStockTBL(HttpServletRequest request) {
		stockService.importStockTBL();
		request.setAttribute("message", "导入股票表(stockTBL)");
		return new ModelAndView("success");
	}

	/**
	 * 导入股票数据表(stockDataTBL)
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping("/importStockDataTBL.do")
	public ModelAndView importStockDataTBL(HttpServletRequest request) {
		stockService.importStockDataTBL();
		request.setAttribute("message", "导入股票数据表(stockDataTBL)");
		return new ModelAndView("success");
	}

}
