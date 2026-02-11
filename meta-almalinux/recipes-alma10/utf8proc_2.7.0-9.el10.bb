
PN = "utf8proc"
PE = "0"
PV = "2.7.0"
PR = "9.el10"
PACKAGES = "utf8proc utf8proc-devel"


URI_utf8proc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/utf8proc-2.7.0-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:utf8proc = " \
 glibc \
"

URI_utf8proc-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/utf8proc-devel-2.7.0-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:utf8proc-devel = " \
 pkgconf-pkg-config \
 utf8proc \
"
