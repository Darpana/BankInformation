CREATE TABLE bank_branches 
(ifsc character varying(11) NOT NULL,
    bank_id integer,
    bank_name character varying(49),
    branch character varying(74),
    address character varying(195),
    city character varying(50),
    district character varying(50),
    primary key(ifsc),
    state character varying(26)
    ) AS SELECT 
  ifsc, 
  bank_id, 
  bank_name,
  branch, 
  address, 
  city,
  district,
  state
FROM 
CSVREAD('src/main/resources/bank_branches.csv');