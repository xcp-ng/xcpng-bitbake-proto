
inherit dnf-bridge

PN = "libmicrohttpd"
PE = "1"
PV = "1.0.0"
PR = "3.el10"
PACKAGES = "libmicrohttpd libmicrohttpd-devel libmicrohttpd-doc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libmicrohttpd-1.0.0-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libmicrohttpd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libmicrohttpd-1.0.0-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libmicrohttpd}"
RDEPENDS:libmicrohttpd = " \
 glibc \
 info \
 gnutls \
"

URI_libmicrohttpd-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libmicrohttpd-devel-1.0.0-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libmicrohttpd-devel}"
RDEPENDS:libmicrohttpd-devel = " \
 gnutls-devel \
 pkgconf-pkg-config \
 libmicrohttpd \
"

URI_libmicrohttpd-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libmicrohttpd-doc-1.0.0-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_libmicrohttpd-doc}"
RDEPENDS:libmicrohttpd-doc = " \
 bash \
 libmicrohttpd \
"
