CREATE TABLE Owner (
    owner_id INT AUTO_INCREMENT PRIMARY KEY,
    owner_name VARCHAR(255) NOT NULL
);

CREATE TABLE Property (
    property_id INT AUTO_INCREMENT PRIMARY KEY,
    property_no VARCHAR(255) NOT NULL,
    area FLOAT NOT NULL,
    owner_id INT,
    FOREIGN KEY (owner_id) REFERENCES Owner(owner_id)
);

CREATE TABLE Fee (
    fee_id INT AUTO_INCREMENT PRIMARY KEY,
    property_id INT,
    annual_fee FLOAT,
    elevator_fee_std FLOAT,
    annual_elevator_fee FLOAT,
    total_fee FLOAT,
    FOREIGN KEY (property_id) REFERENCES Property(property_id)
);

CREATE TABLE PaymentType (
    type_id INT AUTO_INCREMENT PRIMARY KEY,
    type_name VARCHAR(255) NOT NULL
);

CREATE TABLE PaymentRecord (
    record_id INT AUTO_INCREMENT PRIMARY KEY,
    property_id INT,
    year INT,
    fee_amount FLOAT,
    payment_date DATE,
    type_id INT,
    FOREIGN KEY (property_id) REFERENCES Property(property_id),
    FOREIGN KEY (type_id) REFERENCES PaymentType(type_id)
);
