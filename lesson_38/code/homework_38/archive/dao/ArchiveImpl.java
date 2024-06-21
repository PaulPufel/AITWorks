package homework_38.archive.dao;

import homework_38.archive.model.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class ArchiveImpl implements Archive {
    // fields
    private Document[] documents;
    private int size;

    public ArchiveImpl(int capacity) {
        this.documents = new Document[capacity];
        this.size = 0;
    }

    static Comparator<Document> comparator = (p1, p2) -> {
        int res = p1.getDate().compareTo(p2.getDate());
        return res != 0 ? res : Integer.compare(p1.getDocumentId(), p2.getDocumentId());
    };

    @Override
    public boolean addDocument(Document document) {
        // bad cases
        if (document == null || size == documents.length || getDocumentFromArchive(document.getDocumentId(), document.getFolderId()) != null) {
            return false;
        }
        // find index to insert
        int index = Arrays.binarySearch(documents, 0, size, document, comparator);
        // index treatment
        index = index >= 0 ? index : -index - 1;
        // shift array from index right on 1 position
        System.arraycopy(documents, index, documents, index + 1, size - index);
        documents[index] = document;
        size++;
        return true;
    }

    @Override
    public boolean removeDocument(int documentId, int folderId) {
        for (int i = 0; i < size; i++) {
            if (documents[i].getDocumentId() == documentId && documents[i].getFolderId() == folderId) {
                // надвинуть "хвост" массива на i-e место
                System.arraycopy(documents, i + 1, documents, i, size - 1 - i);
                // size--;
                documents[--size] = null;
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean updateDocument(int documentId, int folderId, String url) {
        Document document = getDocumentFromArchive(documentId, folderId);
        if (document == null) {
            return false;
        }
        document.setUrl(url); // update url
        return true;
    }


    @Override
    public Document getDocumentFromArchive(int documentId, int folderId) {
        Document pattern = new Document(folderId, documentId, null, null, null);
        //       for (int i = 0; i < size; i++) {
        //           if(pattern.equals(photos[i])) {
        //               return photos[i];
        //           }
        //      }

        for (Document d : documents) {
            if (pattern.equals(d)) {
                return d;
            }
        }
        return null;
    }

    @Override
    public Document[] getAllDocumentsFromArchive(int folderId) {
        return findByPredicate(d -> d.getFolderId() == folderId); // условие для предиката
    }

    private Document[] findByPredicate(Predicate<Document> predicate) {
        Document[] res = new Document[size]; // все документы могут туда попасть
        int j = 0; // count documents in album
        for (int i = 0; i < size; i++) {
            if (predicate.test(documents[i])) {
                res[j] = documents[i];
                j++;
            }
        }
        return Arrays.copyOf(res, j); // обрезали массив от null

    }

    @Override
    public Document[] getDocumentBetweenDates(LocalDate dateFrom, LocalDate dateTo) {
        Document pattern = new Document(0, Integer.MIN_VALUE, null, null, dateFrom.atStartOfDay());
        int from = Arrays.binarySearch(documents, 0, size, pattern, comparator);
        // это левый край
        from = from >= 0 ? from : -from - 1;
        // это правый край
        pattern = new Document(0, Integer.MAX_VALUE, null, null, LocalDateTime.of(dateTo, LocalTime.MAX));
        int to = Arrays.binarySearch(documents, 0, size, pattern, comparator);
        to = to >= 0 ? to : -to - 1;
        return Arrays.copyOfRange(documents, from, to);
    }

    @Override
    public int size() {
        return size;
    }
}





