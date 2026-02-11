
PN = "bison"
PE = "0"
PV = "3.8.2"
PR = "9.el10"
PACKAGES = "bison bison-runtime bison-devel"


URI_bison = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bison-3.8.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bison = " \
 glibc \
 m4 \
"

URI_bison-runtime = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bison-runtime-3.8.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bison-runtime = ""

URI_bison-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/bison-devel-3.8.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bison-devel = ""
