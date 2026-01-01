# 🏥 MedSystem API

Uma API RESTful desenvolvida com **Spring Boot 3** para gestão de consultas médicas, focada em performance, escalabilidade e facilidade de manutenção.

---

## 📋 Documentação do Projeto

### 1. Requisitos Funcionais (RF)
*O que o sistema deve fazer.*

* **RF01 - Cadastro de Médicos:** O sistema deve permitir o cadastro de médicos (Nome, Email, CRM, Especialidade e Endereço).
* **RF02 - Cadastro de Pacientes:** O sistema deve permitir o cadastro de pacientes (Nome, Email, Telefone, CPF e Endereço).
* **RF03 - Agendamento de Consultas:** O sistema deve permitir agendar uma consulta entre um médico e um paciente em uma data/hora específica.
* **RF04 - Cancelamento de Consultas:** O sistema deve permitir o cancelamento de uma consulta agendada.
* **RF05 - Listagem de Médicos/Pacientes:** O sistema deve permitir listar os registros ativos com paginação.

### 2. Regras de Negócio (RN)
*As condições para que os requisitos funcionais sejam válidos.*

* **RN01 - Unicidade de CRM/CPF:** Não pode haver dois médicos com o mesmo CRM ou dois pacientes com o mesmo CPF.
* **RN02 - Antecedência de Agendamento:** As consultas devem ser agendadas com pelo menos 30 minutos de antecedência.
* **RN03 - Horário de Funcionamento:** A clínica atende de segunda a sábado, das 07:00 às 19:00.
* **RN04 - Disponibilidade do Médico:** O sistema não deve permitir agendar duas consultas para o mesmo médico no mesmo horário.
* **RN05 - Motivo de Cancelamento:** Ao cancelar uma consulta, é obrigatório informar o motivo (ex: "Paciente desistiu", "Médico doente").
* **RN06 - Exclusão Lógica:** Ao "excluir" um médico ou paciente, o registro deve ser apenas inativado no banco de dados, não removido permanentemente.

### 3. Requisitos Não Funcionais (RNF)
*As características técnicas do sistema.*

* **RNF01 - Persistência:** Os dados devem ser armazenados em um banco de dados relacional **PostgreSQL**.
* **RNF02 - Segurança:** As senhas e dados sensíveis (se houver) devem ser protegidos.
* **RNF03 - Performance:** As listagens devem utilizar **paginação** para evitar sobrecarga no servidor e consumo excessivo de memória.
* **RNF04 - Padronização:** A API deve seguir os padrões **RESTful** (uso correto de verbos HTTP como GET, POST, PUT, DELETE).
* **RNF05 - Validação:** Uso de **Bean Validation** (Jakarta Validation) para garantir que os dados de entrada estejam corretos antes de chegar ao banco.

---

## 🚀 Tecnologias Utilizadas

* **Java 17** (ou 17+)
* **Spring Boot 3.5.9**
* **Spring Data JPA** (Persistência)
* **PostgreSQL** (Banco de dados)
* **Flyway** (Sugestão para migração de banco)
* **Lombok** (Produtividade)
* **Maven** (Gerenciador de dependências)

---

## ⚙️ Configuração do Ambiente

1. **Banco de Dados:**
   Certifique-se de que o PostgreSQL está rodando e crie o banco `med_system`.

2. **Propriedades (application.yml):**
   ```yaml
   spring:
     datasource:
       url: jdbc:postgresql://localhost:5432/med_system
       username: seu_usuario
       password: sua_senha
     jpa:
       hibernate:
         ddl-auto: update
       show-sql: true