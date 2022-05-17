package com.ecom.service;

import java.time.LocalDate;

import com.ecom.bean.Order;
import com.ecom.bean.Product;
import com.ecom.dao.ProductDao;

public class ProductService {

	public Order addOrder(int pId, int qntty) {
		Order order = null;

		ProductDao pDao = new ProductDao();

		// get product unit price from ProductDb
		Product product = pDao.getpById(pId);

		if (product != null) {
			double unitPrice = product.getpPrice();

			// calculate total cost cost i.e quantity*product price

			double totalPrice = qntty * unitPrice;

			// add gst 5%

			// display invoice
			order = new Order(qntty, totalPrice, null, qntty);
			order.setOrderId(1);
			order.setDateOfOrder(LocalDate.now());
			order.setOrderAmount(totalPrice);
			order.setpId(pId);

		}
		return order;
	}
}
