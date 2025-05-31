# 💰 SimuladorInvestPro

Um simulador de investimentos em Java com Spring Boot. Permite ao usuário calcular o crescimento de seus aportes ao longo do tempo com base em juros compostos ou simples, oferecendo projeções detalhadas, exportações e visualizações futuras.

---

## 🚀 Funcionalidades

- ✅ Simular investimentos com:
  - Valor inicial
  - Aporte mensal
  - Taxa de juros (% ao mês ou ao ano)
  - Tempo de aplicação (meses ou anos)
  - Tipo de rendimento (composto ou simples)
- ✅ Retorno total projetado
- ✅ Evolução mês a mês do investimento
- ✅ API RESTful com Spring Boot
- 🔜 Exportação em PDF e JSON
- 🔜 Autenticação com JWT (futuramente)
- 🔜 Dashboard com gráficos (futuramente)

---

## 🛠️ Tecnologias Utilizadas

- Java 17
- Spring Boot
- Maven
- JUnit 5 + Mockito
- Swagger (OpenAPI)
- Banco de Dados H2 (modo dev) / PostgreSQL (produção)
- Lombok
- Docker (em breve)
- GitHub Actions (CI/CD em breve)

---

## 🧪 Como Rodar Localmente

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/simulador-investimentos.git

# Acesse o diretório
cd simulador-investimentos

# Compile o projeto
./mvnw clean install

# Rode a aplicação
./mvnw spring-boot:run
