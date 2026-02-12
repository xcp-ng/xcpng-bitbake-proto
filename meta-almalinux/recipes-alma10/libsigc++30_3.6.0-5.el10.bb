
inherit dnf-bridge

PN = "libsigc++30"
PE = "0"
PV = "3.6.0"
PR = "5.el10"
PACKAGES = "libsigc++30 libsigc++30-devel libsigc++30-doc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libsigc++30-3.6.0-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libsigc++30 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsigc++30-3.6.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libsigc++30}"
RDEPENDS:libsigc++30 = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_libsigc++30-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsigc++30-devel-3.6.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libsigc++30-devel}"
RDEPENDS:libsigc++30-devel = " \
 libsigc++30 \
 pkgconf-pkg-config \
"

URI_libsigc++30-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsigc++30-doc-3.6.0-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_libsigc++30-doc}"
RDEPENDS:libsigc++30-doc = " \
 libsigc++30 \
"
