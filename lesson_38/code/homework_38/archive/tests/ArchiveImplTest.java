package homework_38.archive.tests;

import homework_38.archive.dao.Archive;
import homework_38.archive.dao.ArchiveImpl;
import homework_38.archive.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveImplTest {

    Archive archive;
    Document[] doc;
    LocalDateTime now = LocalDateTime.now();

    @BeforeEach
    void setUp() {

        archive = new ArchiveImpl(7);

        doc = new Document[6];
        doc[0] = new Document(1, 1,"t1", "url1", now.minusDays(2)); // newest photo
        doc[1] = new Document(1, 2,"t2", "url2", now.minusDays(3));
        doc[2] = new Document(1, 3,"t3", "url3", now.minusDays(5));
        doc[3] = new Document(2, 1,"t1", "url4", now.minusDays(7));
        doc[4] = new Document(2, 2,"t2", "url5", now.minusDays(7));
        doc[5] = new Document(2, 3,"t3", "url6", now.minusDays(7)); // oldest photos

        // put ph into album
//        for (int i = 0; i < ph.length; i++) {
//            album.addPhoto(ph[i]);
//        }

        // foreach
        for (Document d : doc) {
            archive.addDocument(d);
            System.out.println(d);
        }
    }

    @Test
    void addDocument() {
        // can't add null
        assertFalse(archive.addDocument(null));
        // can't add existed document
        assertFalse(archive.addDocument(doc[1]));
        // can add a new document
        Document document = new Document(3, 1, "title", "url1", now.minusDays(1));
        assertTrue(archive.addDocument(document));
        // check size
        assertEquals(7, archive.size());
        // can't add more documents
        Document document1 = new Document(3, 2, "title", "url1", now.minusDays(1));
        assertFalse(archive.addDocument(document1));
    }


    @Test
    void removeDocument() {
        // remove existed document
        assertTrue(archive.removeDocument(3, 2));
        // remove not existed document
        assertFalse(archive.removeDocument(5,5));
        // check size
        assertEquals(5, archive.size());
        // find removed document
        assertFalse(archive.removeDocument(3, 2));
    }

    @Test
    void updateDocument() {
        assertTrue(archive.updateDocument(1, 1, "newUrl"));
        assertEquals("newUrl", archive.getDocumentFromArchive(1,1).getUrl());
    }


    @Test
    void getDocumentFromArchive() {
        assertEquals(doc[0], archive.getDocumentFromArchive(1, 1));
        assertNull(archive.getDocumentFromArchive(5,5));
    }

    @Test
    void getAllDocumentsFromArchive() {
        Document[] expected = {doc[3], doc[4], doc[5]};
        Document[] actual = archive.getAllDocumentsFromArchive(2);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void getDocumentBetweenDates() {
        LocalDate ld = now.toLocalDate();
        Document[] actual = archive.getDocumentBetweenDates(ld.minusDays(6), ld.minusDays(1));
        Arrays.sort(actual);
        Document[] expected = {doc[0], doc[1], doc[2]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void size() {
        assertEquals(6, archive.size());
    }
}
