
inherit dnf-bridge

PN = "mallard-rng"
PE = "0"
PV = "1.1.0"
PR = "14.el10"
PACKAGES = "mallard-rng"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/mallard-rng-1.1.0-14.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mallard-rng = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mallard-rng-1.1.0-14.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_mallard-rng}"
RDEPENDS:mallard-rng = " \
 pkgconf-pkg-config \
 bash \
 libxml2 \
 xml-common \
"
