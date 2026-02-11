
inherit dnf-bridge

PN = "libtasn1"
PE = "0"
PV = "4.20.0"
PR = "1.el10"
PACKAGES = "libtasn1 libtasn1-devel libtasn1-tools"


URI_libtasn1 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libtasn1-4.20.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtasn1 = " \
 glibc \
"

URI_libtasn1-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtasn1-devel-4.20.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtasn1-devel = " \
 libtasn1-tools \
 pkgconf-pkg-config \
 libtasn1 \
"

URI_libtasn1-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtasn1-tools-4.20.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtasn1-tools = " \
 glibc \
 libtasn1 \
"
