
inherit dnf-bridge

PN = "asio"
PE = "0"
PV = "1.30.2"
PR = "2.el10"
PACKAGES = "asio-devel"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/asio-1.30.2-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_asio-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/asio-devel-1.30.2-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_asio-devel}"
RDEPENDS:asio-devel = " \
 pkgconf-pkg-config \
"
