
PN = "python-psycopg2"
PE = "0"
PV = "2.9.9"
PR = "6.el10"
PACKAGES = "python3-psycopg2 python-psycopg2-doc python3-psycopg2-debug python3-psycopg2-tests"


URI_python3-psycopg2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-psycopg2-2.9.9-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-psycopg2 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpq.so.5()(64bit) ( ) libpq.so.5(RHPG_9.6)(64bit) ( ) libpq.so.5(RHPG_10)(64bit) ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-psycopg2 = "python-psycopg2 ( =  2.9.9-6.el10) python3-psycopg2 ( =  2.9.9-6.el10) python3-psycopg2(x86-64) ( =  2.9.9-6.el10) python3.12-psycopg2 ( =  2.9.9-6.el10) python3.12dist(psycopg2) ( =  2.9.9) python3dist(psycopg2) ( =  2.9.9)"

URI_python-psycopg2-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python-psycopg2-doc-2.9.9-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python-psycopg2-doc = ""
RPROVIDES:python-psycopg2-doc = "python-psycopg2-doc ( =  2.9.9-6.el10) python-psycopg2-doc(x86-64) ( =  2.9.9-6.el10) python3-psycopg2-doc ( =  2.9.9-6.el10)"

URI_python3-psycopg2-debug = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-psycopg2-debug-2.9.9-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-psycopg2-debug = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpq.so.5()(64bit) ( ) libpq.so.5(RHPG_10)(64bit) ( ) libpq.so.5(RHPG_9.6)(64bit) ( ) python(abi) ( =  3.12) python3-psycopg2 ( =  2.9.9-6.el10)"
RPROVIDES:python3-psycopg2-debug = "python-psycopg2-debug ( =  2.9.9-6.el10) python3-psycopg2-debug ( =  2.9.9-6.el10) python3-psycopg2-debug(x86-64) ( =  2.9.9-6.el10) python3.12-psycopg2-debug ( =  2.9.9-6.el10)"

URI_python3-psycopg2-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-psycopg2-tests-2.9.9-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-psycopg2-tests = "/usr/bin/python3 ( ) python(abi) ( =  3.12) python3-psycopg2 ( =  2.9.9-6.el10)"
RPROVIDES:python3-psycopg2-tests = "python-psycopg2-tests ( =  2.9.9-6.el10) python3-psycopg2-tests ( =  2.9.9-6.el10) python3-psycopg2-tests(x86-64) ( =  2.9.9-6.el10) python3.12-psycopg2-tests ( =  2.9.9-6.el10)"
