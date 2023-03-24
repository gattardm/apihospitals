DROP TABLE IF EXISTS hospitals;

CREATE TABLE hospitals(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  longitude VARCHAR(10) NOT NULL,
  latitude VARCHAR(10) NOT NULL,
  bedsquantity VARCHAR(5) NOT NULL,
  bedsavailable VARCHAR(5) NOT NULL,
  speciality VARCHAR(250) NOT NULL,
  incidentid VARCHAR(5),
  attributedby  VARCHAR(5)
);

INSERT INTO hospitals (name, longitude, latitude, bedsquantity, bedsavailable, speciality, incidentid, attributedby) VALUES
  ('Hopital 1', '-10', '10', '1000', '100', 'Anaesthetics', 'n/a', 'n/a'),
  ('Hopital 2', '10', '10',  '2000', '200', 'Intensive care medicine', 'n/a', 'n/a'),
  ('Hopital 3', '10', '-10',  '3000', '300', 'Additional dental specialities', 'n/a', 'n/a'),
  ('Hopital 4', '-10', '-10',  '4000', '400', 'Oral and maxillofacial surgery', 'n/a', 'n/a');