
inherit dnf-bridge

PN = "duktape"
PE = "0"
PV = "2.7.0"
PR = "10.el10"
PACKAGES = "duktape duktape-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/duktape-2.7.0-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_duktape = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/duktape-2.7.0-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_duktape}"
RDEPENDS:duktape = " \
 glibc \
"

URI_duktape-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/duktape-devel-2.7.0-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_duktape-devel}"
RDEPENDS:duktape-devel = " \
 duktape \
 pkgconf-pkg-config \
"
