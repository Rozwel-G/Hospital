package cn.edu.cqu.card.service;

import java.util.Date;
import java.util.List;

import cn.edu.cqu.card.model.SpendingLog;

public interface ShopStatisticService {

	/**
	 * @param shopId
	 * @return ��ѡ���̵��������Ѽ�¼
	 */
	List<SpendingLog> getAllSpendingLogs(int shopId);

	/**
	 * @param shopId
	 * @param begin  ��ʼʱ��
	 * @param end    ����ʱ��
	 * @return ��ѡ���̸���ʱ���ڵ����Ѽ�¼
	 */
	List<SpendingLog> getSpendingLogs(int shopId, Date begin, Date end);

	/**
	 * @param shopId
	 * @return ��ѡ���̽�������Ѽ�¼
	 */
	List<SpendingLog> getTodaySpendingLogs(int shopId);

	/**
	 * @param spendingLogs ���Ѽ�¼�ļ���
	 * @return �����ܶ�
	 */
	float computeTotalMoney(List<SpendingLog> spendingLogs);

}
