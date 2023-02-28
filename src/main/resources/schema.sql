DROP TABLE IF EXISTS PRICES;
DROP TABLE IF EXISTS BRAND;
CREATE TABLE BRAND (
brand_id INT PRIMARY KEY,
brand_description VARCHAR(20) NOT NULL
);
CREATE TABLE PRICES (
brand_id INT,
foreign key (brand_id) references BRAND(brand_id),
start_date  DATE NOT NULL,
end_date  DATE NOT NULL,
price_list  VARCHAR (1) NOT NULL,
product_id  VARCHAR(8) NOT NULL,
priority  VARCHAR(1) NOT NULL,
price  VARCHAR(255) NOT NULL,
curr  VARCHAR(8) NOT NULL
);