
1 - (select (max(id) +1) from rh_kisi)
--SEQ- 2. Yol
2 - (select nextval('seq_rh_kisi_id'))

--ALTER TABLE user ALTER user_id SET DEFAULT NEXTVAL('user_id_seq');

--Kayıt Ekler
insert into rh_kisi (ad,soyad) values ('MEHMET','VARIR')

--SEQ dan kolonun otomatik arttırılmasını sağlar
ALTER TABLE rh_kisi ALTER id SET DEFAULT NEXTVAL('seq_rh_kisi_id')


--Kayıtların Listelenmesi
select * from rh_kisi 

--Kayıt Silme 
delete from rh_kisi  where id=7
