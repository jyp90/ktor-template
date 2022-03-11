# API Documentation

### Customer

Data class

* id: String (PK)
* firstName: String
* lastName: String
* email: String


## API Requests

---

### API Description: 전체 손님 목록 리턴

Method: `GET`

URL : `/customer`

Parameter Type: NONE 

---

### API Description: 손님 리턴

Method: `GET`

URL : `/customer/{id}`

Parameter Type: `Path Variable`

---

### API Description: 손님 생성

Method: `POST`

URL: `/customer`

Parameter Type: `Request Body`

Body description 

* id: String (PK)
* firstName: String
* lastName: String
* email: String

---

### API Description: 손님 삭제

Method: `DELETE`

URL: `/customer/{id}`

Parameter Type: `Path Variable`