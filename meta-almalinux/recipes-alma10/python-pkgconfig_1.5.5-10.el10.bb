
inherit dnf-bridge

PN = "python-pkgconfig"
PE = "0"
PV = "1.5.5"
PR = "10.el10"
PACKAGES = "python3-pkgconfig"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/python-pkgconfig-1.5.5-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pkgconfig = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-pkgconfig-1.5.5-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-pkgconfig}"
RDEPENDS:python3-pkgconfig = " \
 python3 \
 pkgconf-pkg-config \
"
