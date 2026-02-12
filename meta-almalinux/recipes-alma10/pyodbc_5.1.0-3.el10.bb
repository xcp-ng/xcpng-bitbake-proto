
inherit dnf-bridge

PN = "pyodbc"
PE = "0"
PV = "5.1.0"
PR = "3.el10"
PACKAGES = "python3-pyodbc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/pyodbc-5.1.0-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pyodbc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-pyodbc-5.1.0-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-pyodbc}"
RDEPENDS:python3-pyodbc = " \
 python3 \
 libgcc \
 libstdc++ \
 unixODBC \
 glibc \
"
