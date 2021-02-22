INSERT INTO category (id, name, description) VALUES
    (1, 'Elektronika', 'Bardzo fajne przedmioty'),
    (2, 'Moto', 'Samochody, skutery i ciężarówki'),
    (3, 'Meble', 'Prosto od chinczyka');

INSERT INTO offers (id, title, description, img_url, price, category_id) VALUES
    (1, 'Telewizor', 'Super telewizor o przekątnej 55 cali', 'http://blabla2.jpg', 1299, 1),
    (2, 'Stół drewniany', 'Idealny stół drewniany dla rodziny, 6 krzeseł gratis', 'http://blabla.jpg3', 2699, 3),
    (3, 'Kino domowe', 'Wypasione kino domowe firmy Sony, gra tak, że można robić festyn', 'http://blabla3.jpg', 699, 1),
    (4, 'BMW', 'Takie dobre, że Janusze pozazdroszczą', 'http://blabla6.jpg', 100000, 2);