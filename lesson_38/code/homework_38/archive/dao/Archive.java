package homework_38.archive.dao;

import homework_38.archive.model.Document;

import java.time.LocalDate;

public interface Archive {
    boolean addDocument(Document document);
    boolean removeDocument(int documentId,int folderId);
    boolean updateDocument(int documentId, int folderId, String url);
    Document getDocumentFromArchive(int documentId, int folderId);
    Document[] getAllDocumentsFromArchive(int folderId);
    Document[] getDocumentBetweenDates(LocalDate dateFrom, LocalDate dateTo);
    int size();

}

