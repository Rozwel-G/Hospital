package cn.edu.cqu.card.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.edu.cqu.card.model.SpendingLog;
import cn.edu.cqu.card.service.ShopStatisticService;

@Controller
public class ShopStatisticController {

	@Autowired
	ShopStatisticService shopStatisticService;

	// �̼�ͳ��ҳ�����
	@RequestMapping(value = "/shop_statistic", method = RequestMethod.GET)
	public String enterShopStatistic() {
		return "/shopstatistic/index";
	}

	// ��ѯ����
	@RequestMapping(value = "/shop_statistic/today", method = RequestMethod.GET)
	public String listTodaySpendingLog(Model model) {

		// ʵ��Ӧ��ʹ��session��ȡshopId
		List<SpendingLog> spendingLogs = shopStatisticService.getTodaySpendingLogs(1);
		model.addAttribute("spendingLogs", spendingLogs);
		model.addAttribute("totalMoney", shopStatisticService.computeTotalMoney(spendingLogs));
		return "/shopstatistic/show";
	}

	// ��ѯ�ܹ�
	@RequestMapping(value = "/shop_statistic/total", method = RequestMethod.GET)
	public String listTotalSpendingLog(Model model) {

		// ʵ��Ӧ��ʹ��session��ȡshopId
		List<SpendingLog> spendingLogs = shopStatisticService.getAllSpendingLogs(1);
		model.addAttribute("spendingLogs", spendingLogs);
		model.addAttribute("totalMoney", shopStatisticService.computeTotalMoney(spendingLogs));
		return "/shopstatistic/show";
	}

	// ��ѯ������Χ����ˮ
	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/shop_statistic/time", method = RequestMethod.POST)
	public String listTotalSpendingLog(@RequestParam("begin") String begin, @RequestParam("end") String end,
			Model model) {
		// �����ڽ��д���
		try {
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date beginDate = dateFormat.parse(begin);
			beginDate.setHours(0);
			beginDate.setMinutes(0);
			beginDate.setSeconds(0);
			Date endDate = dateFormat.parse(end);
			endDate.setHours(23);
			endDate.setMinutes(59);
			endDate.setSeconds(59);

			// ʵ��Ӧ��ʹ��session��ȡshopId
			List<SpendingLog> spendingLogs = shopStatisticService.getSpendingLogs(1, beginDate, endDate);
			model.addAttribute("spendingLogs", spendingLogs);
			model.addAttribute("totalMoney", shopStatisticService.computeTotalMoney(spendingLogs));
			return "/shopstatistic/show";

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/error";
	}

}
