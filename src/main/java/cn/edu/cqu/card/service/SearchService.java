package cn.edu.cqu.card.service;

import java.util.List;

import cn.edu.cqu.card.model.Commodity;
import cn.edu.cqu.card.model.Shop;

public interface SearchService {
	/**
	 * @param nameKeyword �̻����ƹؼ���
	 * @param area        ����ؼ��֣���4���ֶΣ�����Ϊ ʡ���С��أ���������ϸ��ַ���˲���������Ϊ��
	 * @return �̻��б�
	 */
	List<Shop> searchShop(String nameKeyword, String[] area);

	/**
	 * @param nameKeyword ��Ʒ���ƹؼ���
	 * @param area        ����ؼ��֣���4���ֶΣ�����Ϊ ʡ���С��أ���������ϸ��ַ���˲���������Ϊ��
	 * @return �̻��б�
	 */
	List<Commodity> searchCommodities(String nameKeyword, String[] area);

}
