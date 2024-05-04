SELECT * FROM fs_agency.food;
use fs_agency;
create table optionFood
(
id varchar(40),
name varchar(40),
field varchar(40),
agencyID varchar(40)
);
ALTER TABLE optionFood ADD PRIMARY KEY (id);
create table optionFoodDetail(
id varchar(40),
optionid varchar(40),
foodid varchar(40),
price decimal(10,2),
name varchar(40),
comment varchar(40),
available varchar(40),
date_Create date,
date_Update date
);
ALTER TABLE optionfooddetail ADD PRIMARY KEY (id);
