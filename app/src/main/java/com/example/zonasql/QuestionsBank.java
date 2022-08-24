package com.example.zonasql;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {
    private static List<QuestionsList> quizQuestions() {
        final List<QuestionsList> questionLists = new ArrayList<>();

        // Create object of QuestionsLists class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("1. Apa itu basis data?", "A. Database", "B. Sekelompok Fakta", "C. Kumpulan banyaknya data", "D. Semua benar", "B. Sekelompok Fakta", "");
        final QuestionsList question2 = new QuestionsList("2. Ketika divisualisasikan di database(PhpMyAdmin) Entitas akan berupa?", "A. Column", "B. Field", "C. Table", "D. Structure", "C. Table", "");
        final QuestionsList question3 = new QuestionsList("3. Dalam ERD ada istilah Parent dan Children, untuk Children direfleksikan sebagai?", "A. Weak Relation", "B. Entity", "C. Weak Entity", "D. A dan C benar", "C. Weak Entity", "");
        final QuestionsList question4 = new QuestionsList("4. Untuk menentukan atribut dalam rumus kita menggunakan?", "A. Derived", "B. MultiValued", "C. Composite", "D. Key", "A. Derived", "");
        final QuestionsList question5 = new QuestionsList("5. Dalam sistem sekolah(guru dan siswa) untuk membuat database kita menggunakan relasi?", "A. Many to One", "B. One to One", "C. Many to Many", "D. One to Many", "D. One to Many", "");
        final QuestionsList question6 = new QuestionsList("6. Ketika ada parent dan children kita harus menggunakan ... untuk berrelasi", "A. Entity, Relationship dan Weak Entity", "B. Entity, Weak Relationship dan Entity", "C. Weak Entity, Weak Relationship dan Weak Entity", "D. Entity, Weak Relationship dan Weak Entity", "D. Entity, Weak Relationship dan Weak Entity", "");
        final QuestionsList question7 = new QuestionsList("7. Weak Relationship maupun Relationship bisa terdapat atribut, jika divisualisasikan maka akan menjadi?", "A. Primary Key", "B. Derived Key", "C. Foreign Key", "D. Field Key", "C. Foreign Key", "");
        final QuestionsList question8 = new QuestionsList("8. Apa jadinya jika atribut key tidak ada dalam sistem ERD kita?", "A. Tidak terjadi apa-apa", "B. Akan ERROR!", "C. Kita tidak bisa menyambung ke entitas lain", "D. Aplikasi/Website kita akan ERROR!", "A. Tidak terjadi apa-apa", "");
        final QuestionsList question9 = new QuestionsList("9. 1. Polisi mengatur lalu lintas\n2. Dosen mengajar mahasiswa\n3. Mahasiswa mengambil mata kuliah\n4. Dosen bekerja di jurusan RPL\nContoh relasi yang menggunakan One to Many ialah", "A. 1, 2 dan 3", "B. 1 dan 2", "C. 1 dan 3", "D. 2 dan 4", "A. 1, 2 dan 3", "");
        final QuestionsList question10 = new QuestionsList("10. 1. Guru mengajar siswa\n2. Mata kuliah dipelajari mahasiswa\n3. Mahasiswa belajar Mata kuliah\n4. Siswa dibelajari guru\nContoh relasi yang menggunakan Many to One ialah", "A. 1,2 dan 3", "B. 1 dan 2", "C. 1 dan 3", "D. 2 dan 4", "D. 2 dan 4", "");

        // add all questions to List<QuestionsLists>
        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);
        questionLists.add(question7);
        questionLists.add(question8);
        questionLists.add(question9);
        questionLists.add(question10);

        return questionLists;
    }

    private static List<QuestionsList> Game() {

        final List<QuestionsList> questionLists = new ArrayList<>();

        // Create object of QuestionsLists class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("1. Apa itu basis data?", "A. Database", "B. Sekelompok Fakta", "C. Kumpulan banyaknya data", "D. Semua benar", "B. Sekelompok Fakta", "");
        final QuestionsList question2 = new QuestionsList("2. Ketika divisualisasikan di database(PhpMyAdmin) Entitas akan berupa?", "A. Column", "B. Field", "C. Table", "D. Structure", "C. Table", "");
        final QuestionsList question3 = new QuestionsList("3. Dalam ERD ada istilah Parent dan Children, untuk Children direfleksikan sebagai?", "A. Weak Relation", "B. Entity", "C. Weak Entity", "D. A dan C benar", "C. Weak Entity", "");
        final QuestionsList question4 = new QuestionsList("4. Untuk menentukan atribut dalam rumus kita menggunakan?", "A. Derived", "B. MultiValued", "C. Composite", "D. Key", "A. Derived", "");
        final QuestionsList question5 = new QuestionsList("5. Dalam sistem sekolah(guru dan siswa) untuk membuat database kita menggunakan relasi?", "A. Many to One", "B. One to One", "C. Many to Many", "D. One to Many", "D. One to Many", "");
        final QuestionsList question6 = new QuestionsList("6. Ketika ada parent dan children kita harus menggunakan ... untuk berrelasi", "A. Entity, Relationship dan Weak Entity", "B. Entity, Weak Relationship dan Entity", "C. Weak Entity, Weak Relationship dan Weak Entity", "D. Entity, Weak Relationship dan Weak Entity", "D. Entity, Weak Relationship dan Weak Entity", "");
        final QuestionsList question7 = new QuestionsList("7. Weak Relationship maupun Relationship bisa terdapat atribut, jika divisualisasikan maka akan menjadi?", "A. Primary Key", "B. Derived Key", "C. Foreign Key", "D. Field Key", "C. Foreign Key", "");
        final QuestionsList question8 = new QuestionsList("8. Apa jadinya jika atribut key tidak ada dalam sistem ERD kita?", "A. Tidak terjadi apa-apa", "B. Akan ERROR!", "C. Kita tidak bisa menyambung ke entitas lain", "D. Aplikasi/Website kita akan ERROR!", "A. Tidak terjadi apa-apa", "");
        final QuestionsList question9 = new QuestionsList("9. 1. Polisi mengatur lalu lintas\n2. Dosen mengajar mahasiswa\n3. Mahasiswa mengambil mata kuliah\n4. Dosen bekerja di jurusan RPL\nContoh relasi yang menggunakan One to Many ialah", "A. 1, 2 dan 3", "B. 1 dan 2", "C. 1 dan 3", "D. 2 dan 4", "A. 1, 2 dan 3", "");
        final QuestionsList question10 = new QuestionsList("10. 1. Guru mengajar siswa\n2. Mata kuliah dipelajari mahasiswa\n3. Mahasiswa belajar Mata kuliah\n4. Siswa dibelajari guru\nContoh relasi yang menggunakan Many to One ialah", "A. 1,2 dan 3", "B. 1 dan 2", "C. 1 dan 3", "D. 2 dan 4", "D. 2 dan 4", "");

        // add all questions to List<QuestionsLists>
        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);
        questionLists.add(question7);
        questionLists.add(question8);
        questionLists.add(question9);
        questionLists.add(question10);

        return questionLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        if ("Quiz".equals(selectedTopicName)) {
            return quizQuestions();
        }
        return Game();
    }
}
