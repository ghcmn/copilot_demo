-- Create MYSQL table calendar_day with calendar_date date, currency, user, dt
 CREATE TABLE IF NOT EXISTS calendar_day (
   calendar_date DATE NOT NULL,
   currency VARCHAR(255) NOT NULL,
   user VARCHAR(255) NOT NULL,
   dt VARCHAR(255) NOT NULL,
   PRIMARY KEY (calendar_date)
 ) ENGINE=InnoDB DEFAULT CHARSET= utf8;

