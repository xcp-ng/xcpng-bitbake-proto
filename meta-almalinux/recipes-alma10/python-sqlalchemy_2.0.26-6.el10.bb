
PN = "python-sqlalchemy"
PE = "0"
PV = "2.0.26"
PR = "6.el10"
PACKAGES = "python3-sqlalchemy python-sqlalchemy-doc"


URI_python3-sqlalchemy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-sqlalchemy-2.0.26-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-sqlalchemy = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) python(abi) ( =  3.12) python3.12dist(greenlet) ( or  (REL)) python3.12dist(typing-extensions) ( >=  4.6)"
RPROVIDES:python3-sqlalchemy = "python-sqlalchemy ( =  2.0.26-6.el10) python3-sqlalchemy ( =  2.0.26-6.el10) python3-sqlalchemy(x86-64) ( =  2.0.26-6.el10) python3.12-sqlalchemy ( =  2.0.26-6.el10) python3.12dist(sqlalchemy) ( =  2.0.26) python3dist(sqlalchemy) ( =  2.0.26)"

URI_python-sqlalchemy-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python-sqlalchemy-doc-2.0.26-6.el10.noarch.rpm;unpack=0"
RDEPENDS:python-sqlalchemy-doc = ""
RPROVIDES:python-sqlalchemy-doc = "python-sqlalchemy-doc ( =  2.0.26-6.el10)"
