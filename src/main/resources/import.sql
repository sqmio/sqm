INSERT INTO users (id, login, full_name, first_name, last_name) VALUES ('1','test_login1', 'fullname1', 'firstname1', 'lastname1');
INSERT INTO users (id, login, full_name, first_name, last_name) VALUES ('2','test_login2', 'fullname2', 'firstname2', 'lastname2');

INSERT INTO claim_status (id, name, alias) VALUES ('1', 'new', 'Новый');

INSERT INTO groups (id, name) VALUES ('1', 'Support group 1');
INSERT INTO groups (id, name) VALUES ('2', 'Support group 2');

INSERT INTO claim (id, short_description, description, customer_id, status_id, assigned_group_id, created_date, last_modified_date) VALUES ('1', 'short description 1', 'unlim description 1', '2', '1', '1', '2018-09-02T20:04:49.030', '2018-09-02T20:04:49.030');
INSERT INTO claim (id, short_description, description, customer_id, status_id, req_money, req_currency, assigned_group_id, created_date, last_modified_date) VALUES ('2', 'short description 2', 'unlim description 2', '2', '1', '7000.2', '10', '1', '2018-09-02T20:05:23.030', '2018-09-02T20:05:23.030');
INSERT INTO claim (id, short_description, description, customer_id, status_id, req_money, req_currency, created_date, last_modified_date) VALUES ('4', 'short description 4', 'unlim description 4', '1', '1', '4500', '20', '2018-09-02T20:06:32.030', '2018-09-02T20:06:32.030');
INSERT INTO claim (id, short_description, description, customer_id, status_id, req_money, req_currency, created_date, last_modified_date) VALUES ('5', 'short description 5', 'unlim description 5', '1', '1', '18000', '10', '2018-09-02T20:07:44.030', '2018-09-02T20:07:44.030');
INSERT INTO claim (id, short_description, description, customer_id, status_id, req_money, req_currency, assigned_group_id, created_date, last_modified_date) VALUES ('6', 'short description 6', 'unlim description 6', '2', '1', '5000', '20', '2', '2018-09-02T20:08:42.030', '2018-09-02T20:08:42.030');
INSERT INTO claim (id, short_description, description, customer_id, status_id, req_money, req_currency, created_date, last_modified_date) VALUES ('7', 'short description 7', 'unlim description 7', '1', '1', '1000', '30', '2018-09-02T20:09:38.030', '2018-09-02T20:09:38.030');
INSERT INTO claim (id, short_description, description, customer_id, status_id, req_money, req_currency, created_date, last_modified_date) VALUES ('8', 'short description 8', 'unlim description 8', '2', '1', '900', '10', '2018-09-02T20:10:50.030', '2018-09-02T20:10:50.030');
INSERT INTO claim (id, short_description, description, customer_id, status_id, req_money, req_currency, assigned_group_id, created_date, last_modified_date) VALUES ('9', 'short description 9', 'unlim description 9', '1', '1', '100', '30', '1', '2018-09-02T20:11:49.030', '2018-09-02T20:11:49.030');
INSERT INTO claim (id, short_description, description, customer_id, status_id, req_money, req_currency, created_date, last_modified_date) VALUES ('11', 'short description 11', 'unlim description 11', '1', '1', '250', '10', '2018-09-02T20:12:55.030', '2018-09-02T20:12:55.030');
INSERT INTO claim (id, short_description, description, customer_id, status_id, req_money, req_currency, assigned_group_id, created_date, last_modified_date) VALUES ('12', 'short description12 ', 'unlim description 12', '1', '1', '303.3', '20', '2', '2018-09-02T20:13:07.030', '2018-09-02T20:13:07.030');