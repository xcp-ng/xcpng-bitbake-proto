
inherit dnf-bridge

PN = "python-sqlalchemy"
PE = "0"
PV = "2.0.26"
PR = "6.el10"
PACKAGES = "python3-sqlalchemy python-sqlalchemy-doc"


URI_python3-sqlalchemy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-sqlalchemy-2.0.26-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-sqlalchemy = " \
 glibc \
 python3-greenlet \
 python3 \
 python3-typing-extensions \
"

URI_python-sqlalchemy-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python-sqlalchemy-doc-2.0.26-6.el10.noarch.rpm;unpack=0"
RDEPENDS:python-sqlalchemy-doc = ""
