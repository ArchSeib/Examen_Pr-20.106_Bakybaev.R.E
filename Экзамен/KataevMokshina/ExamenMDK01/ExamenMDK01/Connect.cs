using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExamenMDK01
{
    internal class Connect
    {
        public static LombardEntities _lombardEntities;
        public static LombardEntities GetContext()
        {
            if (_lombardEntities == null)
            {
                _lombardEntities = new LombardEntities();
            }
            return _lombardEntities;
        }
    }
}
