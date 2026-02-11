
PN = "opensp"
PE = "0"
PV = "1.5.2"
PR = "48.el10"
PACKAGES = "opensp opensp-devel"


URI_opensp = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/opensp-1.5.2-48.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:opensp = " \
 glibc \
 sgml-common \
 libgcc \
 libstdc++ \
"

URI_opensp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/opensp-devel-1.5.2-48.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:opensp-devel = " \
 opensp \
"
