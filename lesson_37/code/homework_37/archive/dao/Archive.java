package homework_37.archive.dao;

/* Архив должен позволять:
добавить документ
удалить документ
обновить документ
получить документ по номеру документа и папки
получить все документы из папки по ее номеру
получить все документы с датами за период от и до
узнать количество хранимых документов в архиве */

import homework_37.archive.model.Document;

import java.time.LocalDate;

public interface Archive {

    boolean addDocument (Document document);
    boolean removeDocument(int folderId, int documentId);
    boolean updateDocument(int folderId, int documentId,String url);
    Document getDocFromFolder (int folderId, int documentId);
    Document[] getAllDocFromFolder(int folderId);
    Document[] getDocBetweenDate(LocalDate dateFrom, LocalDate dateTo);
    Document[] getDocBetweenDateTwo(LocalDate dateFrom, LocalDate dateTo);
    int size(); //quantity
    void viewArchive(); // метод для печати содержимого
}