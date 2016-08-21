 create table gnl_il (
		  id bigint not null,
		  tanim character varying(70),
		  kod character varying(10),
		  primary key(id)
	  );
	  
	 create table gnl_ilce (
		  id bigint not null,
		  tanim character varying(70),
		  kod character varying(10),
		  primary key(id)
	  );
	  
	 create table gnl_cinsiyet (
		  id bigint not null,
		  tanim character varying(70),
		  kod character varying(3), 
		  primary key(id)
	  );
	  
	  create table gnl_kisi (
		  id bigint not null,
		  ad character varying(70),
		  soyad character varying(10),
		  adres character varying(500),
		  il_id bigint ,
		  ilce_id bigint ,
		  cinsiyet_id bigint ,
		  dogum_tarihi date,
		  tckn character varying(11),
		  primary key(id)
	  );

	 create table gnl_kullanici (
		  id bigint not null,
		  uname character varying(70),
		  pwd character varying(50), 
		  kisi_id bigint,
		  primary key(id)
	  );
	  
	  ALTER TABLE gnl_kisi
	  ADD CONSTRAINT fk_kisi_il FOREIGN KEY (il_id)
          REFERENCES gnl_il (id);
	  
	  ALTER TABLE gnl_kisi
	  ADD CONSTRAINT fk_kisi_ilce FOREIGN KEY (ilce_id)
          REFERENCES gnl_ilce (id);
	  
	  ALTER TABLE gnl_kisi
	  ADD CONSTRAINT fk_kisi_cinsiyet FOREIGN KEY (cinsiyet_id)
          REFERENCES gnl_cinsiyet (id);
	  
	  create sequence seq_gnl_kisi_id start  1 increment 1;
	  create sequence seq_gnl_il_id start  1 increment 1;
	  create sequence seq_gnl_ilce_id start  1 increment 1;
	  create sequence seq_gnl_cinsiyet_id start  1 increment 1;
	  
	  ALTER TABLE gnl_kisi ALTER id SET DEFAULT NEXTVAL('seq_gnl_kisi_id');
	  ALTER TABLE gnl_il ALTER id SET DEFAULT NEXTVAL('seq_gnl_il_id');
	  ALTER TABLE gnl_ilce ALTER id SET DEFAULT NEXTVAL('seq_gnl_ilce_id');
	  ALTER TABLE gnl_cinsiyet ALTER id SET DEFAULT NEXTVAL('seq_gnl_cinsiyet_id');