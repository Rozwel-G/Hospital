package cn.edu.cqu.card.service;

import java.util.List;

import cn.edu.cqu.card.model.News;

public interface NewsService {

	/**
	 * @return �����б���ʱ������
	 */
	List<News> listNews();

	/**
	 * @param newsId ���ŵ�����
	 * @return Newsʵ��
	 */
	News getNews(int newsId);

	/**
	 * @param news
	 * @return �ɹ��򷵻�1
	 */
	int addNews(News news);

	
	/**
	 * @param id ɾ��ָ��id������
	 */
	int delete(int id);

	int update(News news);

}
