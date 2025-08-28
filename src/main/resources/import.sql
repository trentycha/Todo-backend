-- This file allow to write SQL commands that will be emitted in test and dev.
INSERT INTO TodoItem(id, text, completed) VALUES (1, 'Apprendre Quarkus', false);
INSERT INTO TodoItem(id, text, completed) VALUES (2, 'Créer application Todo', false);
ALTER SEQUENCE TodoItem_SEQ RESTART WITH 3;