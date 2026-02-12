
inherit dnf-bridge

PN = "libabigail"
PE = "0"
PV = "2.6"
PR = "1.el10"
PACKAGES = "libabigail libabigail-devel libabigail-doc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/libabigail-2.6-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libabigail = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libabigail-2.6-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libabigail}"
RDEPENDS:libabigail = " \
 libgcc \
 libbpf \
 libxml2 \
 elfutils-libelf \
 elfutils-libs \
 libstdc++ \
 binutils \
 glibc \
"

URI_libabigail-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libabigail-devel-2.6-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libabigail-devel}"
RDEPENDS:libabigail-devel = " \
 libxml2-devel \
 libabigail \
 pkgconf-pkg-config \
"

URI_libabigail-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libabigail-doc-2.6-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libabigail-doc}"
RDEPENDS:libabigail-doc = ""
