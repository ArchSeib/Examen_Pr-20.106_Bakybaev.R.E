using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace ExamenMDK01
{
    /// <summary>
    /// Логика взаимодействия для MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }
        private void LogIn_Click(object sender, RoutedEventArgs e)
        {
            bool res = TestValidation(TbPassword.Text, TbLogin.Text);
            if (res)
            {
                if (TestAutorozation(TbPassword.Text, TbLogin.Text))
                {
                    var worker = Connect.GetContext().Workers.Where(a => a.Login == TbLogin.Text).First();
                    MessageBox.Show("Вы авторизированы");
                }
                else
                {
                    MessageBox.Show("Вы неправильно ввели логин или пароль");
                }

            }
            else
            {
                MessageBox.Show("Вы не ввели логин или пароль");
            }
        }
        public static bool TestAutorozation(String Password, String Login)
        {
            bool TestResult = true;
            if (Connect.GetContext().Workers.Any(a => a.Login == Login) == true)
            {
                var worker = Connect.GetContext().Workers.Where(a => a.Login == Login).First();
                if (worker.Password == Password)
                {
                    TestResult = true;
                }
                else
                {
                    TestResult = false;
                }
            }
            return TestResult;
        }
        public static bool TestValidation(String Password, String Login)
        {
            bool result = false;
            if (Password == "")
            {
                result = false;
            }
            else
            {
                if (Login == "")
                {
                    result = false;
                }
                else
                {
                    result = true;
                }
            }
            return result;
        }

        private void Clear_Click(object sender, RoutedEventArgs e)
        {
            TbLogin.Clear();
            TbPassword.Clear();
        }
    }
}
