using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using ExamenMDK01;

namespace UnitTestProject1
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            bool expect = true;

            bool Result = MainWindow.TestValidation("Worker", "Worker");
            Assert.AreEqual(expect, Result);
        }
    }
}
