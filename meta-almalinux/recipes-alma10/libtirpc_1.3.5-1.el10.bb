
inherit dnf-bridge

PN = "libtirpc"
PE = "0"
PV = "1.3.5"
PR = "1.el10"
PACKAGES = "libtirpc libtirpc-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libtirpc-1.3.5-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libtirpc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libtirpc-1.3.5-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libtirpc}"
RDEPENDS:libtirpc = " \
 glibc \
 krb5-libs \
 libcom_err \
"

URI_libtirpc-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libtirpc-devel-1.3.5-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libtirpc-devel}"
RDEPENDS:libtirpc-devel = " \
 libtirpc \
 pkgconf-pkg-config \
"
