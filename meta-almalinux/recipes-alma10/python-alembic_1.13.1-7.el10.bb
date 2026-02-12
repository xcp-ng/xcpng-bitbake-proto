
inherit dnf-bridge

PN = "python-alembic"
PE = "0"
PV = "1.13.1"
PR = "7.el10"
PACKAGES = "python3-alembic"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-alembic-1.13.1-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-alembic = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-alembic-1.13.1-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-alembic}"
RDEPENDS:python3-alembic = " \
 python3 \
 python3-sqlalchemy \
 python3-mako \
 python3-typing-extensions \
"
