class BdHandyManOracle : IDisposable
    {
        private OracleConnection Conexao;

        public BdHandyManOracle()
        {
            string DataSource = "localhost;";
            string User = "app;";
            string Password = "app123;";

            string ConnectionString = "Data Source=" + DataSource + "User Id=" + User + "Password=" + Password;

            Console.WriteLine("Estabelecendo Comunicacao...");
            Conexao = new OracleConnection(ConnectionString);

            Console.WriteLine("Estabelecendo Conexao...");
            Conexao.Open();
        }

        public void Execute(string Query)
        {
            OracleCommand Statement = new OracleCommand
            {
                CommandText = Query,
                CommandType = CommandType.Text,
                Connection = Conexao
            };

            Statement.ExecuteNonQuery();
        }

        public OracleDataReader ExecuteAndReturn(string Query)
        {
            OracleCommand Statement = new OracleCommand(Query, Conexao);

            return Statement.ExecuteReader();
        }



        public void Dispose()
        {
            if(Conexao.State == ConnectionState.Open)
                Conexao.Close();
        }
    }