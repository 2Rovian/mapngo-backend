# 🗺️ MapNGo - Backend

Backend do projeto **MapNGo**, desenvolvido com **Java Spring Boot** e **PostgreSQL**. Fornece endpoints RESTful para cadastro, listagem e atualização de entregas, além de integração com APIs de geolocalização.

> Este projeto foi desenvolvido como parte do [Challenge para desenvolvedor Full Stack da RoutEasy](https://github.com/RoutEasy/challenge-fullstack).

## 🛠 Tecnologias

- **Java Spring Boot**
- **PostgreSQL**
- **Maven** (gerenciamento de dependências)
- **Spring Data JPA** (integração com banco)
- **Lombok** (redução de boilerplate)
- **Spring Web** (para criação da API REST)
- **MapStruct** (gerência de DTOs)

## 🧠 Endpoints

| Método | Endpoint           | Descrição                                                                                             | Resposta Esperada                  |
| ------- | ------------------ | ----------------------------------------------------------------------------------------------------- | ---------------------------------- |
| GET     | `/deliveries/`     | Retorna uma lista de todas as entregas cadastradas.                                                   | Lista de entregas                  |
| POST    | `/deliveries/`     | Cria uma nova entrega com os dados informados (cliente, endereço, peso, latitude, longitude, etc.).   | Entrega criada                     |
| PUT     | `/deliveries/{id}` | Atualiza os dados de uma entrega existente.                                                           | Entrega atualizada                 |
| DELETE  | `/deliveries/{id}` | Remove uma entrega específica do sistema.                                                             | String de sucesso ou erro          |
| DELETE  | `/deliveries/`     | Remove toas as entregas.                                                                              | String de sucesso ou erro          |

## 🚀 Instalação

### 1️⃣ Crie uma pasta para o projeto e acesse-a
```
mkdir mapngo && cd mapngo
```

### 2️⃣ Clone o repositório do frontend

```
git clone https://github.com/2rovian/mapngo-frontend.git
```

### 3️⃣ Clone o repositório do backend

```
git clone https://github.com/2rovian/mapngo-backend.git
```

### 4️⃣ Renomeie os diretórios

```
mv mapngo-frontend frontend
```
```
mv mapngo-backend backend
```

### 5️⃣ Acesse o diretório do backend
```
cd backend
```
### 6️⃣ Rode os containers 
```
docker-compose up --build
```

### 🔌 Endereços de execução

- Frontend: `http://localhost:5173`  
- Backend: `http://localhost:8080`  

### 🔗 Repo do frontend
👉 [MapNGo Frontend](https://github.com/2Rovian/mapngo-frontend)
