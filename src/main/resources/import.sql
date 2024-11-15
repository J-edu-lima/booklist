INSERT INTO tb_book_list (name) VALUES ('Romance');
INSERT INTO tb_book_list (name) VALUES ('Filosofia');

INSERT INTO tb_book (title, book_year, genre, img_url, short_description) VALUES ('Mistborn – Nascidos da Bruma', 2006, 'Literatura Fantástica, Romance', 'https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png', 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!');
INSERT INTO tb_book (title, book_year, genre, img_url, short_description) VALUES ('O Mito de Sísifo', 1942, 'Ensaio Filosófico', 'https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/2.png', 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!');

INSERT INTO tb_belonging (list_id, book_id, position) VALUES (1, 1, 0);
INSERT INTO tb_belonging (list_id, book_id, position) VALUES (2, 2, 0);
