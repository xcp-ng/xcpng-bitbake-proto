
inherit dnf-bridge

PN = "libijs"
PE = "0"
PV = "0.35"
PR = "24.el10"
PACKAGES = "libijs libijs-devel libijs-doc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libijs-0.35-24.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libijs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libijs-0.35-24.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libijs}"
RDEPENDS:libijs = " \
 glibc \
"

URI_libijs-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libijs-devel-0.35-24.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libijs-devel}"
RDEPENDS:libijs-devel = " \
 pkgconf-pkg-config \
 libijs \
"

URI_libijs-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libijs-doc-0.35-24.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_libijs-doc}"
RDEPENDS:libijs-doc = " \
 libijs \
"
