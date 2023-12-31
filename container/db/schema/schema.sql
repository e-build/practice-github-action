CREATE TABLE SOURCE
(
    ID          BIGINT                      NOT NULL AUTO_INCREMENT,
    VALIDATED   BIT                         NOT NULL,
    CREATED_AT  DATETIME(6) DEFAULT (NOW()) NOT NULL,
    MODIFIED_AT DATETIME(6) DEFAULT (NOW()) NOT NULL,
    NAME        VARCHAR(255)                NOT NULL,
    VALUE       VARCHAR(255)                NOT NULL,
    PRIMARY KEY (ID)
) ENGINE = INNODB