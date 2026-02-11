
PN = "pycairo"
PE = "0"
PV = "1.25.1"
PR = "5.el10"
PACKAGES = "python3-cairo python3-cairo-devel"


URI_python3-cairo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-cairo-1.25.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-cairo = "
 glibc
 python3
 cairo
"

URI_python3-cairo-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-cairo-devel-1.25.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-cairo-devel = "
 python3-cairo
 pkgconf-pkg-config
 cairo-devel
 python3-devel
"
