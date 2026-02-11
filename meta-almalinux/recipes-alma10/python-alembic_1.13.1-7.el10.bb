
PN = "python-alembic"
PE = "0"
PV = "1.13.1"
PR = "7.el10"
PACKAGES = "python3-alembic"


URI_python3-alembic = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-alembic-1.13.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-alembic = "/usr/bin/python3 ( ) python3.12dist(mako) ( ) python(abi) ( =  3.12) python3.12dist(sqlalchemy) ( >=  1.3) python3.12dist(typing-extensions) ( >=  4)"
RPROVIDES:python3-alembic = "python-alembic ( =  1.13.1-7.el10) python3-alembic ( =  1.13.1-7.el10) python3.12-alembic ( =  1.13.1-7.el10) python3.12dist(alembic) ( =  1.13.1) python3dist(alembic) ( =  1.13.1)"
