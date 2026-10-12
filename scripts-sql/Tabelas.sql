CREATE TABLE pedidos(
id INTEGER PRIMARY KEY AUTOINCREMENT,
cliente TEXT,
valor REAL,
tipo TEXT);

INSERT INTO pedidos(cliente, valor, tipo) VALUES('Vitor', 150, 'Normal');
INSERT INTO pedidos(cliente, valor, tipo) VALUES('Marilia', 100, 'Normal');
INSERT INTO pedidos(cliente, valor, tipo) VALUES('Lorena', 7000, 'VIP');
INSERT INTO pedidos(cliente, valor, tipo) VALUES('Nilton', 5000, 'VIP');

SELECT * FROM pedidos;

SELECT * FROM pedidos WHERE tipo = 'VIP';

SELECT tipo, AVG(valor)
FROM pedidos
GROUP BY tipo;

SELECT cliente, valor FROM pedidos ORDER BY valor DESC LIMIT 1; 