CREATE DATABASE banco;

USE banco;

CREATE TABLE conta (
    numeroConta INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    titular VARCHAR(100),
    saldo NUMERIC(12,2)
);

INSERT INTO conta (titular, saldo) VALUES
    ('Ana Maria Braga', 1000.00),
    ('Bruno Berti', 500.00),
    ('Carla Perez', 200.00);

BEGIN;
    SAVEPOINT antesDeTudo;

    UPDATE conta SET saldo = saldo-200 WHERE titular = 'Ana Maria Braga';
    UPDATE conta SET saldo = saldo+200 WHERE titular = 'Bruno Berti';
    SAVEPOINT transacaoAnaParaBruno;

    UPDATE conta SET saldo = saldo-300 WHERE titular = 'Carla Perez';
    UPDATE conta SET saldo = saldo+300 WHERE titular = 'Bruno Berti';
    ROLLBACK TO transacaoAnaParaBruno;

    UPDATE conta SET saldo = saldo-50 WHERE titular = 'Ana Maria Braga';
    UPDATE conta SET saldo = saldo+50 WHERE titular = 'Carla Perez';
    SAVEPOINT transacaoAna50ParaCarla;

    UPDATE conta SET saldo = saldo-100 WHERE titular = 'Ana Maria Braga';
    UPDATE conta SET saldo = saldo+100 WHERE titular = 'Carla Perez';
    ROLLBACK TO transacaoAna50ParaCarla;
COMMIT;

SELECT * FROM conta;

