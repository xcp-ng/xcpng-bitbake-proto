
inherit dnf-bridge

PN = "libproxy"
PE = "0"
PV = "0.5.5"
PR = "4.el10"
PACKAGES = "libproxy libproxy-bin libproxy-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libproxy-0.5.5-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libproxy = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libproxy-0.5.5-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libproxy}"
RDEPENDS:libproxy = " \
 libgcc \
 glib2 \
 libcurl \
 glibc \
 duktape \
"

URI_libproxy-bin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libproxy-bin-0.5.5-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libproxy-bin}"
RDEPENDS:libproxy-bin = " \
 glibc \
 libproxy \
"

URI_libproxy-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libproxy-devel-0.5.5-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libproxy-devel}"
RDEPENDS:libproxy-devel = " \
 glib2-devel \
 pkgconf-pkg-config \
 libproxy \
"
