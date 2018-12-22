using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

    public class BdHandyMan : IDisposable
    {
        private readonly SqlConnection conexao;

        public BdHandyMan()
        {
            string BdServerName = "MRGLASS-PC";
            string BdName = "Pessoas";

            conexao = new SqlConnection(@"data source=" + BdServerName + ";Integrated Security=SSPI;Initial Catalog=" + BdName);
            conexao.Open();
        }

        public void ExecutaComando(String Query)
        {
            var cmdComando = new SqlCommand
            {
                CommandText = Query,
                CommandType = CommandType.Text,
                Connection = conexao
            };


            cmdComando.ExecuteNonQuery();
        }

        public SqlDataReader ExecutaComandoComRetorno(String Query)
        {
            var cmdComando = new SqlCommand(Query, conexao);

            return cmdComando.ExecuteReader();
        }

        public void Dispose()
        {
            if (conexao.State == ConnectionState.Open)
                conexao.Close();
        }
    }